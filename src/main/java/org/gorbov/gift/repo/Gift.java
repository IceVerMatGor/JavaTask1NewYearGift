package org.gorbov.gift.repo;


import org.gorbov.gift.models.Sweet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Gift {
    private List<Sweet> sweets;

    private static final Logger LOGGER = LoggerFactory.getLogger(Gift.class);

    public Gift(List sweets) {
        this.sweets = sweets;

    }

    public Gift() {
    }

    public List<Sweet> getSweets() {
        LOGGER.debug("REPOSITORY: Sweets getAllOperation");
        if (sweets == null) {
            LOGGER.warn("REPOSITORY: Sweets is null");
        }
        LOGGER.info("REPOSITORY: Sweets getAllOperation success");
        return sweets;
    }

    public void setSweets(List<Sweet> sweets) {
        this.sweets = sweets;
    }

}
