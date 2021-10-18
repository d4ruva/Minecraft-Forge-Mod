package me.self.dhruvamod.init;

import me.self.dhruvamod.Dhruvamod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Dhruvamod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_ORE = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
