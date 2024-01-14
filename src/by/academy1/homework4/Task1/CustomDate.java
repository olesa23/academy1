package by.academy1.homework4.Task1;

import java.time.LocalDate;

public class CustomDate {


    int year;
    int month;
    int day;


    public CustomDate(int year, int month, int day) {
        super();
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public CustomDate() {

    }

    LocalDate localDate;

    public void LocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


    public LocalDate getDate() {
        return localDate;
    }

    public boolean isLeapYear() {
        return localDate.isLeapYear();
    }

    public void DayOfWeek() {
        System.out.println("День недели (номер): " + localDate.getDayOfWeek().getValue());
    }
}


class Year {
    int value;

    public Year(int year) {
        this.value = year;
    }

}

class Month {
    int value;

    public Month(int month) {
        this.value = month;
    }

}

class Day {

    int day;

    public Day(int day) {
        this.day = day;

    }

    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }



    public void a() {
        switch (getDayOfWeek().toString()) {
            case "Понедельник":
                dayOfWeek = DayOfWeek.MONDAY;
                break;
            case "Вторник":
                dayOfWeek = DayOfWeek.TUESDAY;
                break;
            case "Среда":
                dayOfWeek = DayOfWeek.WEDNESDAY;
                break;
            case "Четверг":
                dayOfWeek = DayOfWeek.THURSDAY;
                break;
            case "Пятница":
                dayOfWeek = DayOfWeek.FRIDAY;
                break;
            case "Суббота":
                dayOfWeek = DayOfWeek.SATURDAY;
                break;
            case "Воскресенье":
                dayOfWeek = DayOfWeek.SUNDAY;
                break;

        }
    }
}