package by.academy1.homework6.task3;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;


public class UserMain {
    public static void main(String[] args) throws IOException {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Олеся", "Курчевская", 34));
        users.add(new User("Дмитрий", "Курчевский", 35));
        users.add(new User("Ульяна", "Курчевская", 8));
        users.add(new User("Ярослав", "Курчевский", 2));
        users.add(new User("Святослав", "Зуев", 29));
        users.add(new User("Катя", "Зуева", 30));
        users.add(new User("Макар", "Зуев", 6));
        users.add(new User("Савелий", "Зуев", 3));
        users.add(new User("Пользователь", "Один", 30));
        users.add(new User("Пользователь", "Два", 34));

//        FileWriter writer = new FileWriter("file1.txt");//запись всех пользователей в 1 файл.
//        for(User user : users) {
//            String name = user.name;
//            String surname = user.surname;
//            writer.write(name + " " + surname + System.getProperty("line.separator"));
//        }
        //       writer.close();

        File dirs = new File("users");

        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        for (User user : users) {
            File file = new File("users", user.getName() + user.getSurname() + ".txt");

            if (!file.exists()) {
                file.createNewFile();

                try {

                    FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    oos.writeObject(user);

                    oos.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());

                }
            }
        }
    }
}