package by.academy1.homework5;
//Попробовать добавить в массив int на 8 элементов 10 чисел.
//Обернуть в try/catch, словить ArrayIndexOutOfBoundsException и вывести на экран сообщение:
//"Array is to small, expand the array".
public class Task6 {
    public static void main(String[] args) {
        int [] array= new int[8];
        try {
        array [9]=9;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка" + e);

        }
        System.out.println("Array is to small, expand the array");

    }
}
