package lecture.generics;

import java.util.*;

public class SDAList<E> implements List<E> {

    private List<E> list;

    public SDAList() {
        this.list = new ArrayList<>();
    }

    public SDAList(E... elements) {
        this.list = new ArrayList<>(List.of(elements));
    }

    //E... elements - oznacza, że wrzucamy tam tablicę E[], tylko deklarujemy ją
    // wypisując elementy po przecinku
    public static <E> SDAList<E> of(E... elements) {
        return new SDAList<>(elements);
    }

    @Override
    public boolean add(E e) {
        list.add(e);
        return true;
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public E set(int index, E element) {
        return list.set(index, element);
    }

    public SDAList<E> union(Collection<E> collection) {
        SDAList<E> emptyList = new SDAList<>();
        emptyList.addAll(this.list);
        emptyList.addAll(collection);
        return emptyList;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    //    Resztę metod można zaimplementować samodzielnie
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        this.list.addAll(c);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
