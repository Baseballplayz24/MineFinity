
package net.mcreator.minefinity.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.minefinity.procedures.IronHeartItemInInventoryTickProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;

public class IronHeartItem extends Item {
	public IronHeartItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_BASICS).stacksTo(1).rarity(Rarity.COMMON));
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
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		IronHeartItemInInventoryTickProcedure.execute(entity);
	}
}
