package bee.beeshroom.rubysapphire;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

//thank-you mcjty

@Mod.EventBusSubscriber
public class Config {

	public static ForgeConfigSpec COMMON_CONFIG;
	public static ForgeConfigSpec CLIENT_CONFIG;
	
	//
	public static final String CATEGORY_SETTINGS = "settings";
	
	public static ForgeConfigSpec.BooleanValue TOOLQUIRKS;
	public static ForgeConfigSpec.BooleanValue GENRUBY;
	public static ForgeConfigSpec.BooleanValue RUBYEVERYWHERE;
	public static ForgeConfigSpec.BooleanValue GENSAPPHIRE;
	public static ForgeConfigSpec.BooleanValue SAPPHIREEVERYWHERE;
	public static ForgeConfigSpec.BooleanValue OREEVERYWHERE;
	public static ForgeConfigSpec.BooleanValue SILVERFISH;
	
	//
	public static final String CATEGORY_CLIENT = "client";

	static {
		ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
		COMMON_BUILDER
				.comment("Settings").push(CATEGORY_SETTINGS);
		
		//
		
		TOOLQUIRKS = COMMON_BUILDER
				.comment("Should Ruby tools mine faster when you are on fire? Should Sapphire tools mine faster when you are underwater? (Default: true)")
				.define("enableToolQuirks", true);
		
		//ruby
		
		GENRUBY = COMMON_BUILDER
				.comment("Should Ruby Ore generate in Desert-like biomes? (Default: true)")
				.define("enableGenRuby", true);
		
		RUBYEVERYWHERE = COMMON_BUILDER
				.comment("Should Ruby Ore generate in all biomes, except for Oceans? (Default: false)")
				.define("enableRubyEverywhere", false);
		
		//sapphire
		
		GENSAPPHIRE = COMMON_BUILDER
				.comment("Should Sapphire Ore generate in Ocean-like biomes?(Default: true)")
				.define("enableGenSapphire", true);
		
		SAPPHIREEVERYWHERE = COMMON_BUILDER
				.comment("Should Sapphire Ore generate in all biomes, except for Deserts? (Default: false)")
				.define("enableSapphireEverywhere", false);
		
		//
		
		OREEVERYWHERE = COMMON_BUILDER
				.comment("Should *both* Ruby Ore and Sapphire Ore generate in *every* type of biome? (Default: false)")
				.define("enableOreEverywhere", false);
		
		//
		
		SILVERFISH = COMMON_BUILDER
				.comment("Should Silverfish infested blocks be able to generate in any biome, not just Extreme Hills? (Default: false)")
				.define("enableSilverfish", false);
		
		//
		
		COMMON_BUILDER.pop();
		
		COMMON_CONFIG = COMMON_BUILDER.build();

		ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

		CLIENT_BUILDER.comment("Client settings").push(CATEGORY_CLIENT);

		CLIENT_CONFIG = CLIENT_BUILDER.build();
	}
	
	
	@SubscribeEvent
	public static void onLoad(final ModConfig.Loading configEvent) {
	}

	@SubscribeEvent
	public static void onReload(final ModConfig.Reloading configEvent) {
	}
	
}
