package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import me.mrCookieSlime.Slimefun.cscorelib2.materials.MaterialCollections;

public final class DiamondBlockPillarSurprise implements Surprise {
	
	@Override
	public String getName() {
		return "Stained Clay Pillar with Diamond Block on top";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		for (int i = 0; i < 8; i++) {
			l.getWorld().spawnFallingBlock(l.add(0, (i + 1) * 4, 0), MaterialCollections.getAllTerracottaColors()[i].createBlockData());
		}
		l.getWorld().spawnFallingBlock(l.add(0, 9 * 4, 0), Material.DIAMOND_BLOCK.createBlockData());
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.LUCKY;
	}

}
