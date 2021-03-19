package impl;

import inter.ReverseInterface;

public class ReverseDefaultImpl implements ReverseInterface {
    @Override
    public String reverse(String src) {
        String[] strings = src.split(" ");
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

    @Override
    public String reverse(String src, String dest) {
        String[] strings = src.split(" ");
        StringBuilder newString = new StringBuilder();
        String[] tmpD = dest.split("");

        for (String s : strings) {

            if (!s.contains(dest)) {
                newString.append(s + " ");
            }
            if (s.contains(dest)) {

                String[] tmpInputStr = s.split("");

                int first = s.indexOf(tmpD[0]);
                int last = s.indexOf(tmpD[tmpD.length - 1]);

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
            }
        }
        return newString.toString();
    }

    @Override
    public String reverse(String src, int firstIndex, int lastIndex) {
        String[] strings = src.split(" ");
        StringBuilder newString = new StringBuilder();

        return null;
    }

}
