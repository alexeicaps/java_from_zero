package start.lesson4___;

public class Practice {
    public static void main(String[] args) {
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = false;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = false;
        int countFineWheels = 0;
        countFineWheels += isFineWheel1 ? 1 : 0;
        countFineWheels += isFineWheel2 ? 1 : 0;
        countFineWheels += isFineWheel3 ? 1 : 0;
        countFineWheels += isFineWheel4 ? 1 : 0;

        if (isWorkEngine && isWorkTransmission && (countFineWheels >= 3)) {
            System.out.println("машина готова к эксплуатации");
        } else {
            System.out.println("машина сломана");
        }
    }
}
