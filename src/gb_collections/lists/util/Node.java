package gb_collections.lists.util;

public class Node<Sublustrum007> {
    public Sublustrum007 value;
    public Node<Sublustrum007> next;
    public Node<Sublustrum007> prev;

    public Node(Node<Sublustrum007> prev, Sublustrum007 value, Node<Sublustrum007> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }
}
