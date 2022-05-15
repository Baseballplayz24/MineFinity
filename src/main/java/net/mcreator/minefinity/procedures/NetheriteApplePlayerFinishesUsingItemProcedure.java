package net.mcreator.minefinity.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class NetheriteApplePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 3, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 24000, 0, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 4, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 24000, 7, (false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 6000, 0, (false), (false)));
	}
}
