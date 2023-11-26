package by.academy1.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество слов: ");
        int n = scan.nextInt();
        String[] word = new String[n];
        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < word.length; i++) {
            System.out.println("Введите" + (i + 1) + "Слово");
            word[i] = scan2.nextLine();
        }
        String min = null;
        int maxS = 100000;
        for (int i = 0; i <n; i++){
            if (maxS > word[i].length()) {
                maxS = word[i].length();
                min = word[i];
            }
        }
    System.out.println("Искомое слово: " + min);


    }
}