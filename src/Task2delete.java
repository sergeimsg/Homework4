package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task2delete {
    public static void main(String[] args) {
        int[] mass = {52, 36, 85, 96, 45, 78, 86, 95, 26, 15}; // задали массив, можно построить через random
        int[] newmass = null;
        System.out.println("выводим заданный массив" + Arrays.toString(mass));
        Scanner scanner = new Scanner(System.in);
        System.out.println("задайте число Х для поиска в массиве");
        int x = scanner.nextInt();
        for (int c : mass) {
            if (c != x) {
                System.out.println("нет совпадений");
                break;
            }}
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == x) {
                    newmass = new int[mass.length - 1];
                    for (int i1 = 0; i1 < i; i1++) {
                        newmass[i1] = mass[i1];
                        //System.out.println(Arrays.toString(newmass)); // вводим числа в новый массив до совпадения
                    }
                    for (int i2 = i; i2 < mass.length - 1; i2++) {
                        newmass[i2] = mass[i2 + 1]; // вводим числа после совпадения

                    }
                    System.out.println("массив без удаленного числа=" + x + " со сдвигом " + Arrays.toString(newmass));
                    break;
                }
            }

        }
    }


