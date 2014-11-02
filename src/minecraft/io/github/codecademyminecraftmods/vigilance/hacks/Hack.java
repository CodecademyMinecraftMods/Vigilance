package io.github.codecademyminecraftmods.vigilance.hacks;

public abstract class Hack {
	
	private EnumHacks mod;
	protected String name;
	
	public Hack(EnumHacks mod) {
		this.mod = mod;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void toggle();
	
}