
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class CobaltAxeItem extends AxeItem {
	public CobaltAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3072;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.COBALT_INGOT.get()));
			}
		}, 1, -2.7999999999999998f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
	}
}
