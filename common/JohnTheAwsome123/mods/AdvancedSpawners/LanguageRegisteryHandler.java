package JohnTheAwsome123.mods.AdvancedSpawners;


public class LanguageRegisteryHandler
{
    // LanguageRegistry.instance().addStringLocalization("item.NetherStarHelmet.name",
    // "en_US", "Nether Star Helmet");
    public static AdvancedSpawners AS;

    public static void registerBlocks()
    {
        // Register Blocks//
//        LanguageRegistry.addName(AS.netherStarBlock, "Nether Star Block");
    }

    public static void registerItems()
    {
        // Register Items//
//        LanguageRegistry.addName(AS.netherStarNugget, "Nether Star Nugget");
//
//        if (!Config.disableDoubler)
//        {
//            LanguageRegistry.addName(AS.Doubler, "Doubler");
//        }
    }

    public static void registerTools()
    {
        // Register Tools//
//        LanguageRegistry.addName(AS.netherStarSword, "Nether Star Sword");
    }
    
    public static void registerAll()
    {
        registerBlocks();
        registerItems();
        registerTools();
        
    }
}
