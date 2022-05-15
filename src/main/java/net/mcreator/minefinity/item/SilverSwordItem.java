
package net.mcreator.minefinity.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.mcreator.minefinity.procedures.SilverSwordItemIsCraftedsmeltedProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public class SilverSwordItem extends SwordItem {
	public SilverSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 360;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.SILVER_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SilverSwordItemIsCraftedsmeltedProcedure.execute(itemstack);
	}
}
