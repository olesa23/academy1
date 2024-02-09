package by.academy1.homework6;
//Прочесть информацию введеную из клавиатури и записать в созданный вами txt файл,
//      если введена "stop" строка тогда закончить запись в файл.

import java.io.*;


public class Task1 {

    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст :");
        System.out.println("Чтобы закончит введите 'Stop': ");


        try (FileWriter writer = new FileWriter("io/.txt")) {
            do {
                System.out.print(" ");
                str = reader.readLine();
                if (str.compareTo("stop") == 0)
                    break;
                str += " ";
                writer.write(str);
                writer.flush();
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}