
package net.mcreator.minefinity.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.minefinity.procedures.EnderItemIsDroppedByPlayerProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;

public class MeloditeIngotItem extends Item {
	public MeloditeIngotItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		EnderItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}
