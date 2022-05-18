
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minefinity.item.ZincNuggetItem;
import net.mcreator.minefinity.item.ZincIngotItem;
import net.mcreator.minefinity.item.ZincDustItem;
import net.mcreator.minefinity.item.TinNuggetItem;
import net.mcreator.minefinity.item.TinIngotItem;
import net.mcreator.minefinity.item.TinDustItem;
import net.mcreator.minefinity.item.SoulCoalItem;
import net.mcreator.minefinity.item.SilverSwordItem;
import net.mcreator.minefinity.item.SilverShovelItem;
import net.mcreator.minefinity.item.SilverPickaxeItem;
import net.mcreator.minefinity.item.SilverNuggetItem;
import net.mcreator.minefinity.item.SilverIngotItem;
import net.mcreator.minefinity.item.SilverHoeItem;
import net.mcreator.minefinity.item.SilverDustItem;
import net.mcreator.minefinity.item.SilverAxeItem;
import net.mcreator.minefinity.item.SilverArmorItem;
import net.mcreator.minefinity.item.RoseGoldNuggetItem;
import net.mcreator.minefinity.item.RoseGoldIngotItem;
import net.mcreator.minefinity.item.RawZincItem;
import net.mcreator.minefinity.item.RawTinItem;
import net.mcreator.minefinity.item.RawSilverItem;
import net.mcreator.minefinity.item.RawNickelItem;
import net.mcreator.minefinity.item.RawMagmiteItem;
import net.mcreator.minefinity.item.RawCobaltItem;
import net.mcreator.minefinity.item.PearlescentNuggetItem;
import net.mcreator.minefinity.item.PearlescentIngotItem;
import net.mcreator.minefinity.item.NickelNuggetItem;
import net.mcreator.minefinity.item.NickelIngotItem;
import net.mcreator.minefinity.item.NickelDustItem;
import net.mcreator.minefinity.item.NetherrackRodItem;
import net.mcreator.minefinity.item.NetheriteNuggetItem;
import net.mcreator.minefinity.item.NetheriteHeartItem;
import net.mcreator.minefinity.item.NetheriteHammerItem;
import net.mcreator.minefinity.item.NetheriteDustItem;
import net.mcreator.minefinity.item.NetheriteAppleItem;
import net.mcreator.minefinity.item.NetherheartForgeSmeltingModuleItem;
import net.mcreator.minefinity.item.NetherheartForgeCraftingModuleItem;
import net.mcreator.minefinity.item.NetherheartForgeAlloyingModuleItem;
import net.mcreator.minefinity.item.NetherWheatItem;
import net.mcreator.minefinity.item.NetherBreadItem;
import net.mcreator.minefinity.item.MeloditeSwordItem;
import net.mcreator.minefinity.item.MeloditeShovelItem;
import net.mcreator.minefinity.item.MeloditeShardItem;
import net.mcreator.minefinity.item.MeloditeRodItem;
import net.mcreator.minefinity.item.MeloditePickaxeItem;
import net.mcreator.minefinity.item.MeloditeNuggetItem;
import net.mcreator.minefinity.item.MeloditeIngotItem;
import net.mcreator.minefinity.item.MeloditeHoeItem;
import net.mcreator.minefinity.item.MeloditeDustItem;
import net.mcreator.minefinity.item.MeloditeAxeItem;
import net.mcreator.minefinity.item.MeloditeArmorItem;
import net.mcreator.minefinity.item.MagmiteSwordItem;
import net.mcreator.minefinity.item.MagmiteShovelItem;
import net.mcreator.minefinity.item.MagmitePickaxeItem;
import net.mcreator.minefinity.item.MagmiteNuggetItem;
import net.mcreator.minefinity.item.MagmiteIngotItem;
import net.mcreator.minefinity.item.MagmiteHoeItem;
import net.mcreator.minefinity.item.MagmiteDustItem;
import net.mcreator.minefinity.item.MagmiteAxeItem;
import net.mcreator.minefinity.item.MagmiteArmorItem;
import net.mcreator.minefinity.item.MagmiteAppleItem;
import net.mcreator.minefinity.item.LigniteChunkItem;
import net.mcreator.minefinity.item.IronHeartItem;
import net.mcreator.minefinity.item.IronHammerItem;
import net.mcreator.minefinity.item.IronDustItem;
import net.mcreator.minefinity.item.GoldDustItem;
import net.mcreator.minefinity.item.GarnetItem;
import net.mcreator.minefinity.item.GarnetGemSwordItem;
import net.mcreator.minefinity.item.GarnetGemShovelItem;
import net.mcreator.minefinity.item.GarnetGemPickaxeItem;
import net.mcreator.minefinity.item.GarnetGemHoeItem;
import net.mcreator.minefinity.item.GarnetGemAxeItem;
import net.mcreator.minefinity.item.GarnetGemArmorItem;
import net.mcreator.minefinity.item.ElectrumNuggetItem;
import net.mcreator.minefinity.item.ElectrumIngotItem;
import net.mcreator.minefinity.item.DiamondHeartItem;
import net.mcreator.minefinity.item.DiamondHammerItem;
import net.mcreator.minefinity.item.DiamondAppleItem;
import net.mcreator.minefinity.item.CopperNuggetItem;
import net.mcreator.minefinity.item.CopperDustItem;
import net.mcreator.minefinity.item.ConstantanNuggetItem;
import net.mcreator.minefinity.item.ConstantanIngotItem;
import net.mcreator.minefinity.item.CobaltSwordItem;
import net.mcreator.minefinity.item.CobaltShovelItem;
import net.mcreator.minefinity.item.CobaltRodItem;
import net.mcreator.minefinity.item.CobaltPickaxeItem;
import net.mcreator.minefinity.item.CobaltNuggetItem;
import net.mcreator.minefinity.item.CobaltIngotItem;
import net.mcreator.minefinity.item.CobaltHoeItem;
import net.mcreator.minefinity.item.CobaltHeartItem;
import net.mcreator.minefinity.item.CobaltHammerItem;
import net.mcreator.minefinity.item.CobaltDustItem;
import net.mcreator.minefinity.item.CobaltAxeItem;
import net.mcreator.minefinity.item.CobaltArmorItem;
import net.mcreator.minefinity.item.CobaltAppleItem;
import net.mcreator.minefinity.item.ChorusCoreItem;
import net.mcreator.minefinity.item.CatalyticChorusCoreItem;
import net.mcreator.minefinity.item.BronzeNuggetItem;
import net.mcreator.minefinity.item.BronzeIngotItem;
import net.mcreator.minefinity.item.BrassNuggetItem;
import net.mcreator.minefinity.item.BrassIngotItem;
import net.mcreator.minefinity.item.BasaltRodItem;
import net.mcreator.minefinity.MinefinityMod;

public class MinefinityModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinefinityMod.MODID);
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
	public static final RegistryObject<Item> TIN_ORE = block(MinefinityModBlocks.TIN_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> TIN_BLOCK = block(MinefinityModBlocks.TIN_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
	public static final RegistryObject<Item> RAW_TIN_BLOCK = block(MinefinityModBlocks.RAW_TIN_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> DEEPSLATE_TIN_ORE = block(MinefinityModBlocks.DEEPSLATE_TIN_ORE,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> MARBLE = block(MinefinityModBlocks.MARBLE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> MARBLE_DIAMOND_ORE = block(MinefinityModBlocks.MARBLE_DIAMOND_ORE,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> LIGNITE = block(MinefinityModBlocks.LIGNITE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> LIGNITE_CHUNK = REGISTRY.register("lignite_chunk", () -> new LigniteChunkItem());
	public static final RegistryObject<Item> LIGNITE_IRON_ORE = block(MinefinityModBlocks.LIGNITE_IRON_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", () -> new TinNuggetItem());
	public static final RegistryObject<Item> STONECELIUM = block(MinefinityModBlocks.STONECELIUM, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
	public static final RegistryObject<Item> NICKEL_ORE = block(MinefinityModBlocks.NICKEL_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> NICKEL_BLOCK = block(MinefinityModBlocks.NICKEL_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> RAW_NICKEL = REGISTRY.register("raw_nickel", () -> new RawNickelItem());
	public static final RegistryObject<Item> RAW_NICKEL_BLOCK = block(MinefinityModBlocks.RAW_NICKEL_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> DEEPSLATE_NICKEL_ORE = block(MinefinityModBlocks.DEEPSLATE_NICKEL_ORE,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> NICKEL_NUGGET = REGISTRY.register("nickel_nugget", () -> new NickelNuggetItem());
	public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new CopperNuggetItem());
	public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());
	public static final RegistryObject<Item> ZINC_ORE = block(MinefinityModBlocks.ZINC_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> ZINC_BLOCK = block(MinefinityModBlocks.ZINC_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> RAW_ZINC = REGISTRY.register("raw_zinc", () -> new RawZincItem());
	public static final RegistryObject<Item> DEEPSLATE_ZINC_ORE = block(MinefinityModBlocks.DEEPSLATE_ZINC_ORE,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> RAW_ZINC_BLOCK = block(MinefinityModBlocks.RAW_ZINC_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> ZINC_NUGGET = REGISTRY.register("zinc_nugget", () -> new ZincNuggetItem());
	public static final RegistryObject<Item> IRON_DUST = REGISTRY.register("iron_dust", () -> new IronDustItem());
	public static final RegistryObject<Item> GOLD_DUST = REGISTRY.register("gold_dust", () -> new GoldDustItem());
	public static final RegistryObject<Item> COPPER_DUST = REGISTRY.register("copper_dust", () -> new CopperDustItem());
	public static final RegistryObject<Item> TIN_DUST = REGISTRY.register("tin_dust", () -> new TinDustItem());
	public static final RegistryObject<Item> NICKEL_DUST = REGISTRY.register("nickel_dust", () -> new NickelDustItem());
	public static final RegistryObject<Item> ZINC_DUST = REGISTRY.register("zinc_dust", () -> new ZincDustItem());
	public static final RegistryObject<Item> NETHERITE_DUST = REGISTRY.register("netherite_dust", () -> new NetheriteDustItem());
	public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
	public static final RegistryObject<Item> WOOD_CASING = block(MinefinityModBlocks.WOOD_CASING, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> METALLIC_CRUSHING_HAMMER = block(MinefinityModBlocks.METALLIC_CRUSHING_HAMMER,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
	public static final RegistryObject<Item> BEJEWELED_CRUSHING_HAMMER = block(MinefinityModBlocks.BEJEWELED_CRUSHING_HAMMER,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_ORE = block(MinefinityModBlocks.SILVER_ORE, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> SILVER_BLOCK = block(MinefinityModBlocks.SILVER_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> SILVER_DUST = REGISTRY.register("silver_dust", () -> new SilverDustItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> RAW_SILVER_BLOCK = block(MinefinityModBlocks.RAW_SILVER_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> BASALT_ROD = REGISTRY.register("basalt_rod", () -> new BasaltRodItem());
	public static final RegistryObject<Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", () -> new SilverArmorItem.Helmet());
	public static final RegistryObject<Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate",
			() -> new SilverArmorItem.Chestplate());
	public static final RegistryObject<Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", () -> new SilverArmorItem.Leggings());
	public static final RegistryObject<Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", () -> new SilverArmorItem.Boots());
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(MinefinityModBlocks.BRONZE_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new BrassIngotItem());
	public static final RegistryObject<Item> BRASS_BLOCK = block(MinefinityModBlocks.BRASS_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> CONSTANTAN_INGOT = REGISTRY.register("constantan_ingot", () -> new ConstantanIngotItem());
	public static final RegistryObject<Item> CONSTANTAN_BLOCK = block(MinefinityModBlocks.CONSTANTAN_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", () -> new BronzeNuggetItem());
	public static final RegistryObject<Item> BRASS_NUGGET = REGISTRY.register("brass_nugget", () -> new BrassNuggetItem());
	public static final RegistryObject<Item> CONSTANTAN_NUGGET = REGISTRY.register("constantan_nugget", () -> new ConstantanNuggetItem());
	public static final RegistryObject<Item> ROSE_GOLD_INGOT = REGISTRY.register("rose_gold_ingot", () -> new RoseGoldIngotItem());
	public static final RegistryObject<Item> ROSE_GOLD_BLOCK = block(MinefinityModBlocks.ROSE_GOLD_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> ROSE_GOLD_NUGGET = REGISTRY.register("rose_gold_nugget", () -> new RoseGoldNuggetItem());
	public static final RegistryObject<Item> ELECTRUM_INGOT = REGISTRY.register("electrum_ingot", () -> new ElectrumIngotItem());
	public static final RegistryObject<Item> ELECTRUM_BLOCK = block(MinefinityModBlocks.ELECTRUM_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> ELECTRUM_NUGGET = REGISTRY.register("electrum_nugget", () -> new ElectrumNuggetItem());
	public static final RegistryObject<Item> NETHER_BRICK_FURNACE = block(MinefinityModBlocks.NETHER_BRICK_FURNACE,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> NETHER_TIN_ORE = block(MinefinityModBlocks.NETHER_TIN_ORE, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> ELECTRUM_CASING = block(MinefinityModBlocks.ELECTRUM_CASING, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());
	public static final RegistryObject<Item> NETHERITE_NUGGET = REGISTRY.register("netherite_nugget", () -> new NetheriteNuggetItem());
	public static final RegistryObject<Item> COBALT_INGOT = REGISTRY.register("cobalt_ingot", () -> new CobaltIngotItem());
	public static final RegistryObject<Item> COBALT_ORE = block(MinefinityModBlocks.COBALT_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> COBALT_BLOCK = block(MinefinityModBlocks.COBALT_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> RAW_COBALT = REGISTRY.register("raw_cobalt", () -> new RawCobaltItem());
	public static final RegistryObject<Item> RAW_COBALT_BLOCK = block(MinefinityModBlocks.RAW_COBALT_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> COBALT_DUST = REGISTRY.register("cobalt_dust", () -> new CobaltDustItem());
	public static final RegistryObject<Item> COBALT_NUGGET = REGISTRY.register("cobalt_nugget", () -> new CobaltNuggetItem());
	public static final RegistryObject<Item> INFERNAL_CRUSHING_HAMMER = block(MinefinityModBlocks.INFERNAL_CRUSHING_HAMMER,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> COBALT_PICKAXE = REGISTRY.register("cobalt_pickaxe", () -> new CobaltPickaxeItem());
	public static final RegistryObject<Item> COBALT_AXE = REGISTRY.register("cobalt_axe", () -> new CobaltAxeItem());
	public static final RegistryObject<Item> COBALT_SWORD = REGISTRY.register("cobalt_sword", () -> new CobaltSwordItem());
	public static final RegistryObject<Item> COBALT_SHOVEL = REGISTRY.register("cobalt_shovel", () -> new CobaltShovelItem());
	public static final RegistryObject<Item> COBALT_HOE = REGISTRY.register("cobalt_hoe", () -> new CobaltHoeItem());
	public static final RegistryObject<Item> COBALT_ROD = REGISTRY.register("cobalt_rod", () -> new CobaltRodItem());
	public static final RegistryObject<Item> COBALT_ARMOR_HELMET = REGISTRY.register("cobalt_armor_helmet", () -> new CobaltArmorItem.Helmet());
	public static final RegistryObject<Item> COBALT_ARMOR_CHESTPLATE = REGISTRY.register("cobalt_armor_chestplate",
			() -> new CobaltArmorItem.Chestplate());
	public static final RegistryObject<Item> COBALT_ARMOR_LEGGINGS = REGISTRY.register("cobalt_armor_leggings", () -> new CobaltArmorItem.Leggings());
	public static final RegistryObject<Item> COBALT_ARMOR_BOOTS = REGISTRY.register("cobalt_armor_boots", () -> new CobaltArmorItem.Boots());
	public static final RegistryObject<Item> SOUL_COAL = REGISTRY.register("soul_coal", () -> new SoulCoalItem());
	public static final RegistryObject<Item> NETHERHEART_FORGE_CRAFTING_MODULE = REGISTRY.register("netherheart_forge_crafting_module",
			() -> new NetherheartForgeCraftingModuleItem());
	public static final RegistryObject<Item> NETHERHEART_FORGE_ALLOYING_MODULE = REGISTRY.register("netherheart_forge_alloying_module",
			() -> new NetherheartForgeAlloyingModuleItem());
	public static final RegistryObject<Item> NETHERHEART_FORGE_SMELTING_MODULE = REGISTRY.register("netherheart_forge_smelting_module",
			() -> new NetherheartForgeSmeltingModuleItem());
	public static final RegistryObject<Item> NETHERHEART_FORGE = block(MinefinityModBlocks.NETHERHEART_FORGE,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_WOOD = block(MinefinityModBlocks.BLAZEWOOD_WOOD, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_LOG = block(MinefinityModBlocks.BLAZEWOOD_LOG, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_PLANKS = block(MinefinityModBlocks.BLAZEWOOD_PLANKS, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_STAIRS = block(MinefinityModBlocks.BLAZEWOOD_STAIRS, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_SLAB = block(MinefinityModBlocks.BLAZEWOOD_SLAB, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_FENCE = block(MinefinityModBlocks.BLAZEWOOD_FENCE, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_FENCE_GATE = block(MinefinityModBlocks.BLAZEWOOD_FENCE_GATE,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_PRESSURE_PLATE = block(MinefinityModBlocks.BLAZEWOOD_PRESSURE_PLATE,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWOOD_BUTTON = block(MinefinityModBlocks.BLAZEWOOD_BUTTON, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BLAZEWART_BLOCK = block(MinefinityModBlocks.BLAZEWART_BLOCK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BURNT_NETHERRACK = block(MinefinityModBlocks.BURNT_NETHERRACK, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> BURNING_NYLIUM = block(MinefinityModBlocks.BURNING_NYLIUM, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MAGMITE_INGOT = REGISTRY.register("magmite_ingot", () -> new MagmiteIngotItem());
	public static final RegistryObject<Item> MAGMITE_ORE = block(MinefinityModBlocks.MAGMITE_ORE, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MAGMITE_BLOCK = block(MinefinityModBlocks.MAGMITE_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> RAW_MAGMITE = REGISTRY.register("raw_magmite", () -> new RawMagmiteItem());
	public static final RegistryObject<Item> MAGMITE_DUST = REGISTRY.register("magmite_dust", () -> new MagmiteDustItem());
	public static final RegistryObject<Item> RAW_MAGMITE_BLOCK = block(MinefinityModBlocks.RAW_MAGMITE_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MAGMITE_NUGGET = REGISTRY.register("magmite_nugget", () -> new MagmiteNuggetItem());
	public static final RegistryObject<Item> MAGMITE_PICKAXE = REGISTRY.register("magmite_pickaxe", () -> new MagmitePickaxeItem());
	public static final RegistryObject<Item> MAGMITE_AXE = REGISTRY.register("magmite_axe", () -> new MagmiteAxeItem());
	public static final RegistryObject<Item> MAGMITE_SWORD = REGISTRY.register("magmite_sword", () -> new MagmiteSwordItem());
	public static final RegistryObject<Item> MAGMITE_SHOVEL = REGISTRY.register("magmite_shovel", () -> new MagmiteShovelItem());
	public static final RegistryObject<Item> MAGMITE_HOE = REGISTRY.register("magmite_hoe", () -> new MagmiteHoeItem());
	public static final RegistryObject<Item> MAGMITE_ARMOR_HELMET = REGISTRY.register("magmite_armor_helmet", () -> new MagmiteArmorItem.Helmet());
	public static final RegistryObject<Item> MAGMITE_ARMOR_CHESTPLATE = REGISTRY.register("magmite_armor_chestplate",
			() -> new MagmiteArmorItem.Chestplate());
	public static final RegistryObject<Item> MAGMITE_ARMOR_LEGGINGS = REGISTRY.register("magmite_armor_leggings",
			() -> new MagmiteArmorItem.Leggings());
	public static final RegistryObject<Item> MAGMITE_ARMOR_BOOTS = REGISTRY.register("magmite_armor_boots", () -> new MagmiteArmorItem.Boots());
	public static final RegistryObject<Item> GARNET = REGISTRY.register("garnet", () -> new GarnetItem());
	public static final RegistryObject<Item> GARNET_ORE = block(MinefinityModBlocks.GARNET_ORE, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> GARNET_BLOCK = block(MinefinityModBlocks.GARNET_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> GARNET_GEM_PICKAXE = REGISTRY.register("garnet_gem_pickaxe", () -> new GarnetGemPickaxeItem());
	public static final RegistryObject<Item> GARNET_GEM_AXE = REGISTRY.register("garnet_gem_axe", () -> new GarnetGemAxeItem());
	public static final RegistryObject<Item> GARNET_GEM_SWORD = REGISTRY.register("garnet_gem_sword", () -> new GarnetGemSwordItem());
	public static final RegistryObject<Item> GARNET_GEM_SHOVEL = REGISTRY.register("garnet_gem_shovel", () -> new GarnetGemShovelItem());
	public static final RegistryObject<Item> GARNET_GEM_HOE = REGISTRY.register("garnet_gem_hoe", () -> new GarnetGemHoeItem());
	public static final RegistryObject<Item> NETHERRACK_ROD = REGISTRY.register("netherrack_rod", () -> new NetherrackRodItem());
	public static final RegistryObject<Item> GARNET_GEM_ARMOR_HELMET = REGISTRY.register("garnet_gem_armor_helmet",
			() -> new GarnetGemArmorItem.Helmet());
	public static final RegistryObject<Item> GARNET_GEM_ARMOR_CHESTPLATE = REGISTRY.register("garnet_gem_armor_chestplate",
			() -> new GarnetGemArmorItem.Chestplate());
	public static final RegistryObject<Item> GARNET_GEM_ARMOR_LEGGINGS = REGISTRY.register("garnet_gem_armor_leggings",
			() -> new GarnetGemArmorItem.Leggings());
	public static final RegistryObject<Item> GARNET_GEM_ARMOR_BOOTS = REGISTRY.register("garnet_gem_armor_boots",
			() -> new GarnetGemArmorItem.Boots());
	public static final RegistryObject<Item> ELECTRUM_ALTAR = block(MinefinityModBlocks.ELECTRUM_ALTAR, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MAGMITE_APPLE = REGISTRY.register("magmite_apple", () -> new MagmiteAppleItem());
	public static final RegistryObject<Item> DIAMOND_APPLE = REGISTRY.register("diamond_apple", () -> new DiamondAppleItem());
	public static final RegistryObject<Item> NETHERITE_APPLE = REGISTRY.register("netherite_apple", () -> new NetheriteAppleItem());
	public static final RegistryObject<Item> COBALT_APPLE = REGISTRY.register("cobalt_apple", () -> new CobaltAppleItem());
	public static final RegistryObject<Item> IRON_HEART = REGISTRY.register("iron_heart", () -> new IronHeartItem());
	public static final RegistryObject<Item> DIAMOND_HEART = REGISTRY.register("diamond_heart", () -> new DiamondHeartItem());
	public static final RegistryObject<Item> NETHERITE_HEART = REGISTRY.register("netherite_heart", () -> new NetheriteHeartItem());
	public static final RegistryObject<Item> COBALT_HEART = REGISTRY.register("cobalt_heart", () -> new CobaltHeartItem());
	public static final RegistryObject<Item> COBALT_ANCHOR = block(MinefinityModBlocks.COBALT_ANCHOR, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> IRON_DUST_BLOCK = block(MinefinityModBlocks.IRON_DUST_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> GOLD_DUST_BLOCK = block(MinefinityModBlocks.GOLD_DUST_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> COPPER_DUST_BLOCK = block(MinefinityModBlocks.COPPER_DUST_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> TIN_DUST_BLOCK = block(MinefinityModBlocks.TIN_DUST_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> NICKEL_DUST_BLOCK = block(MinefinityModBlocks.NICKEL_DUST_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> ZINC_DUST_BLOCK = block(MinefinityModBlocks.ZINC_DUST_BLOCK, MinefinityModTabs.TAB_MINEFINITY_BASICS);
	public static final RegistryObject<Item> SILVER_DUST_BLOCK = block(MinefinityModBlocks.SILVER_DUST_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> COBALT_DUST_BLOCK = block(MinefinityModBlocks.COBALT_DUST_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MAGMITE_DUST_BLOCK = block(MinefinityModBlocks.MAGMITE_DUST_BLOCK,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> NETHER_WHEAT = REGISTRY.register("nether_wheat", () -> new NetherWheatItem());
	public static final RegistryObject<Item> NETHER_BREAD = REGISTRY.register("nether_bread", () -> new NetherBreadItem());
	public static final RegistryObject<Item> BLAZEWOOD_PURIFIER = block(MinefinityModBlocks.BLAZEWOOD_PURIFIER,
			MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> CHORUS_PHYLIUM = block(MinefinityModBlocks.CHORUS_PHYLIUM, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_WOOD = block(MinefinityModBlocks.CHORUSWOOD_WOOD, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_LOG = block(MinefinityModBlocks.CHORUSWOOD_LOG, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_PLANKS = block(MinefinityModBlocks.CHORUSWOOD_PLANKS, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_STAIRS = block(MinefinityModBlocks.CHORUSWOOD_STAIRS, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_SLAB = block(MinefinityModBlocks.CHORUSWOOD_SLAB, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_FENCE = block(MinefinityModBlocks.CHORUSWOOD_FENCE, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_FENCE_GATE = block(MinefinityModBlocks.CHORUSWOOD_FENCE_GATE,
			MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_PRESSURE_PLATE = block(MinefinityModBlocks.CHORUSWOOD_PRESSURE_PLATE,
			MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUSWOOD_BUTTON = block(MinefinityModBlocks.CHORUSWOOD_BUTTON, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUS_LIGHT = block(MinefinityModBlocks.CHORUS_LIGHT, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> PEARLESCENT_INGOT = REGISTRY.register("pearlescent_ingot", () -> new PearlescentIngotItem());
	public static final RegistryObject<Item> PEARLESCENT_BLOCK = block(MinefinityModBlocks.PEARLESCENT_BLOCK, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> PEARLESCENT_NUGGET = REGISTRY.register("pearlescent_nugget", () -> new PearlescentNuggetItem());
	public static final RegistryObject<Item> ENDER_WART = block(MinefinityModBlocks.ENDER_WART, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> CHORUS_CORE = REGISTRY.register("chorus_core", () -> new ChorusCoreItem());
	public static final RegistryObject<Item> CATALYTIC_CHORUS_CORE = REGISTRY.register("catalytic_chorus_core", () -> new CatalyticChorusCoreItem());
	public static final RegistryObject<Item> WARPED_STONE = block(MinefinityModBlocks.WARPED_STONE, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> UNPREPARED_END_PORTAL_FRAME = block(MinefinityModBlocks.UNPREPARED_END_PORTAL_FRAME,
			MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> ENDERGIZER = block(MinefinityModBlocks.ENDERGIZER, MinefinityModTabs.TAB_MINEFINITY_NETHER);
	public static final RegistryObject<Item> MELODITE_INGOT = REGISTRY.register("melodite_ingot", () -> new MeloditeIngotItem());
	public static final RegistryObject<Item> MELODITE_ORE = block(MinefinityModBlocks.MELODITE_ORE, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> MELODITE_BLOCK = block(MinefinityModBlocks.MELODITE_BLOCK, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> MELODITE_SHARD = REGISTRY.register("melodite_shard", () -> new MeloditeShardItem());
	public static final RegistryObject<Item> MELODITE_NUGGET = REGISTRY.register("melodite_nugget", () -> new MeloditeNuggetItem());
	public static final RegistryObject<Item> COBALT_HAMMER = REGISTRY.register("cobalt_hammer", () -> new CobaltHammerItem());
	public static final RegistryObject<Item> PEARLESCENT_CASING = block(MinefinityModBlocks.PEARLESCENT_CASING, MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> MELODITE_DUST = REGISTRY.register("melodite_dust", () -> new MeloditeDustItem());
	public static final RegistryObject<Item> ENDERGIZED_CRUSHING_HAMMER = block(MinefinityModBlocks.ENDERGIZED_CRUSHING_HAMMER,
			MinefinityModTabs.TAB_MINEFINITY_END);
	public static final RegistryObject<Item> MELODITE_PICKAXE = REGISTRY.register("melodite_pickaxe", () -> new MeloditePickaxeItem());
	public static final RegistryObject<Item> MELODITE_AXE = REGISTRY.register("melodite_axe", () -> new MeloditeAxeItem());
	public static final RegistryObject<Item> MELODITE_SWORD = REGISTRY.register("melodite_sword", () -> new MeloditeSwordItem());
	public static final RegistryObject<Item> MELODITE_SHOVEL = REGISTRY.register("melodite_shovel", () -> new MeloditeShovelItem());
	public static final RegistryObject<Item> MELODITE_HOE = REGISTRY.register("melodite_hoe", () -> new MeloditeHoeItem());
	public static final RegistryObject<Item> MELODITE_ROD = REGISTRY.register("melodite_rod", () -> new MeloditeRodItem());
	public static final RegistryObject<Item> MELODITE_ARMOR_HELMET = REGISTRY.register("melodite_armor_helmet", () -> new MeloditeArmorItem.Helmet());
	public static final RegistryObject<Item> MELODITE_ARMOR_CHESTPLATE = REGISTRY.register("melodite_armor_chestplate",
			() -> new MeloditeArmorItem.Chestplate());
	public static final RegistryObject<Item> MELODITE_ARMOR_LEGGINGS = REGISTRY.register("melodite_armor_leggings",
			() -> new MeloditeArmorItem.Leggings());
	public static final RegistryObject<Item> MELODITE_ARMOR_BOOTS = REGISTRY.register("melodite_armor_boots", () -> new MeloditeArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
