
package net.mcreator.minefinity.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minefinity.init.MinefinityModTabs;
import net.mcreator.minefinity.init.MinefinityModItems;

public abstract class MeloditeArmorItem extends ArmorItem {
	public MeloditeArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 8, 10, 7}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 42;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.MELODITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "melodite_armor";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.33f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MeloditeArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/melodite__layer_1.png";
		}
	}

	public static class Chestplate extends MeloditeArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/melodite__layer_1.png";
		}
	}

	public static class Leggings extends MeloditeArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/melodite__layer_2.png";
		}
	}

	public static class Boots extends MeloditeArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_END).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/melodite__layer_1.png";
		}
	}
}
