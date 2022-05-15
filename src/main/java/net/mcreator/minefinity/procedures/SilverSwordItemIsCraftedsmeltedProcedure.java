package net.mcreator.minefinity.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class SilverSwordItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) == 0) {
			(itemstack).enchant(Enchantments.SMITE, 2);
		}
	}
}
