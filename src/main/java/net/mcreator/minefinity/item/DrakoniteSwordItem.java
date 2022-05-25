
package net.mcreator.minefinity.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class DrakoniteSwordItem extends SwordItem {
	public DrakoniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 6144;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 75;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.DRAKONITE_INGOT.get()));
			}
		}, 3, -2f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
	}
}
