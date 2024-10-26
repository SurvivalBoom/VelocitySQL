package net.survivalboom.velocitySQL;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(id = "velocitysql", name = "VelocitySQL", version = "1.0", description = "Додає MySQL драйвери на Velocity", url = "https://survivalboom.net", authors = {"TIMURishche"})
public class VelocitySQL {

    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Successfully loaded!");
    }

}
