package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.util.Vars;
import net.minecraft.client.Minecraft;

public class Xray extends Hack {
	
	private Minecraft minecraft;
	
	public Xray(Minecraft mc) {
		super(EnumHacks.XRAY);
		minecraft = mc;
	}
 
	@Override
	public void turnOn() {
		Vars.xray = true;
		minecraft.renderGlobal.loadRenderers();
	}
	
	@Override
	public void turnOff() {
		Vars.xray = false;
		minecraft.renderGlobal.loadRenderers();
	}

	@Override
	public void toggle() {
		if(Vars.xray) {
			turnOff();
		} else {
			turnOn();
		}
	}
	
}