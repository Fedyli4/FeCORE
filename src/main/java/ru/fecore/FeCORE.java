package ru.fecore;


import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import ru.fecore.commands.fecoregamemode;
import ru.fecore.commands.fecorehelp;


public final class FeCORE extends JavaPlugin {

    private static FeCORE instance;
    private players data;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
       data = new players("players.yml");

        saveDefaultConfig();



        new fecoregamemode();
        new fecorehelp();
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static FeCORE getInstance() {
        return instance;
    }

    public static players getData() {
        return instance.data;
    }

}
