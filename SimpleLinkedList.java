package structures;

public class SimpleLinkedList<V> implements List<V>{
    
    private Node<V> head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void add(V e) {
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
    }
    
    //Not implemented
    @Override
    public void add(int index, V element) {
        
    }
    
    //Not implemented
    @Override
    public boolean addAll(Collection<? extends V> c) {
        return false;
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

        for (V element : c) {
            Node<V> newNode = new Node<>(element);
            if (prev == null) {
                newNode.next = head;
                head = newNode;
            } else {
                newNode.next = prev.next;
                prev.next = newNode;
            }
            prev = newNode;
        }

        return true;
    }
    
    //Not implemented
    @Override
    public void clear() {
        
    }
    
    //Not implemented
    @Override
    public boolean contains(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean equals(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public V get(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public int indexOf(Object o) {
        return -1;
    }
    
    //Not implemented
    @Override
    public boolean isEmpty() {
        return false;
    }
    
    //Not implemented
    @Override
    public Iterator<V> iterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }
    
    //Not implemented
    @Override
    public ListIterator<V> listIterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public ListIterator<V> listIterator(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public V remove(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public boolean remove(Object o) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public V set(int index, E element) {
        return null;
    }
    
    //Not implemented
    @Override
    public int size() {
        return 0;
    }
    
    //Not implemented
    @Override
    public List<V> subList(int fromIndex, int toIndex) {
        return null;
    }
    
    //Not implemented
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    
    //Not implemented
    @Override
    public <V> V[] toArray(V[] a) {
        return null;
    }
    
}
