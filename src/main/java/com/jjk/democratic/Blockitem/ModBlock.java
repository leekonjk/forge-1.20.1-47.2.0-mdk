package com.jjk.democratic.Blockitem;
import com.jjk.democratic.JjkMod;
import com.jjk.democratic.item.Modlist;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlock {
     public static final DeferredRegister<Block> BLOCKS =
             DeferredRegister.create(ForgeRegistries.BLOCKS,JjkMod.MOD_ID);
     public static final RegistryObject<Block> RAW_COTTON=registryBlock("raw_cotton",
             () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
     private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block){
         RegistryObject<T> toReturn=BLOCKS.register(name,block);
         registryBlockItem(name,toReturn);
         return toReturn;
     }
     private static <T extends Block>RegistryObject<Item> registryBlockItem(String name,RegistryObject<T> block)
     {
         return Modlist.ITEMS.register(name,() -> new BlockItem(block.get(),new Item.Properties()));
     }
     public static void register (IEventBus eventBus){
         BLOCKS.register(eventBus);
     }
}
