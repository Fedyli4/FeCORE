package ru.fecore.commands;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import ru.fecore.FeCORE;
import java.util.List;
import java.util.UUID;

public class fecorehelp extends FeCOREcommands {

    public fecorehelp() {
        super("fecore");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if (args.length == 0) {
            if(!sender.hasPermission("fecore.admin")) {
                sender.sendMessage(ChatColor.DARK_RED + FeCORE.getInstance().getConfig().getString("messages.noPermission"));
            return;
            }
            sender.sendMessage(ChatColor.GOLD + "Все команды!!");
            sender.sendMessage("");
            sender.sendMessage(ChatColor.BLUE + "Для перезагрузки плагина используйте /" + label + " reload");
            return;
        }
    if (args[0].equalsIgnoreCase("reload")) {
        if (!sender.hasPermission("fecore.admin")) {
            sender.sendMessage(ChatColor.RED + "У вас нет прав, становись феменистом!!!");
            return;
            }
        FeCORE.getInstance().reloadConfig();
        sender.sendMessage(ChatColor.YELLOW + "Плагин перезагружен!!");
        return;
        }
    if (args[1].equalsIgnoreCase("creative")) {
            if (!sender.hasPermission("fecore.admin")) ;
            sender.sendMessage(ChatColor.DARK_RED + "У ВАС НЕТ ПРАВ!!!");
        }

    sender.sendMessage(ChatColor.DARK_RED + "Команда /fecore " + args[0] + " Не найдена");

    }


    @Override
    public List<String> complete(CommandSender sender, String[] args) {
        if(args.length == 1) return Lists.newArrayList("reload");
        return Lists.newArrayList();
    }
}
