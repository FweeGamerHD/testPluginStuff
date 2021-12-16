package io.github.FweeGamerHD.testpluginstuff;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandKit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player){

            Player player = (Player) sender;

            ItemStack diamondsword = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack diamondchest = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack steak = new ItemStack(Material.COOKED_BEEF, 16);

            player.getInventory().addItem(diamondsword, diamondchest, steak);
        }

        return true;
    }
}
