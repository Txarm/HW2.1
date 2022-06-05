package ru.test;

public class StudentsGriffindor extends Griffindor {
    private String name;

    public StudentsGriffindor(int magic, int transgression, int nobility, int honor, int brave, String name) {
        super(magic, transgression, nobility, honor, brave);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
