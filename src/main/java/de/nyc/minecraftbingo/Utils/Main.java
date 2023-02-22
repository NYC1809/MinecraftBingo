package de.nyc.minecraftbingo.Utils;

import de.nyc.minecraftbingo.BingoCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    private static Main plugin;
    public static String defaultGameMode = "CLASSIC";

    @Override
    public void onEnable() {

        plugin = this;

        registerListener();
        registerCommands();

    }

    @Override
    public void onDisable() {

    }

    private void registerListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        //register Listener here
    }

    private void registerCommands() {
        Objects.requireNonNull(getCommand("bingo")).setExecutor(new BingoCommand());
    }


}
