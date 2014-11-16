package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;

public class Radar extends Hack {

	public Radar(Minecraft mc) {
		super(EnumHacks.TRACERS, mc);
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
        int pos = 1;
        ScaledResolution sc = new ScaledResolution(this.minecraft, this.minecraft.displayWidth, this.minecraft.displayHeight);
        for(Object o : this.minecraft.theWorld.getLoadedEntityList()) {
            if(o instanceof EntityPlayer && o != null && o != this.minecraft.thePlayer) {
                EntityPlayer enemy = (EntityPlayer)o;
                int dis = (int)this.minecraft.thePlayer.getDistanceToEntity(enemy);
                
                if (dis <= 20 && dis > 0) {
                	this.minecraft.fontRenderer.drawStringWithShadow("Enemy ["+dis+"]", sc.getScaledWidth() - this.minecraft.fontRenderer.getStringWidth("Enemy ["+dis+"]") - 2, 12 * pos, 0xFF0000);
            	} else if (dis <= 50) {
                	this.minecraft.fontRenderer.drawStringWithShadow("Enemy ["+dis+"]", sc.getScaledWidth() - this.minecraft.fontRenderer.getStringWidth("Enemy ["+dis+"]") - 2, 12 * pos, 0xFF6600);
                }
                
                pos++;
            }
        }
	}
		
}