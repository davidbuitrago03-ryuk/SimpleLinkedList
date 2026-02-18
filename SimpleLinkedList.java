package structures;

public class SimpleLinkedList<T> implements List<E>{
    
    private Node<T> head;

    public SimpleLinkedList() {
        this.head = null;
    }

    public void add(E e) {
        Node<T> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    //Not implemented
    @Override
    public void add(int index, E element) {
        
    }
    
    //Not implemented
    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }
    
    //Not implemented
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
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
    public E get(int index) {
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
    public Iterator<E> iterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }
    
    //Not implemented
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }
    
    //Not implemented
    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }
    
    //Not implemented
    @Override
    public E remove(int index) {
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
    public E set(int index, E element) {
        return null;
    }
    
    //Not implemented
    @Override
    public int size() {
        return 0;
    }
    
    //Not implemented
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
    
    //Not implemented
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    
    //Not implemented
    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }
    
}
