import java.util.ArrayList;
import java.util.List;

public class UserList {
    private final List<User> users = new ArrayList<>();

    public void add(User u) {
        if (u == null) return;
        users.add(u);
    }

    public List<User> all() { return users; }

    public User find(User probe) {
        if (probe == null) return null;
        for (User u : users) {
            if (u.equals(probe)) return u;
        }
        return null;
    }
}
