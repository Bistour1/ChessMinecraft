package be.bistouri.chess.init;

import be.bistouri.chess.Chess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Chess.MODID);
    //public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("WESHGHHHHHHH", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<T> block){
        return BLOCKS.register(name,block);
    }
}
