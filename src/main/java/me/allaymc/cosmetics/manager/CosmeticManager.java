package me.allaymc.cosmetics.manager;

import me.allaymc.cosmetics.registry.Cosmetic;
import me.allaymc.cosmetics.registry.CosmeticRegistry;
import me.allaymc.cosmetics.type.CosmeticType;
import org.bukkit.entity.Player;
import java.util.*;

public class CosmeticManager {
    private final Map<UUID,CosmeticProfile> data = new HashMap<>();
    private final CosmeticRegistry registry;

    public CosmeticManager(CosmeticRegistry r){ this.registry=r; }

    private CosmeticProfile get(Player p){
        return data.computeIfAbsent(p.getUniqueId(),k->new CosmeticProfile());
    }

    public void toggle(Player p, CosmeticType t){
        CosmeticProfile d=get(p);
        Cosmetic c=registry.get(t);

        if(d.has(t)){
            d.disable(t);
            c.disable(p);
        }else{
            d.enable(t);
            c.enable(p);
        }
    }

    public void tick(Player p){
        CosmeticProfile d=get(p);
        for(CosmeticType t: d.get()){
            Cosmetic c=registry.get(t);
            if(c!=null) c.tick(p);
        }
    }
}
