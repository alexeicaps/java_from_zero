package start.lesson4___;

public class Switch {
    public static void main(String[] args) {
        //1 - понедельник ... 7 - воскресенье
        int numberDay = 2;

        //Более короткий способ написания:
        switch (numberDay) {
            case 1 -> System.out.println("понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            default -> System.out.println("Такой день не существует");
        }

//        switch (numberDay) {
//            case 1:
//                System.out.println("понедельник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//            case 4:
//                System.out.println("Четверг");
//                break;
//            case 5:
//                System.out.println("Пятница");
//                break;
//            case 6:
//                System.out.println("Суббота");
//                break;
//            case 7:
//                System.out.println("воскресенье");
//                break;
//            default:
//                System.out.println("Такой день не существует");
//                break;
//
//        }
    }
}
