package com.clearportals;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ponto de entrada do mod, executado quando o jogo abre no cliente.
 *
 * Etapa 1: o efeito translucido vem da textura do portal, que fica em
 * src/main/resources/assets/minecraft/textures/block/.
 *
 * Etapa 2 (futura): a visao da outra dimensao sera registrada aqui.
 */
public class ClearPortalsClient implements ClientModInitializer {
    public static final String MOD_ID = "clearportals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Clear Portals carregado: portais translucidos ativados.");
    }
}
