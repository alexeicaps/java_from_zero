package oop.inheritance.lesson9;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Инфо о пуделе");
        //Пудель
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);

        System.out.println("Инфо об овчарке");
        //Овчарка
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);

        System.out.println("Инфо о терьере");
        Terier terier = new Terier(40);
        System.out.println(terier.countTeeth);
    }
}
