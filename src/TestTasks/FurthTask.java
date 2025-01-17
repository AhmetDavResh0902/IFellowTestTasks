package TestTasks;

import java.util.Random;

public class FurthTask {

    public static double calculateAngle(int hours, int minutes) {

        hours = hours % 12;
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Некорректное значение минут!");
        }

        double minuteAngle = 6 * minutes;
        double hourAngle = 30 * hours + 0.5 * minutes;
        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        double angle = calculateAngle(hours, minutes);

        System.out.println("Сгенерированное время на часах: " + hours + ":" + String.format("%02d", minutes));
        System.out.println("Угол между стрелками часов: " + angle + " градусов.");
    }
}
