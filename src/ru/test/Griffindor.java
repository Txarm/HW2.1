package ru.test;

public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int brave;

    public Griffindor(int magic, int transgression, int nobility, int honor, int brave) {
        super(magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }
}
