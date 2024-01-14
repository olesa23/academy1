package by.academy1.homework4.Task4;

public class OneIteratorMain {
    public static void main(String[] args) {

        String[] h = {"Декабрь", "Январь", "Февраль"};
        OneIterator<String> iterator = new OneIterator<>(h);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
