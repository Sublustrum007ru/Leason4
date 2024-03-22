package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.util.ArrayIterator;
import java.util.Iterator;

public class GbArrayList<W> implements GbList<W> {
    private W[] values;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public GbArrayList() {
        this.size = 0;
        this.capacity = 10;
        try {
            this.values = (W[]) new Object[capacity];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void addCapacity() {
        capacity = capacity + (capacity / 2);
        try {
            W[] array = (W[]) new Object[capacity];
            System.arraycopy(values, 0, array, 0, values.length);
            this.values = array;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void add(W value) {
        if (size == capacity) {
            addCapacity();
        }
        values[size++] = value;
    }

    @Override
    public void add(int index, W value) {
        try {
            W[] temp = values;
            values = (W[]) new Object[values.length + 1];
            System.arraycopy(temp, 0, values, 0, index);
            values[index] = value;
            for (int i = index; i < temp.length ; i++) {
                if(!temp[i].equals(null)){
                    values[i + 1] = temp[i];
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public W get(int index) {
        return values[index];
    }

    @Override
    public void remove(W value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)) {
                removeByIndex(i);
                return;
            }
        }
        throw new RuntimeException("Element is not found.");
    }

    @Override
    @SuppressWarnings("unchecked")
    public void removeByIndex(int index) {
//        capacity = capacity - 1;
//        W[] result = (W[]) new Object[capacity];
//        System.arraycopy(values, 0, result, 0, values.length - 1);
//        int amountElementsAftrerIndex = values.length - index - 1;
//        System.arraycopy(values, index + 1, result, index, amountElementsAftrerIndex);
//        size--;
        try{
            capacity = capacity - 1;
            W[] result = values;
            values = (W[]) new Object[capacity];
            System.arraycopy(result, 0, values, 0, index);
            int amountElementsAftrerIndex = values.length - index - 1;
            System.arraycopy(result, index + 1, values, index, amountElementsAftrerIndex);
            size--;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<W> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (values[i] != null) {
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1) {
            return "[]";
        }
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();

    }
}
