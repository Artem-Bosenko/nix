package com.nix.hometask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] mas = {1, 5, 7, -5};
        Integer[] mas2 = {0, 0, 7, -88};
        System.out.println("Create two sets:");
        MathSet<Integer> set = new MathSet<>(mas);
        MathSet<Integer> set2 = new MathSet<>(mas2);
        System.out.println(Arrays.toString(set.toArray()));
        System.out.println(Arrays.toString(set2.toArray()));
        System.out.println();
        System.out.println("Find median value for set = " + set.getMedian());
        System.out.print("Join set2 to set -> ");
        set.join(set2);
        System.out.println(Arrays.toString(set.toArray()));
        set.sortDesc(1,4);
        System.out.println("Sort Desc for set from 1 to 4 index");
        System.out.println(Arrays.toString(set.toArray()));

        System.out.println("Average value for set2 = " + set2.getAverage());

        System.out.println("Get sub set form set");
        MathSet<Integer> subSet = set.squash(3, 7);
        System.out.println(Arrays.toString(subSet.toArray()));

        System.out.println("Clear set");
        set.clear();
        System.out.println(Arrays.toString(set.toArray()));
    }
}
