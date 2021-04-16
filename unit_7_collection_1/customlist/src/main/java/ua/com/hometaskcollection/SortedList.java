package ua.com.hometaskcollection;

import java.util.*;

public class SortedList<T> implements List<T> {

    private T[] massive;
    private int size;

    public SortedList() {
        massive = (T[]) new Object[0];
        size = 0;
    }

    public SortedList(int capacity) {
        size = capacity;
        massive = (T[]) new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return massive;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {

        if (a.length < massive.length) {

        }
        return null;
    }

    @Override
    public boolean add(T t) {
        T[] newMassive = (T[]) new Object[size + 1];
        if(size() == 0){
            newMassive[0] = t;
        }
        else {

            for (int i = 0; i < massive.length; i++) {
                newMassive[i] = massive[i];
            }
            newMassive[newMassive.length-1] = t;
        }
        massive = newMassive;
        size++;
        Arrays.sort(massive);
        return true;
    }

    @Override
    public boolean remove(Object o) {

        if (size == 0) return false;

        T[] newMassive = (T[]) new Object[size - 1];


        for (int i = size - 1; i >= 0; i--) {
            if (massive[i].equals(o)) {
                remove(i);
            }
        }

        Arrays.sort(massive);

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }

        massive = newMassive;
        size--;

        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        T[] mas = (T[]) c.toArray();

        for (int i = 0; i < mas.length; i++) {
            if (!contains(mas[i]))
                return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] newMassive = (T[]) new Object[size + c.size()];

        if (size == 0) massive = (T[]) c.toArray();
        else {


            int indexForNewMassive = 0, indexForOldMassive = 0;
            int sizeCurrentMassiveSize = size;
            int addedMassiveSize = c.size();

            while (sizeCurrentMassiveSize != 0) {
                newMassive[indexForNewMassive] = massive[indexForOldMassive];
                indexForNewMassive++;
                indexForOldMassive++;
                sizeCurrentMassiveSize--;
            }

            indexForOldMassive = 0;

            while (addedMassiveSize != 0) {

                T[] mas = (T[]) c.toArray();

                newMassive[indexForNewMassive] = mas[indexForOldMassive];
                indexForNewMassive++;
                indexForOldMassive++;
                addedMassiveSize--;
            }
        }

        Arrays.sort(newMassive);
        massive = newMassive;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        T[] newMassive = (T[]) new Object[size + c.size()];

        if (size == 0) massive = (T[]) c.toArray();
        else {


            int indexForNewMassive = 0, indexForOldMassive = 0;
            int sizeCurrentMassiveSize = size;
            int addedMassiveSize = c.size();

            while (sizeCurrentMassiveSize != 0) {
                newMassive[indexForNewMassive] = massive[indexForOldMassive];
                indexForNewMassive++;
                indexForOldMassive++;
                sizeCurrentMassiveSize--;
            }

            indexForOldMassive = 0;

            while (addedMassiveSize != 0) {

                T[] mas = (T[]) c.toArray();

                newMassive[indexForNewMassive] = mas[indexForOldMassive];
                indexForNewMassive++;
                indexForOldMassive++;
                addedMassiveSize--;
            }
        }

        Arrays.sort(newMassive);
        massive = newMassive;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        if (size == 0) return false;

        for (int i = size - 1; i >= 0; i--) {
            if (c.contains(massive[i])) {
                remove(i);
            }
        }

        T[] newMassive = (T[]) new Object[size];
        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }
        massive = newMassive;

        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (size == 0) return false;

        int counter = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (!c.contains(massive[i])) {
                remove(i);
            }else counter++;
        }

        T[] newMassive = (T[]) new Object[counter];

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }
        massive = newMassive;

        return true;
    }

    @Override
    public void clear() {
        T[] newMassive = (T[]) new Object[0];
        massive = newMassive;
        size = 0;
    }

    @Override
    public T get(int index) {
        return massive[index];
    }

    @Override
    public T set(int index, T element) {

        T oldValue = massive[index];
        massive[index] = element;
        Arrays.sort(massive);
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        T[] newMassive = (T[]) new Object[size + 1];
        if(size() == 0){
            newMassive[0] = element;
        }
        else {

            for (int i = 0; i < massive.length; i++) {
                newMassive[i] = massive[i];
            }
            newMassive[newMassive.length-1] = element;
        }
        massive = newMassive;
        Arrays.sort(massive);
    }

    @Override
    public T remove(int index) {

        T oldValue = massive[index];
        T[] newMassive = (T[]) new Object[size - 1];


        for(int i = index; i < size-1 ; i++) {
            massive[i] = massive[i+1];
        }
        Arrays.sort(massive);

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }

        massive = newMassive;
        size--;

        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i <size; i++) {
            if (o.equals(massive[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        for (int i = massive.length-1; i >= 0; i--) {
            if (massive[i].equals(o)) return i;
        }

        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}
