package ru.test;

public class Cogtevran extends Hogwarts{

    private int smart;
    private int wisdom;
    private int witty;
    private int creative;

    public Cogtevran(int magic, int transgression, int smart, int wisdom, int witty, int creative) {
        super(magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
