package start.lesson5___;

import start.lesson5.Array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        //Ограбили магазин. Вор был ростом 178.
        //Следователь нашел две группы людей около магазина. Задача найти вора по росту.
        int[] group1 = {180, 178, 190};
        int[] group2 = {165, 195, 193};
        int[][] multiArray = {group1, group2};

        upperFor:
        for (int[] array : multiArray) {
            for (int number : array) {
                if (number == 178) {
                    System.out.println("Нашли вора!");
                    break upperFor;
                } else {
                    System.out.println("человек не подошел по росту");
                }
            }
        }

        int[] array1 = {2, 5, 8, 9, 12};
        int[] array2 = {7, 13, 18, 19, 16};
        int[][] murrayAll = {array1, array2};

        upperFor:
        for (int[] arr : murrayAll) {
            for (int number : arr) {
                if (number == 12) {
                    System.out.println("Ura this is - 12");
                    break upperFor;
                } else {
                    System.out.println("bad, we didn't find twelve");
                }
            }
        }
    }
}
