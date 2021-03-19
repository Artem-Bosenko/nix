import impl.ReverseDefaultImpl;

public class Main {
    public static void main(String[] args) {

        ReverseDefaultImpl r = new ReverseDefaultImpl();
        String s1 = r.reverse("hello world");
        System.out.println(s1);

        String s2 = r.reverse("hello world", "wor");
        System.out.println(s2);

    }
}
