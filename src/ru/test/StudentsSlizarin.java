package ru.test;

public class StudentsSlizarin extends Slizarin {
    private String name;

    public StudentsSlizarin(int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, String name) {
        super(magic, transgression, cunning, determination, ambition, resourcefulness, lustForPower);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
