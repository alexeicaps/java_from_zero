package start.lesson6___;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.000;
        boolean hasAutomaticTransmission = false;
        //Задача: С помощью String format составить строку:
        //Привет, я менеджер салона [Имя бренда]
        //У нас есть модель - [Имя модели] за [Цена]
        //Есть ли у нее автоматическая коробка передач?
        //[Да/Нет]
//        System.out.printf("Привет, я менеджер салона %s. У нас есть модель - %s за %e. Есть ли у нее автоматическая коробка передач? %b", carMark, carModel, price, hasAutomaticTransmission);

        String result = """
                Привет, я менеджер салона %s
                У нас есть модель - %s за %f
                Есть ли у нее автоматическая коробка передач?
                %s
                """.formatted(carMark,carModel,price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);
    }
}
