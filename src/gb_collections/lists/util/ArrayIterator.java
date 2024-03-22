package gb_collections.lists.util;

import java.util.Iterator;

public class ArrayIterator<Q> implements Iterator<Q>{
    private Q[] array;
    private int index;

    public ArrayIterator(Q[] array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public Q next() {
        return array[index++];
    }
}

