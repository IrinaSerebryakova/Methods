import java.time.LocalDate;

public class Main {

    //Task 1
    public static void toVerifyIsLeapYear(int year) {
        String isLeapYear = " год — високосный год.";
        String isNotLeapYear = " год — невисокосный год.";
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + isLeapYear);
                }
            } else {
                System.out.println(year + isLeapYear);
            }
        } else {
            System.out.println(year + isNotLeapYear);
        }
    }


    //Task 2
    public static void toDetermineVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if ((clientOS == 0 || clientOS == 1) && (clientDeviceYear > 2000 && clientDeviceYear < currentYear)) {
            System.out.print("Установите ");
            if (clientDeviceYear < currentYear) {
                System.out.print("облегченную ");
            }
            if (clientOS == 0) {
                System.out.println("версию для iOS по ссылке.");
            }
            if (clientOS == 1) {
                System.out.println("версию для Android по ссылке.");
            }
        } else{
            System.out.println("Введены некорректные данные.");
        }
    }

    //Task 3
    public static int toDetermineDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            deliveryTime--;
        } else {
            if (deliveryDistance > 0) {
                deliveryTime++;
            }
            if (deliveryDistance > 20) {
                deliveryTime++;
            }
            if (deliveryDistance < 60) {
                deliveryTime++;
            }
        }
        return deliveryTime;
    }


    public static void main(String[] args) {
        toVerifyIsLeapYear(2024);
        toDetermineVersion(0, 2023);
        toDetermineDeliveryTime(95);
    }
}

