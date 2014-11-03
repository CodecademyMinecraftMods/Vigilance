package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.util.Vars;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.PotionEffect;

public class Regen extends Hack {
	
	public Regen(Minecraft mc) {
		super(EnumHacks.REGEN, mc);
	}
	 
	@Override
	public void turnOn() {
		minecraft.thePlayer.setHealth(minecraft.thePlayer.getMaxHealth());
	}
	
	@Override
	public void turnOff() {}
	
	@Override
	public void toggle() {}
		
}