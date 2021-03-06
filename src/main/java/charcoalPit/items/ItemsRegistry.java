package charcoalPit.items;

import charcoalPit.blocks.BlocksRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

public class ItemsRegistry {
	
	public static ItemBase coke=new ItemBase("item_coke");
	public static ItemBase ash=new ItemBase("item_ash");
	public static ItemFertilizer fertilizer=new ItemFertilizer("item_fertilizer");
	public static ItemBase clay_Pot=new ItemBase("clay_pot");
	public static ItemBase magic_Coal=new ItemBase("alchemical_coal");
	
	public static ItemBlockBase logPile=new ItemBlockBase(BlocksRegistry.logPile);
	public static ItemBlockBase cokeBlock=new ItemBlockBase(BlocksRegistry.cokeBlock);
	public static ItemBlockBase stoneCollector=new ItemBlockBase(BlocksRegistry.stoneCollector);
	public static ItemBlockBase brickCollector=new ItemBlockBase(BlocksRegistry.brickCollector);
	public static ItemBlockBase netherCollector=new ItemBlockBase(BlocksRegistry.netherCollector);
	
	public static ItemStack coke_stack;
	public static ItemStack ash_stack;
	public static ItemStack wood_stack;
	public static ItemStack thatch_stack;
	
	public static void initStacks(){
		coke_stack=new ItemStack(coke);
		ash_stack=new ItemStack(ash);
		wood_stack=new ItemStack(Blocks.LOG);
		thatch_stack=new ItemStack(Blocks.HAY_BLOCK);
	}
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(coke, ash, fertilizer, clay_Pot, magic_Coal,
				logPile, cokeBlock, stoneCollector, brickCollector, netherCollector);
	}
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event){
		coke.initModel();
		ash.initModel();
		fertilizer.initModel();
		clay_Pot.initModel();
		magic_Coal.initModel();
		
		logPile.initModel();
		cokeBlock.initModel();
		stoneCollector.initModel();
		brickCollector.initModel();
		netherCollector.initModel();
	}
	public static void initOreDict(){
		OreDictionary.registerOre("fuelCoke", coke);
		OreDictionary.registerOre("dustAsh", ash);
	}
}
