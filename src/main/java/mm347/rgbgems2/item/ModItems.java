package mm347.rgbgems2.item;

import mm347.rgbgems2.creativetab.ModTabs;
import mm347.rgbgems2.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	public static final Item gemRubite = new ItemBasic("gemRubite", ModTabs.tabGems);
	public static final Item gemSapphirite = new ItemBasic("gemSapphirite", ModTabs.tabGems);
	public static final Item gemEmerite = new ItemBasic("gemEmerite", ModTabs.tabGems);
	
	public static void init() {
		GameRegistry.registerItem(gemRubite, "gemRubite");
		GameRegistry.registerItem(gemSapphirite, "gemSapphirite");
		GameRegistry.registerItem(gemEmerite, "gemEmerite");
	}
}