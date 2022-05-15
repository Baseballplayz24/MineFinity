
package net.mcreator.minefinity.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.minefinity.procedures.NetheriteApplePlayerFinishesUsingItemProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;

public class NetheriteAppleItem extends Item {
	public NetheriteAppleItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_BASICS).stacksTo(64).fireResistant().rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(2f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		NetheriteApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
