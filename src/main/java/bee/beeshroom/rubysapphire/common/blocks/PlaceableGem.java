/*  scrapped feature where you could place Rubies and Sapphires:
 * removed because it was annoying, was possibly preventing them from working as Beacon fuel, and because it was inconsisent with
 * diamonds and emerald from Vanilla.
 
 * 
 *package bee.beeshroom.rubysapphire.common.blocks;


import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

//copied and edited from EndRodBlock

public class PlaceableGem extends DirectionalBlock implements IWaterLoggable {
	   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	   
	//fix these hit boxes
	   
	// north    3, 0, 3, 13, 10, 13
	   
	   protected static final VoxelShape Y_AXIS_AABB = Block.box(3D, 0D, 3D, 13D, 10D, 13D);
	   protected static final VoxelShape Z_AXIS_AABB = Block.box(3D, 3D, 0D, 13D, 13D, 10D);
	   protected static final VoxelShape X_AXIS_AABB = Block.box(0D, 3D, 3D, 10D, 13D, 13D);

	   public PlaceableGem(AbstractBlock.Properties p_i48404_1_) {
	      super(p_i48404_1_);
	      this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
	   }

	   public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
	      return p_185499_1_.setValue(FACING, p_185499_2_.rotate(p_185499_1_.getValue(FACING)));
	   }

	   public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
	      return p_185471_1_.setValue(FACING, p_185471_2_.mirror(p_185471_1_.getValue(FACING)));
	   }

	   public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
	      switch(p_220053_1_.getValue(FACING).getAxis()) {
	      case X:
	      default:
	         return X_AXIS_AABB;
	      case Z:
	         return Z_AXIS_AABB;
	      case Y:
	         return Y_AXIS_AABB;
	      }
	   }

	   public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
	      Direction direction = p_196258_1_.getClickedFace();
	      BlockState blockstate = p_196258_1_.getLevel().getBlockState(p_196258_1_.getClickedPos().relative(direction.getOpposite()));
	      return blockstate.is(this) && blockstate.getValue(FACING) == direction ? this.defaultBlockState().setValue(FACING, direction.getOpposite()) : this.defaultBlockState().setValue(FACING, direction);
	   }

	   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
	      p_206840_1_.add(FACING);
	   }
	     
	   public PushReaction getPistonPushReaction(BlockState p_149656_1_) {
	      return PushReaction.NORMAL;
	   }

	   public boolean isPathfindable(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
	      return false;
	   }
	   
	 //from TorchBlock
	   public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
		      return p_196271_2_ == Direction.DOWN && !this.canSurvive(p_196271_1_, p_196271_4_, p_196271_5_) ? Blocks.AIR.defaultBlockState() : super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
		   }

		   public boolean canSurvive(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
		      return canSupportCenter(p_196260_2_, p_196260_3_.below(), Direction.UP);
		   }
		  
	} */