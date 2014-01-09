package JohnTheAwsome123.mods.AdvancedSpawners;


public class GameRegisteryHandler
{
    public static AdvancedSpawners AS;

    // LanguageRegistry.instance().addStringLocalization("item.NetherStarHelmet.name",
    // "en_US", "Nether Star Helmet");

    public static void registerBlocks()
    {
        // Register Blocks//
//        GameRegistry.registerBlock(AS.netherStarBlock, "netherStarBlock");
//        MinecraftForge.setBlockHarvestLevel(AS.netherStarBlock, "pickaxe", 4);

    }

    public static void registerItems()
    {
        // Register Items//
//        GameRegistry.registerItem(AS.netherStarNugget, "netherStarNugget");
    }

    public static void registerFuels()
    {
        // Register Fuels//
//        if (!Config.disableFuels)
//        {
//            GameRegistry.registerFuelHandler(new ACFuelHandler());
//        }

    }

    public static void registerTools()
    {
        // Register Tools//
//        GameRegistry.registerItem(AS.netherStarSword, "netherStarSword");
    }

    public static void registerAll()
    {
        registerBlocks();
        registerFuels();
//        registerItems();
        registerTools();
    }
}
