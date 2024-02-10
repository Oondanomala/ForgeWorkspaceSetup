package com.integral.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION, name = ExampleMod.NAME)
public class ExampleMod {
    public static final String MODID = "examplemod";
    public static final String NAME = "The Example Mod";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }
}
