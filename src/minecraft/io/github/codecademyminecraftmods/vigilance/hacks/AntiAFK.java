package io.github.codecademyminecraftmods.vigilance.hacks;

import java.util.Random;

import net.minecraft.client.Minecraft;

public class AntiAFK extends Hack {

	private Random rng = new Random();
	
	public AntiAFK(Minecraft mc) {
		super(EnumHacks.ANTIAFK, mc);
	}
	
	public void turnOn() {
		this.active = true;
	}
	
	public void turnOff() {
		this.active = false;
	}
	
	public void tick() {
		switch(this.rng.nextInt(100)) {
		case 1:
			this.minecraft.thePlayer.motionX += 0.4D;
			break;
		case 2:
			this.minecraft.thePlayer.motionZ += 0.4D;
			break;
		case 3:
			this.minecraft.thePlayer.motionX -= 0.4D;
			break;
		case 4:
			this.minecraft.thePlayer.motionZ -= 0.4D;
			break;
		case 5:
			this.minecraft.thePlayer.jump();
			break;
		default:
			break;
		}
	}
	
}