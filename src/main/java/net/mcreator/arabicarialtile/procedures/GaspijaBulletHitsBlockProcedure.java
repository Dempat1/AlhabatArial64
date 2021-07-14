package net.mcreator.arabicarialtile.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.arabicarialtile.ArabicarialtileModElements;
import net.mcreator.arabicarialtile.ArabicarialtileMod;

import java.util.Map;

@ArabicarialtileModElements.ModElement.Tag
public class GaspijaBulletHitsBlockProcedure extends ArabicarialtileModElements.ModElement {
	public GaspijaBulletHitsBlockProcedure(ArabicarialtileModElements instance) {
		super(instance, 19);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency x for procedure GaspijaBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency y for procedure GaspijaBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency z for procedure GaspijaBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ArabicarialtileMod.LOGGER.warn("Failed to load dependency world for procedure GaspijaBulletHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_BLOCK.getDefaultState(), 3);
	}
}
