package mm347.rgbgems2.block;

import mm347.rgbgems2.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
	public static final BlockBasic blockRubite = new BlockBasic("blockRubite");
	public static final BlockBasic blockSapphirite = new BlockBasic("blockSapphirite");
	public static final BlockBasic blockEmerite = new BlockBasic("blockEmerite");
	
	public static void init() {
		GameRegistry.registerBlock(blockRubite, "blockRubite");
		GameRegistry.registerBlock(blockSapphirite, "blockSapphirite");
		GameRegistry.registerBlock(blockEmerite, "blockEmerite");
	}
}