
package net.mcreator.minefinity.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minefinity.init.MinefinityModTabs;

public class CobaltDustItem extends Item {
	public CobaltDustItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
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
