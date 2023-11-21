package by.academy1.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1-10:");
        String x = sc.next();

        switch (x) {
            case "1":
                for (int a = 1; a < 11; a++) {
                    System.out.println("1*" + a + "=" + a * 1);
                }
                break;
            case "2":
                for (int a = 1; a < 11; a++) {
                    System.out.println("2*" + a + "=" + a * 2);
                }
                break;

            case "3":
                for (int a = 1; a < 11; a++) {
                    System.out.println("3*" + a + "=" + a * 3);
                }
                break;
            case "4":
                for (int a = 1; a < 11; a++) {
                    System.out.println("4*" + a + "=" + a * 4);
                }
                break;
            case "5":
                for (int a = 1; a < 11; a++) {
                    System.out.println("5*" + a + "=" + a * 5);
                }
                break;
            case "6":
                for (int a = 1; a < 11; a++) {
                    System.out.println("6*" + a + "=" + a * 6);
                }
                break;
            case "7":
                for (int a = 1; a < 11; a++) {
                    System.out.println("7*" + a + "=" + a * 7);
                }
                break;
            case "8":
                for (int a = 1; a < 11; a++) {
                    System.out.println("8*" + a + "=" + a * 8);
                }
                break;
            case "9":
                for (int a = 1; a < 11; a++) {
                    System.out.println("9*" + a + "=" + a * 9);
                }
                break;
            case "10":
                for (int a = 1; a < 11; a++) {
                    System.out.println("10*" + a + "=" + a * 10);
                }
                break;
        }
        sc.close();
    }
}
