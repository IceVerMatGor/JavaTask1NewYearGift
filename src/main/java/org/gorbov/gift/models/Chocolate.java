package org.gorbov.gift.models;

public class Chocolate extends Sweet {
    private Integer cocoa;

    public Chocolate() {
        cocoa = 0;
    }

    public Chocolate(String firm, Integer weight, Integer sugar, Integer cocoa) {
        super(firm, weight, sugar);
        this.cocoa = cocoa;
    }

    public Integer getCocoa() {
        return cocoa;
    }


}
