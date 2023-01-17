package net.allthemods.alltheores.meka.resources;


import mekanism.api.chemical.slurry.Slurry;
import mekanism.common.registration.impl.SlurryRegistryObject;
import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.meka.SlurryRegistry;

import java.util.LinkedHashMap;
import java.util.Map;

public class ATOSlurries {

    public static final SlurryRegistry SLURRIES = new SlurryRegistry(Reference.MOD_ID);

    public static final Map<ATOResource, SlurryRegistryObject<Slurry, Slurry>> PROCESSED_RESOURCES = new LinkedHashMap<>();

    static {
        for (ATOResource resource : EnumFunc.PRIMARY_RESOURCES) {
            PROCESSED_RESOURCES.put(resource, SLURRIES.register(resource));
        }
    }


}
