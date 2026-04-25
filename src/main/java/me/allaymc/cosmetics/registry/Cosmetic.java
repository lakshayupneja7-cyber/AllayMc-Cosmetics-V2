package me.allaymc.cosmetics.registry;

import me.allaymc.cosmetics.type.CosmeticType;
import org.bukkit.entity.Player;

public abstract class Cosmetic {
    public abstract CosmeticType getType();
    public void enable(Player p){}
    public void disable(Player p){}
    public void tick(Player p){}
}
