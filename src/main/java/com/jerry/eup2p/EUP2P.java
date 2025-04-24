package com.jerry.eup2p;

import com.jerry.eup2p.registry.EUP2PItem;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(EUP2P.MOD_ID)
public class EUP2P {
    public static final String MOD_ID = "eup2p";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EUP2P(IEventBus modEventBus, ModContainer modContainer) {
        EUP2PItem.DR_ITEMS.register(modEventBus);
    }

    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
