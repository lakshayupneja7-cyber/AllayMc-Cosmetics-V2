package me.allaymc.cosmetics.api;

import me.allaymc.cosmetics.manager.CosmeticManager;
import me.allaymc.cosmetics.type.CosmeticType;
import org.bukkit.entity.Player;

public class CosmeticAPI {
    private static CosmeticManager manager;

    public static void init(CosmeticManager m){ manager = m; }

    public static void toggle(Player p, CosmeticType t){
        manager.toggle(p,t);
    }
}
