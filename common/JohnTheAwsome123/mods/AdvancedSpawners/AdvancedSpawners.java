package JohnTheAwsome123.mods.AdvancedSpawners;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import JohnTheAwsome123.mods.AdvancedSpawners.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER, useMetadata = false, modid = Reference.MOD_ID, acceptedMinecraftVersions = "[1.6,1.7)", dependencies = "required-after:Forge@[9.10.0.800,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AdvancedSpawners {
	// The instance of your mod that Forge uses.
	@Instance(Reference.MOD_ID)
	public static AdvancedSpawners instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
	public static CommonProxy proxy;
	
	//Define Creative Tab//
	public static CreativeTabs tabAdvancedSpawners = ASCreativeTab.instance();
	
	// Define Config//
	public Config config;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Loading " + Reference.MOD_NAME);
		proxy.registerRenderers();

		config = new Config(new Configuration(event.getSuggestedConfigurationFile()));

	}
}
