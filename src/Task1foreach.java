package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// ������� ������ ����� ���� for - each
public class Task1foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        for (int i=0; i<mass.length; i++) {
            mass[i]=r.nextInt(100);
        }
        System.out.println("��������� ������� ��������������� ������ �����  "+ Arrays.toString(mass));
        System.out.println("�������� ����� �� �������:");
        int x = scanner.nextInt();
        int i=0;
        for (int c : mass) {
            i++;  // ������� �����
            if (c == x) {
                System.out.println("����� ������ � ������ ��� --" + "mass["+i+"] = "+ c);
                break;
            } else;
        }
        System.out.println("������ ��� ����������");
    }
}

