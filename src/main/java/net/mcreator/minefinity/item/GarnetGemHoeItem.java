
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class GarnetGemHoeItem extends HoeItem {
	public GarnetGemHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1651;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.GARNET.get()));
			}
		}, 0, -3f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
	}
}
