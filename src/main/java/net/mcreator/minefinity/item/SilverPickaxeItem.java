
package net.mcreator.minefinity.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.minefinity.procedures.SilverPickaxeItemIsCraftedsmeltedProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class SilverPickaxeItem extends PickaxeItem {
	public SilverPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
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
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.SILVER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SilverPickaxeItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
