
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.minefinity.block.ZincOreBlock;
import net.mcreator.minefinity.block.ZincDustBlockBlock;
import net.mcreator.minefinity.block.ZincBlockBlock;
import net.mcreator.minefinity.block.WoodCasingBlock;
import net.mcreator.minefinity.block.TinOreBlock;
import net.mcreator.minefinity.block.TinDustBlockBlock;
import net.mcreator.minefinity.block.TinBlockBlock;
import net.mcreator.minefinity.block.StoneceliumBlock;
import net.mcreator.minefinity.block.SilverOreBlock;
import net.mcreator.minefinity.block.SilverBlockBlock;
import net.mcreator.minefinity.block.RoseGoldBlockBlock;
import net.mcreator.minefinity.block.RawZincBlockBlock;
import net.mcreator.minefinity.block.RawTinBlockBlock;
import net.mcreator.minefinity.block.RawSilverBlockBlock;
import net.mcreator.minefinity.block.RawNickelBlockBlock;
import net.mcreator.minefinity.block.RawMagmiteBlockBlock;
import net.mcreator.minefinity.block.RawCobaltBlockBlock;
import net.mcreator.minefinity.block.NickelOreBlock;
import net.mcreator.minefinity.block.NickelDustBlockBlock;
import net.mcreator.minefinity.block.NickelBlockBlock;
import net.mcreator.minefinity.block.NetherheartForgeBlock;
import net.mcreator.minefinity.block.NetherTinOreBlock;
import net.mcreator.minefinity.block.NetherBrickFurnaceBlock;
import net.mcreator.minefinity.block.MetallicCrushingHammerBlock;
import net.mcreator.minefinity.block.MarbleDiamondOreBlock;
import net.mcreator.minefinity.block.MarbleBlock;
import net.mcreator.minefinity.block.MagmiteOreBlock;
import net.mcreator.minefinity.block.MagmiteBlockBlock;
import net.mcreator.minefinity.block.LigniteIronOreBlock;
import net.mcreator.minefinity.block.LigniteBlock;
import net.mcreator.minefinity.block.IronDustBlockBlock;
import net.mcreator.minefinity.block.InfernalCrushingHammerBlock;
import net.mcreator.minefinity.block.GoldDustBlockBlock;
import net.mcreator.minefinity.block.GarnetOreBlock;
import net.mcreator.minefinity.block.GarnetBlockBlock;
import net.mcreator.minefinity.block.ElectrumCasingBlock;
import net.mcreator.minefinity.block.ElectrumBlockBlock;
import net.mcreator.minefinity.block.ElectrumAltarBlock;
import net.mcreator.minefinity.block.DeepslateZincOreBlock;
import net.mcreator.minefinity.block.DeepslateTinOreBlock;
import net.mcreator.minefinity.block.DeepslateNickelOreBlock;
import net.mcreator.minefinity.block.CopperDustBlockBlock;
import net.mcreator.minefinity.block.ConstantanBlockBlock;
import net.mcreator.minefinity.block.CobaltOreBlock;
import net.mcreator.minefinity.block.CobaltBlockBlock;
import net.mcreator.minefinity.block.CobaltAnchorBlock;
import net.mcreator.minefinity.block.BurntNetherrackBlock;
import net.mcreator.minefinity.block.BurningNyliumBlock;
import net.mcreator.minefinity.block.BronzeBlockBlock;
import net.mcreator.minefinity.block.BrassBlockBlock;
import net.mcreator.minefinity.block.BlazewoodWoodBlock;
import net.mcreator.minefinity.block.BlazewoodStairsBlock;
import net.mcreator.minefinity.block.BlazewoodSlabBlock;
import net.mcreator.minefinity.block.BlazewoodPressurePlateBlock;
import net.mcreator.minefinity.block.BlazewoodPlanksBlock;
import net.mcreator.minefinity.block.BlazewoodLogBlock;
import net.mcreator.minefinity.block.BlazewoodFenceGateBlock;
import net.mcreator.minefinity.block.BlazewoodFenceBlock;
import net.mcreator.minefinity.block.BlazewoodButtonBlock;
import net.mcreator.minefinity.block.BlazewartBlockBlock;
import net.mcreator.minefinity.block.BejeweledCrushingHammerBlock;
import net.mcreator.minefinity.MinefinityMod;

public class MinefinityModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinefinityMod.MODID);
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new TinOreBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", () -> new RawTinBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = REGISTRY.register("deepslate_tin_ore", () -> new DeepslateTinOreBlock());
	public static final RegistryObject<Block> MARBLE = REGISTRY.register("marble", () -> new MarbleBlock());
	public static final RegistryObject<Block> MARBLE_DIAMOND_ORE = REGISTRY.register("marble_diamond_ore", () -> new MarbleDiamondOreBlock());
	public static final RegistryObject<Block> LIGNITE = REGISTRY.register("lignite", () -> new LigniteBlock());
	public static final RegistryObject<Block> LIGNITE_IRON_ORE = REGISTRY.register("lignite_iron_ore", () -> new LigniteIronOreBlock());
	public static final RegistryObject<Block> STONECELIUM = REGISTRY.register("stonecelium", () -> new StoneceliumBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> RAW_NICKEL_BLOCK = REGISTRY.register("raw_nickel_block", () -> new RawNickelBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = REGISTRY.register("deepslate_nickel_ore", () -> new DeepslateNickelOreBlock());
	public static final RegistryObject<Block> ZINC_ORE = REGISTRY.register("zinc_ore", () -> new ZincOreBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = REGISTRY.register("deepslate_zinc_ore", () -> new DeepslateZincOreBlock());
	public static final RegistryObject<Block> RAW_ZINC_BLOCK = REGISTRY.register("raw_zinc_block", () -> new RawZincBlockBlock());
	public static final RegistryObject<Block> WOOD_CASING = REGISTRY.register("wood_casing", () -> new WoodCasingBlock());
	public static final RegistryObject<Block> METALLIC_CRUSHING_HAMMER = REGISTRY.register("metallic_crushing_hammer",
			() -> new MetallicCrushingHammerBlock());
	public static final RegistryObject<Block> BEJEWELED_CRUSHING_HAMMER = REGISTRY.register("bejeweled_crushing_hammer",
			() -> new BejeweledCrushingHammerBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", () -> new RawSilverBlockBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> BRASS_BLOCK = REGISTRY.register("brass_block", () -> new BrassBlockBlock());
	public static final RegistryObject<Block> CONSTANTAN_BLOCK = REGISTRY.register("constantan_block", () -> new ConstantanBlockBlock());
	public static final RegistryObject<Block> ROSE_GOLD_BLOCK = REGISTRY.register("rose_gold_block", () -> new RoseGoldBlockBlock());
	public static final RegistryObject<Block> ELECTRUM_BLOCK = REGISTRY.register("electrum_block", () -> new ElectrumBlockBlock());
	public static final RegistryObject<Block> NETHER_BRICK_FURNACE = REGISTRY.register("nether_brick_furnace", () -> new NetherBrickFurnaceBlock());
	public static final RegistryObject<Block> NETHER_TIN_ORE = REGISTRY.register("nether_tin_ore", () -> new NetherTinOreBlock());
	public static final RegistryObject<Block> ELECTRUM_CASING = REGISTRY.register("electrum_casing", () -> new ElectrumCasingBlock());
	public static final RegistryObject<Block> COBALT_ORE = REGISTRY.register("cobalt_ore", () -> new CobaltOreBlock());
	public static final RegistryObject<Block> COBALT_BLOCK = REGISTRY.register("cobalt_block", () -> new CobaltBlockBlock());
	public static final RegistryObject<Block> RAW_COBALT_BLOCK = REGISTRY.register("raw_cobalt_block", () -> new RawCobaltBlockBlock());
	public static final RegistryObject<Block> INFERNAL_CRUSHING_HAMMER = REGISTRY.register("infernal_crushing_hammer",
			() -> new InfernalCrushingHammerBlock());
	public static final RegistryObject<Block> NETHERHEART_FORGE = REGISTRY.register("netherheart_forge", () -> new NetherheartForgeBlock());
	public static final RegistryObject<Block> BLAZEWOOD_WOOD = REGISTRY.register("blazewood_wood", () -> new BlazewoodWoodBlock());
	public static final RegistryObject<Block> BLAZEWOOD_LOG = REGISTRY.register("blazewood_log", () -> new BlazewoodLogBlock());
	public static final RegistryObject<Block> BLAZEWOOD_PLANKS = REGISTRY.register("blazewood_planks", () -> new BlazewoodPlanksBlock());
	public static final RegistryObject<Block> BLAZEWOOD_STAIRS = REGISTRY.register("blazewood_stairs", () -> new BlazewoodStairsBlock());
	public static final RegistryObject<Block> BLAZEWOOD_SLAB = REGISTRY.register("blazewood_slab", () -> new BlazewoodSlabBlock());
	public static final RegistryObject<Block> BLAZEWOOD_FENCE = REGISTRY.register("blazewood_fence", () -> new BlazewoodFenceBlock());
	public static final RegistryObject<Block> BLAZEWOOD_FENCE_GATE = REGISTRY.register("blazewood_fence_gate", () -> new BlazewoodFenceGateBlock());
	public static final RegistryObject<Block> BLAZEWOOD_PRESSURE_PLATE = REGISTRY.register("blazewood_pressure_plate",
			() -> new BlazewoodPressurePlateBlock());
	public static final RegistryObject<Block> BLAZEWOOD_BUTTON = REGISTRY.register("blazewood_button", () -> new BlazewoodButtonBlock());
	public static final RegistryObject<Block> BLAZEWART_BLOCK = REGISTRY.register("blazewart_block", () -> new BlazewartBlockBlock());
	public static final RegistryObject<Block> BURNT_NETHERRACK = REGISTRY.register("burnt_netherrack", () -> new BurntNetherrackBlock());
	public static final RegistryObject<Block> BURNING_NYLIUM = REGISTRY.register("burning_nylium", () -> new BurningNyliumBlock());
	public static final RegistryObject<Block> MAGMITE_ORE = REGISTRY.register("magmite_ore", () -> new MagmiteOreBlock());
	public static final RegistryObject<Block> MAGMITE_BLOCK = REGISTRY.register("magmite_block", () -> new MagmiteBlockBlock());
	public static final RegistryObject<Block> RAW_MAGMITE_BLOCK = REGISTRY.register("raw_magmite_block", () -> new RawMagmiteBlockBlock());
	public static final RegistryObject<Block> GARNET_ORE = REGISTRY.register("garnet_ore", () -> new GarnetOreBlock());
	public static final RegistryObject<Block> GARNET_BLOCK = REGISTRY.register("garnet_block", () -> new GarnetBlockBlock());
	public static final RegistryObject<Block> ELECTRUM_ALTAR = REGISTRY.register("electrum_altar", () -> new ElectrumAltarBlock());
	public static final RegistryObject<Block> COBALT_ANCHOR = REGISTRY.register("cobalt_anchor", () -> new CobaltAnchorBlock());
	public static final RegistryObject<Block> IRON_DUST_BLOCK = REGISTRY.register("iron_dust_block", () -> new IronDustBlockBlock());
	public static final RegistryObject<Block> GOLD_DUST_BLOCK = REGISTRY.register("gold_dust_block", () -> new GoldDustBlockBlock());
	public static final RegistryObject<Block> COPPER_DUST_BLOCK = REGISTRY.register("copper_dust_block", () -> new CopperDustBlockBlock());
	public static final RegistryObject<Block> TIN_DUST_BLOCK = REGISTRY.register("tin_dust_block", () -> new TinDustBlockBlock());
	public static final RegistryObject<Block> NICKEL_DUST_BLOCK = REGISTRY.register("nickel_dust_block", () -> new NickelDustBlockBlock());
	public static final RegistryObject<Block> ZINC_DUST_BLOCK = REGISTRY.register("zinc_dust_block", () -> new ZincDustBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ElectrumAltarBlock.registerRenderLayer();
		}
	}
}
