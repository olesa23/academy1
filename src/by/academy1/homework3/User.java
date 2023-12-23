package by.academy1.homework3;

import java.time.LocalDate;
import java.util.Objects;

public class User {
    private String name;
    private LocalDate dateOfBirth;
    private double money;
    private String phone;
    private String email;

    public User(String name,//LocalDate dateOfBirth
                double money, String phone, String email) {
        this.name = name;
       // this.dateOfBirth = dateOfBirth;
        this.money = money;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    //public LocalDate getDateOfBirth() {
    //  return dateOfBirth;
    //}

   //public void setDateOfBirth(LocalDate dateOfBirth) {
       // this.dateOfBirth = dateOfBirth;
  // }


    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return Double.compare(user.money, money) != 0 && Objects.equals(name, user.name) &&
               Objects.equals(dateOfBirth, user.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, dateOfBirth);
    }

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", money=" + money +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


