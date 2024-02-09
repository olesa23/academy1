package by.academy1.homework6;


import java.io.*;
import java.util.Random;
//Создайте каталог(папку). Создайте в папке 100 txt файлов (Например, 1.txt, 2.txt ... 100.txt).
// Считываем текст из 2-ого задания, получаем его длинну (576 символов).
// Для каждого файла генерируем рандомное число от 0 до 576, достаем из текста (из 2 задания)
// такое-же количество символов (string.substring()) и сохраняем в наш файл.
// Создайте файл result.txt и запишите туда список всех файлов и их размеры.

public class Task4 {
    public static void main(String[] args) {

        File dirs = new File("txt_files");
        if (!dirs.exists()) {
            dirs.mkdir();
        }
        for (int i = 1; i <= 100; i++) {
            File file = new File(dirs, i + ".txt");
            try (FileWriter writer = new FileWriter(file)) {
                int randomLength = new Random().nextInt(574);
                String text = getTextFromFile();
                String substring = text.substring(0, randomLength);
                writer.write(substring);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        File resultFile = new File(dirs, "result.txt");
        try (FileWriter writer = new FileWriter(resultFile)) {
            for (File file : dirs.listFiles()) {
                if (file.isFile()) {
                    writer.write(file.getName() + ": " + file.length() + " bytes\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getTextFromFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("io/txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}
