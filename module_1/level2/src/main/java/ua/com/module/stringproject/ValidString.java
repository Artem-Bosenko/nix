package ua.com.module.stringproject;

public class ValidString {
    public static boolean isValidString(String str){
        String[] massive = str.trim().split("");

        if(str.isEmpty()) return true;

        for(int i = 0; i< massive.length; i++){

            String[] split = str.substring(i, massive.length).split("");

            switch (massive[i]) {
                case ")": return false;
                case "}": return false;
                case "]": return false;
                case "(": {
                    for (String s : split) {
                        if (s.equals(")")) return true;
                    }
                    return false;
                }
                case "{": {
                    for (String s : split) {
                        if (s.equals("}")) return true;
                    }
                    return false;
                }
                case "[": {
                    for (String s : split) {
                        if (s.equals("]")) return true;
                    }
                    return false;
                }
            }

        }

        return false;
    }

}
