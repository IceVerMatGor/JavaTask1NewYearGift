package org.gorbov.gift.models;

public class Lollipop extends Candy{
    private String color;

    public Lollipop() {
    }

    public Lollipop(String firm, Integer weight, Integer sugar, String form, String color) {
        super(firm, weight, sugar, form);
        this.color = color;
    }
}
