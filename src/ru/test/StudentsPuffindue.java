package ru.test;

public class StudentsPuffindue extends Puffindue{
    private String name;

    public StudentsPuffindue(int magic, int transgression, int industrious, int loyalty, int honesty, String name) {
        super(magic, transgression, industrious, loyalty, honesty);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
