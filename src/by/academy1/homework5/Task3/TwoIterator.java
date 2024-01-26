package by.academy1.homework5.Task3;

import java.util.Iterator;

public class TwoIterator<T> implements Iterator<T> {
    private T[][] home;
    private int i, j;


    public TwoIterator(T[][] home) {
        this.home = home;

    }

    @Override
    public boolean hasNext() {

        return i < home.length && j < home[i].length;

    }

    @Override
    public T next() {
        T a = home[i][i++];
        if (j >= home[i].length) {
            i++;
            j = 0;
        }
        return a;
    }
}
