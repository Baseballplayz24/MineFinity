
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.minefinity.client.gui.NetherheartForgeGUIScreen;
import net.mcreator.minefinity.client.gui.NetherBrickFurnaceGUIScreen;
import net.mcreator.minefinity.client.gui.CrushingHammer3GUIScreen;
import net.mcreator.minefinity.client.gui.CrushingHammer2GUIScreen;
import net.mcreator.minefinity.client.gui.CrushingHammer1GUIScreen;
import net.mcreator.minefinity.client.gui.BasicAltarGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinefinityModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MinefinityModMenus.CRUSHING_HAMMER_1_GUI, CrushingHammer1GUIScreen::new);
			MenuScreens.register(MinefinityModMenus.CRUSHING_HAMMER_2_GUI, CrushingHammer2GUIScreen::new);
			MenuScreens.register(MinefinityModMenus.NETHER_BRICK_FURNACE_GUI, NetherBrickFurnaceGUIScreen::new);
			MenuScreens.register(MinefinityModMenus.CRUSHING_HAMMER_3_GUI, CrushingHammer3GUIScreen::new);
			MenuScreens.register(MinefinityModMenus.NETHERHEART_FORGE_GUI, NetherheartForgeGUIScreen::new);
			MenuScreens.register(MinefinityModMenus.BASIC_ALTAR_GUI, BasicAltarGUIScreen::new);
		});
	}
}
