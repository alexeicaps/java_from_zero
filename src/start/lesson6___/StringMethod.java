package start.lesson6___;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
        System.out.println(textLower);

        //Длина строки
        int length = text.length();
        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean containsHello = text.contains("Hello");
        System.out.println(containsHello);

        //Замена всех кусков текста(подстроки) на другой текст
        String replaceText = text.replaceAll("l", "F");
        System.out.println(replaceText);

        //Повторить текст n раз
        String repeatedText = text.repeat(5);
        System.out.println(repeatedText);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] namesArray = names.split(";", 3);
        System.out.println(Arrays.toString(namesArray));


        String nnn = "Ghena;Jora;Alex;Borya";
        String[] stringArray = nnn.split(";");
        System.out.println(Arrays.toString(stringArray));
        String textulUpper = nnn.toUpperCase();
        String textulLower = nnn.toLowerCase();
        System.out.println(textulUpper);
        System.out.println(textulLower);

        //Объединение строк (Конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String wordComplete = word1 + word2;
        System.out.println(wordComplete);

        //Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
        System.out.println(startsWithHel);

        //Заканчивается на подстроку
        boolean endsWithWorld = text.endsWith("world!");
        System.out.println(endsWithWorld);

        //Обрезка строки (Первые 5 символов)
        String firstFiveLetters = text.substring(3, 8);
        System.out.println(firstFiveLetters);

        String textOlolo = "Hello my friend!".replaceAll("l", "|_").toUpperCase();
        System.out.println(textOlolo);

    }
}
