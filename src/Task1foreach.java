package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// решение задачи через цикл for - each
public class Task1foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива:");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        for (int i=0; i<mass.length; i++) {
            mass[i]=r.nextInt(100);
        }
        System.out.println("ПОДСКАЗКА выводим сгенерированный массив чисел  "+ Arrays.toString(mass));
        System.out.println("угадайте число из массива:");
        int x = scanner.nextInt();
        int i=0;
        for (int c : mass) {
            i++;  // счетчик цикла
            if (c == x) {
                System.out.println("число входит в массив это --" + "mass["+i+"] = "+ c);
                break;
            } else;
        }
        System.out.println("больше нет совпадений");
    }
}

