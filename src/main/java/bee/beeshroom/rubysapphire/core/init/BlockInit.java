package bee.beeshroom.rubysapphire.core.init;

import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.common.blocks.Ore;
import bee.beeshroom.rubysapphire.common.blocks.RubyBlock;
import bee.beeshroom.rubysapphire.common.blocks.SapphireBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			RubySapphire.MOD_ID);
	
	
/*	public static final RegistryObject<Block> RUBY = BLOCKS.register("ruby",
			() -> new PlaceableGem(AbstractBlock.Properties.of(Material.STONE)
							.strength(1.0F, 1.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> SAPPHIRE = BLOCKS.register("sapphire",
			() -> new PlaceableGem(AbstractBlock.Properties.of(Material.STONE)
							.strength(1.0F, 1.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()));
	*/
	
	
	//the compact blocks use their own class, just in case i think of something special for them to do later...
	
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
			() -> new Ore(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()
							.harvestLevel(2)));
	
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
			() -> new RubyBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_RED)
							.strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.METAL).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore",
			() -> new Ore(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()
							.harvestLevel(2)));
	
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block",
			() -> new SapphireBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLUE)
							.strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE)
							.sound(SoundType.METAL).requiresCorrectToolForDrops()));
	
	
}
