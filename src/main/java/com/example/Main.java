package com.example;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@SuppressWarnings("unused")
@Plugin(name = "ExamplePlugin", version = "1.0")
@Description("Just a simple bukkit plugin.")
@Author("Author")
@Website("https://example.com")
@ApiVersion(ApiVersion.Target.v1_13)
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello World!");
    }
}
