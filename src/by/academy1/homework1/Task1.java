package by.academy1.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сумма покупки:");
        double sum = sc.nextDouble();
        System.out.println("Возрост покупателя");
        int age = sc.nextInt();

        if (sum <= 100) {
            System.out.println("Сумма со скидкой:" + (sum - sum * 0.05));
        }else if (sum>=100 && sum<200) {
            System.out.println("Сумма со скидкой:" + (sum - sum * 0.07));

        }else  if (sum >= 200 && sum < 300 && age>18){
            System.out.println("Сумма со скидкой:" + (sum - sum * (0.12 + 0.04)));
        }else if (sum>=200 && sum< 300 && age<18) {
            System.out.println("Сумма со скидкой:" + (sum-sum*(0.12-0.03)));

        }else if (sum>=200 && sum<300) {
            System.out.println("Сумма со скидкой:" + (sum - sum * 0.12));
        }else if (sum>=300 && sum<400) {
            System.out.println("Сумма со скидкой:" + (sum - sum * 0.15));
        }else if (sum>=400) {
            System.out.println("Сумма со скидкой:" + (sum - sum * 0.20));


        }
        sc.close();
    }
}
