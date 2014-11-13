package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;

public abstract class Hack {
	
	private EnumHacks mod;
	protected String name;
	protected Minecraft minecraft;
	protected boolean active;
	
	public Hack(EnumHacks mod, Minecraft mc) {
		this.mod = mod;
		this.minecraft = mc;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	
	public void toggle() {
		if(!this.active) {
			turnOn();
		} else {
			turnOff();
		}
	}
	
	public boolean isActive() {
		return this.active;
	}
	
}