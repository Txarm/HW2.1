package ru.test;

public class StudentsCogtevran extends Cogtevran{
    private String name;

    public StudentsCogtevran(int magic, int transgression, int smart, int wisdom, int witty, int creative, String name) {
        super(magic, transgression, smart, wisdom, witty, creative);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
