package carson.diehl1.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.util.IIcon;


public class RiceBowl extends ItemFood{
	
	public RiceBowl(int i, int j, boolean b) {
		super(j,b);
		setUnlocalizedName("RiceBowl");
		
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

