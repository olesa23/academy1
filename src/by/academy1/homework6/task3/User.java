package by.academy1.homework6.task3;

import java.io.Serializable;

//Создайте класс User с полями Имя, Фамилия, Возраст и конструктором(Имя, Фамилия, Возраст).
// В классе Main создайте ArrayList<User>, добавьте 10 пользователей в коллекцию.
// Создайте каталог(папку) users и для каждого пользователя создайте файл в этом каталоге.
// Назовите файл Имя_Фамилия.txt. Сериализуйте информацию о пользователе и положите в файл пользователя.
// Не забываем закрывать потоки.
// В блоке catch выводим сообщение ошибки на экран (System.err.println(e.getMessage());)
public class User implements Serializable {

    String name;
    String surname;
    int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
