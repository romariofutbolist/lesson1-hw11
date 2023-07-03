import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1600;
        printYear(year);
        }

    public static void checkPhone(int checkIOs, int checKYear) {
        int iOs = 0;
        int android = 1;
        int year = 2015;
        if (checKYear >= year && checkIOs == iOs) {
            System.out.println("Установите версию приложения для iOs по ссылке");
        } else if (checKYear < year && checkIOs == iOs) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке");
        } else if (checKYear >= year && checkIOs == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (checKYear < year && checkIOs == android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 2;
        if (clientOS == 0 || clientOS == 1) {
        checkPhone(clientOS, currentYear);
        } else {
            System.out.println("Операцмонная система не поддерживается");
        }
    }

    private static int checkDeliveryDay (int distance){
        int day = 0;
        if (distance < 20) {
            day ++;
        } else if (20 <= distance && distance < 60) {
            day += 2;
        } else if (60 <= distance && distance <= 100) {
            day += 3;
        }
        return day;
    }

    private static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 60;
        int deliveryDays = checkDeliveryDay(deliveryDistance);
        if (deliveryDays <= 3){
            System.out.println("Потребуется дней: " + (deliveryDays));
        } else {
            System.out.println("доставки нет");
        }
    }
}