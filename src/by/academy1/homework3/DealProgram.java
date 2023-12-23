package by.academy1.homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DealProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите имя покупателя");
        String buyerName = scanner.nextLine();
        //LocalDate buyerBirthDate = Birthdate();

        User buyer = new User("Покупатель", 1000000, "1234567", "chdhk@mail");
        User seller = new User("Продовец", 1000000, "2283778", "hgfghg@mail");


        // LocalDate sellerBirthDate = LocalDate.parse("23-04-1900", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        Basket basket = getProducts();
        System.out.println("------------------");
        System.out.println("Информация о сделке");
        Deal deal = new Deal(buyer, seller, basket.getProducts(), LocalDate.now());
        deal.submitDeal();
        System.out.println("------------------");
        System.out.println(buyer);
        System.out.println(seller);
    }
    // private static LocalDate Birthdate() {
    //  DateTimeFormatter formatter;
    //  LocalDate dateOfBirth;
    // for (; ; ) {
    //      System.out.println("Введите свою дату рождения в формате (dd/MM/yyyy) или (dd-MM-yyyy)");
    // String buyerDate = scanner.nextLine();
    //  Validator date = new DateValidator();
    //  Validator date1 = new DateValidator1();
    //   if (date.validate(buyerDate)) {
    //    formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    //      dateOfBirth = LocalDate.parse(buyerDate, formatter);
    //   break;
    // } else if (date1.validate(buyerDate)) {
    //     formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    //    dateOfBirth = LocalDate.parse(buyerDate, formatter);
    //   break;
    //   } else {
    //      System.out.println("Неверно введена дата");

    // }
    //  return dateOfBirth;
    // }

    private static Basket getProducts() {
        Basket basket = new Basket();
        double quantity;
        int index;
        boolean c = true;
        System.out.println("Магазин:");
        System.out.println("1 Яблоки, 2 Помидоры, 3 Клубника, 0 стоп");
        while (c) {
            String position = scanner.next();
            switch (position) {
                case "1":
                    System.out.println("Сколько берете?");
                    quantity = scanner.nextInt();
                    System.out.println("Выбрано яблоко красное в количестве " + quantity);
                    basket.add(new Apple("Яблоко", 2, quantity, "Красное"));
                    break;
                case "2":
                    System.out.println("Сколько берете?");
                    quantity = scanner.nextInt();
                    System.out.println("Выбрано помидор красный в количестве " + quantity);
                    basket.add(new Tomato("Помидор", 2, quantity, "Желтый"));
                    break;
                case "3":
                    System.out.println("Сколько берете?");
                    quantity = scanner.nextInt();
                    System.out.println("Выбрано клубника сладкая в количестве " + quantity);
                    basket.add(new Strawberry("Клубнка", 5, 3, "Красное"));
                    break;
                case "0":
                    c = false;
            }break;
            }
            System.out.println("\n Ваша корзина");
            basket.printProducts();
            System.out.println("Удалить позиции?  1-да, 0-нет");
            String number = scanner.next();
            if (number.equals("1")) {
                System.out.println("Введите позиции для отмены   0-стоп");
                basket.printProducts();
                for (; ; ) {
                    index = scanner.nextInt();
                    if (index == 0) {
                        break;
                    } else {
                        basket.delete(index - 1);
                    }
                }
            }
            return basket;
        }

    }


