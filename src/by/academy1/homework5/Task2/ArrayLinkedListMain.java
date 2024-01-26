package by.academy1.homework5.Task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLinkedListMain {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        add(linkedList);
        //get(linkedList);

        long start1 = System.currentTimeMillis();
        add(arrayList);
        //get(arrayList);
        System.out.println("Время работы LinkedList = " + (System.currentTimeMillis() - start));
        System.out.println("Время работы ArrayList = " + (System.currentTimeMillis() - start1));
    }


    private static void add(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(new Integer(i));}
            for(int i=0;i<100;i++){
                list.add(10000, new Integer(Integer.MAX_VALUE));

        }
    }
        private static void get (List<Integer> list) {
            for (int i = 0; i < 100000; i++) {
                list.get((int) (Math.random() * (1000000 - 1)));
            }
        }
}





//        ArrayList<Double> arrayList = new ArrayList<>();
//        LinkedList<Double> linkedList = new LinkedList<>();
//        int A = 10000000;
//        int B = 100000;
//        for (int i = 0; i < A; i++) {
//            arrayList.add(Math.random());
//            linkedList.add(Math.random());
//        }
//        long startTime = System.currentTimeMillis();//возвращает текущее количество миллисекунд в формате лонг
//        for (int i = 0; i < B; i++) {
//            arrayList.get((int) (Math.random() * (A - 1)));
//        }
//        System.out.println(System.currentTimeMillis() - startTime);
//
//        startTime = System.currentTimeMillis();
//        for (int i = 0; i < B; i++) {
//            linkedList.get((int) (Math.random() * (A - 1)));
//        }
//        System.out.println(System.currentTimeMillis() - startTime);
//    }
//}
//
