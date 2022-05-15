
package net.mcreator.minefinity.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;

import net.mcreator.minefinity.procedures.SilverHoeItemIsCraftedsmeltedProcedure;
import net.mcreator.minefinity.init.MinefinityModItems;

public class SilverHoeItem extends HoeItem {
	public SilverHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 360;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.SILVER_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SilverHoeItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
