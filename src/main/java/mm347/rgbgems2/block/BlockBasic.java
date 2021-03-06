package mm347.rgbgems2.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mm347.rgbgems2.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBasic extends Block {
	public BlockBasic(String unlocalizedName, Material material, Float hardness, CreativeTabs tab) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setHardness(hardness);
		this.setCreativeTab(tab);
	}
	
	public BlockBasic(String unlocalizedName) {
		this(unlocalizedName, Material.rock, 5.0f, CreativeTabs.tabMisc);
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", Reference.MOD_ID+":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
	}
}
