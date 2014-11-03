package io.github.codecademyminecraftmods.vigilance.hacks;

import io.github.codecademyminecraftmods.vigilance.util.Vars;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class KillAura extends Hack {
	
	public KillAura(Minecraft mc) {
		super(EnumHacks.KILLAURA, mc);
	}
 
	@Override
	public void turnOn() {
		Vars.ka = true;
	}
	
	@Override
	public void turnOff() {
		Vars.ka = false;
	}

	@Override
	public void toggle() {
		if(Vars.ka) {
			turnOff();
		} else {
			turnOn();
		}
	}
	
	public void tick() {
		List<Entity> entities = minecraft.theWorld.getLoadedEntityList();
		for(Entity e : entities) {
			if(minecraft.thePlayer.getDistanceToEntity(e) <= 5.0F && e instanceof EntityLivingBase && e.getEntityId() != minecraft.thePlayer.getEntityId()) minecraft.playerController.attackEntity(minecraft.thePlayer, e);
		}
	}
	
}