package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Решение задачи 1 через цикл for
public class Task1forcycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива:");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        for (int i=0; i<mass.length; i++) {
            mass[i]=r.nextInt(100);
        }
        System.out.println("подсаазка"+ Arrays.toString(mass));
        System.out.println("введите число:");
        int x = scanner.nextInt();
        for (int i=0; i< mass.length; i++) {
            if ((mass[i] == x))
            {   System.out.println("верно, " + " mass[" + i + "]=" + mass[i]);
                break;
            }else;
        }    System.out.println("больше нет совпадений");

    }
}

