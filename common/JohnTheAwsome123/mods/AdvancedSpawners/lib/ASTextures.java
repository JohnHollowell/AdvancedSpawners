package JohnTheAwsome123.mods.AdvancedSpawners.lib;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * AdvancedSpawners
 * 
 * ASTextures
 * @category Library
 * @author JohnTheAwsome123
 * 
 */

public class ASTextures {
	public static String FormatUnlocalized(Item item) {
		return item.getUnlocalizedName().substring(5);
	}

	public static String FormatUnlocalized(Block block) {
		return block.getUnlocalizedName().substring(5);
	}

	public static String GetTextureNameFull(Item item) {
		return ASTextures.GetTextureNameFull(item, "");
	}

	public static String GetTextureNameFull(Block block) {
		return ASTextures.GetTextureNameFull(block, "");
	}

	public static String GetTextureNameFull(Item item, String subFolders) {
		return ASTextures.RESOURCE_CONTEXT + ":" + subFolders
				+ ASTextures.FormatUnlocalized(item);
	}

	public static String GetTextureNameFull(Block block, String subFolders) {
		return ASTextures.RESOURCE_CONTEXT + ":" + subFolders
				+ ASTextures.FormatUnlocalized(block);
	}

	// public static final String RESOURCE_CONTEXT = "AdvancedCraft";
	public static final String RESOURCE_CONTEXT = Reference.MOD_ID;

	// Guis //

	// Models //
	// public static final ResourceLocation MODEL_ROCKET = new
	// ResourceLocation(RESOURCE_CONTEXT, "textures/entities/fuselage.png");
	// public static final ResourceLocation MODEL_COM_SATELLITE=new
	// ResourceLocation(RESOURCE_CONTEXT,"textures/entities/comSatelliteBase.png");

}
