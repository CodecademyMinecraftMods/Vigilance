package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.util.Vars;
import net.minecraft.client.Minecraft;

public class Fullbright extends Hack {
	
	private float oldGamma;
	private Minecraft minecraft;
	
	public Fullbright(Minecraft mc) {
		super(EnumHacks.FULLBRIGHT);
		minecraft = mc;
		oldGamma = minecraft.gameSettings.gammaSetting;
	}
 
	@Override
	public void turnOn() {
		Vars.fullbright = true;
		oldGamma = minecraft.gameSettings.gammaSetting;
		minecraft.gameSettings.gammaSetting = 1000000;
	}
	
	@Override
	public void turnOff() {
		Vars.fullbright = false;
		minecraft.gameSettings.gammaSetting = oldGamma;
	}

	@Override
	public void toggle() {
		if(Vars.fullbright) {
			turnOff();
		} else {
			turnOn();
		}
	}

}