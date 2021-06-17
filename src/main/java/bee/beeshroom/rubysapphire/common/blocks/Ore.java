package bee.beeshroom.rubysapphire.common.blocks;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.server.ServerWorld;


//copied (with little edits) from OreBlock.class !

public class Ore extends OreBlock {

	public Ore(Properties p_i48357_1_) {
		super(p_i48357_1_);
		// TODO Auto-generated constructor stub
	}
	
	 protected int xpOnDrop(Random p_220281_1_) {
	         return MathHelper.nextInt(p_220281_1_, 3, 7);
	   }

	   public void spawnAfterBreak(BlockState p_220062_1_, ServerWorld p_220062_2_, BlockPos p_220062_3_, ItemStack p_220062_4_) {
		      super.spawnAfterBreak(p_220062_1_, p_220062_2_, p_220062_3_, p_220062_4_);
		   }
	 
	 
	 @Override
	   public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
	      return silktouch == 0 ? this.xpOnDrop(RANDOM) : 0;
	   }
}
