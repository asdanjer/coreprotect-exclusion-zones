package org.asdanjer.coreprotectexclusionzones;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;

public final class Coreprotect_exclusion_zones extends JavaPlugin {
    private CoreProtectAPI getCoreProtect() {
        Plugin plugin = getServer().getPluginManager().getPlugin("CoreProtect");

        // Check that CoreProtect is loaded
        if (plugin == null || !(plugin instanceof CoreProtect)) {
            return null;
        }
    }
    @Override
    public void onEnable() {
        // Plugin startup logic
        CoreProtectAPI coreProtect = getCoreProtect();
        if (coreProtect == null) {
            getLogger().info("CoreProtect not found, disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        getLogger().info("CoreProtect found, enabling plugin.");

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
