package com.nix.hometask;

import java.util.Arrays;

public class MathSet<N extends Number> {

    private N[] massive;

    MathSet() {
        massive = (N[]) new Number[0];
    }

    MathSet(int capacity) {
        massive = (N[]) new Number[capacity];
    }

    MathSet(N[] numbers) {
        massive = numbers;
    }

    MathSet(N[]... numbers) {
        massive = (N[]) new Number[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                add(numbers[i][j]);
            }
        }

    }

    MathSet(MathSet<N> numbers) {
        massive = numbers.massive;
    }

    MathSet(MathSet<N>... numbers) {
        massive = (N[]) new Number[0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].massive.length; j++) {
                add(numbers[i].massive[j]);
            }
        }
    }

    int size() {
        return massive.length;
    }

    int indexOf(N n){
        for (int i = 0; i < massive.length; i++) {
            if (massive[i].equals(n)) return i;
        }
        return -1;
    }

    void add(N n) {

        N[] newMassive = (N[]) new Number[massive.length + 1];
        for (int i = 0; i < massive.length; i++) {
            newMassive[i] = massive[i];
        }
        newMassive[newMassive.length - 1] = n;
        massive = newMassive;
    }

    void add(N... n) {
        for (int i = 0; i < n.length; i++) {
            add(n[i]);
        }
    }

    public void remove(int index) {

        N[] newMassive = (N[]) new Number[massive.length - 1];


        for (int i = index; i < massive.length - 1; i++) {
            massive[i] = massive[i + 1];
        }

        for (int i = 0; i < newMassive.length; i++) {
            newMassive[i] = massive[i];
        }

        massive = newMassive;
    }

    void join(MathSet ms) {

        N[] newMassive = (N[]) new Number[massive.length + ms.massive.length];
        int i = 0;
        for (; i < massive.length; i++) {
            newMassive[i] = massive[i];
        }
        for (int j = 0; j < ms.massive.length; j++, i++) {
            newMassive[i] = (N) ms.massive[j];
        }
        massive = newMassive;

    }

    void join(MathSet... ms) {
        for (int i = 0; i < ms.length; i++) {
            join(ms[i]);
        }
    }

    void sortDesc() {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - 1 - i; j++) {
                if (massive[j].longValue() < massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    void sortDesc(int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            for (int j = firstIndex; j < lastIndex - 1; j++) {
                if (massive[j].longValue() < massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    void sortDesc(N value) {

        for (int i = indexOf(value); i < massive.length - 1; i++) {
            for (int j = indexOf(value); j < massive.length - 1 - i; j++) {
                if (massive[j].longValue() < massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    void sortAsc() {
        for (int i = 0; i < massive.length - 1; i++) {
            for (int j = 0; j < massive.length - 1 - i; j++) {
                if (massive[j].longValue() > massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    void sortAsc(int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            for (int j = firstIndex; j < lastIndex - 1; j++) {
                if (massive[j].longValue() > massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    void sortAsc(N value) {

        for (int i = indexOf(value); i < massive.length - 1; i++) {
            for (int j = indexOf(value); j < massive.length - 1 - i; j++) {
                if (massive[j].longValue() > massive[j + 1].longValue()) {
                    N tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }
    }

    N get(int index) {
        return massive[index];
    }

    N getMax() {
        N max = massive[0];

        for (int i = 0; i < massive.length; i++) {

            if (max.longValue() < massive[i].longValue()) max = massive[i];
        }
        return max;
    }

    N getMin() {
        N min = massive[0];

        for (int i = 0; i < massive.length; i++) {

            if (min.longValue() > massive[i].longValue()) min = massive[i];
        }
        return min;
    }

    double getAverage() {

        double avg = 0;

        for (int i = 0; i < massive.length; i++) {
            avg += massive[i].longValue();
        }

        return avg / massive.length;
    }

    Number getMedian() {

        sortAsc();
        System.out.println(Arrays.toString(toArray()));
        int searchIndex = (massive.length / 2);

        if (massive.length % 2 == 0) {
            return (massive[searchIndex - 1].longValue() + massive[searchIndex].longValue()) / 2;
        }else {
            return massive[searchIndex];
        }
    }

    N[] toArray() {
        return massive;
    }

    N[] toArray(int firstIndex, int lastIndex) {
        MathSet<N> set = new MathSet<>();

        for (int i = firstIndex; i < lastIndex; i++) {
            set.add(massive[i]);
        }

        return set.toArray();
    }

    MathSet<N> squash(int firstIndex, int lastIndex) {

        MathSet<N> set = new MathSet<>();
        for (int i = firstIndex; i < lastIndex; i++) {
            set.add(massive[i]);
        }
        return set;
    }

    void clear() {
        massive = (N[]) new Number[0];
    }

    void clear(N[] numbers) {

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (massive[i].equals(numbers[j])) {
                    remove(i);
                }
            }
        }
    }

}
