package ua.com.hometaskcollection;

public class User implements Comparable<User> {
    private String name;

    public User(String name){this.name = name;}

    @Override
    public String toString() {
        return "'\n'User{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(User o) {
        return Integer.compare(this.name.charAt(0), o.name.charAt(0));
    }
}
