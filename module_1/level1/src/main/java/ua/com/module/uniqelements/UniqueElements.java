package ua.com.module.uniqelements;


import java.util.Arrays;

public class UniqueElements {

    public static int findNumberUniqueElements(String str) {

        String[] massive = str.trim().split("");
        int numberUniqueElements = 0;

        Arrays.sort(massive);

        if (massive.length == 1) return 1;

        for (int i = 0; i < massive.length - 1; i++) {
            if (massive[i].matches("[0-9]")) {
                if (!massive[i].equals(massive[i + 1])) {
                    numberUniqueElements++;
                }
            }
        }
        numberUniqueElements++;

        return numberUniqueElements;
    }
}
