package bee.beeshroom.rubysapphire;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import bee.beeshroom.rubysapphire.core.init.BlockInit;
import bee.beeshroom.rubysapphire.core.init.EffectsInit;
import bee.beeshroom.rubysapphire.core.init.ItemInit;
import bee.beeshroom.rubysapphire.world.OreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(RubySapphire.MOD_ID)
public class RubySapphire {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "rubysapphire";
	public static final ItemGroup RUBY_GROUP = new RubyGroup("rubygroup");

	public RubySapphire() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		bus.addListener(this::setup);
		//MinecraftForge.EVENT_BUS.register(this);

		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		EffectsInit.EFFECTS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::generateOres);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {

	}
	
	/* private void clientSetup(final FMLClientSetupEvent event)
	    {
	        RenderTypeLookup.setRenderLayer(BlockInit.RUBY.get(), RenderType.cutout());
	        RenderTypeLookup.setRenderLayer(BlockInit.SAPPHIRE.get(), RenderType.cutout());
	    } */

	 public static class RubyGroup extends ItemGroup {

		public RubyGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.RUBY_ORE.get().getDefaultInstance(); 
		} 
	} 
}