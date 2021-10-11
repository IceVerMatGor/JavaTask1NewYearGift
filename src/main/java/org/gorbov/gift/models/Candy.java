package org.gorbov.gift.models;

public class Candy extends Sweet {
    private String form;

    public Candy(String firm, Integer weight, Integer sugar, String form) {
        super(firm, weight, sugar);
        this.form = form;
    }

    public Candy() {
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

}
