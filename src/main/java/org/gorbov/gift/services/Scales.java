package org.gorbov.gift.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.gorbov.gift.repo.Gift;
import org.gorbov.gift.models.Sweet;

public class Scales {

    private static final Logger LOGGER = LoggerFactory.getLogger(Scales.class);

    public static int getAllWeight(Gift gift) {
        LOGGER.debug("getAllWeight start");
        int weight = 0;
        if (gift == null){
            LOGGER.warn("gift is null");
        }
        for (Sweet sweet : gift.getSweets()) {
            weight += sweet.getWeight();
        }
        LOGGER.info("getAllWeight completed");
        return weight;
    }

}
