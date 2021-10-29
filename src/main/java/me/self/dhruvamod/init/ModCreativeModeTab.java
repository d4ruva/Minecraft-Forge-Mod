package me.self.dhruvamod.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUTORIAL_TAB =
            new CreativeModeTab("tutorial_tab") {
                @Override
                public ItemStack makeIcon() {
                    return new ItemStack(ModItems.TITANIUM_INGOT.get());
                }
    };
}
