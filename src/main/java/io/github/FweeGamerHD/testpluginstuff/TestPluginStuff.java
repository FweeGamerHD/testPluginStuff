package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPluginStuff extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("onEnable has been called!");

        getServer().getPluginManager().registerEvents(new MyListener(), this);

        this.getCommand("kit").setExecutor(new CommandKit());

        ExampleEvent exampleEvent = new ExampleEvent("Msrules123");
        Bukkit.getPluginManager().callEvent(exampleEvent);
        if (!exampleEvent.isCancelled()) {
            Bukkit.getPlayer("Msrules123").sendMessage(exampleEvent.getPlayerName());
        }
    }
    @Override
    public void onDisable(){
        getLogger().info("onDisable has been called!");
    }
}
