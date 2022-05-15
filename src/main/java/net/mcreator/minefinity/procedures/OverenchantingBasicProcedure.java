package net.mcreator.minefinity.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.minefinity.init.MinefinityModItems;

import java.util.function.Supplier;
import java.util.Map;

public class OverenchantingBasicProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof SwordItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 5
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRONZE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRONZE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRONZE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRONZE_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
					_enchantments.remove(Enchantments.SHARPNESS);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.SHARPNESS, 6);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof SwordItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 5
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.SILVER_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.SILVER_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.SILVER_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.SILVER_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.SMITE)) {
					_enchantments.remove(Enchantments.SMITE);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.SMITE, 6);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof SwordItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 5
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.TIN_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.TIN_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.TIN_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.TIN_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
					_enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.BANE_OF_ARTHROPODS, 6);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof SwordItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 2
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.GARNET.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.GARNET.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.GARNET.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.GARNET.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
					_enchantments.remove(Enchantments.FIRE_ASPECT);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.FIRE_ASPECT, 3);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof PickaxeItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 5
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ROSE_GOLD_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ROSE_GOLD_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ROSE_GOLD_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ROSE_GOLD_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.BLOCK_EFFICIENCY, 6);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof PickaxeItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 3
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
					_enchantments.remove(Enchantments.BLOCK_FORTUNE);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.BLOCK_FORTUNE, 4);
		}
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
				? ((Slot) _slt.get(0)).getItem()
				: ItemStack.EMPTY).getItem() instanceof SwordItem
				&& EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MOB_LOOTING,
						(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 3
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.GLOWSTONE_DUST
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.ELECTRUM_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
					_enchantments.remove(Enchantments.MOB_LOOTING);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.MOB_LOOTING, 4);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.ALL_DAMAGE_PROTECTION,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRASS_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRASS_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRASS_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.BRASS_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
					_enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_PROTECTION,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == MinefinityModItems.MAGMITE_INGOT.get()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
					_enchantments.remove(Enchantments.FIRE_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.FIRE_PROTECTION, 5);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLAST_PROTECTION,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY).getItem() == Items.GUNPOWDER) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
					_enchantments.remove(Enchantments.BLAST_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.BLAST_PROTECTION, 5);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.PROJECTILE_PROTECTION,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.ARROW
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.ARROW
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == Items.ARROW
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY).getItem() == Items.ARROW) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
					_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.PROJECTILE_PROTECTION, 5);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FALL_PROTECTION,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 4
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY).getItem() == Items.FEATHER) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.FALL_PROTECTION)) {
					_enchantments.remove(Enchantments.FALL_PROTECTION);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.FALL_PROTECTION, 5);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING,
				(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)) == 3
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY).getItem() == Blocks.OBSIDIAN.asItem()
				&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
						.getItem() == Blocks.OBSIDIAN.asItem()) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(1)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(2)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(3)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(4)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(5)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(6)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(7)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				((Slot) _slots.get(8)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper
						.getEnchantments((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
								&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
					_enchantments.remove(Enchantments.UNBREAKING);
					EnchantmentHelper.setEnchantments(_enchantments,
							(entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
									&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY));
				}
			}
			((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
					? ((Slot) _slt.get(0)).getItem()
					: ItemStack.EMPTY)).enchant(Enchantments.UNBREAKING, 4);
		}
	}
}
