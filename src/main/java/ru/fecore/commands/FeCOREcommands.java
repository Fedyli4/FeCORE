package ru.fecore.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.jetbrains.annotations.NotNull;
import ru.fecore.FeCORE;

public abstract class FeCOREcommands implements CommandExecutor {

    public FeCOREcommands(String command) {
        PluginCommand pluginCommand = FeCORE.getInstance().getCommand(command);
        if (pluginCommand != null) {
            pluginCommand.setExecutor(this);
        }
    }

    public abstract void execute(CommandSender sender, String label, String[] args);
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        execute(commandSender, label, args);
        return true;
    }
}


