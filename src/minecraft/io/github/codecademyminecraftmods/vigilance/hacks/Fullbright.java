package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;

public class Fullbright extends Hack {
	
	private float oldGamma;
	
	public Fullbright(Minecraft mc) {
		super(EnumHacks.FULLBRIGHT, mc);
		oldGamma = minecraft.gameSettings.gammaSetting;
	}
 
	@Override
	public void turnOn() {
		this.active = true;
		oldGamma = minecraft.gameSettings.gammaSetting;
		minecraft.gameSettings.gammaSetting = 1000000;
	}
	
	@Override
	public void turnOff() {
		this.active = false;
		minecraft.gameSettings.gammaSetting = oldGamma;
	}

}