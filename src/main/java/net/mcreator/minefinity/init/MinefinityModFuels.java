
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minefinity.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class MinefinityModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == MinefinityModBlocks.LIGNITE.get().asItem())
			event.setBurnTime(400);
		else if (event.getItemStack().getItem() == MinefinityModItems.LIGNITE_CHUNK.get())
			event.setBurnTime(100);
		else if (event.getItemStack().getItem() == MinefinityModItems.SOUL_COAL.get())
			event.setBurnTime(160000);
	}
}
