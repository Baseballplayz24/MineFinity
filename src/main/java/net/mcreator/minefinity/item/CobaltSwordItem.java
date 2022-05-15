
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class CobaltSwordItem extends SwordItem {
	public CobaltSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3072;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4f;
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
		}, 3, -2.2f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
	}
}
