
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.minefinity.init.MinefinityModItems;

public class MeloditeAxeItem extends AxeItem {
	public MeloditeAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 4096;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 8f;
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
		}, 1, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
