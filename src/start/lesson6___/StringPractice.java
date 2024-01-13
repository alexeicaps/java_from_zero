package start.lesson6___;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        //Выбрать текст начиная c 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки этого слова
        String text = "my name is Giovanni Giorgio";
        String[] textResult = text.toLowerCase().substring(11).split(" ");
//        System.out.println(Arrays.toString(textResult));

        for (String word : textResult) {
            System.out.println(word);
            System.out.println(word.length());
            
        }

    }
}
