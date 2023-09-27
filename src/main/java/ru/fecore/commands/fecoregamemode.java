package ru.fecore.commands;

import com.google.common.collect.Lists;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.fecore.FeCORE;

import java.util.List;
import java.util.UUID;

public class fecoregamemode extends FeCOREcommands {
    public fecoregamemode() {
        super("gm");
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        if (args.length == 0) {
            if(!sender.hasPermission("fecore.admin")) {
                sender.sendMessage("У вас нет прав");
                return;
            }
            sender.sendMessage(ChatColor.GOLD + "Все команды!!");
            sender.sendMessage("");
            sender.sendMessage(ChatColor.BLUE + "/gm creative - режим строителя" + "\n" + "/gm survival - Режим стоителя");
            return;
        }
        if (args[0].equalsIgnoreCase("creative")) {
                if (!sender.hasPermission("fecore.admin")) {
                    sender.sendMessage(ChatColor.RED + "У вас нет прав, становись феменистом!!!");
                    return;
                }
                Player player = (Player) sender;
                player.setGameMode(GameMode.CREATIVE);
                sender.sendMessage(ChatColor.YELLOW + "Вы  переключили режим " + args[0]);
                return;
        }
        if (args[0].equalsIgnoreCase("survival")) {
            if (!sender.hasPermission("fecore.admin")) {
                sender.sendMessage(ChatColor.RED + "У вас нет прав, становись феменистом!!!");
                return;
            }
            Player player = (Player) sender;
            player.setGameMode(GameMode.SURVIVAL);
            sender.sendMessage(ChatColor.YELLOW + "Вы  переключили режим " + args[0]);
            return;
        }
        if (args[0].equalsIgnoreCase("spectator")) {
            if (!sender.hasPermission("fecore.admin")) {
                sender.sendMessage(ChatColor.RED + "У вас нет прав, становись феменистом!!!");
                return;
            }
            Player player = (Player) sender;
            player.setGameMode(GameMode.SPECTATOR);
            sender.sendMessage(ChatColor.YELLOW + "Вы  переключили режим на " + args[0]);
            return;
        }

        if (args[0].equalsIgnoreCase("adventure")) {
            if (!sender.hasPermission("fecore.admin")) {
                sender.sendMessage(ChatColor.RED + "У вас нет прав, становись феменистом!!!");
                return;
            }
            Player player = (Player) sender;
            player.setGameMode(GameMode.ADVENTURE);
            sender.sendMessage(ChatColor.YELLOW + "Вы  переключили режим " + args[0]);
            return;
        }

        sender.sendMessage(ChatColor.DARK_RED + "Команда " + " Не найдена");

    }

    @Override
    public List<String> complete(CommandSender sender, String[] args) {
        if(args.length == 1) return Lists.newArrayList("creative", "survival", "spectator", "adventure");
        return Lists.newArrayList();


    }
}
