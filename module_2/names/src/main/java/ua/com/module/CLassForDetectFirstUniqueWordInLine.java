package ua.com.module;

import java.util.ArrayList;
import java.util.Optional;

public final class CLassForDetectFirstUniqueWordInLine {
    public static Optional<String> findUniqueWord(ArrayList<String> list){
        for (int i = 0; i<list.size(); i++){
            boolean isUnique = true;
            for (int j = 0; j<list.size();j++){
                if(i!=j && list.get(i).equals(list.get(j))) isUnique = false;
            }
            if(isUnique) return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
