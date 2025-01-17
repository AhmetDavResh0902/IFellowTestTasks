package TestTasks;

import java.util.Scanner;

public class ThirdTask {

    // Метод для конвертации температуры
    public double convert(double celsius, String scale) {
        switch (scale.toUpperCase()) {  // Преобразуем входящий параметр в верхний регистр для унификации
            case "K":
                return celsius + 273.15;
            case "F":
                return (celsius * 9/5) + 32;
            default:
                throw new IllegalArgumentException("Неизвестная шкала: " + scale);
        }
    }

    public static void main(String[] args) {

        ThirdTask converter = new ThirdTask();
        Scanner scanner = new Scanner(System.in);

        // Запрос температуры в градусах Цельсия
        System.out.print("Введите температуру в градусах Цельсия - числовое значение: ");
        double celsius = 0;
        if (scanner.hasNextDouble()) {
            celsius = scanner.nextDouble();
        } else {
            System.out.println("Ошибка ввода значения температуры в градусах Цельсия. Введите числовое значение! Программа завершена с ошибкой ввода");
            scanner.close();
            return;
        }

        // Выбор шкалы для конвертации
        System.out.println("\nВыберите шкалу для конвертации - номер нужной шкалы конвертирования:");
        System.out.println("1. Кельвины (K)");
        System.out.println("2. Фаренгейты (F)");
        int choice = 0;
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Ошибка ввода. Введите числовое значение для выбора шкалы.");
            scanner.close();
            return;
        }

        String scale = "";
        switch (choice) {
            case 1:
                scale = "K";
                break;
            case 2:
                scale = "F";
                break;
            default:
                System.out.println("Некорректный выбор! Завершение программы конвертации.");
                scanner.close();
                return;
        }

        // Выполнение конвертации и вывод результата
        try {
            double result = converter.convert(celsius, scale);
            System.out.printf("Температура в %s: %.2f%n", scale, result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
