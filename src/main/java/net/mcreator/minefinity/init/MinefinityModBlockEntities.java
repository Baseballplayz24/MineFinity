
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.minefinity.block.entity.SeedEggstractorBlockEntity;
import net.mcreator.minefinity.block.entity.NetherheartForgeBlockEntity;
import net.mcreator.minefinity.block.entity.NetherBrickFurnaceBlockEntity;
import net.mcreator.minefinity.block.entity.MetallicCrushingHammerBlockEntity;
import net.mcreator.minefinity.block.entity.InfernalCrushingHammerBlockEntity;
import net.mcreator.minefinity.block.entity.EndergizerBlockEntity;
import net.mcreator.minefinity.block.entity.EndergizedCrushingHammerBlockEntity;
import net.mcreator.minefinity.block.entity.ElectrumAltarBlockEntity;
import net.mcreator.minefinity.block.entity.BlazewoodPurifierBlockEntity;
import net.mcreator.minefinity.block.entity.BejeweledCrushingHammerBlockEntity;
import net.mcreator.minefinity.MinefinityMod;

public class MinefinityModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MinefinityMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> METALLIC_CRUSHING_HAMMER = register("metallic_crushing_hammer",
			MinefinityModBlocks.METALLIC_CRUSHING_HAMMER, MetallicCrushingHammerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BEJEWELED_CRUSHING_HAMMER = register("bejeweled_crushing_hammer",
			MinefinityModBlocks.BEJEWELED_CRUSHING_HAMMER, BejeweledCrushingHammerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_BRICK_FURNACE = register("nether_brick_furnace",
			MinefinityModBlocks.NETHER_BRICK_FURNACE, NetherBrickFurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INFERNAL_CRUSHING_HAMMER = register("infernal_crushing_hammer",
			MinefinityModBlocks.INFERNAL_CRUSHING_HAMMER, InfernalCrushingHammerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHERHEART_FORGE = register("netherheart_forge", MinefinityModBlocks.NETHERHEART_FORGE,
			NetherheartForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ELECTRUM_ALTAR = register("electrum_altar", MinefinityModBlocks.ELECTRUM_ALTAR,
			ElectrumAltarBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BLAZEWOOD_PURIFIER = register("blazewood_purifier", MinefinityModBlocks.BLAZEWOOD_PURIFIER,
			BlazewoodPurifierBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDERGIZER = register("endergizer", MinefinityModBlocks.ENDERGIZER,
			EndergizerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ENDERGIZED_CRUSHING_HAMMER = register("endergized_crushing_hammer",
			MinefinityModBlocks.ENDERGIZED_CRUSHING_HAMMER, EndergizedCrushingHammerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SEED_EGGSTRACTOR = register("seed_eggstractor", MinefinityModBlocks.SEED_EGGSTRACTOR,
			SeedEggstractorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
