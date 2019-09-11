package io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import me.mrCookieSlime.CSCoreLibPlugin.general.Particles.FireworkShow;

public final class ValuablesSurprise implements Surprise {
	
	@Override
	public String getName() {
		return "Valuables";
	}

	@Override
	public void activate(Random random, Player p, Location l) {
		FireworkShow.launchRandom(p, 3);
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.EMERALD, 4));
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.DIAMOND, 4));
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.GOLD_INGOT, 4));
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.IRON_INGOT, 4));
		l.getWorld().dropItemNaturally(l, new ItemStack(Material.LAPIS_LAZULI, 8));
	}

	@Override
	public LuckLevel getLuckLevel() {
		return LuckLevel.LUCKY;
	}

}
