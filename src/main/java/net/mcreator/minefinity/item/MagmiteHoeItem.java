
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class MagmiteHoeItem extends HoeItem {
	public MagmiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 7f;
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
				return Ingredient.of(new ItemStack(MinefinityModItems.MAGMITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
	}
}
