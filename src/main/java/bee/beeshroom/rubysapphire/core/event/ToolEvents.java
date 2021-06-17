package bee.beeshroom.rubysapphire.core.event;

import bee.beeshroom.rubysapphire.Config;
import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.core.init.ItemInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = RubySapphire.MOD_ID)
public class ToolEvents {

	
		@SubscribeEvent
		public static void BreakSpeed (net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed event) 
		{
			
			if (Config.TOOLQUIRKS.get())
			{
			
			PlayerEntity entity = event.getPlayer();
			 ItemStack itemstack = entity.getItemInHand(Hand.MAIN_HAND);
			 //Integer fireticks = entity.getRemainingFireTicks();
			 //BlockState blockstate = event.getState();
			 Integer air = entity.getAirSupply();
			
			 //ruby boost
			 
			if (
				(	(itemstack.getItem() == ItemInit.RUBY_PICKAXE.get()) ||
					(itemstack.getItem() == ItemInit.RUBY_SHOVEL.get()) ||
					(itemstack.getItem() == ItemInit.RUBY_AXE.get()) ||
					(itemstack.getItem() == ItemInit.RUBY_HOE.get()) ||
					(itemstack.getItem() == ItemInit.RUBY_SWORD.get()) 
					)			
					&&  (entity.isOnFire() )
					)
			{	
				if (!entity.isInLava())
			{
				event.setNewSpeed(event.getOriginalSpeed() * 1.8f);
				//this might be evil
					if (entity.getRemainingFireTicks() <= 25)
						{
							entity.setRemainingFireTicks(entity.getRemainingFireTicks() + 15);
						}
			}
			if (entity.isInLava())
			{
				event.setNewSpeed(event.getOriginalSpeed() * 2.2f);
				//entity.playSound(SoundEvents.NOTE_BLOCK_PLING, 1.0f, 5.0f);
			}
			}
			
			//ruby weak
			
			if (
					(	(itemstack.getItem() == ItemInit.RUBY_PICKAXE.get()) ||
						(itemstack.getItem() == ItemInit.RUBY_SHOVEL.get()) ||
						(itemstack.getItem() == ItemInit.RUBY_AXE.get()) ||
						(itemstack.getItem() == ItemInit.RUBY_HOE.get()) ||
						(itemstack.getItem() == ItemInit.RUBY_SWORD.get()) 
						)			
						&&  (entity.isUnderWater() )
						)
			{
				event.setNewSpeed(event.getOriginalSpeed() * .6f);
			}
			
			
			
			
			//sapphire boost
			
			if (
					(
					(itemstack.getItem() == ItemInit.SAPPHIRE_PICKAXE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_SHOVEL.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_AXE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_HOE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_SWORD.get()) 
					)
					&&  entity.isUnderWater()			
					) 
			{
				if (air <= 300 && air > 80)
				{
				event.setNewSpeed(event.getOriginalSpeed() * 1.2f);
				}
				
				if (air <= 80 && air > 15)
				{
				event.setNewSpeed(event.getOriginalSpeed() * 2.0f);
				}
			
				if (air <= 15)
				{
				event.setNewSpeed(event.getOriginalSpeed() * 2.6f);
				//entity.playSound(SoundEvents.NOTE_BLOCK_PLING, 3.0f, 1.5f);
				}
			}
			
			//sapphire weak
			
			if (
					(
					(itemstack.getItem() == ItemInit.SAPPHIRE_PICKAXE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_SHOVEL.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_AXE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_HOE.get()) ||
					(itemstack.getItem() == ItemInit.SAPPHIRE_SWORD.get()) 
					)
					&&  entity.isOnFire()			
					) 
			{
				event.setNewSpeed(event.getOriginalSpeed() * .6f);
			}
			
			
		
		} 
		
		
		}
		
		/*	@SubscribeEvent
		public static void HarvestCheck (net.minecraftforge.event.entity.player.PlayerEvent.HarvestCheck event) 
		
		{
			PlayerEntity entity = event.getPlayer();
			 ItemStack itemstack = entity.getItemInHand(Hand.MAIN_HAND);
			 Integer air = entity.getAirSupply();

			 if (
						(	(itemstack.getItem() == ItemInit.RUBY_PICKAXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SHOVEL.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_AXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_HOE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SWORD.get()) 
							)			
							&&  (entity.isOnFire())
							)
					{	
						if (!entity.isInLava())
					{
							entity.addEffect(new EffectInstance(Effects.DIG_SPEED, 90, 0));
					}
					if (entity.isInLava())
					{
						entity.addEffect(new EffectInstance(Effects.DIG_SPEED, 90, 0));
					}
					}
					
					if (
							(
							(itemstack.getItem() == ItemInit.SAPPHIRE_PICKAXE.get()) ||
							(itemstack.getItem() == ItemInit.SAPPHIRE_SHOVEL.get()) ||
							(itemstack.getItem() == ItemInit.SAPPHIRE_AXE.get()) ||
							(itemstack.getItem() == ItemInit.SAPPHIRE_HOE.get()) ||
							(itemstack.getItem() == ItemInit.SAPPHIRE_SWORD.get()) 
							)
							&&  entity.isUnderWater()	
							//&&  entity.isInWaterRainOrBubble()	
							) 
					{
				if (air > 100)
					{
					entity.addEffect(new EffectInstance(Effects.DIG_SPEED, 90, 0));
					}
				if (air <= 100)
					{
					entity.addEffect(new EffectInstance(Effects.DIG_SPEED, 90, 1));
					}
				}
				} */
		
		
		
			//@SubscribeEvent
			//public static void LeftClickBlock (net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock event)
		
			
			//this i would only work for players so, nah
	/*		
		@SubscribeEvent
		public static void AttackEntityEvent(net.minecraftforge.event.entity.player.AttackEntityEvent event) 
		{
			PlayerEntity player = event.getPlayer();
			Entity target = event.getTarget();
			 ItemStack itemstack = ((player)).getItemInHand(Hand.MAIN_HAND);

			 if (
						(	(itemstack.getItem() == ItemInit.RUBY_PICKAXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SHOVEL.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_AXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_HOE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SWORD.get()) 
							)			
							&&  (player.isOnFire() )
							)
			 if (!(target.getRemainingFireTicks() >= 5))
			 {
				 target.setRemainingFireTicks(target.getRemainingFireTicks() + 5);
			 } 
		}  */
		
	/*t	@SubscribeEvent
		public static void LivingAttackEvent (net.minecraftforge.event.entity.living.LivingAttackEvent event)
		{
			LivingEntity entity = event.getEntityLiving();
			DamageSource source = event.getSource();
			 ItemStack itemstack = ((entity)).getItemInHand(Hand.MAIN_HAND);
			if (
						(	(itemstack.getItem() == ItemInit.RUBY_PICKAXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SHOVEL.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_AXE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_HOE.get()) ||
							(itemstack.getItem() == ItemInit.RUBY_SWORD.get()) 
							)			
							&&  (entity.isOnFire() )
							)
			{
				
			}
				
		} */
		
		}