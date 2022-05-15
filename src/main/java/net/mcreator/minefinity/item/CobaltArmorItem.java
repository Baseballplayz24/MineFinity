
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

public abstract class CobaltArmorItem extends ArmorItem {
	public CobaltArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 28;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MinefinityModItems.COBALT_INGOT.get()));
			}

			@Override
			public String getName() {
				return "cobalt_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.25f;
			}
		}, slot, properties);
	}

	public static class Helmet extends CobaltArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/cobalt__layer_1.png";
		}
	}

	public static class Chestplate extends CobaltArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/cobalt__layer_1.png";
		}
	}

	public static class Leggings extends CobaltArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/cobalt__layer_2.png";
		}
	}

	public static class Boots extends CobaltArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MinefinityModTabs.TAB_MINEFINITY_NETHER).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "minefinity:textures/models/armor/cobalt__layer_1.png";
		}
	}
}
