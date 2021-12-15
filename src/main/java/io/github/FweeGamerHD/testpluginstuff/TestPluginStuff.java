package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPluginStuff extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("onEnable has been called!");
    }
    @Override
    public void onDisable(){
        getLogger().info("onDisable has been called!");
    }
}
