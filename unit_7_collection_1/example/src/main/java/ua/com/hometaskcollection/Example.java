package ua.com.hometaskcollection;

import java.util.Arrays;
import java.util.List;

public class Example {
    public void run(){
        System.out.println("Create empty sorted list");
        SortedList<Integer> list = new SortedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(1);
        list.add(2);
        System.out.println("Added next numbers: 1, 5, 7, 4, 9, 1, 2");
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("Create new sortedList with numbers: 5, 2, 777, 88");
        SortedList<Integer> list1 = new SortedList<>();
        list1.add(5);
        list1.add(2);
        list1.add(777);
        list1.add(88);

        System.out.println("Add list1 to list");
        list.addAll(list1);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Deleted 0, 5, 3 element indexes");
        list.remove(0);
        list.remove(5);
        list.remove(3);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Set 10 to 0 element index");
        list.set(0, 10);
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("Added next users name: eee, www, qqq, aaa");
        List<User> listUsers = new SortedList();
        listUsers.add(new User("eee"));
        listUsers.add(new User("www"));
        listUsers.add(new User("qqq"));
        listUsers.add(new User("aaa"));
        System.out.println(Arrays.toString(listUsers.toArray()));
        listUsers.remove( 3);
        System.out.println("Deleted third User from sorted list");
        System.out.println(Arrays.toString(listUsers.toArray()));
    }
}
