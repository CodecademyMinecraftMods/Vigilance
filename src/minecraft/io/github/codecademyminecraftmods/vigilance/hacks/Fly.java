package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;

public class Fly extends Hack {
	
	public Fly(Minecraft mc) {
		super(EnumHacks.FLY, mc);
	}
	 
	@Override
	public void turnOn() {
		this.active = true;
		this.minecraft.thePlayer.capabilities.allowFlying = true;
	}
	
	@Override
	public void turnOff() {
		this.active = false;
		this.minecraft.thePlayer.capabilities.allowFlying = false;
		this.minecraft.thePlayer.capabilities.isFlying = false;
	}
	
}