package bee.beeshroom.rubysapphire.common.effects;

import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.core.init.EffectsInit;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RubySapphire.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DrowningEffect extends Effect
{

	public DrowningEffect() 
	{
		super(EffectType.HARMFUL, 0);
	}

	

@SubscribeEvent
public static void onLivingUpdate(LivingUpdateEvent event) 
	{
	LivingEntity entity = event.getEntityLiving();
	
	 if (entity.hasEffect(EffectsInit.DROWNING.get()))
     {
	
		 
}


}
}