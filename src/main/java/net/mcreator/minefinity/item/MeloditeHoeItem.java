
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class MeloditeHoeItem extends HoeItem {
	public MeloditeHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 4096;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.MELODITE_INGOT.get()));
			}
		}, 0, 2f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
	}
}
