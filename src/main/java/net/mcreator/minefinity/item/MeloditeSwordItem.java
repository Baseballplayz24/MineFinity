
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class MeloditeSwordItem extends SwordItem {
	public MeloditeSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 4096;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -2.2f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
	}
}
