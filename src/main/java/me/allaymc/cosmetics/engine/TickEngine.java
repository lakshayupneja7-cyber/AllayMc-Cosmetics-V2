package me.allaymc.cosmetics.engine;

import me.allaymc.cosmetics.manager.CosmeticManager;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class TickEngine {
    public TickEngine(Plugin plugin, CosmeticManager m){
        Bukkit.getScheduler().runTaskTimer(plugin,()->{
            for(Player p:Bukkit.getOnlinePlayers()){
                m.tick(p);
            }
        },1L,1L);
    }
}
