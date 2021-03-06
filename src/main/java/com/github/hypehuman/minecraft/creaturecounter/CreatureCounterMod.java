package com.github.hypehuman.minecraft.creaturecounter;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = CreatureCounterMod.MODID, name = CreatureCounterMod.NAME, version = CreatureCounterMod.VERSION)
public class CreatureCounterMod
{
    public static final String MODID = "creaturecounter";
    public static final String NAME = "Creature Counter";
    public static final String VERSION = "0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
