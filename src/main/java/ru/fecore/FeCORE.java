package ru.fecore;

import org.bukkit.plugin.java.JavaPlugin;
import ru.fecore.commands.fecorehelp;

public final class FeCORE extends JavaPlugin {

    private static FeCORE instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        new fecorehelp();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static FeCORE getInstance() {
        return instance;
    }

}
