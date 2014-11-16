package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.Vigilance;
import net.minecraft.client.Minecraft;

public class Freecam extends Hack {

	private double _posX, _posY, _posZ;
	
	public Freecam(Minecraft mc) {
		super(EnumHacks.FREECAM, mc);
	}
	 
	@Override
	public void turnOn() {
		this.active = true;
		this.minecraft.thePlayer.jump();
		this.minecraft.thePlayer.noClip = true;
		if(!this.minecraft.thePlayer.capabilities.isFlying) Vigilance.fly.turnOn();
		this._posX = this.minecraft.thePlayer.posX;
		this._posY = this.minecraft.thePlayer.posY;
		this._posZ = this.minecraft.thePlayer.posZ;
	}

	@Override
	public void turnOff() {
		this.active = false;
		this.minecraft.thePlayer.noClip = false;
		Vigilance.fly.turnOff();
		this.minecraft.thePlayer.setPosition(this._posX, this._posY, this._posZ);
	}
}
