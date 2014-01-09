package JohnTheAwsome123.mods.AdvancedSpawners;


public class OreDictionaryHandler {
	public static AdvancedSpawners AS;

	public static void registerBlocks() {
//		OreDictionary.registerOre("blockmobSpawner", new ItemStack(AS.advancedSpawner));
	}

	public static void registerItems() {
		// OreDictionary.registerOre("nuggetNetherStar", new ItemStack(AS.netherStarNugget));
	}

	public static void registerAll() {
		registerBlocks();
		registerItems();
	}
}
