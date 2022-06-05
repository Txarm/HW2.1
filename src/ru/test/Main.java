package ru.test;

public class Main {

    public static void main(String[] args) {
        StudentsGriffindor garryPotter = new StudentsGriffindor(50, 50, 30, 30, 30, "Harry Potter");
        StudentsGriffindor germionaGranger = new StudentsGriffindor(40, 30, 30, 30, 25, "Germiona Granger");
        StudentsGriffindor ronWeasley = new StudentsGriffindor(35, 35, 20, 30, 30, "Ron Weasley");
        StudentsSlizarin drakoMalfoe = new StudentsSlizarin(40, 30, 20, 15, 15, 15, 30, "Drako Malfoe");
        StudentsSlizarin gramMontegry = new StudentsSlizarin(25, 20, 15, 15, 15, 15, 15, "Graham Montegry");
        StudentsSlizarin gregoryGoil = new StudentsSlizarin(25, 25, 10, 10, 10, 10, 10, "Gregory Goil");
        StudentsPuffindue zakariaSmith = new StudentsPuffindue(30, 30, 20, 20, 20, "Zakaria Smith");
        StudentsPuffindue cedrickDiggery = new StudentsPuffindue(35, 35, 20, 20, 25, "Cedrick Diggery");
        StudentsPuffindue jastinFinch = new StudentsPuffindue(30, 25, 15, 20, 20, "Jastin Finch");
        StudentsCogtevran zhoyZhang = new StudentsCogtevran(25, 25, 20, 25, 25, 20, "Zhoy Zhang");
        StudentsCogtevran padmaPatil = new StudentsCogtevran(20, 20, 20, 20, 20, 20, "Padma Patil");
        StudentsCogtevran marcusBelby = new StudentsCogtevran(15, 15, 15, 15, 15, 15, "Marcus Belby");
        Service service = new Service();
        service.bestGriffindor(garryPotter, germionaGranger);
        service.bestCogtevran(zhoyZhang, padmaPatil);
        service.bestPuffindue(cedrickDiggery, zakariaSmith);
        service.bestSlizarin(gramMontegry, gregoryGoil);
        Student studentPotter = new Student(garryPotter.getMagic(), garryPotter.getTransgression(), garryPotter.getName());
        Student studentGranger = new Student(germionaGranger.getMagic(), germionaGranger.getTransgression(), germionaGranger.getName());
        Student studentWeasley = new Student(ronWeasley.getMagic(), ronWeasley.getTransgression(), ronWeasley.getName());
        Student studentMalfoe = new Student(drakoMalfoe.getMagic(), drakoMalfoe.getTransgression(), drakoMalfoe.getName());
        Student studentMontegry = new Student(gramMontegry.getMagic(), gramMontegry.getTransgression(), gramMontegry.getName());
        Student studentGoil = new Student(gregoryGoil.getMagic(), gregoryGoil.getTransgression(), gregoryGoil.getName());
        Student studentSmith = new Student(zakariaSmith.getMagic(), zakariaSmith.getTransgression(), zakariaSmith.getName());
        Student studentDiggery = new Student(cedrickDiggery.getMagic(), cedrickDiggery.getTransgression(), cedrickDiggery.getName());
        Student studentFinch = new Student(jastinFinch.getMagic(), jastinFinch.getTransgression(), jastinFinch.getName());
        Student studentZhang = new Student(zhoyZhang.getMagic(), zhoyZhang.getTransgression(), zhoyZhang.getName());
        Student studentPatil = new Student(padmaPatil.getMagic(), padmaPatil.getTransgression(), padmaPatil.getName());
        Student studentBelby = new Student(marcusBelby.getMagic(), marcusBelby.getTransgression(), marcusBelby.getName());
        service.bestInHogwarts(studentPotter,studentDiggery);
        service.printStudentGriffindor(garryPotter);
        service.printStudentCogtevran(zhoyZhang);
        service.printStudentPuffindue(cedrickDiggery);
        service.printStudentSlizarin(drakoMalfoe);
    }
}
