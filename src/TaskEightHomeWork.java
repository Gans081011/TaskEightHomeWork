public class TaskEightHomeWork {
    public static void checkYear() {
        int a = 4;
        int b = 100;
        int c = 400;
        int year = 1920;
        if (year % a == 0 || year % c == 0 && year != b) {
            System.out.println("Номер года - високосный год ");

        } else {
            System.out.println("Номер года - не високосный год ");
        }
    }
    public static void checkPhone() {
        int clientOS = 0;  // изначальные данные, ios - 0, 1 - android
        int clientDeviceYear = 2014; // телефон произведен после 2015 года
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static int calculateNumDay(int deliveryDistance) {
        int leftDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + leftDays);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней:" + (leftDays + leftDays));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + (leftDays + 2));
        }
        return leftDays;
    }
    public static void main(String[] args) {
        // Задание 1
        checkYear();
        // Задание 2
        checkPhone();
        // задание 3
        int deliveryDistance = 95;
        calculateNumDay(deliveryDistance);
    }
}
