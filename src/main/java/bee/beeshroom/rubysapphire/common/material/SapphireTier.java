package bee.beeshroom.rubysapphire.common.material;

import java.util.function.Supplier;

import bee.beeshroom.rubysapphire.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

// references IItemTier:

public enum SapphireTier implements IItemTier {
/*  1 harvest lvl,  
	2 max uses, 
	3 effeciency, 
	4 damage, 
	5 enchant, 
	6 (and then repair) 
	
	 IRON(2, 250, 6.0F, 2.0F, 14, () 
   DIAMOND(3, 1561, 8.0F, 3.0F, 10, () 
      
	*/
/* original	(3, 
			550, 
			6.5F, 
			2.5F, 
			14, */
	
		
		SAPPHIRE
				(3, 
				755, 
				6.2f, 
				2.0f, 
				15, 
			() -> Ingredient.of(ItemInit.SAPPHIRE.get()));
	

	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantability;
	private final Ingredient repairMaterial;

	SapphireTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
			Supplier<Ingredient> repairMaterial) {
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial.get();
	}

	@Override
	public int getUses() {
		return this.maxUses;
	}

	@Override
	public float getSpeed() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamage;
	}

	@Override
	public int getLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairMaterial;
	}
	

}