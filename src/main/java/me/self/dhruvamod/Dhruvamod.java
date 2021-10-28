package me.self.dhruvamod;

import me.self.dhruvamod.block.ModBlocks;
import me.self.dhruvamod.init.ModItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dhruvamod.MOD_ID)
public class Dhruvamod {
    public static final String MOD_ID = "dhruvamod";
    public Dhruvamod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(bus);
        ModBlocks.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
