package carson.diehl1.MyItems;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


public class Knife extends ItemSword{
	
	public Knife (ToolMaterial material) {
		super(material);
		setUnlocalizedName("Knife");
		 
				
			}
				//Load Icons and Textures Properly
				@SideOnly(Side.CLIENT)
				private IIcon[] icons;
				@SideOnly(Side.CLIENT)
				public void registerIcons(IIconRegister par1IconRegister)
				{
					this.itemIcon = par1IconRegister.registerIcon("carsonsmod:"
							+(this.getUnlocalizedName().substring(5)));


	}

}
