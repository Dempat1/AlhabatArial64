
package net.mcreator.arabicarialtile.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.arabicarialtile.ArabicarialtileModElements;

@ArabicarialtileModElements.ModElement.Tag
public class ChasquibuneriaEnchantment extends ArabicarialtileModElements.ModElement {
	@ObjectHolder("arabicarialtile:chasquibuneria")
	public static final Enchantment enchantment = null;
	public ChasquibuneriaEnchantment(ArabicarialtileModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("chasquibuneria"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.BOW, slots);
		}

		@Override
		public int getMinLevel() {
			return 30;
		}

		@Override
		public int getMaxLevel() {
			return 30;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(Items.BOW, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return true;
		}

		@Override
		public boolean isCurse() {
			return true;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
