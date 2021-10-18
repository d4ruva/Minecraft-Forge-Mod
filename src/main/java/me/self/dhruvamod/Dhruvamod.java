package me.self.dhruvamod;

import me.self.dhruvamod.block.ModBLocks;
import me.self.dhruvamod.init.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dhruvamod.MOD_ID)
public class Dhruvamod {
    public static final String MOD_ID = "dhruvamod";
    public Dhruvamod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.register(bus);
        ModBLocks.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
