package structures;

import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class SimpleLinkedList<V> implements List<V>{
    
    private Node<V> head;

    public SimpleLinkedList() {
        this.head = null;
    }

    @Override
    public boolean add(V e) {
        Node<V> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<V> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return true;
    }

    // Not implemented
    @Override
    public void add(int index, V element) {

    }
    
    @Override
    public boolean addAll(Collection<? extends V> c) {
        boolean modified = false;
        if ( c.isEmpty()) {
            modified = false; 
        }else{ 
                for (T dataCollection : c) {
                add(dataCollection); 
                modified = true;
            }
            }
        return modified; 
    }
    
    @Override
    public boolean addAll(int index, Collection<? extends V> c) {
        if (c == null) throw new NullPointerException("Collection cannot be null");
        if (index < 0 || index > size()) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        if (c.isEmpty()) return false;
        for (V element : c) {
            if (element == null) throw new NullPointerException("Collection cannot contain null elements");
            if (!(element instanceof Object)) throw new ClassCastException("Element type is not compatible with this list");
        }

        Node<V> prev = null;
        Node<V> current = head;
        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }

        Node<V> insertionPoint = current; 

        for (V element : c) {
            Node<V> newNode = new Node<>(element);
            newNode.next = insertionPoint;
            if (prev == null) {
                head = newNode;
            } else {
                prev.next = newNode;
            }
            prev = newNode;
        }

        return true;
    }
    
    @Override
    public void clear() {
        head=null;
    }

    // Not implemented
    @Override
    public boolean contains(Object o) {
        return false;
    }

    // Not implemented
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    // Not implemented
    @Override
    public boolean equals(Object o) {
        return false;
    }    

    @Override
    public V get(int index){
        int counter =0;

        if (index>=size() || index<0 ) {
            throw new IndexOutOfBoundsException();
        }

        Node<V> next = head;
            while (counter< index) {
                next = next.getNext();
                counter++;
            }

        return next.getData();
        
    }

    // Not implemented
    @Override
    public int indexOf(Object o) {
        Node<T> aux = head;
        int i = 0;
        while(aux != null){
            if(aux.getData().equals(o)){
                return i;
            }
            i++;
            aux = aux.getNext();
        }
        return -1;
    }

    // Not implemented
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    // Not implemented
    @Override
    public Iterator<V> iterator() {
        return null;
    }
    
    @Override
    public int lastIndexOf(Object o) {
    int lastIndex = -1;
    int currentIndex = 0;
    Node<V> current = head;
    while (current != null) {
        if (o == null) {
            if (current.getData() == null) {
                lastIndex = currentIndex;
            }
        } else if (o.equals(current.getData())) {
            lastIndex = currentIndex;
        }
        
        current = current.getNext();
        currentIndex++;
    }

    // Not implemented
    @Override
    public ListIterator<V> listIterator() {
        return null;
    }

    // Not implemented
    @Override
    public ListIterator<V> listIterator(int index) {
        return null;
    }

    // Not implemented
    @Override
    public V remove(int index) {
        return null;
    }

    // Not implemented
    @Override
    public boolean remove(Object o) {
        return false;

    }

    @Override
    public boolean removeAll(Collection<V> c) {

        if (head == null) {

            return false;

        } else {

            Node<V> aux = head;
            Node<V> prev = null;
            boolean delete = false;

            while (aux != null) {

                if (c.contains(aux.getData())) {

                    if (prev == null) {
                        head = aux.getNext();
                    } else {
                       prev.setNext(aux.getNext());
                    }

                    delete = true;
                    
                } else {
                    prev = aux;
                }
                aux = aux.getNext();

            }
            return delete;
        }
    }

    // Not implemented
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    
    @Override
    public V set(int index, V element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        Node<V> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        V oldValue = current.value;
        current.value = element;
        return oldValue;
    }

    // Not implemented
    @Override
    public int size() {
        Node <V> aux= head;
        int counter=0;

        while(aux!=null){
            counter++;
            aux = aux.getNext();
        }

        return counter;
    }

    // Not implemented
    @Override
    public List<V> subList(int fromIndex, int toIndex) {
        if(fromIndex < 0 || toIndex > size() || fromIndex > toIndex){
            throw new IndexOutOfBoundsException();
        }

        SimpleLinkedList<V> list = new SimpleLinkedList<>();
        Node<V> aux = head;
        int actualIndex =0;
        while(aux!=null && actualIndex<toIndex){
            if(actualIndex >= fromIndex){
                list.add(aux.getData());
            }
            aux=aux.getNext();
            actualIndex++;
        }

        return list;
    }
    
    @Override
    public Object[] toArray() {
        int count = 0;
        Node<V> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        Object[] array = new Object[count];
        current = head;
        for (int i = 0; i < count; i++) {
            array[i] = current.getData();
            current = current.getNext();
        }
        return array;
    }

    // Not implemented
    @Override
    public <V> V[] toArray(V[] a) {
        int size=size();
        if (a.length<size) {
            a=java.util.Arrays.copyOf(a, size);
        }
        Node aux=head;
        int count=0;
        while (aux!=null) {
            a[count]=(V)aux.getData();
            count++;
            aux=aux.getNext();
        }

        if (a.length>size) {
            a[size]=null;
        }
        return a;
    }
    
}
