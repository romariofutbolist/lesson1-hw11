import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printYear(int year) {
        System.out.println(year + " год - високосный год");
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1601;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printYear(year);
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static int checkOS(int clientOS) {
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            clientOS = iOs;
        } else if (clientOS == android) {
            clientOS = android;
        }
        return clientOS;
    }

    public static int checkYear(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {
            clientDeviceYear = 1;
        } else {
            clientDeviceYear = 0;
        }
        return clientDeviceYear;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0, clientDeviceYear = 2022;
        int phoneOS = checkOS(clientOS);
        int yearPhone = checkYear(clientDeviceYear);
        if (phoneOS == 1 && yearPhone == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (phoneOS == 1 && yearPhone != 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (phoneOS == 0 && yearPhone == 1) {
            System.out.println("Установите версию приложения для iOs по ссылке");
        } else if (phoneOS == 0 && yearPhone != 1) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке");
        } else {
            System.out.println("Операцмонная система не поддерживается");
        }
    }

    private static int checkDeliveryDay (int distance){
        int day = 0;
        if (distance<20) {
            day ++;
        } else if (20<=distance&&distance<60) {
            day +=2;
        } else if (60<=distance&&distance<=100) {
            day +=3;
        } else {
            day+=4;
        }
        return day;
    }
    private static void task3() {
        System.out.println("задача 3");
        int deliveryDistance = 60;
        int deliveryDays = checkDeliveryDay(deliveryDistance);
        if(deliveryDays<=3){
            System.out.println("Потребуется дней: " + (deliveryDays));
        } else {
            System.out.println("доставки нет");
        }
    }
}