package gb_collections.lists;

import gb_collections.GbList;
import gb_collections.lists.util.ArrayIterator;
import gb_collections.lists.util.Node;
import java.util.Iterator;

public class GbLinkedList<Sublustrum007> implements GbList<Sublustrum007> {

    private int size;
    private Node<Sublustrum007> first;
    private Node<Sublustrum007> last;
    private Object array;

    public GbLinkedList(){
        this.size = 0;
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

    private Node<Sublustrum007> createNode(Node<Sublustrum007> prev, Sublustrum007 value, Node<Sublustrum007> next){
        this.size++;
        return new Node<>(prev, value, next);
    }
    @Override
    public void add(Sublustrum007 value) {
        if(size == 0){
            first = createNode(null, value, null);
            last = first;
        }else{
            Node<Sublustrum007> temp = last;
            last = createNode(last, value, null);
            temp.next = last;
        }
    }

    @Override
    public void add(int index, Sublustrum007 value) {
        if(index < 0 || index > size){
            System.out.println("Введен не корректный индекс " + index);
            return;
        }
        if(index == 0 || index == size){
            if(first == null){
                add(value);
            }else{
                add(value);
            }
        }else {
            Node<Sublustrum007> temp = findNodeByIndex(index);
            temp.prev.next = createNode(temp.prev, value, temp);
        }
    }

    @Override
    public Sublustrum007 get(int index) {
        return findNodeByIndex(index).value;
    }

    @Override
    public void remove(Sublustrum007 value){
        int result = 0;
        for(int i = 0; i < this.size(); i++){
            if(this.get(i) == value){
                removeByIndex(i);
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        if(index < 0 || index > size){
            System.out.println("Введен не корректный индекс " + index);
            return;
        }
        Node<Sublustrum007> temp = findNodeByIndex(index);
        if(index == 0){
            first = temp.next;
        }
        else if(index == size - 1){
            temp.prev.next = null;
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        size--;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int count = 0;
        for(int i = 0; i < this.size(); i++){
            if(count < size() - 1) {
                builder.append(this.get(count)).append(", ");
            }else {
                builder.append(this.get(count)).append("]");
            }
            count++;
        }
        if(builder.length() == 1){
            return "[]";
        }
        return builder.toString();
    }
    @Override
    public Iterator<Sublustrum007> iterator() {
        return null;

    }

}
