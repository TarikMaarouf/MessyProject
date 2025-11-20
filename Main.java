public class Main {
    public static void main(String[] args) {
        User u1 = new User(10, "Bob");
        User u2 = new User(20, "Alice");
        User u3 = new User(30, "Carl");

        UserList list = new UserList();
        list.add(u1);
        list.add(u2);
        list.add(u3);


        System.out.println("Size=" + list.all().size());
        for (User u : list.all()) {
            System.out.println("Have: " + u);
        }


        User probe = new User(11, "Bob");
        for (User u : list.all()) {
            System.out.println("Compare " + u.getName() + " vs " + probe.getName()
                    + " -> equals? " + u.equals(probe));
        }


        User found = list.find(probe);
        System.out.println("FOUND = " + found);

        Persister.save(list);
    }
}
