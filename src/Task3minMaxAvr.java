package src;

import java.util.Arrays;
import java.util.Scanner;

public class Task3minMaxAvr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������");
        int n = scanner.nextInt();
        double[] ranmass = new double[n];
        for (n = 0; n < ranmass.length; n++) {
            ranmass[n] = Math.random() * 100;
        }
        System.out.println(Arrays.toString(ranmass));
        double maxmass = ranmass[0];
        double minmass = ranmass[0];
        double avrsum = 0;
        double sum = 0;
        for (double check : ranmass) {
            if (check > maxmass) {
                maxmass = check;
            }
            if (check < minmass) {
                minmass = check;
            }
            sum = check + sum;
        }
        avrsum = sum / ranmass.length;
        double avr = (maxmass + minmass) / 2;
        System.out.println("��������� = " + maxmass);
        System.out.println("������� = " + minmass);
        System.out.println("������� ����� ��� � ���� = " + avr);
        System.out.println("����� ����� �������=" + sum);
        System.out.println("������� �������������� ����� ����� ������� = " + avrsum);

    }
}

