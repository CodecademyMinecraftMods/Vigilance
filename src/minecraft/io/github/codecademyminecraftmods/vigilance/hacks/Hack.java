package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;

public abstract class Hack {
	
	private EnumHacks mod;
	protected String name;
	protected Minecraft minecraft;
	
	public Hack(EnumHacks mod, Minecraft mc) {
		this.mod = mod;
		this.minecraft = mc;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void toggle();
	
}