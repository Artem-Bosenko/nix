package ua.com.hometaskcollection;

import java.util.*;

public class SortedList<T extends Comparable<T>> implements List<T> {

    private T[] massive;
    private int size;

    public SortedList() {
        massive = (T[]) new Comparable[0];
        size = 0;
    }

    public SortedList(int capacity) {
        size = capacity;
        massive = (T[]) new Comparable[size];
        quickSort(0, size-1);
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
        return new CustomIterator();
    }

    @Override
    public Object[] toArray() {
        return massive;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) massive;
    }

    @Override
    public boolean add(T t) {
        T[] newMassive = (T[]) new Comparable[size + 1];
        if (size() == 0) {
            newMassive[0] = t;
        } else {

            for (int i = 0; i < massive.length; i++) {
                newMassive[i] = massive[i];
            }
            newMassive[newMassive.length - 1] = t;
        }
        massive = newMassive;
        size++;
        quickSort(0, size - 1);
        return true;
    }

    @Override
    public boolean remove(Object o) {

        if (size == 0) return false;

        T[] newMassive = (T[]) new Comparable[size - 1];


        for (int i = size - 1; i >= 0; i--) {
            if (massive[i].equals(o)) {
                remove(i);
            }
        }

        quickSort(0, size - 1);

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
        T[] newMassive = (T[]) new Comparable[size + c.size()];

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

        massive = newMassive;
        size = size + c.size();
        quickSort(0, size - 1);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        T[] newMassive = (T[]) new Comparable[size + c.size()];

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


        massive = newMassive;
        size = size + c.size();
        quickSort(0, size - 1);
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

        T[] newMassive = (T[]) new Comparable[size];
        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }
        massive = newMassive;
        quickSort(0, size - 1);
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        if (size == 0) return false;

        int counter = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (!c.contains(massive[i])) {
                remove(i);
            } else counter++;
        }

        T[] newMassive = (T[]) new Comparable[counter];

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }
        massive = newMassive;
        size = counter;
        quickSort(0, size - 1);

        return true;
    }

    @Override
    public void clear() {
        massive = (T[]) new Comparable[0];
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
        quickSort(0, size - 1);
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        T[] newMassive = (T[]) new Comparable[size + 1];
        if (size() == 0) {
            newMassive[0] = element;
        } else {

            for (int i = 0; i < massive.length; i++) {
                newMassive[i] = massive[i];
            }
            newMassive[newMassive.length - 1] = element;
        }
        massive = newMassive;
        size++;
        quickSort(0, size - 1);
    }

    @Override
    public T remove(int index) {

        T oldValue = massive[index];
        T[] newMassive = (T[]) new Comparable[size - 1];


        for (int i = index; i < size - 1; i++) {
            massive[i] = massive[i + 1];
        }
        quickSort(0, size - 1);

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }

        massive = newMassive;
        size--;

        return oldValue;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(massive[i])) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        for (int i = massive.length - 1; i >= 0; i--) {
            if (massive[i].equals(o)) return i;
        }

        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new CustomListIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return new CustomListIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {

        SortedList<T> list = new SortedList<>();

        for (int i = fromIndex; i < toIndex; i++) {
            list.add(massive[fromIndex]);
        }

        return list;
    }


    private void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = heap(begin, end);

            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int heap(int begin, int end) {
        T pivot = massive[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (massive[j].compareTo(pivot) <= 0) {
                i++;

                T swapTemp = massive[i];
                massive[i] = massive[j];
                massive[j] = swapTemp;
            }
        }

        T swapTemp = massive[i + 1];
        massive[i + 1] = massive[end];
        massive[end] = swapTemp;

        return i + 1;
    }


    private class CustomIterator implements Iterator<T> {

        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such


        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public T next() {
            int i = cursor;
            if (i >= size)
                throw new NoSuchElementException();
            Object[] elementData = massive;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (T) elementData[lastRet = i];
        }

        @Override
        public void remove() {
            if (lastRet < 0)
                throw new IllegalStateException();

            try {
                SortedList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

    }

    private class CustomListIterator extends CustomIterator implements ListIterator<T> {

        public CustomListIterator(int index) {
            super();
            cursor = index;
        }

        @Override
        public boolean hasNext() {
            return cursor != size;
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {
            int i = cursor - 1;
            if (i < 0)
                throw new NoSuchElementException();
            Object[] elementData = SortedList.this.massive;
            if (i >= elementData.length)
                throw new ConcurrentModificationException();
            cursor = i;
            return (T) elementData[lastRet = i];
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor-1;
        }

        @Override
        public void set(T t) {
            try {
                SortedList.this.set(lastRet, t);
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public void add(T t) {
            int i = cursor;
            SortedList.this.add(i, t);
            cursor = i + 1;
            lastRet = -1;
        }
    }
}
