package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// ������� ������ 1 ����� ���� for
public class Task1forcycle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        int n = scanner.nextInt();
        int[] mass = new int[n];
        Random r = new Random();
        for (int i=0; i<mass.length; i++) {
            mass[i]=r.nextInt(100);
        }
        System.out.println("���������"+ Arrays.toString(mass));
        System.out.println("������� �����:");
        int x = scanner.nextInt();
        for (int i=0; i< mass.length; i++) {
            if ((mass[i] == x))
            {   System.out.println("�����, " + " mass[" + i + "]=" + mass[i]);
                break;
            }else;
        }    System.out.println("������ ��� ����������");

    }
}

