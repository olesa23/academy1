package by.academy1.homework6;
//Создать руками текстовый файл, закинуть следующий текст:
//Создать новый файл result.txt.
// Программно считать файл с текстом, удалить все пробелы и записать полученный текст в result.txt.

import java.io.*;

public class Task2 {

    public static void main(String[] args) throws IOException {

        File file = new File("io/txt");
        if (!file.exists()) {
            file.createNewFile();

        }

        String text = ("Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
                "sheets containing Lorem Ipsum passages,and more recently with desktop publishing software like" +
                " Aldus PageMaker including versions of Lorem Ipsum.");


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);

            writer.close();
            writer.flush();

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("io/txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("io/result.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String lineWithoutSpaces = line.replaceAll(" ", "");
                writer.write(lineWithoutSpaces);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


