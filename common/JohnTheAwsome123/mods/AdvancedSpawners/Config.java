package JohnTheAwsome123.mods.AdvancedSpawners;

import net.minecraftforge.common.Configuration;

public class Config
{
    public int startBlockID = 2500;
    public int BlockIncr = 0;
    public int startItemID = 2700;
    public int ItemIncr = 0;

    // Define Tests//
    public static int[] testList;

    public Config(Configuration config)
    {
        config.load();

        // Cofigs for testing//
        String tmpList = config.get("Options", "Blacklist", "").getString();
        if (tmpList != null)
        {
            for (String num : tmpList.split(","))
            {
                int i = 0;
//                testList[i] = Integer.parseInt(num.toString());
                i++;
            }
        }

        if (config.hasChanged())
        {
            config.save();
        }

    }
}
