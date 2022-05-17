
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinefinityModTabs {
	public static CreativeModeTab TAB_MINEFINITY_BASICS;
	public static CreativeModeTab TAB_MINEFINITY_NETHER;
	public static CreativeModeTab TAB_MINEFINITY_END;

	public static void load() {
		TAB_MINEFINITY_BASICS = new CreativeModeTab("tabminefinity_basics") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinefinityModItems.TIN_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MINEFINITY_NETHER = new CreativeModeTab("tabminefinity_nether") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinefinityModBlocks.SILVER_BLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_MINEFINITY_END = new CreativeModeTab("tabminefinity_end") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinefinityModBlocks.CHORUS_PHYLIUM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
