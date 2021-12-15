package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ExampleEvent extends Event implements Cancellable {

    private final String playerName;
    private boolean isCancelled;

    public ExampleEvent(String playerName){
        this.playerName = playerName;
        this.isCancelled = false;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers(){
        return HANDLERS;
    }

    public static HandlerList getHandlerList(){
        return HANDLERS;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public boolean isCancelled(){
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled){
        this.isCancelled = isCancelled;
    }
}
