package io.github.codecademyminecraftmods.vigilance;

import io.github.codecademyminecraftmods.vigilance.hacks.AntiAFK;
import io.github.codecademyminecraftmods.vigilance.hacks.Fly;
import io.github.codecademyminecraftmods.vigilance.hacks.Freecam;
import io.github.codecademyminecraftmods.vigilance.hacks.Fullbright;
import io.github.codecademyminecraftmods.vigilance.hacks.KillAura;
import io.github.codecademyminecraftmods.vigilance.hacks.NoSwear;
import io.github.codecademyminecraftmods.vigilance.hacks.Radar;
import io.github.codecademyminecraftmods.vigilance.hacks.Regen;
import io.github.codecademyminecraftmods.vigilance.hacks.Xray;
import io.github.codecademyminecraftmods.vigilance.util.CheckKey;
import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

public class Vigilance {
	
	public static Minecraft minecraft = Minecraft.getMinecraft();
	public static CheckKey ck = new CheckKey(minecraft);
	
	public static Fullbright fullbright = new Fullbright(minecraft);
	public static Xray xray = new Xray(minecraft);
	public static Regen rgn = new Regen(minecraft);
	public static Fly fly = new Fly(minecraft);
	public static KillAura ka = new KillAura(minecraft);
	public static AntiAFK aafk = new AntiAFK(minecraft);
	public static Freecam fc = new Freecam(minecraft);
	public static Radar rdr = new Radar(minecraft);
	public static NoSwear nswr = new NoSwear(minecraft);
	
	public static void tick() {
        int pos = 1;
        if(fullbright.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Fullbright", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(xray.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Xray", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(rgn.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Regen", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(fly.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Fly", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(ka.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Kill Aura", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(aafk.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Anti AFK", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(fc.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Freecam", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(rdr.isActive()) {
            minecraft.fontRenderer.drawStringWithShadow("Text Radar", 2, 12 * pos, 0xFFFFFF);
            pos++;
        }
        if(nswr.isActive()) {
        	minecraft.fontRenderer.drawStringWithShadow("No Swear", 2, 12 * pos, 0xFFFFFF);
        	pos++;
        }
	}
	
	public static void checkForKeyPress() {
		if(ck.checkKey(Keyboard.KEY_F)) {
			fullbright.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_X)) {
			xray.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_C)) {
			rgn.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_Z)) {
			fly.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_R)) {
			ka.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_V)) {
			aafk.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_G)) {
			fc.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_B)) {
			rdr.toggle();
		}
		if(ck.checkKey(Keyboard.KEY_N)) {
			nswr.toggle();
		}
	}

}