package me.allaymc.cosmetics.engine;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class ParticleEngine {
    public void trail(Player p){
        p.getWorld().spawnParticle(Particle.END_ROD,p.getLocation(),2);
    }
}
