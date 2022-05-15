package net.mcreator.minefinity.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class CobaltAnchorOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.setRespawnPosition(_serverPlayer.level.dimension(), new BlockPos(x, y, z), _serverPlayer.getYRot(), true, false);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 8, Explosion.BlockInteraction.DESTROY);
		}
	}
}
