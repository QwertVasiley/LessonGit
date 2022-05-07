package LEsson24_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        User user = new User("VAsil", Sex.MAN);
        User user1 = new User("Dasha", Sex.WOMAN);
        User user2 = new User("Kolya", Sex.MAN);
        User user3 = new User("Klava", Sex.WOMAN);

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User user15: list )
            user15.hello();

    }
}
