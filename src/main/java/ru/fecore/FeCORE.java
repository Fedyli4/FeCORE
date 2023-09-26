package ru.fecore;

import it.unimi.dsi.fastutil.io.FastByteArrayInputStream;
import net.kyori.adventure.audience.Audience;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class FeCORE extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fecore").setExecutor(new CommandExecutor() {
            @Override
            public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

                if (args.length == 0){
                    Sender.sendMessage("Для перезагрузки плагина используйте -  /fecore reload");
                return true;
                }
                if (args[0].equalsIgnoreCase("reload"))
                    reloadConfig();
                Sender.sendMessage("Плагин перезапущен");
                return true;
            }

        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
