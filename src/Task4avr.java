package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4avr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        Random n = new Random();
        for (int i = 0; i < 5; i++) {
            mass1[i] = n.nextInt(100);
            mass2[i] = n.nextInt(100);
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));
        int sum1 = 0;
        int sum2 = 0;
        for (int c : mass1) {
            sum1 = c + sum1;

        } System.out.println(sum1);
        for (int c : mass2) {
            sum2 = c + sum2;

        }System.out.println(sum2);
        int avrsum1 = 0;
        avrsum1 = sum1 / mass1.length;
        System.out.println("Среднее арифметическое первого массива =  "+avrsum1);
        int avrsum2 = 0;
        avrsum2 = sum2 / mass2.length;
        System.out.println("Среднее арифметическое второго массива =   "+avrsum2);
        if (avrsum1 > avrsum2) {
            System.out.println("У первого массива больше");
        }
        if (avrsum1 < avrsum2) {
            System.out.println("У второго массива больше");
        } if (avrsum1 == avrsum2) { System.out.println("Средние арифметические равны");}

    }
}

