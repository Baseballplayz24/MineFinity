
package net.mcreator.minefinity.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;

import net.mcreator.minefinity.procedures.WandOfEnderRightclickedOnBlockProcedure;
import net.mcreator.minefinity.procedures.EnderItemIsDroppedByPlayerProcedure;
import net.mcreator.minefinity.init.MinefinityModTabs;

public class WandOfEnderItem extends Item {
	public WandOfEnderItem() {
		super(new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).durability(128).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		WandOfEnderRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		EnderItemIsDroppedByPlayerProcedure.execute(entity);
		return true;
	}
}
