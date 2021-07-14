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
public class GaspijaBulletHitsLivingEntityProcedure extends ArabicarialtileModElements.ModElement {
	public GaspijaBulletHitsLivingEntityProcedure(ArabicarialtileModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency entity for procedure GaspijaBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency world for procedure GaspijaBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
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
				_ent.moveForced(Vector3d
						.copyCenteredHorizontally(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ()))));
				_ent.setEffectOnly(false);
				((World) world).addEntity(_ent);
			}
		}
	}
}
