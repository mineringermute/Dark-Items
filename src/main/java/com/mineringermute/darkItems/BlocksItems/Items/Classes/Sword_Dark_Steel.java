package com.mineringermute.darkItems.BlocksItems.Items.Classes;

import com.mineringermute.darkItems.darkItems;
import com.mineringermute.darkItems.BlocksItems.Items.darkitemsCTabs;

import net.minecraft.item.ItemSword;

public class Sword_Dark_Steel extends ItemSword {

	public Sword_Dark_Steel(String Sword_Dark_Steel, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(Sword_Dark_Steel);
		this.setTextureName(darkItems.MODID + ":" + "Sword_Dark_Steel");
		this.setCreativeTab(darkitemsCTabs.tab);
	}

}
