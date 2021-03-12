package main.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Comparator;

public class SymbolCalculation {

    public static void t(String str) {

        char[] chars = str.toCharArray();
        List<Character> characterList = new LinkedList<>();
        Map<Character, Integer> mapCharacter = new HashMap<>();

        /*for(int i=0; i<chars.length-1; i++){
            for (int j=0; j<chars.length-1-i; j++){

                if(chars[j]>chars[j+1]){

                    char k = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = k;
                }
            }
        }*/

        //Arrays.sort(chars);

        for (char sym : chars) {

            if (Character.isAlphabetic(sym)) {

                characterList.add(sym);
                mapCharacter.put(sym, 0);
            }
        }
        characterList.sort(Comparator.naturalOrder());

        int counter = 1;
        for (Map.Entry<Character, Integer> m : mapCharacter.entrySet()) {
            for (char sym : characterList) {
                if (m.getKey().equals(sym)) {

                    int tmp = m.getValue() + 1;
                    m.setValue(tmp);
                }
            }
            System.out.println(counter++ + ". " + m.getKey() + " - " + m.getValue());

        }
    }
}
