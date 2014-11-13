package io.github.codecademyminecraftmods.vigilance;

import io.github.codecademyminecraftmods.vigilance.hacks.AntiAFK;
import io.github.codecademyminecraftmods.vigilance.hacks.Fly;
import io.github.codecademyminecraftmods.vigilance.hacks.Freecam;
import io.github.codecademyminecraftmods.vigilance.hacks.Fullbright;
import io.github.codecademyminecraftmods.vigilance.hacks.KillAura;
import io.github.codecademyminecraftmods.vigilance.hacks.Regen;
import io.github.codecademyminecraftmods.vigilance.hacks.Radar;
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
	}

}