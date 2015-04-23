package me.mark;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SeeYouSoon extends JavaPlugin{

	// Start
	@Override
	public void onEnable(){
	}
	
	@Override 
	public void onDisable() {
	}
	
	//Commands
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String[] args){
		if(cmd.getName().equalsIgnoreCase("leaving")){
			Player player = (Player) sender;
			Bukkit.broadcastMessage(ChatColor.RED + player.getName() + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + " is about to leave the server. Please say your goodbyes!");
            Bukkit.getScheduler().runTaskLater(this, new Runnable() {
                public void run() {
                    //Run your function or change stuff here.
                   player.kickPlayer(ChatColor.RED + "Kicked:" + ChatColor.WHITE + " You requested to leave.");
                }
            }, 20 * 30);// There are 20 ticks in one second so we can just multiply seconds by 20.
		}
		return false;
		
	}
}
