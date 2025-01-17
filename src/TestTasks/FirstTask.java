package TestTasks;

import java.util.Random;

public class FirstTask {
    public static void main(String[] args) {

        Random random = new Random();
        int size = random.nextInt(19) + 1;
        double[] randomArray = new double[size];
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextDouble();
        }

        // Нахождение максимального значения
        double max = randomArray[0];
        for (double num : randomArray) {
            if (num > max) {
                max = num;
            }
        }

        // Нахождение минимального значения
        double min = randomArray[0];
        for (double num : randomArray) {
            if (num < min) {
                min = num;
            }
        }

        // Нахождение среднего значения
        double sum = 0;
        for (double num : randomArray) {
            sum += num;
        }
        double average = sum / randomArray.length;

        // Вывод результатов
        System.out.println("Массив случайных чисел:");
        for (double num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Среднее значение массива: " + average);
    }
}

