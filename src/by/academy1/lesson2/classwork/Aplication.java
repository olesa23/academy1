package by.academy1.lesson2.classwork;

public class Aplication {
    public static void main(String[]args){
        Cat noname = new Cat();
        noname.setNickname("Без имени");
        noname.setAge(2);
        System.out.println(noname);

        Cat myr = new Cat();
        myr.setNickname("Myr");
        System.out.println(myr);

        myr.eat();
        myr.sleep();
        myr.walk();
        noname.grow();
        noname.grow();
        noname.grow();

        noname.setAge(2);
        System.out.println(noname);
    }

}


