package net.mcreator.arabicarialtile.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Difficulty;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.EntityType;

import net.mcreator.arabicarialtile.ArabicarialtileModElements;
import net.mcreator.arabicarialtile.ArabicarialtileMod;

import java.util.Map;

@ArabicarialtileModElements.ModElement.Tag
public class ForunculoRightClickedInAirProcedure extends ArabicarialtileModElements.ModElement {
	public ForunculoRightClickedInAirProcedure(ArabicarialtileModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency x for procedure ForunculoRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency y for procedure ForunculoRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency z for procedure ForunculoRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency world for procedure ForunculoRightClickedInAir!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() < 0.7)) {
			if ((!(world.getDifficulty() == Difficulty.PEACEFUL))) {
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
				}
				if (world instanceof ServerWorld) {
					LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
					_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
					_ent.setEffectOnly(false);
					((World) world).addEntity(_ent);
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
}
