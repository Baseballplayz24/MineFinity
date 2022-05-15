
package net.mcreator.minefinity.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.minefinity.procedures.MagmiteApplePlayerFinishesUsingItemProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;

public class MagmiteAppleItem extends Item {
	public MagmiteAppleItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).stacksTo(64).rarity(Rarity.RARE)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(1f).alwaysEat()

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MagmiteApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
