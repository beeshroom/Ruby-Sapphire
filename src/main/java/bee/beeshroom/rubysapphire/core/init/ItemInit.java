package bee.beeshroom.rubysapphire.core.init;

import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.common.material.RubyTier;
import bee.beeshroom.rubysapphire.common.material.SapphireTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			RubySapphire.MOD_ID);

	 public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
			() -> new Item(new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
	
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
			() -> new Item(new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
	

	 
	//tools                attack, attack speed
	//check "Items.class" for Iron / Diamond attack and attack speed values
	/*
  		ShovelItem(I, 1.5F, -3.0F,
  		ShovelItem(D, 1.5F, -3.0F, 
  		
   		PickaxeItem(I, 1, -2.8F, 
   		PickaxeItem(D, 1, -2.8F,
   		
   		AxeItem(I, 6.0F, -3.1F, 
   		AxeItem(D, 5.0F, -3.0F,
   			
   		HoeItem(I, -2, -1.0F,
   		HoeItem(D, -3, 0.0F, 
   		
   		SwordItem(I, 3, -2.4F,
  		SwordItem(D, 3, -2.4F,
  		
  		//messing with ruby a lot, i dont want them to be exactly like iron, but i dont want them to be EQUAL to diamond either??
  		 * (sapphire is the previous setting still, and broken (hoe was too weak i think?)
	 */
			public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
					() -> new ShovelItem(RubyTier.RUBY, 1.5f, -3.0f,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
	
			public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
					() -> new PickaxeItem(RubyTier.RUBY, 1, -2.8f,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
			public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
					() -> new AxeItem(RubyTier.RUBY, 6.0F, -3.1F,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
			public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
					() -> new HoeItem(RubyTier.RUBY, -2, -1.0F,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
			public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
					() -> new SwordItem(RubyTier.RUBY, 4, -2.4f,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
			//
			
			public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
					() -> new ShovelItem(SapphireTier.SAPPHIRE, 1.5f, -3.0f,
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
					public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
							() -> new PickaxeItem(SapphireTier.SAPPHIRE, 1, -2.8f,
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
					
					public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
							() -> new AxeItem(SapphireTier.SAPPHIRE, 6.0F, -3.1F,
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
					
					public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
							() -> new HoeItem(SapphireTier.SAPPHIRE, -2, -1.0F,
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
					
					public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
							() -> new SwordItem(SapphireTier.SAPPHIRE, 4, -2.4f,
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
		
			
	
			
			
	//block items
					
					
		/*	public static final RegistryObject<BlockItem> RUBY = ITEMS.register("ruby",
					() -> new BlockItem(BlockInit.RUBY.get(),
							new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));
			
			public static final RegistryObject<BlockItem> SAPPHIRE = ITEMS.register("sapphire",
					() -> new BlockItem(BlockInit.SAPPHIRE.get(),
							new Item.Properties().tab(ItemGroup.TAB_MATERIALS))); */
			
			
			
					public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
							() -> new BlockItem(BlockInit.RUBY_ORE.get(),
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
					
					
					public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore",
							() -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(),
									new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
					
			public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
					() -> new BlockItem(BlockInit.RUBY_BLOCK.get(),
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
			public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block",
					() -> new BlockItem(BlockInit.SAPPHIRE_BLOCK.get(),
							new Item.Properties().tab(RubySapphire.RUBY_GROUP)));
			
	}
	
