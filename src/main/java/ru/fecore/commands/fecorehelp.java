package ru.fecore.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import ru.fecore.FeCORE;

public class fecorehelp extends FeCOREcommands {

    public fecorehelp() {
        super("fecore");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage("Help");
            sender.sendMessage("Для перезагрузки плагина используйте /" + label + "reload");
            if(!sender.hasPermission("fecore.admin")) {
                sender.sendMessage("Пошел нахуй!!!!");
            }
            return;
        }
    if (args[0].equalsIgnoreCase("reload")) {
        if (!sender.hasPermission("fecore.admin")) {
            sender.sendMessage(ChatColor.RED + "У вас не прав, становись феменистом!!!");
            return;
            }
        FeCORE.getInstance().reloadConfig();

        }

    }
}
