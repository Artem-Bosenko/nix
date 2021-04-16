import ua.com.hometaskcollection.SortedList;

import java.util.Arrays;

public class Test {
    public void test(){
        SortedList<Integer> list = new SortedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(2);
        System.out.println(Arrays.toString(list.toArray()));

        SortedList<Integer> list1 = new SortedList<>();
        list1.add(5);
        list1.add(2);
        list1.add(777);
        list1.add(88);


        list.addAll(list1);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
