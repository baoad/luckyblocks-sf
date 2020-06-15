package io.github.thebusybiscuit.slimefunluckyblocks;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.CustomItemSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.LuckLevel;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.Surprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.CakeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.CookedFoodSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.DiamondBlockPillarSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.DiamondBlockSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.EmeraldBlockSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.GoldenAppleSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.IronBlockSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyAxeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyBootsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyChestplateSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyHelmetSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyLeggingsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyPickaxeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckyPotionsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.LuckySwordSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.TamedCatsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.TamedDogsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.UnluckyPotionsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.ValuablesSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.lucky.XPRainSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.ChickenRainSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.CookieSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.DyeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.FishSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.GrootSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.HaySurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.JebSheepSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.JerrySlimeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.PotatOSSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.RainbowSheepSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.RawFoodSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.VillagersSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.neutral.WanderingTraderSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.pandora.IronGolemsSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.pandora.ReapersSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.AnvilRainSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.BryanZombieSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.ChargedCreeperSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.CobwebSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.EnclosedWaterSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.ExplosionSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.FakeDiamondBlock;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.FlyingCreeperSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.FlyingTNTSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.GiantSlimeSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.HighJumpSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.TNTRainSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.VoidHoleSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.WalshrusSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.WitchSurprise;
import io.github.thebusybiscuit.slimefunluckyblocks.surprises.unlucky.ZombiePigmenSurprise;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullBlock;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.GitHubBuildsUpdater;
import me.mrCookieSlime.Slimefun.cscorelib2.updater.Updater;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Rotatable;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

public class SlimefunLuckyBlocks extends JavaPlugin implements SlimefunAddon {

	private Config cfg;
	private final List<Surprise> surprises = new LinkedList<>();
	private final BlockFace[] blockfaces = {BlockFace.NORTH, BlockFace.NORTH_EAST, BlockFace.EAST, BlockFace.SOUTH_EAST, BlockFace.SOUTH, BlockFace.SOUTH_WEST, BlockFace.WEST, BlockFace.NORTH_WEST};
	
	private final String texture = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjNiNzEwYjA4YjUyM2JiYTdlZmJhMDdjNjI5YmEwODk1YWQ2MTEyNmQyNmM4NmJlYjM4NDU2MDNhOTc0MjZjIn19fQ==";
	
	@Override
	public void onEnable() {
		cfg = new Config(this);

		// Setting up bStats
		new Metrics(this, 4858);

		if (getDescription().getVersion().startsWith("DEV - ")) {
			Updater updater = new GitHubBuildsUpdater(this, getFile(), "TheBusyBiscuit/luckyblocks-sf/master");
			if (cfg.getBoolean("options.auto-update")) updater.start();
		}
		
		Category category = new Category(new NamespacedKey(this, "lucky_blocks"), new CustomItem(SkullItem.fromBase64(texture), "&rLucky Blocks", "&a> Click to open"));
		
		SlimefunItemStack luckyBlock = new SlimefunItemStack("LUCKY_BLOCK", texture, "&rLucky Block", "&7Luck: &r0");
		SlimefunItemStack veryLuckyBlock = new SlimefunItemStack("LUCKY_BLOCK_LUCKY", texture, "&rVery lucky Block", "&7Luck: &a+80");
		SlimefunItemStack veryUnluckyBlock = new SlimefunItemStack("LUCKY_BLOCK_UNLUCKY", texture, "&rVery unlucky Block", "&7Luck: &c-80");
		SlimefunItemStack pandorasBox = new SlimefunItemStack("PANDORAS_BOX", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODZjN2RkZTUxMjg3MWJkNjA3Yjc3ZTY2MzVhZDM5ZjQ0ZjJkNWI0NzI5ZTYwMjczZjFiMTRmYmE5YTg2YSJ9fX0=", "&5Pandora's Box", "&7Luck: &c&oERROR");
		
		new LuckyBlock(category, luckyBlock, RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K, new ItemStack(Material.DISPENSER), SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K, SlimefunItems.GOLD_12K})
		.register(this, surprises, s -> s.getLuckLevel() != LuckLevel.PANDORA);
		
		new LuckyBlock(category, veryLuckyBlock, RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {null, SlimefunItems.GOLD_12K, null, SlimefunItems.GOLD_12K, luckyBlock, SlimefunItems.GOLD_12K, null, SlimefunItems.GOLD_12K, null})
		.register(this, surprises, s -> s.getLuckLevel() == LuckLevel.LUCKY);
		
		new LuckyBlock(category, veryUnluckyBlock, RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {null, new ItemStack(Material.SPIDER_EYE), null, new ItemStack(Material.SPIDER_EYE), luckyBlock, new ItemStack(Material.SPIDER_EYE), null, new ItemStack(Material.SPIDER_EYE), null})
		.register(this, surprises, s -> s.getLuckLevel() == LuckLevel.UNLUCKY);
		
		new LuckyBlock(category, pandorasBox, RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.LAPIS_BLOCK), luckyBlock, new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.OAK_PLANKS), new ItemStack(Material.LAPIS_BLOCK), new ItemStack(Material.OAK_PLANKS)})
		.register(this, surprises, s -> s.getLuckLevel() == LuckLevel.PANDORA);
		
		new WorldGenerator(this);
		registerSurprises();
		
		getLogger().log(Level.INFO, "Loaded {0} different Surprises!", surprises.size());
	}

	private void registerSurprises() {
		// Lucky Surprises
		registerSuprise(new CookedFoodSurprise());
		registerSuprise(new GoldenAppleSurprise());
		registerSuprise(new DiamondBlockSurprise());
		registerSuprise(new DiamondBlockPillarSurprise());
		registerSuprise(new EmeraldBlockSurprise());
		registerSuprise(new IronBlockSurprise());
		registerSuprise(new TamedDogsSurprise());
		registerSuprise(new TamedCatsSurprise());
		registerSuprise(new ValuablesSurprise());
		registerSuprise(new LuckySwordSurprise());
		registerSuprise(new LuckyPickaxeSurprise());
		registerSuprise(new LuckyAxeSurprise());
		registerSuprise(new XPRainSurprise());
		registerSuprise(new LuckyHelmetSurprise());
		registerSuprise(new LuckyChestplateSurprise());
		registerSuprise(new LuckyLeggingsSurprise());
		registerSuprise(new LuckyBootsSurprise());
		registerSuprise(new LuckyPotionsSurprise());
		registerSuprise(new UnluckyPotionsSurprise());
		registerSuprise(new CakeSurprise());
		
		// Neutral Surprises
		registerSuprise(new GrootSurprise());
		registerSuprise(new RawFoodSurprise());
		registerSuprise(new FishSurprise());
		registerSuprise(new WanderingTraderSurprise());
		registerSuprise(new RainbowSheepSurprise());
		registerSuprise(new ChickenRainSurprise());
		registerSuprise(new DyeSurprise());
		registerSuprise(new HaySurprise());
		registerSuprise(new CookieSurprise());
		registerSuprise(new JebSheepSurprise());
		registerSuprise(new VillagersSurprise());
		registerSuprise(new PotatOSSurprise());
		registerSuprise(new JerrySlimeSurprise());

		// Unlucky Surprises
		registerSuprise(new ChargedCreeperSurprise());
		registerSuprise(new WitchSurprise());
		registerSuprise(new ExplosionSurprise());
		registerSuprise(new VoidHoleSurprise());
		registerSuprise(new AnvilRainSurprise());
		registerSuprise(new EnclosedWaterSurprise());
		registerSuprise(new TNTRainSurprise());
		registerSuprise(new FlyingCreeperSurprise());
		registerSuprise(new FlyingTNTSurprise());
		registerSuprise(new FakeDiamondBlock());
		registerSuprise(new BryanZombieSurprise());
		registerSuprise(new WalshrusSurprise());
		registerSuprise(new HighJumpSurprise());
		registerSuprise(new CobwebSurprise());
		registerSuprise(new GiantSlimeSurprise());
		registerSuprise(new ZombiePigmenSurprise());
		
		// Pandora Box Surprises
		registerSuprise(new ReapersSurprise());
		registerSuprise(new IronGolemsSurprise());

		// CustomItem Surprises
		if (cfg.getValue("custom") != null && cfg.getKeys("custom").size() > 0) {
			for (String name : cfg.getKeys("custom")) {
				LuckLevel luckLevel = LuckLevel.NEUTRAL;
				List<ItemStack> items = new ArrayList<>();

				if (cfg.getString("custom." + name + ".lucklevel") != null) {
					try {
						luckLevel = LuckLevel.valueOf(cfg.getString("custom." + name + ".lucklevel").toUpperCase());
					} catch (IllegalArgumentException ex) {
						getLogger().log(Level.WARNING, "Couldn't load lucklevel of CustomItem Surprise '" + name + "', now using NEUTRAL (default)");
						getLogger().log(Level.WARNING, "Valid lucklevel types: LUCKY, NEUTRAL, UNLUCKY, PANDORA");
					}
				}

				if (cfg.getValue("custom." + name + ".items") != null && cfg.getKeys("custom." + name + ".items").size() > 0) {
					for (String itemID : cfg.getKeys("custom." + name + ".items")) {
						ItemStack item = null;
						String itemPath = "custom." + name + ".items." + itemID;
						if (cfg.getString(itemPath + ".type") != null && Material.getMaterial(cfg.getString(itemPath + ".type")) != null) {
							item = new ItemStack(Material.getMaterial(cfg.getString(itemPath + ".type")));
							ItemMeta itemMeta = item.getItemMeta();

							if (cfg.getInt(itemPath + ".amount") > 1) {
								item.setAmount(cfg.getInt(itemPath + ".amount"));
							}

							if (cfg.getString(itemPath + ".displayname") != null) {
								itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', cfg.getString(itemPath + ".displayname")));
							}

							if (cfg.getStringList(itemPath + ".lore").size() > 0) {
								List<String> lore = new ArrayList<>();
								cfg.getStringList(itemPath + ".lore").forEach(l -> {
									lore.add(ChatColor.translateAlternateColorCodes('&', l));
								});
								itemMeta.setLore(lore);
							}


							if (cfg.getStringList(itemPath + ".enchants").size() > 0) {
								cfg.getStringList(itemPath + ".enchants").forEach(ench -> {
									String enchName = ench.split(":")[0];
									String enchLevel = ench.split(":")[1];
									Enchantment enchantment;
									int level = 0;

									if (Enchantment.getByName(enchName.toUpperCase()) == null) {
										getLogger().log(Level.WARNING, "Couldn't set '" + enchName + "' enchant for CustomItem Surprise '" + name + "'");
										return;
									}
									enchantment = Enchantment.getByName(enchName.toUpperCase());

									try {
										level = Integer.parseInt(enchLevel);
									} catch (NumberFormatException ex) {
										getLogger().log(Level.WARNING, "Couldn't set '" + enchName + "' enchant with level '" + enchLevel + "' for CustomItem Surprise '" + name + "'");
										return;
									}

									itemMeta.addEnchant(enchantment, level, true);
								});
							}
							item.setItemMeta(itemMeta);
							items.add(item);
						}
					}

					if (items.size() > 0) {
						registerSuprise(new CustomItemSurprise(name, items, luckLevel));
					}
				}
			}
		}
	}

	public static ItemStack createPotion(Color color, PotionEffect effect, boolean lucky) {
		ItemStack potion = new ItemStack(lucky ? Material.POTION: Material.SPLASH_POTION);
		PotionMeta pm = (PotionMeta) potion.getItemMeta();
		pm.setDisplayName(ChatColor.translateAlternateColorCodes('&', (lucky ? "&6Lucky" : "&cUnlucky") + " potion"));
		pm.setColor(color);
		pm.addCustomEffect(effect, false);
		potion.setItemMeta(pm);
		return potion;
	}

	public void registerSuprise(Surprise surprise) {
		if (surprise instanceof CustomItemSurprise) {
			if (cfg.getBoolean("custom." + surprise.getName() + ".enabled")) {
				surprises.add(surprise);
			}
			return;
		}

		if (cfg.contains("events." + surprise.getName())) {
			if (cfg.getBoolean("events." + surprise.getName())) {
				surprises.add(surprise);
			}
		}
		else {
			cfg.setValue("events." + surprise.getName(), true);
			cfg.save();
			surprises.add(surprise);
		}
	}

	public void spawnLuckyBlock(Block b) {
		b.setType(Material.PLAYER_HEAD);
		Rotatable s = (Rotatable) b.getBlockData();
		s.setRotation(blockfaces[ThreadLocalRandom.current().nextInt(blockfaces.length)]);
		b.setBlockData(s);
		
		SkullBlock.setFromBase64(b, texture);
		BlockStorage.store(b, "LUCKY_BLOCK");
		
		if (getCfg().getBoolean("debug")) {
			getLogger().log(Level.INFO, "spawned lucky block at " + b.getX() + " " + b.getY() + " " + b.getZ() + " " + b.getWorld().getName());
		}
	}

	public Config getCfg() {
		return cfg;
	}

	@Override
	public JavaPlugin getJavaPlugin() {
		return this;
	}

	@Override
	public String getBugTrackerURL() {
		return "https://github.com/TheBusyBiscuit/luckyblocks-sf/issues";
	}

}
