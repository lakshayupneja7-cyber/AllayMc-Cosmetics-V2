package me.allaymc.cosmetics.manager;

import me.allaymc.cosmetics.type.CosmeticType;
import java.util.*;

public class CosmeticProfile {
    private final Set<CosmeticType> active = new HashSet<>();

    public boolean has(CosmeticType t){ return active.contains(t); }
    public void enable(CosmeticType t){ active.add(t); }
    public void disable(CosmeticType t){ active.remove(t); }
    public Set<CosmeticType> get(){ return active; }
}
