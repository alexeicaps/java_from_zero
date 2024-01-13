package start.lesson6___;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Alexei";
        double age = 39.2;
        boolean bool = true;
//        String phrase = "My name is " + name + " and I am " + age;
//        String phrase = String.format("My name is %s and I am %e. is %b", name, age, bool);
//        System.out.println(phrase);
        System.out.printf("My name is %s and I am %e. is %b", name, age, bool);

    }
}
