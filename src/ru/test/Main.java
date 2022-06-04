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
        service.printStudent(garryPotter);
        service.bestGriffindor(garryPotter,germionaGranger);
        service.bestCogtevran(zhoyZhang,padmaPatil);
        service.bestPuffindue(cedrickDiggery,zakariaSmith);
        service.bestSlizarin(gramMontegry, gregoryGoil);
        service.bestInHogwarts(drakoMalfoe,garryPotter);

    }

}
