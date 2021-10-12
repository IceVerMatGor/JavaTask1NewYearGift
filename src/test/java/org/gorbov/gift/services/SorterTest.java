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


public class SorterTest {
    @Test
    public void sortByWeightTest() {
        //GIVEN
        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Sweet("gg", 46, 2));
        sweets.add(new Candy("ro", 32, 2, "circle"));
        sweets.add(new Lollipop("ag", 15, 2, "cockerel","red"));
        sweets.add(new ChocolateBar("ag", 11, 2, 3, 4));
        Gift gift = new Gift(sweets);
        //WHEN
        new Sorter().sortByWeight(gift);
        //THEN
        Assert.assertEquals(11, sweets.get(0).getWeight().intValue());
        Assert.assertEquals(15, sweets.get(1).getWeight().intValue());
        Assert.assertEquals(32, sweets.get(2).getWeight().intValue());
        Assert.assertEquals(46, sweets.get(3).getWeight().intValue());
    }

    @Test
    public void sortBySugarTest() {
        //GIVEN
        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Sweet("gg", 46, 6));
        sweets.add(new Candy("ro", 32, 1, "circle"));
        sweets.add(new Lollipop("ag", 15, 2, "cockerel","red"));
        sweets.add(new ChocolateBar("ag", 11, 9, 3, 4));
        Gift gift = new Gift(sweets);
        //WHEN
        new Sorter().sortBySugar(gift);
        //THEN
        Assert.assertEquals(1, sweets.get(0).getSugar().intValue());
        Assert.assertEquals(2, sweets.get(1).getSugar().intValue());
        Assert.assertEquals(6, sweets.get(2).getSugar().intValue());
        Assert.assertEquals(9, sweets.get(3).getSugar().intValue());
    }

    @Test
    public void sortByFirmTest() {
        //GIVEN
        List<Sweet> sweets = new ArrayList<>();
        sweets.add(new Sweet("zzz", 46, 2));
        sweets.add(new Candy("bb", 32, 2, "circle"));
        sweets.add(new Lollipop("ab", 15, 2, "cockerel","red"));
        sweets.add(new ChocolateBar("abc", 11, 2, 3, 4));
        Gift gift = new Gift(sweets);
        //WHEN
        new Sorter().sortByFirm(gift);
        //THEN
        Assert.assertEquals("ab", sweets.get(0).getFirm());
        Assert.assertEquals("abc", sweets.get(1).getFirm());
        Assert.assertEquals("bb", sweets.get(2).getFirm());
        Assert.assertEquals("zzz", sweets.get(3).getFirm());
    }
}
