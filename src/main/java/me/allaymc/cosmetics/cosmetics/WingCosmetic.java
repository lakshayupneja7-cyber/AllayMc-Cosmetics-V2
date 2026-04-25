package me.allaymc.cosmetics.cosmetics;

import me.allaymc.cosmetics.registry.Cosmetic;
import me.allaymc.cosmetics.type.CosmeticType;
import org.bukkit.entity.Player;

public class WingCosmetic extends Cosmetic {
    public CosmeticType getType(){ return CosmeticType.WINGS; }
    public void tick(Player p){}
}
