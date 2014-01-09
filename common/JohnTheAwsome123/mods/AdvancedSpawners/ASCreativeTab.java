package JohnTheAwsome123.mods.AdvancedSpawners;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import JohnTheAwsome123.mods.AdvancedSpawners.lib.Reference;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ASCreativeTab extends CreativeTabs {
	public static final String ID = Reference.MOD_ID;
	public static final String NAME = Reference.MOD_NAME;
	public static final ItemStack ICON = new ItemStack(Block.mobSpawner);
	public static ASCreativeTab instance;
	public static ItemStack stack;

	public static ASCreativeTab instance() {
		if (instance == null) {
			instance = new ASCreativeTab(CreativeTabs.getNextID(), NAME);
		}
		return instance;
	}

	public ASCreativeTab(int id, String name) {
		super(id, name);
		LanguageRegistry.instance().addStringLocalization("itemGroup." + ID, "en_US", NAME);
	}

	@Override
	public ItemStack getIconItemStack() {
		if (ICON != null) {
			return stack;
		}
		return null;
	}

}
