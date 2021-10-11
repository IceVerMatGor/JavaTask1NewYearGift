package org.gorbov.gift.models;

public class Sweet {
    private String firm;
    private Integer weight;
    private Integer sugar;

    public Sweet() {
        weight = 0;
        sugar = 0;
    }

    public Sweet(String firm, Integer weight, Integer sugar) {
        this.firm = firm;
        this.weight = weight;
        this.sugar = sugar;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }
}
