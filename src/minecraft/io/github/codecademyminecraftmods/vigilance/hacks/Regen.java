package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Regen extends Hack {
	
	public Regen(Minecraft mc) {
		super(EnumHacks.REGEN, mc);
	}
	 
	@Override
	public void turnOn() {
		this.active = true;
		this.minecraft.thePlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 10000000, 4));
	}

	@Override
	public void turnOff() {
		this.active = false;
		this.minecraft.thePlayer.removePotionEffect(Potion.regeneration.id);
	}
		
}