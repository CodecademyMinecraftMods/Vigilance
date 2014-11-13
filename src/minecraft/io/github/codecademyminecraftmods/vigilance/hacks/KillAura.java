package io.github.codecademyminecraftmods.vigilance.hacks;

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
		this.active = true;
	}
	
	@Override
	public void turnOff() {
		this.active = false;
	}
	
	public void tick() {
		List<Entity> entities = minecraft.theWorld.getLoadedEntityList();
		for(Entity e : entities) {
			if(minecraft.thePlayer.getDistanceToEntity(e) <= 5.0F && e instanceof EntityLivingBase && e.getEntityId() != minecraft.thePlayer.getEntityId()) {
				minecraft.playerController.attackEntity(minecraft.thePlayer, e);
			}
		}
	}
	
}