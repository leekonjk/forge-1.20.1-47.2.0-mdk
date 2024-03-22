package com.jjk.democratic.item;

import com.jjk.democratic.JjkMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModlistTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, JjkMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> JJK_MOD=CREATIVE_MODE_TAB.register("jjk_mod",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(Modlist.RUNE.get()))
                    .title(Component.translatable("creativetab.jjk_mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Modlist.Soul.get());
                        output.accept(Modlist.RUNE.get());
                        output.accept(Items.DIAMOND_AXE);
                    })


                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
