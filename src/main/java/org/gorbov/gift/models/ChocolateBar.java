package org.gorbov.gift.models;

public class ChocolateBar extends Chocolate {
    private Integer bar;

    public ChocolateBar() {
        bar = 0;
    }

    public ChocolateBar(String firm, Integer weight, Integer sugar, Integer cocoa, Integer bar) {
        super(firm, weight, sugar, cocoa);
        this.bar = bar;
    }

    public Integer getBar() {
        return bar;
    }


}
