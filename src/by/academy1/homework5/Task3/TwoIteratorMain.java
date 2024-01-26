package by.academy1.homework5.Task3;

import by.academy1.homework4.Task4.OneIterator;

import java.util.Arrays;

public class TwoIteratorMain {
    public static void main(String[] args) {
        Integer[][] home = new Integer[][]{{2, 3, 4, 5,}, {8, 9, 10, 11}};
        OneIterator<Integer[]> oneIterator = new OneIterator<>(home);
        while (oneIterator.hasNext()) {
            System.out.println(Arrays.toString(oneIterator.next()));
        }
    }
}
