
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class GarnetGemPickaxeItem extends PickaxeItem {
	public GarnetGemPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
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
		}, 1, -3f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
	}
}
