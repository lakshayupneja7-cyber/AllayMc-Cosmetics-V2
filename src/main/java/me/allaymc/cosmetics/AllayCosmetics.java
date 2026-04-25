package me.allaymc.cosmetics;

import me.allaymc.cosmetics.engine.TickEngine;
import me.allaymc.cosmetics.manager.CosmeticManager;
import me.allaymc.cosmetics.registry.CosmeticRegistry;
import org.bukkit.plugin.java.JavaPlugin;

public class AllayCosmetics extends JavaPlugin {
    private CosmeticManager manager;

    @Override
    public void onEnable() {
        CosmeticRegistry registry = new CosmeticRegistry();
        manager = new CosmeticManager(registry);
        new TickEngine(this, manager);
    }

    public CosmeticManager getManager() {
        return manager;
    }
}
