
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

public abstract class SilverArmorItem extends ArmorItem {
	public SilverArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_gold"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.SILVER_INGOT.get()));
			}

			@Override
			public String getName() {
				return "silver_armor";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SilverArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/silver__layer_1.png";
		}
	}

	public static class Chestplate extends SilverArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/silver__layer_1.png";
		}
	}

	public static class Leggings extends SilverArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/silver__layer_2.png";
		}
	}

	public static class Boots extends SilverArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/silver__layer_1.png";
		}
	}
}
