package org.gorbov.gift.services;

import org.gorbov.gift.repo.Gift;
import org.gorbov.gift.models.Candy;
import org.gorbov.gift.models.ChocolateBar;
import org.gorbov.gift.models.Lollipop;
import org.gorbov.gift.models.Sweet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ScalesTest {
    @Test
    public void getAllWeightTest(){
        //GIVEN
        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Sweet("gg", 46, 2));
        sweets.add(new Candy("ro", 32, 2, "circle"));
        sweets.add(new Lollipop("ag", 15, 2, "cockerel","red"));
        sweets.add(new ChocolateBar("ag", 11, 2, 3, 4));
        Gift gift = new Gift(sweets);

        //WHEN
        int allWeight = Scales.getAllWeight(gift);

        //THEN
        Assert.assertEquals(104, allWeight);
    }
}
