package bee.beeshroom.rubysapphire.core.init;

import bee.beeshroom.rubysapphire.RubySapphire;
import bee.beeshroom.rubysapphire.common.effects.BurningEffect;
import bee.beeshroom.rubysapphire.common.effects.DrowningEffect;
import net.minecraft.potion.Effect;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EffectsInit 
{
	public static final DeferredRegister<Effect> EFFECTS = DeferredRegister.create(ForgeRegistries.POTIONS, RubySapphire.MOD_ID);
	public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, RubySapphire.MOD_ID);

	//public static final RegistryObject<Effect> TEMPO = EFFECTS.register("tempo", TempoEffect::new);
	
	public static final RegistryObject<Effect> BURNING = EFFECTS.register("burning", BurningEffect::new);
	public static final RegistryObject<Effect> DROWNING = EFFECTS.register("drowning", DrowningEffect::new);
	
/*	
	public static void registerBrewingRecipes() {
		.addMix(Effects.FIRE_RESISTANCE, Items.FERMENTED_SPIDER_EYE, EffectsInit.BURNING.get());
	} */
}