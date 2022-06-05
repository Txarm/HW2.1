package ru.test;

public class Student extends Hogwarts {
    private String name;


    public Student(int magic, int transgression, String name) {
        super(magic, transgression);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
