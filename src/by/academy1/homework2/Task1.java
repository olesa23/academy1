package by.academy1.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первую строку: ");
            String str1 = scanner.nextLine();
            System.out.print("Введите вторую строку: ");
            String str2 = scanner.nextLine();
            boolean result = checkPermutation(str1, str2);
            System.out.println("Результат: " + result);
        }
        private static boolean checkPermutation(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }

            int[] charCount = new int[256];

            for (char c : str1.toCharArray()) {
                charCount[c]++;
            }

            for (char c : str2.toCharArray()) {
                if (charCount[c] == 0) {

                    return false;
                }
                charCount[c]--;
            }
            return true;
        }
    }

