package bee.beeshroom.rubysapphire.core.event;

import bee.beeshroom.rubysapphire.Config;
import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.core.init.EffectsInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.PotionEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = RubySapphire.MOD_ID)
public class EffectEvents {
		
	//==============================BURNING===========================

	
	//when you are on fire, you get Burning Effect
	
		@SubscribeEvent
		public static void BurningEffect (LivingUpdateEvent event) 
		{
			if (Config.BURNDROWNEFFECT.get())
			{
			LivingEntity entity = event.getEntityLiving();
			
			if (entity.isOnFire() && entity.getRemainingFireTicks() >= 0 )//&& !entity.hasEffect(EffectsInit.BURNING.get()))
			{
				entity.addEffect(new EffectInstance (EffectsInit.BURNING.get(), entity.getRemainingFireTicks(), 0));
			}
		/*	if (entity.isInWaterRainOrBubble() && entity.hasEffect(EffectsInit.BURNING.get()))
			{
				entity.removeEffect(EffectsInit.BURNING.get());
			} */
			if (!entity.isOnFire())
			{
				entity.removeEffect(EffectsInit.BURNING.get());
			} 
			}
		}
		
		@SubscribeEvent
		public static void CatchOnFireFromBurningEffect (PotionEvent.PotionApplicableEvent event) 
		
		//just a way to make it so if you apply the effect, it will set you on fire. doesn't have a use in survival. but, 
		//it makes it consistent, i guess.
		
		{
			LivingEntity entity = event.getEntityLiving();
			Effect effect = event.getPotionEffect().getEffect();

			if (effect == EffectsInit.BURNING.get() && event.getPotionEffect().getDuration() > entity.getRemainingFireTicks()
				 && !entity.hasEffect(EffectsInit.BURNING.get()) && !entity.isOnFire()
					)
		 {	
				 entity.setRemainingFireTicks(event.getPotionEffect().getDuration());
			 }
		} 
		
		//set you on fire if you have Burning Effect and arent already burning
		//this doesnt have a use in Survival, but, if you apply the effect with a command "/effect give @p rubysapphire:burning", you will be lit on fire
/*		@SubscribeEvent
		public static void KeepBurning (LivingUpdateEvent event) 
		{
			if (Config.BURNDROWNEFFECT.get())
			{
			LivingEntity entity = event.getEntityLiving();
			EffectInstance effectinstance = entity.getEffect(EffectsInit.BURNING.get());
			
			if (!entity.isOnFire() && entity.hasEffect(EffectsInit.BURNING.get()) && !entity.isInWaterRainOrBubble()
					&& effectinstance.getDuration() > 0 )
					{
				//this probably wont work
				entity.setRemainingFireTicks(effectinstance.getDuration());
					}
			}
		} */
		
		
		
		//==================DROWNING=================
		
		
		@SubscribeEvent
		public static void DrowningEffect (LivingDamageEvent event) 
		{
			if (Config.BURNDROWNEFFECT.get())
			{
			LivingEntity entity = event.getEntityLiving();
			
			//when you are damaged by lack of air in water, you get Drowning Effect
			
			if (entity.isUnderWater() && entity.getAirSupply() < 1 && !entity.hasEffect(EffectsInit.DROWNING.get()))
			{
																				//very long! but don't worry. it goes away when you get air
				entity.addEffect(new EffectInstance (EffectsInit.DROWNING.get(), 120000, 0));
			}
			}
		}
		
		@SubscribeEvent
		public static void RemoveDrowningEffect (LivingUpdateEvent event) 
		{
			if (Config.BURNDROWNEFFECT.get())
			{
			LivingEntity entity = event.getEntityLiving();
			
			//when you have Drowning Effect, but get air, the effect is removed
			
			if (entity.hasEffect(EffectsInit.DROWNING.get()) && entity.getAirSupply() >= 1
					&& !entity.isUnderWater())
			{
				entity.removeEffect(EffectsInit.DROWNING.get());
			}
					}
		}
		
		
		@SubscribeEvent
		public static void DrowningEffect (PotionEvent.PotionApplicableEvent event) 
		{
			if (Config.BURNDROWNEFFECT.get())
			{
			LivingEntity entity = event.getEntityLiving();
			Effect effect = event.getPotionEffect().getEffect();
	 
			//Water Breathing potion removes Drowning Effect
			
			if (effect == Effects.WATER_BREATHING && entity.hasEffect(EffectsInit.DROWNING.get()))
		 {
				 entity.removeEffect(EffectsInit.DROWNING.get());
		 }
			
			//No usage in Survival. But, if you unnaturally apply Drowning, such as with a command, you should instantly lose all your air
			//this only works if you're underwater currently, since otherwise your air will refill and remove drowning effect
		
			if (effect == EffectsInit.DROWNING.get() && !entity.hasEffect(Effects.WATER_BREATHING))
			{
			/*	if (entity.getAirSupply() > 0)
				{
				entity.setAirSupply(entity.getAirSupply() - 1);	
				}
				if (entity.getAirSupply() <= 0)
				{
				entity.setAirSupply(0);	
				}
				*/
				
				if (entity.getAirSupply() > 0)
				{
				entity.setAirSupply(0);	
				}
				
			}	
			}
		}
		

				
				
	// ============================ OTHER =============================
				
				
}