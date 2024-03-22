package com.jjk.democratic.item;

import com.jjk.democratic.JjkMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Modlist {
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, JjkMod.MOD_ID);
    public static final RegistryObject<Item> Soul= ITEMS.register("soul",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNE=ITEMS.register("rune",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
