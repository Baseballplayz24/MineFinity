
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.minefinity.world.inventory.NetherheartForgeGUIMenu;
import net.mcreator.minefinity.world.inventory.NetherBrickFurnaceGUIMenu;
import net.mcreator.minefinity.world.inventory.EndergizerGUIMenu;
import net.mcreator.minefinity.world.inventory.EggstractorGUIMenu;
import net.mcreator.minefinity.world.inventory.CrushingHammer4GUIMenu;
import net.mcreator.minefinity.world.inventory.CrushingHammer3GUIMenu;
import net.mcreator.minefinity.world.inventory.CrushingHammer2GUIMenu;
import net.mcreator.minefinity.world.inventory.CrushingHammer1GUIMenu;
import net.mcreator.minefinity.world.inventory.BlazewoodPurifierGUIMenu;
import net.mcreator.minefinity.world.inventory.BasicAltarGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinefinityModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CrushingHammer1GUIMenu> CRUSHING_HAMMER_1_GUI = register("crushing_hammer_1_gui",
			(id, inv, extraData) -> new CrushingHammer1GUIMenu(id, inv, extraData));
	public static final MenuType<CrushingHammer2GUIMenu> CRUSHING_HAMMER_2_GUI = register("crushing_hammer_2_gui",
			(id, inv, extraData) -> new CrushingHammer2GUIMenu(id, inv, extraData));
	public static final MenuType<NetherBrickFurnaceGUIMenu> NETHER_BRICK_FURNACE_GUI = register("nether_brick_furnace_gui",
			(id, inv, extraData) -> new NetherBrickFurnaceGUIMenu(id, inv, extraData));
	public static final MenuType<CrushingHammer3GUIMenu> CRUSHING_HAMMER_3_GUI = register("crushing_hammer_3_gui",
			(id, inv, extraData) -> new CrushingHammer3GUIMenu(id, inv, extraData));
	public static final MenuType<NetherheartForgeGUIMenu> NETHERHEART_FORGE_GUI = register("netherheart_forge_gui",
			(id, inv, extraData) -> new NetherheartForgeGUIMenu(id, inv, extraData));
	public static final MenuType<BasicAltarGUIMenu> BASIC_ALTAR_GUI = register("basic_altar_gui",
			(id, inv, extraData) -> new BasicAltarGUIMenu(id, inv, extraData));
	public static final MenuType<BlazewoodPurifierGUIMenu> BLAZEWOOD_PURIFIER_GUI = register("blazewood_purifier_gui",
			(id, inv, extraData) -> new BlazewoodPurifierGUIMenu(id, inv, extraData));
	public static final MenuType<EndergizerGUIMenu> ENDERGIZER_GUI = register("endergizer_gui",
			(id, inv, extraData) -> new EndergizerGUIMenu(id, inv, extraData));
	public static final MenuType<CrushingHammer4GUIMenu> CRUSHING_HAMMER_4_GUI = register("crushing_hammer_4_gui",
			(id, inv, extraData) -> new CrushingHammer4GUIMenu(id, inv, extraData));
	public static final MenuType<EggstractorGUIMenu> EGGSTRACTOR_GUI = register("eggstractor_gui",
			(id, inv, extraData) -> new EggstractorGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
