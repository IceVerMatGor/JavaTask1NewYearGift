package org.gorbov.gift.services;

import org.gorbov.gift.repo.Gift;
import org.gorbov.gift.models.Sweet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Comparator;

public class Sorter {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sorter.class);

    public static void sortByWeight(Gift gift) {
        LOGGER.debug("sortByWeight start");
        if (gift == null) {
            LOGGER.warn("gift is null");
        }
        Collections.sort(gift.getSweets(), Comparator.comparing(Sweet::getWeight));
        LOGGER.info("sortByWeight completed");
    }

    public static void sortBySugar(Gift gift) {
        LOGGER.debug("sortBySugar start");
        if (gift == null) {
            LOGGER.warn("gift is null");
        }
        Collections.sort(gift.getSweets(), Comparator.comparing(Sweet::getSugar));
        LOGGER.info("sortBySugar completed");
    }

    public static void sortByFirm(Gift gift) {
        LOGGER.debug("sortByFirm start");
        if (gift == null) {
            LOGGER.warn("gift is null");
        }
        Collections.sort(gift.getSweets(), Comparator.comparing(Sweet::getFirm));
        LOGGER.info("sortByFirm completed");
    }
}
