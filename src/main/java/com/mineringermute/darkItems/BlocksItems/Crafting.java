package com.mineringermute.darkItems.BlocksItems;

import com.mineringermute.darkItems.BlocksItems.Blocks.DarkBlocks;
import com.mineringermute.darkItems.BlocksItems.Items.DarkItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafting {

	public static void  init() {
//////////////////////////////////// Crafting \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\		
		//Block_Dark_Steel (Dark Steel Block)
		GameRegistry.addRecipe(new ItemStack(DarkBlocks.Block_Dark_Steel), new Object[] {
				"###",
				"###",
				"###",
				'#', DarkItems.Ingot_Dark_Steel});
		//Stick_Obsidian (Obsidian Stick)
		GameRegistry.addRecipe(new ItemStack(DarkItems.Stick_Obsidian), new Object[] {
				"###",
				"#S#",
				"###",
				'#', Blocks.obsidian ,'S', Items.stick});
		
		//Stick_Obsidian (Obsidian Stick)
				GameRegistry.addRecipe(new ItemStack(DarkItems.Stick_Obsidian), new Object[] {
						"###",
						"#S#",
						"###",
						'#', Blocks.obsidian ,'S', Items.stick});
		
		
		/////////////////////////Smelting\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		GameRegistry.addSmelting(DarkItems.Raw_Dark_Steel, new ItemStack(DarkItems.Ingot_Dark_Steel), 3.0F);
		
		
		
	}
	

}
