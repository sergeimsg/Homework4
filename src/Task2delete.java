package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task2delete {
    public static void main(String[] args) {
        int[] mass = {52, 36, 85, 96, 45, 78, 86, 95, 26, 15}; // ������ ������, ����� ��������� ����� random
        int[] newmass = null;
        System.out.println("������� �������� ������" + Arrays.toString(mass));
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� � ��� ������ � �������");
        int x = scanner.nextInt();
        for (int c : mass) {
            if (c != x) {
                System.out.println("��� ����������");
                break;
            }}
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == x) {
                    newmass = new int[mass.length - 1];
                    for (int i1 = 0; i1 < i; i1++) {
                        newmass[i1] = mass[i1];
                        //System.out.println(Arrays.toString(newmass)); // ������ ����� � ����� ������ �� ����������
                    }
                    for (int i2 = i; i2 < mass.length - 1; i2++) {
                        newmass[i2] = mass[i2 + 1]; // ������ ����� ����� ����������

                    }
                    System.out.println("������ ��� ���������� �����=" + x + " �� ������� " + Arrays.toString(newmass));
                    break;
                }
            }

        }
    }


