
package tutorial.DMAexample;




import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
//Import MyCode to Boiler Plate
import tutorial.DMAexample.MyCode;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
//import cpw.mods.fml.common.Mod.PreInit;    // used in 1.5.2
//import cpw.mods.fml.common.Mod.Init;       // used in 1.5.2
//import cpw.mods.fml.common.Mod.PostInit;   // used in 1.5.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7




@Mod(modid = YourModsName.MODID, version = YourModsName.VERSION)
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class YourModsName {
		
		//List Items and Blocks Here!
    public static final String MODID = "DMA Example";
    public static final String VERSION = "1.0";
		

        // The instance of your mod that Forge uses.
        @Instance(value = "DMAModID")
        public static YourModsName instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="tutorial.DMAexample.client.ClientProxy", serverSide="tutorial.DMAexample.CommonProxy")
        public static CommonProxy proxy;
        
        
        
        @EventHandler // used in 1.6.2
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        	
        		//#MyCode Block Properties
        	MyCode.MyItems();    
        	MyCode.MyBlocks();
        }
        
        
        @EventHandler // used in 1.6.2
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                //#MyCode Recipes
                MyCode.MyRecipes();
                //GameRegistry.registerWorldGenerator(new MyOreGenerator(),1);
        }
        
        
        @EventHandler // used in 1.6.2
        //@PostInit   // used in 1.5.2
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}
