package utils;

public class ReversesMethods {

    static public String reverse(String src) {
        String[] strings = src.trim().split("[ ,_]");
        StringBuilder newString = new StringBuilder();
        for (String s : strings) {
            String[] tmp = s.split("");
            for (int i = tmp.length - 1; i >= 0; i--) {
                newString.append(tmp[i]);
            }
            newString.append(" ");
        }
        return newString.toString();
    }


    static public String reverse(String src, String dest) {
        String[] strings = src.trim().split("[ ,_]");
        StringBuilder newString = new StringBuilder();


        for (String s : strings) {

            if (!s.contains(dest)) {
                newString.append(s + " ");
            }
            if (s.contains(dest)) {

                newString.append(reverseFunc(s, dest));
            }
        }
        return newString.toString();
    }


    static public String reverse(String src, int firstIndex, int lastIndex) {
        String[] strings = src.trim().split("[ ,_]");
        String[] strArrayTmp = src.substring(firstIndex,lastIndex+1).trim().split("[ ,_]");
        StringBuilder newString = new StringBuilder();

        for (String s : strings) {
            boolean flag = false;
            for (String sTmp : strArrayTmp) {
                if (s.contains(sTmp)) {

                    flag = true;
                    newString.append(reverseFunc(s,sTmp));

                }
            }
            if(flag == false) newString.append(s + " ");
        }

        return newString.toString();
    }

    private static String reverseFunc(String str, String tmpStr){
        String[] tmpInputStr = str.split("");
        String[] tmpIndStr = tmpStr.split("");
        StringBuilder newString = new StringBuilder();

        int first = str.indexOf(tmpIndStr[0]);
        int last = str.indexOf(tmpIndStr[tmpIndStr.length - 1]);

        for (int i = 0; i < tmpInputStr.length; i++) {
            if (i == first && first < last) {
                String tmp = tmpInputStr[first];
                tmpInputStr[first] = tmpInputStr[last];
                tmpInputStr[last] = tmp;

                first++;
                last--;

            }
            newString.append(tmpInputStr[i]);
        }
        newString.append(" ");

        return newString.toString();
    }

}
