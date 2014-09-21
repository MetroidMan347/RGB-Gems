package mm347.rgbgems2.creativetab;

import mm347.rgbgems2.item.ModItems;
import mm347.rgbgems2.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTabs {
	public static final CreativeTabs tabGems = new CreativeTabs(Reference.MOD_ID+":gems") {
		@Override
		public Item getTabIconItem() {
			return ModItems.gemRubite;
		}
	};

	public static final CreativeTabs tabGemTools = new CreativeTabs(Reference.MOD_ID+":gemTools") {
		@Override
		public Item getTabIconItem() {
			return ModItems.gemSapphirite;
		}
	};
}
