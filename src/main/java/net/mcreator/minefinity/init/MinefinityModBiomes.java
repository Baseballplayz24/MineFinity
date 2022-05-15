
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.minefinity.world.biome.MushroomCavesBiome;
import net.mcreator.minefinity.world.biome.MarbleCavesBiome;
import net.mcreator.minefinity.world.biome.LigniteCavesBiome;
import net.mcreator.minefinity.world.biome.BlazingJungleBiome;
import net.mcreator.minefinity.MinefinityMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinefinityModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, MinefinityMod.MODID);
	public static final RegistryObject<Biome> MARBLE_CAVES = REGISTRY.register("marble_caves", () -> MarbleCavesBiome.createBiome());
	public static final RegistryObject<Biome> LIGNITE_CAVES = REGISTRY.register("lignite_caves", () -> LigniteCavesBiome.createBiome());
	public static final RegistryObject<Biome> MUSHROOM_CAVES = REGISTRY.register("mushroom_caves", () -> MushroomCavesBiome.createBiome());
	public static final RegistryObject<Biome> BLAZING_JUNGLE = REGISTRY.register("blazing_jungle", () -> BlazingJungleBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MarbleCavesBiome.init();
			LigniteCavesBiome.init();
			MushroomCavesBiome.init();
			BlazingJungleBiome.init();
		});
	}

	@Mod.EventBusSubscriber
	public static class BiomeInjector {
		@SubscribeEvent
		public static void onServerAboutToStart(ServerAboutToStartEvent event) {
			MinecraftServer server = event.getServer();
			Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
			Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
			WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
			for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
				DimensionType dimensionType = entry.getValue().typeHolder().value();
				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(MarbleCavesBiome.PARAMETER_POINT_UNDERGROUND,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVES.getId()))));
						parameters.add(new Pair<>(LigniteCavesBiome.PARAMETER_POINT_UNDERGROUND,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, LIGNITE_CAVES.getId()))));
						parameters.add(new Pair<>(MushroomCavesBiome.PARAMETER_POINT_UNDERGROUND,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, MUSHROOM_CAVES.getId()))));

						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MARBLE_CAVES.getId()),
									MinefinityModBlocks.MARBLE.get().defaultBlockState(), MinefinityModBlocks.MARBLE.get().defaultBlockState(),
									MinefinityModBlocks.MARBLE.get().defaultBlockState()));
							surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, LIGNITE_CAVES.getId()),
									MinefinityModBlocks.LIGNITE.get().defaultBlockState(), MinefinityModBlocks.LIGNITE.get().defaultBlockState(),
									MinefinityModBlocks.LIGNITE.get().defaultBlockState()));
							surfaceRules.add(1,
									anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, MUSHROOM_CAVES.getId()),
											MinefinityModBlocks.STONECELIUM.get().defaultBlockState(), Blocks.STONE.defaultBlockState(),
											Blocks.STONE.defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}

				if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.NETHER_LOCATION)) {
					ChunkGenerator chunkGenerator = entry.getValue().generator();
					// Inject biomes to biome source
					if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
						List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
						parameters.add(new Pair<>(BlazingJungleBiome.PARAMETER_POINT,
								biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, BLAZING_JUNGLE.getId()))));
						MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters),
								noiseSource.preset);
						chunkGenerator.biomeSource = moddedNoiseSource;
						chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
					}
					// Inject surface rules
					if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
						NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
						SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
						if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
							List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
							surfaceRules.add(2,
									anySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, BLAZING_JUNGLE.getId()),
											MinefinityModBlocks.BURNING_NYLIUM.get().defaultBlockState(),
											MinefinityModBlocks.BURNT_NETHERRACK.get().defaultBlockState(),
											MinefinityModBlocks.BURNT_NETHERRACK.get().defaultBlockState()));
							NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
									noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
									noiseGeneratorSettings.noiseRouter(),
									SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])),
									noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(),
									noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(),
									noiseGeneratorSettings.useLegacyRandomSource());
							noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
						}
					}
				}
			}
		}

		private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock,
				BlockState underwaterBlock) {
			return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
					SurfaceRules.sequence(
							SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
									SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)),
											SurfaceRules.state(underwaterBlock))),
							SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
		}
	}
}
