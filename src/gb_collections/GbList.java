package gb_collections;

public interface GbList<E> extends Iterable<E> {
    void add(E value);

    void add(int index, E value);

    E get(int index);

    void remove(E value);

    void removeByIndex(int index);

    int size();
}
