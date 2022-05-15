
package net.mcreator.minefinity.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;

public class NetherheartForgeCraftingModuleItem extends Item {
	public NetherheartForgeCraftingModuleItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
