package start.lesson6___;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);
    }
}
