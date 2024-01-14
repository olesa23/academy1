package by.academy1.homework4.Task4;

import java.util.Iterator;

public class OneIterator<T> implements Iterator<T> {
    private T[] home;
    private int indx;

    public OneIterator() {
        super();
    }

    public OneIterator(T[] home) {
        this.home = home;
    }

    @Override
    public boolean hasNext() {
        if (home == null || home.length <= indx) {
            return false;
        }
        return home[indx] != null;
    }

    @Override
    public T next() {
        return home[indx++];
    }
}
