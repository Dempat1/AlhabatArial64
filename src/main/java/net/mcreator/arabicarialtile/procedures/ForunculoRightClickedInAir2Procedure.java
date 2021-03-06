package net.mcreator.arabicarialtile.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.arabicarialtile.ArabicarialtileModElements;
import net.mcreator.arabicarialtile.ArabicarialtileMod;

import java.util.Map;

@ArabicarialtileModElements.ModElement.Tag
public class ForunculoRightClickedInAir2Procedure extends ArabicarialtileModElements.ModElement {
	public ForunculoRightClickedInAir2Procedure(ArabicarialtileModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency entity for procedure ForunculoRightClickedInAir2!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency x for procedure ForunculoRightClickedInAir2!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency y for procedure ForunculoRightClickedInAir2!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency z for procedure ForunculoRightClickedInAir2!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency world for procedure ForunculoRightClickedInAir2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.7)) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
					entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 1, 0);
					entityToSpawn.setDamage((float) 5);
					entityToSpawn.setKnockbackStrength((int) 5);
					_ent.world.addEntity(entityToSpawn);
				}
			}
			if (world instanceof ServerWorld) {
				LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
				_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
				_ent.setEffectOnly(false);
				((World) world).addEntity(_ent);
			}
		}
	}
}
