package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;

public class NoSwear extends Hack {

	public NoSwear(Minecraft mc) {
		super(EnumHacks.NOSWEAR, mc);
	}

	@Override
	public void turnOn() {
		this.active = true;
	}

	@Override
	public void turnOff() {
		this.active = false;
	}
	
}