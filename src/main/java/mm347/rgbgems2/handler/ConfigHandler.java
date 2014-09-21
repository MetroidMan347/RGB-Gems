package mm347.rgbgems2.handler;

import java.io.File;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import mm347.rgbgems2.reference.Reference;
import net.minecraftforge.common.config.Configuration;


public class ConfigHandler {
	
	public static Configuration config;
	public static boolean generateRubite = false;
	
	public static void init(File configFile) {
		if (config == null) {
			config = new Configuration(configFile);
			loadConfig();
		}
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			//Resync Configs
			loadConfig();
		}
	}
	
	private static void loadConfig() {
		generateRubite = config.get(Configuration.CATEGORY_GENERAL, "generateRubite", true, "Whether or not to generate Rubite Ore").getBoolean(true);
		
		if (config.hasChanged()) {
			config.save();
		}
	}
}
