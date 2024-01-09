package start.lesson4___;

public class BooleanLogic {
    public static void main(String[] args) {
        //Сынок купил хлеб
        boolean isBoughtBread = false;
        //Сынок купил молоко
        boolean isBoughtMilk = false;

        //And - Логическое И, если два значения true, то тогда true, иначе false
//        boolean isBoughtBreadAndMilk = isBoughtBread && isBoughtMilk;

//        if (isBoughtBread && isBoughtMilk) {
//            System.out.println("Grate, the son bought bread and milk");
//        } else if (isBoughtMilk) {
//            System.out.println("Good son, you bought the milk");
//        } else if (isBoughtBread) {
//            System.out.println("Good son, you bought the bread");
//        } else {
//            System.out.println("not good, no bread no milk");
//        }


        //Or - Логическое или, если хотя бы одно значение true, то тогда true, и только если все значения false,
        //то тогда false
        boolean isBoughtMilkOrBread = true || true;
//        boolean isBoughtMilkOrBread = true || true;

        //NOT - Логическое не, который переворачивает значение true на false и наоборот
        //Купил сладости или нет
        boolean isBoughtCandy = false;

        if (!isBoughtCandy) {
            System.out.println("good");
        }



    }
}
