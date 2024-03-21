package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.util.Node;

import java.util.Iterator;

public class GbLinkedList<Sublustrum007> implements GbList<Sublustrum007> {

    private int size;
    private Node<Sublustrum007> first;
    private Node<Sublustrum007> last;

    public GbLinkedList(){
        this.size = 0;
    }

    private Node<Sublustrum007> createNode(Node<Sublustrum007> prev, Sublustrum007 value, Node<Sublustrum007> next){
        this.size++;
        return new Node<>(prev, value, next);
    }
    private Node<Sublustrum007> findNodeByIndex(int index){
        if(index > size - 1) {
            System.out.println("Введен не корректный индекс");
            return null;
        }else{
            Node<Sublustrum007> targetNode = first;
            int i = 0;
            while (i < index) {
                targetNode = targetNode.next;
                i++;
            }
        return targetNode;
       }
    }

    @Override
    public void add(Sublustrum007 value) {
        if(size == 0){
            first = createNode(null, value, null);
            last = first;
        }else{
            Node<Sublustrum007> targetNode = last;
            last = createNode(last, value, null);
            targetNode.next = last;
        }
    }

    @Override
    public void add(int index, Sublustrum007 value) {
        Node<Sublustrum007> targetNode;
        if(index == 0){
            if(first != null){
                targetNode = first;
                first = createNode(null, value, targetNode);
                targetNode.prev = first;
            }else{
                add(value);
            }
        }else if(index >= size - 1){
            System.out.println("Введенный индекс больше или равне размеру листа.");
            System.out.println("Число добавленов в конец списка.");
            add(value);
        }else{
            targetNode = findNodeByIndex(index);
            targetNode.prev.next = createNode(targetNode.prev, value, targetNode);
        }
    }

    @Override
    public Sublustrum007 get(int index) {
        return findNodeByIndex(index).value;
    }

    @Override
    public void remove(Sublustrum007 value) {

    }

    @Override
    public void removeByIndex(int index) {
        if(index < 0 || index > size - 1){
            System.out.println("Введен не верный индекс");
            return;
        }
        Node<Sublustrum007> targetNode = findNodeByIndex(index);
        if(index == 0){
            first = targetNode.next;
            last = targetNode.prev;
        }else if(index == size - 1){
            last = targetNode.prev;
            last.next = null;
        }else{
            Node temp = targetNode.prev;
            temp.next = targetNode.next;
            targetNode.next = temp;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<Sublustrum007> iterator() {
        return null;
    }
    @Override
    public String toString() {
        Node<Sublustrum007> targetNode = this.first;
        StringBuilder builder = new StringBuilder("[");
        int i = 0;
        while (targetNode.next != null) {
            builder.append(targetNode.value).append(", ");
            targetNode = targetNode.next;
        }
        builder.append(targetNode.value).append("]");
        if(builder.length() == 1) {
            return "[]";
        }
        return builder.toString();
        }

}
