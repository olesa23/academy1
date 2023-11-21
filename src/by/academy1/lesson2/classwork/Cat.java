package by.academy1.lesson2.classwork;

public class Cat {
    int age;
    String nickname;

    public void grow() {
        System.out.println(" кот по кличке " + nickname + " Кот растет");
    }

    public void sleep() {
        System.out.println(" кот по кличке " + nickname + " Кот спит");
    }

    public void eat() {
        System.out.println(" кот по кличке " + nickname + " Кот ест");
    }

    public void walk() {
        System.out.println(" кот по кличке " + nickname + " Кот гуляет");
    }

    public Cat() {
        super();
    }

    public Cat(String nickname) {
        super();

        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Cat(int age) {
        super();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    int money;
    public int getMoney() {
        return getMoney();
    }
    public void setMoney( int setMoney){
        this.money = money;
    }

    String initials;
    public String getInitials () {
        return getInitials();
    }
    public void setInitials (String setInitials){
        this.initials = initials;
    }
    boolean isHomeAnimals;
    public boolean getIsHomeAnimals () {
        return getIsHomeAnimals();
    }
    public void setHomeAnimals ( boolean setHomeAnimals){
        this.isHomeAnimals = isHomeAnimals;
    }

    @Override
    public String toString () {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}


