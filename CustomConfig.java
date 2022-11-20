package wtf.nucker.spigotutilities.utils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

/**
 * A class for easily creating custom config files
 * @author Nucker
 */
public class CustomConfig {
    private final File file;
    private final YamlConfiguration yaml;
    private static JavaPlugin plugin = JavaPlugin.getProvidingPlugin(getClass());

    /**
     * The constructor. Pass your params and the file is created and initiated.
     * @param name The name of the file. EG data.yml
     *
     *             <b>Must include the extension (.yml)</b>
     */
    public CustomConfig(String name) {
        if(!name.endsWith(".yml")) name = name+".yml";
        File dir = plugin.getDataFolder();
        if(!dir.exists()) {
            dir.mkdirs();
        }
        file = new File(dir, name);

        if(!file.exists()) {
            plugin.saveResource(name, false);
        }

        yaml = new YamlConfiguration();

        try {
            yaml.load(file);
        }catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the config file again updating the values that you can get in your code
     * to those that have been updated in the file
     */
    public void reload() {
        try {
            yaml.load(file);
        }catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    /**
     * Saves any changes made by the code to the file
     * EG: You set a value in your config. Call this method to save it into your file
     */
    public void save() {
        try {
            yaml.save(file);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return Returns the {@link YamlConfiguration}
     */
    public YamlConfiguration getConfig() {
        return yaml;
    }
}
