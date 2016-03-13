package com.mineringermute.darkItems.BlocksItems.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class darkitemsCTabs {

	public static final CreativeTabs tab = new CreativeTabs("tab") {
	    @Override public Item getTabIconItem() {
	        return DarkItems.Sword_Dark_SteelLocal2;
	    }
	    public int getItemIconDamage() {
	        return 4;
	    }
	};
	
	
	
	
	
}
