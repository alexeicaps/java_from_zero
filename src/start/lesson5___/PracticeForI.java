package start.lesson5___;

public class PracticeForI {
    public static void main(String[] args) {
        //Практическое задание №1
        //Распечатать все четные числа из массива numbers2
//        int[] numbers2 = {3, 2, 10, 5, 8};
//        for (int i = 0; i < 5; i++) {
//            if (numbers2[i] % 2 == 0)
//            {
//                System.out.println(numbers2[i]);
//            }

//        int[] numbers2 = {3, 2, 10, 5, 8};
//        for (int number : numbers2) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//        }

        //Практическое задание №2
        //Распечатать индексы всех четных элементов массива numbers2
//        int[] numbers2 = {3, 2, 10, 5, 8};
//        for (int i = 0; i < 5; i++) {
//            if (numbers2[i] % 2 == 0) {
//                System.out.println(i);
//            }
//        }

        //Практическое задание №3
        //Распечатать все индексы элементов четных чисел из массива numbers2
//        int[] numbers2 = {3, 2, 10, 5, 8};
//        for (int i = 0; i < 5; i++) {
//            if (numbers2[i] % 2 == 0) {
//                System.out.println(i);
//                }
//            }

        //Практическое задание №4
        //Распечатать все элементы под четными индексами из массива numbers2
        int[] numbers2 = {3, 2, 10, 5, 8};
        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers2[i]);
            }
        }
    }
}
