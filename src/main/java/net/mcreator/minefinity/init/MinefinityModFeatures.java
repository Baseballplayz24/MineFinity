
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.minefinity.world.features.plants.EnderWartFeature;
import net.mcreator.minefinity.world.features.ores.ZincOreFeature;
import net.mcreator.minefinity.world.features.ores.WarpedStoneFeature;
import net.mcreator.minefinity.world.features.ores.TinOreFeature;
import net.mcreator.minefinity.world.features.ores.SilverOreFeature;
import net.mcreator.minefinity.world.features.ores.NickelOreFeature;
import net.mcreator.minefinity.world.features.ores.NetherTinOreFeature;
import net.mcreator.minefinity.world.features.ores.MeloditeOreFeature;
import net.mcreator.minefinity.world.features.ores.MarbleDiamondOreFeature;
import net.mcreator.minefinity.world.features.ores.MagmiteOreFeature;
import net.mcreator.minefinity.world.features.ores.LigniteIronOreFeature;
import net.mcreator.minefinity.world.features.ores.LigniteFeature;
import net.mcreator.minefinity.world.features.ores.GarnetOreFeature;
import net.mcreator.minefinity.world.features.ores.DeepslateZincOreFeature;
import net.mcreator.minefinity.world.features.ores.DeepslateTinOreFeature;
import net.mcreator.minefinity.world.features.ores.DeepslateNickelOreFeature;
import net.mcreator.minefinity.world.features.ores.CobaltOreFeature;
import net.mcreator.minefinity.world.features.ChorusIslandFeature;
import net.mcreator.minefinity.MinefinityMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MinefinityModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MinefinityMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> TIN_ORE = register("tin_ore", TinOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", DeepslateTinOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateTinOreFeature.GENERATE_BIOMES,
					DeepslateTinOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MARBLE_DIAMOND_ORE = register("marble_diamond_ore", MarbleDiamondOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MarbleDiamondOreFeature.GENERATE_BIOMES,
					MarbleDiamondOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LIGNITE = register("lignite", LigniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LigniteFeature.GENERATE_BIOMES, LigniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LIGNITE_IRON_ORE = register("lignite_iron_ore", LigniteIronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LigniteIronOreFeature.GENERATE_BIOMES,
					LigniteIronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NICKEL_ORE = register("nickel_ore", NickelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NickelOreFeature.GENERATE_BIOMES, NickelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_NICKEL_ORE = register("deepslate_nickel_ore", DeepslateNickelOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateNickelOreFeature.GENERATE_BIOMES,
					DeepslateNickelOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ZINC_ORE = register("zinc_ore", ZincOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ZincOreFeature.GENERATE_BIOMES, ZincOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DEEPSLATE_ZINC_ORE = register("deepslate_zinc_ore", DeepslateZincOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DeepslateZincOreFeature.GENERATE_BIOMES,
					DeepslateZincOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SILVER_ORE = register("silver_ore", SilverOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES, SilverOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> NETHER_TIN_ORE = register("nether_tin_ore", NetherTinOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, NetherTinOreFeature.GENERATE_BIOMES, NetherTinOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COBALT_ORE = register("cobalt_ore", CobaltOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CobaltOreFeature.GENERATE_BIOMES, CobaltOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAGMITE_ORE = register("magmite_ore", MagmiteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MagmiteOreFeature.GENERATE_BIOMES, MagmiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GARNET_ORE = register("garnet_ore", GarnetOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GarnetOreFeature.GENERATE_BIOMES, GarnetOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CHORUS_ISLAND = register("chorus_island", ChorusIslandFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.RAW_GENERATION, ChorusIslandFeature.GENERATE_BIOMES, ChorusIslandFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENDER_WART = register("ender_wart", EnderWartFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, EnderWartFeature.GENERATE_BIOMES, EnderWartFeature::placedFeature));
	public static final RegistryObject<Feature<?>> WARPED_STONE = register("warped_stone", WarpedStoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, WarpedStoneFeature.GENERATE_BIOMES, WarpedStoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MELODITE_ORE = register("melodite_ore", MeloditeOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MeloditeOreFeature.GENERATE_BIOMES, MeloditeOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
