
package net.mcreator.arabicarialtile.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.arabicarialtile.ArabicarialtileModElements;

import java.util.List;

@ArabicarialtileModElements.ModElement.Tag
public class MilanesaItem extends ArabicarialtileModElements.ModElement {
	@ObjectHolder("arabicarialtile:milanesa")
	public static final Item block = null;
	public MilanesaItem(ArabicarialtileModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(8).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(12).saturation(1f).build()));
			setRegistryName("milanesa");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("*No estar\u00EDa mal acompa\u00F1arla con pur\u00E9*"));
		}
	}
}
