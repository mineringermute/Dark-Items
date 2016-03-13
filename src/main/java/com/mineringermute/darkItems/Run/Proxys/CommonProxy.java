package com.mineringermute.darkItems.Run.Proxys;

import com.mineringermute.darkItems.BlocksItems.Crafting;
import com.mineringermute.darkItems.BlocksItems.Blocks.DarkBlocks;
import com.mineringermute.darkItems.BlocksItems.Items.DarkItems;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	DarkItems.init();
    	DarkBlocks.init();
    }

    public void init(FMLInitializationEvent event) {
    	Crafting.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}