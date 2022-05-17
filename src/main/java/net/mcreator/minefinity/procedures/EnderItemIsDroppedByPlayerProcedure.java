package net.mcreator.minefinity.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class EnderItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() < -32) {
			entity.setDeltaMovement(new Vec3(0, 1000, 0));
		} else if (entity.getY() > 256) {
			entity.setDeltaMovement(new Vec3(0, (-100), 0));
		}
	}
}
