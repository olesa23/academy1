package by.academy1.homework5.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        int listEl = 10;
        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < listEl; i++) {
            int m = (int) (Math.random() * 10 + 1);

            mark.add(i, m);

        }
        System.out.println(mark);
        ListIterator<Integer> listIterator = mark.listIterator();

        while (listIterator.hasNext()) {

            int max = 0;
            for (Integer a : mark) {
                a = listIterator.next();
                if (max < a) {
                    max = a;

                }
            }
            System.out.println(" Max mark  " + max);


        }
    }
}

