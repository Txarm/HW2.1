package ru.test;

public class Service {

    public void bestGriffindor(StudentsGriffindor student1, StudentsGriffindor student2) {
        int sum1 = student1.getNobility() + student1.getBrave() + student1.getHonor();
        int sum2 = student2.getNobility() + student2.getBrave() + student2.getHonor();
        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else if (sum1 == sum2) {
            System.out.println("В Гриффиндоре ничья!");
        }
    }

    public void bestCogtevran(StudentsCogtevran student1, StudentsCogtevran student2) {
        int sum3 = student1.getSmart() + student1.getWisdom() + student1.getWitty() + student1.getCreative();
        int sum4 = student2.getSmart() + student2.getWisdom() + student2.getWitty() + student2.getCreative();
        if (sum3 > sum4) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sum3 < sum4) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else if (sum3 == sum4) {
            System.out.println("В Когтевране ничья!");
        }
    }

    public void bestPuffindue(StudentsPuffindue student1, StudentsPuffindue student2) {
        int sum5 = student1.getHonesty() + student1.getIndustrious() + student1.getLoyalty();
        int sum6 = student2.getHonesty() + student2.getIndustrious() + student2.getLoyalty();
        if (sum5 > sum6) {
            System.out.println(student1.getName() + " лучший Пуффиндуец, чем " + student2.getName());
        } else if (sum5 < sum6) {
            System.out.println(student2.getName() + " лучший Пуффиндуец, чем " + student1.getName());
        } else if (sum5 == sum6) {
            System.out.println("В Пуффиндуе ничья!");
        }
    }

    public void bestSlizarin(StudentsSlizarin student1, StudentsSlizarin student2) {
        int sum7 = student1.getAmbition() + student1.getCunning() + student1.getDetermination() + student1.getResourcefulness() + student1.getLustForPower();
        int sum8 = student2.getAmbition() + student2.getCunning() + student2.getDetermination() + student2.getResourcefulness() + student2.getLustForPower();
        if (sum7 > sum8) {
            System.out.println(student1.getName() + " лучший Слизаринец, чем " + student2.getName());
        } else if (sum7 < sum8) {
            System.out.println(student2.getName() + " лучший Слизаринец, чем " + student1.getName());
        } else if (sum7 == sum8) {
            System.out.println("В Слизарине ничья!");
        }
    }

    public void bestInHogwarts(Student student1, Student student2) {
        int sum1 = student1.getMagic() + student1.getTransgression();
        int sum2 = student2.getMagic() + student2.getTransgression();
        if (sum1 > sum2) {
            System.out.println((student1.getName()) + " обладает большей мощностью, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " обладает большей мощностью, чем " + student1.getName());
        } else if (sum1 == sum2) {
            System.out.println("Ничья!");
        }
    }

    public void printStudentGriffindor(StudentsGriffindor print) {
        System.out.println(print.getName() + " - магия " + print.getMagic() + ", трансгрессирование " + print.getTransgression() + ", благородство " + print.getNobility() + ", храбрость " + print.getBrave() + ", честь " + print.getHonor());
    }
    public void printStudentCogtevran(StudentsCogtevran print) {
        System.out.println(print.getName() + " - магия " + print.getMagic() + ", трансгрессирование " + print.getTransgression() + ", ум " + print.getSmart() + ", мудрость " + print.getWisdom() + ", остроумность " + print.getWitty() + ", творчество " + print.getCreative());
    }
    public void printStudentPuffindue(StudentsPuffindue print) {
        System.out.println(print.getName() + " - магия " + print.getMagic() + ", трансгрессирование " + print.getTransgression() + ", трудолюбие " + print.getIndustrious() + ", верность " + print.getLoyalty() + ", честность " + print.getHonesty());
    }
    public void printStudentSlizarin(StudentsSlizarin print) {
        System.out.println(print.getName() + " - магия " + print.getMagic() + ", трансгрессирование " + print.getTransgression() + ", хитрость " + print.getCunning() + ", решительность " + print.getDetermination() + ", амбициозность " + print.getAmbition() + ", находчивость " + print.getResourcefulness() + ", жажда власти " + print.getLustForPower());
    }

}
