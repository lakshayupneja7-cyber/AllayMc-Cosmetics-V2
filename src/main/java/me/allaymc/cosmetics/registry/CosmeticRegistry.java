package me.allaymc.cosmetics.registry;

import me.allaymc.cosmetics.type.CosmeticType;
import java.util.*;

public class CosmeticRegistry {
    private final Map<CosmeticType, Cosmetic> map = new HashMap<>();

    public void register(Cosmetic c){
        map.put(c.getType(),c);
    }

    public Cosmetic get(CosmeticType t){
        return map.get(t);
    }
}
