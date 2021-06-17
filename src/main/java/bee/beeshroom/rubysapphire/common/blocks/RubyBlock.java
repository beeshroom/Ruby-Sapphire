package bee.beeshroom.rubysapphire.common.blocks;

import net.minecraft.block.Block;


//referenced MagmaBlock, RedstoneOreBlock, and MyceliumBlock classes!

public class RubyBlock extends Block {

	public RubyBlock(Properties p_i48357_1_) {
		super(p_i48357_1_);
	}
	 
/*
 	 public void stepOn(World world, BlockPos blockpos, Entity entity) {
	      if (entity.isOnFire() && entity instanceof LivingEntity) {
	    		 
	    	  spawnParticles(world, blockpos);
	      }

	      super.stepOn(world, blockpos, entity);
	   } 
	 
	// @OnlyIn(Dist.CLIENT)
	   private static void spawnParticles(World world, BlockPos blockpos)  {
		   Random random = world.random;

		   world.addParticle(ParticleTypes.FLAME, (double)blockpos.getX() + random.nextDouble(), (double)blockpos.getY() + 1.1D, (double)blockpos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
	      }
	*/
	
}
