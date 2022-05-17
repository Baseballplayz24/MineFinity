
package net.mcreator.minefinity.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.minefinity.procedures.EnderItemIsDroppedByPlayerProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class CatalyticChorusCoreItem extends Item {
	public CatalyticChorusCoreItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).durability(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(MinefinityModItems.CHORUS_CORE.get());
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		EnderItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}
