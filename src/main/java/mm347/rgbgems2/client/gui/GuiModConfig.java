package mm347.rgbgems2.client.gui;

import mm347.rgbgems2.handler.ConfigHandler;
import mm347.rgbgems2.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiModConfig extends GuiConfig {
	public GuiModConfig(GuiScreen guiScreen) {
		super(guiScreen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
	}
}