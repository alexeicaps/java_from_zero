package oop.lersson7___;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", 10, "Petr");
//        System.out.println(cat.weight);
//        System.out.println(cat.color);
//        System.out.println(cat.ownerName);
//        cat.color = "Red";
//        System.out.println(cat.color);

        cat.destroySofa("Петра");

        String animal = cat.hunt(false);
        System.out.println(animal);

    }
}
