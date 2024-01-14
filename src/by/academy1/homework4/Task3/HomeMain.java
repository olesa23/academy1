package by.academy1.homework4.Task3;

public class HomeMain {
    public static void main(String[] args) {

        Home<Integer> home = new Home<>(8);
        home.add(1);
        home.add(2);
        home.add(3);
        home.add(4);
        home.add(5);
        home.add(6);
        home.add(7);
        home.add(8);

        System.out.println(home);

        home.remove(1);
        home.remove1(3);

        System.out.println(home);

        //System.out.println("Элемент по индексу" + home.getElement(1));

        System.out.println("Последний элемент массива: " + home.getLast());

        System.out.println("1 й элемент массива: " + home.getFirst());

        System.out.println("Размер массива: " + home.homeR());

        System.out.println("Индекс последнего элемента: " + home.indexOf());

    }
}

