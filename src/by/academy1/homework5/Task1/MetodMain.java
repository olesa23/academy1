package by.academy1.homework5.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class MetodMain {
    public static void main(String[] args) {
        List<Integer> arrayList = List.of(1,2,3,3);
        System.out.println(arrayList);
        System.out.println(remove(arrayList));

    }
    public static <T> Collection<T>
    remove(Collection<T> collection) {
        return new HashSet<>(collection);

    }
}
