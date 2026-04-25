package me.allaymc.cosmetics.engine;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class PacketEngine {
    public void wings(Player p){
        p.getWorld().spawnParticle(Particle.CLOUD,p.getLocation().add(0,1,0),2);
    }
}
