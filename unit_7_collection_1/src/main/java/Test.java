import ua.com.hometaskcollection.SortedList;

import java.util.Arrays;

public class Test {
    public void test(){
        SortedList<Integer> list = new SortedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(4);
        System.out.println(list.isEmpty());
        System.out.println(Arrays.toString(list.toArray()));
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.isEmpty());
    }
}
