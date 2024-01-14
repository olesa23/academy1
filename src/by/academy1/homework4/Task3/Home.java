package by.academy1.homework4.Task3;

import java.util.Arrays;

public class Home<T> {
    private T[] home;
    private int current = 0;

    public Home() {
        this.home = (T[]) new Object[16];

    }

    public Home(int r) {
        this.home = (T[]) new Object[r];
    }

    public void add(T homes) {
        if (home == null) {
            this.home = (T[]) new Object[16];
        }
        if (home.length <= current) {
            grow();
        }
        home[current++] = homes;
    }

    private void grow() {
        T[] temp = (T[]) new Object[home.length * 2 + 1];
        System.arraycopy(home, 0, temp, 0, home.length);
        home = temp;
    }


    // public T getElement(int i) {// взятие по индексу get(int i)
    //   System.out.println(home[i]);
    //}
    public T getLast() {
        return (T) home[home.length - 1];
    }

    public T getFirst() {
        return (T) home[0];

    }

    public int homeR() {
        return home.length;
    }

    public int indexOf() {
        return home.length - 1;

    }

    public void remove(int i) {

        if (i < 0 || i >= current) {
            System.out.println("Введи правельный индекс");
            return;
        }
        if (i != home.length - 1) {
            System.arraycopy(home, i + 1, home, i, home.length - i - 1);
        }
        home[current-- - 1] = null;
    }

    public void remove1(T obj) {
        for (int i = 0; i < this.current; i++) {
            if (home[i] == obj) {
                System.arraycopy(home, i + 1, home, i, home.length - i - 1);
                home[--current] = null;
                return;
            }
        }
    }


    @Override
    public String toString() {
        return "Home{" +
                "home=" + Arrays.toString(home) +
                '}';
    }

}


