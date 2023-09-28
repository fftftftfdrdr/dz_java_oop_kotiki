package org.example;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;
    private int MaxSatiety;
    public Cat(String name, int appetite, int satiety, int MaxSatiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.MaxSatiety = MaxSatiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getMaxSatiety() {
        return MaxSatiety;
    }


    public void eat(){
        setSatiety(getSatiety() + getAppetite());
    }
}
