package start.lesson5___;

public class Continue {
    public static void main(String[] args) {
        //Тренер дал задание спортсмену. Он бросает кости, и если выпадает любое значение от 1 до 5 - то он отжимается
        //А если выпадает шесть, то он отдыхает (ничего не делает)
        int[] array = {1, 6, 3, 4, 5, 6};

        for (int number : array) {
            System.out.println(number);
            if (number == 6) {
                System.out.println("rest");
                continue;
            } else {
                System.out.println("Спортсмен отжимается");
            }
        }
    }
}
