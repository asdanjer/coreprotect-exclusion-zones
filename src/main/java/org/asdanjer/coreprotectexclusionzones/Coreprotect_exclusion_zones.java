package org.asdanjer.coreprotectexclusionzones;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;

public final class Coreprotect_exclusion_zones extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");
        if (coreProtect == null) {
            getLogger().info("CoreProtect not found, disabling plugin.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        CoreProtectAPI coreProtectAPI = ((CoreProtect) coreProtect).getAPI();
        getLogger().info("CoreProtect found, enabling plugin.");

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
