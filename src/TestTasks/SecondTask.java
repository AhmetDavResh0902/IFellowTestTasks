package TestTasks;

import java.util.HashSet;
import java.util.Set;

public class SecondTask {
    public static void main(String[] args) {
        String word = "Hello";
        Set<Character> seen = new HashSet<>();

        // Ищем повторяющийся символ
        for (char csim : word.toCharArray()) {
            if (seen.contains(csim)) {
                System.out.println("Повторяющийся символ в строке: " + csim);
                return;
            } else {
                seen.add(csim);
            }
        }

        System.out.println("Повторяющихся символов в строке нет.");
    }
}

