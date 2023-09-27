package ru.fecore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.fecore.EventListener;
import ru.fecore.FeCORE;
import ru.fecore.Storage;

public class joincommand extends FeCOREcommands {

    public joincommand() {
        super("join");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {

        if (args.length == 0) {
            if (!sender.hasPermission("fecore.join")) {
                sender.sendMessage(ChatColor.DARK_RED + FeCORE.getInstance().getConfig().getString("messages.noPermission"));
                return;
            }
            sender.sendMessage(ChatColor.RED + "Команда находится в разработке");
        }
    }
}

