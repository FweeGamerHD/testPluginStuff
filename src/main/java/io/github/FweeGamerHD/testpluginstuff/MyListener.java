package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.AQUA + "[" + ChatColor.RED + "+" + ChatColor.AQUA + "]" + event.getPlayer().getName());
    }

    public void onExampleEvent(ExampleEvent event) {
        Bukkit.broadcastMessage("Heyho, this is just a test message");
    }
}
