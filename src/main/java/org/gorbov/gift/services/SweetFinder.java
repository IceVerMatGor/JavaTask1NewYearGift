package org.gorbov.gift.services;

import org.gorbov.gift.repo.Gift;
import org.gorbov.gift.models.Sweet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SweetFinder {

    private static final Logger LOGGER = LoggerFactory.getLogger(SweetFinder.class);

    public Sweet findSweetInRangeOfSugar(Gift gift, int minSugar, int maxSugar){
        LOGGER.debug("findSweetInRangeOfSugar start");
        if (gift == null) {
            LOGGER.warn("gift is null");
        }
        LOGGER.info("findSweetInRangeOfSugar completed");
        return gift.getSweets().stream().filter(s->s.getSugar()>=minSugar && s.getSugar()<=maxSugar).findFirst().get();
    }
}
