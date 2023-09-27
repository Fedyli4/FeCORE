package ru.fecore;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Storage {
    private File file;
    private FileConfiguration config;

    public Storage(String name) {
        file = new File(FeCORE.getInstance().getDataFolder(), name);
        try {
            if (!file.exists() && !file.createNewFile()) throw new IOException();
        } catch (IOException e) {
            throw new RuntimeException("При создании файла, players.yml произошла ошибка", e);
        }

        config = YamlConfiguration.loadConfiguration(file);
    }

    public FileConfiguration getConfig() {
        return config;
    }


    public void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            throw new RuntimeException("При сохранении players.yml произошла ошибка", e);

        }
    }
}
