package bee.beeshroom.rubysapphire.world;

import bee.beeshroom.rubysapphire.Config;
import bee.beeshroom.rubysapphire.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

//followed TurtyWurty's 1.16 youtube tutorial

public class OreGen {
	
		public static void generateOres(final BiomeLoadingEvent event) {
			Biome.Climate climate = event.getClimate();

			
			if (Config.GENRUBY.get())
			{
		//rubies generate in any warm biome (greater than 1.0 is deserts, i believe?? I don't actually have a chart of biome temps)
			if ((climate.temperature >= 1.0F) 
				&& !(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND)))
			{
				generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
						BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 35, 3);
			}
			}		
			
		
			if (Config.GENSAPPHIRE.get())
			{
		//sapphires generate in beach/ocean biomes
			if ((event.getCategory().equals(Biome.Category.OCEAN) || event.getCategory().equals(Biome.Category.BEACH)
			&& !(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND)))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 6, 35, 3);
			}
			}
			
			
		//configurable silverfish spawn blocks
			if (Config.SILVERFISH.get())
					{
			if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					Blocks.INFESTED_STONE.defaultBlockState(), 3, 8, 60, 3);
				}
					}
			
			//configurable ore spawning in any biome (other than end and nether)
			//if the config "OREEVERYWHERE" is "true" these two won't work, 
			//because if they did, I'm pretty sure the ores would spawn twice as frequently
			
			
			if (!(Config.OREEVERYWHERE.get()))
			{
			
			if (Config.RUBYEVERYWHERE.get())
			{
				if (!(event.getCategory().equals(Biome.Category.OCEAN) || event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 35, 1);
				}
			}
			
			if (Config.SAPPHIREEVERYWHERE.get())
			{
				if (!(event.getCategory().equals(Biome.Category.DESERT) || event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 6, 35, 1);
				} 
			}
			
			
			}
			
			
			if (Config.OREEVERYWHERE.get())
			{
				if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.RUBY_ORE.get().defaultBlockState(), 4, 6, 35, 1);				
				} 
				
				if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
					generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE,
					BlockInit.SAPPHIRE_ORE.get().defaultBlockState(), 4, 6, 35, 1);
				}
			}
		
		}
		
		
		
		//place the ores in the world
		
		private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest filler, BlockState state,
				int veinSize, int minHeight, int maxHeight, int amount) {
			settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
					Feature.ORE.configured(new OreFeatureConfig(filler, state, veinSize))
							.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
							.squared().count(amount));
		}
	}