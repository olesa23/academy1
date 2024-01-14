package by.academy1.homework4.Task1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CustomDateMain {
    public static void main(String[] args) {

        CustomDate customDate = new CustomDate();

        customDate.LocalDate(LocalDate.now());
        customDate.getDate().isLeapYear();
        customDate.isLeapYear();
        customDate.getDate().getYear();
        customDate.DayOfWeek();
        customDate.getDate().getDayOfWeek();


        System.out.println("День недели  " + customDate.getDate().getDayOfWeek());
        System.out.println("Высокосный год ? " + customDate.isLeapYear());
        System.out.println(customDate.getDate().getYear());


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse("21.06.1989", formatter);
        LocalDate endDate = LocalDate.parse("23.06.1989", formatter);
        Period period = Period.between(startDate, endDate);
        System.out.println(period);


    }
}


