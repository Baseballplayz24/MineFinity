package net.mcreator.minefinity.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class DiamondApplePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 3, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 12000, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3000, 2, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 12000, 5, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 3000, 0, (false), (false)));
	}
}
