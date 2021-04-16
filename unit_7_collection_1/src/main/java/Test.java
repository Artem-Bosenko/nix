import ua.com.hometaskcollection.SortedList;

public class Test {
    public void test(){
        SortedList<Integer> list = new SortedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(4);

        System.out.println(list.indexOf(5));
        System.out.println(list.contains(7));
    }
}
