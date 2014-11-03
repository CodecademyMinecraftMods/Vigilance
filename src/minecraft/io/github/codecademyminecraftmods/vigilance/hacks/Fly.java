package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.util.Vars;
import net.minecraft.client.Minecraft;

public class Fly extends Hack {
	
	public Fly(Minecraft mc) {
		super(EnumHacks.FLY, mc);
	}
	 
	@Override
	public void turnOn() {
		Vars.fly = true;
		minecraft.thePlayer.capabilities.allowFlying = true;
	}
	
	@Override
	public void turnOff() {
		Vars.fly = false;
		minecraft.thePlayer.capabilities.allowFlying = false;
		minecraft.thePlayer.capabilities.isFlying = false;
	}

	@Override
	public void toggle() {
		if(Vars.fly) {
			turnOff();
		} else {
			turnOn();
		}
	}
	
}