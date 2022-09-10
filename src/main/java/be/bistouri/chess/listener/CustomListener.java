package be.bistouri.chess.listener;

import be.bistouri.chess.Chess;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Chess.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class CustomListener {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void playerInteractEvent(PlayerInteractEvent event){
        if(event.getSide() == LogicalSide.CLIENT) return;
        Player p = event.getEntity();
        p.sendSystemMessage(event.getItemStack().getItem().getName(event.getItemStack()));
    }
}
