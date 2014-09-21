package mm347.rgbgems2;

import mm347.rgbgems2.block.ModBlocks;
import mm347.rgbgems2.handler.ConfigHandler;
import mm347.rgbgems2.item.ModItems;
import mm347.rgbgems2.proxy.IProxy;
import mm347.rgbgems2.reference.Reference;
import mm347.rgbgems2.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class RGBGems {
	
	@Mod.Instance(Reference.MOD_ID)
	public static RGBGems instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		LogHelper.info("Preinitialization Complete");
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
		ModItems.init();
		ModBlocks.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LogHelper.info("Initialization Complete");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Postinitialization Complete");
	}
}