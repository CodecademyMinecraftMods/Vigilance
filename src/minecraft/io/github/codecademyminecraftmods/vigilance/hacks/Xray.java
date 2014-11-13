package io.github.codecademyminecraftmods.vigilance.hacks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;

public class Xray extends Hack {
	
	public static Block[] blocks = new Block[]{Blocks.diamond_ore, Blocks.iron_ore, Blocks.redstone_ore, Blocks.coal_ore, Blocks.emerald_ore, Blocks.lapis_ore, Blocks.chest, Blocks.gold_ore};
	
	public Xray(Minecraft mc) {
		super(EnumHacks.XRAY, mc);
	}
 
	@Override
	public void turnOn() {
		this.active = true;
		minecraft.renderGlobal.loadRenderers();
	}
	
	@Override
	public void turnOff() {
		this.active = false;
		minecraft.renderGlobal.loadRenderers();
	}
	
}