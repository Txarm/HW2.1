package ru.test;

public class Puffindue extends Hogwarts{

    private int industrious;
    private int loyalty;
    private int honesty;

    public Puffindue(int magic, int transgression, int industrious, int loyalty, int honesty) {
        super(magic, transgression);
        this.industrious = industrious;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustrious() {
        return industrious;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
