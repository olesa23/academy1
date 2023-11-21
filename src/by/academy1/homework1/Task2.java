package by.academy1.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Тип данных:");
        String tip = sc.next();

        System.out.println(" Введите переменную:" );
        double a= sc.nextDouble();

        switch (tip) {
            case "int":
                System.out.println("Остаток от деления:" +(a % 2));
                break;
            case "double":
                System.out.println("70 процентов :" +(a*70/100));
                break;
            case "float":
                System.out.println("В квадрате:" + (a*a));
                break;
            case "char":
                System.out.println("Код символа:" .charAt(0));
                break;
            case "String":
                System.out.println("Строка:" + ("Hello" + a));
                break;
            default:
                System.out.println("Unsupported type");


        }sc.close();
    }
}
