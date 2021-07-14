
package net.mcreator.arabicarialtile.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.arabicarialtile.item.MilanesaConPureItem;
import net.mcreator.arabicarialtile.ArabicarialtileModElements;

@ArabicarialtileModElements.ModElement.Tag
public class ChasquisItemGroup extends ArabicarialtileModElements.ModElement {
	public ChasquisItemGroup(ArabicarialtileModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchasquis") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MilanesaConPureItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
