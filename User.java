public class User {
    private final int id;
    private String name;

    public User(int id, String name) {
        if (name == null || name.isEmpty() || name.length() > 100) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;

        return this.name != null && this.name.trim().equalsIgnoreCase(other.name.trim());
    }

    @Override
    public int hashCode() { return name == null ? 0 : name.trim().toLowerCase().hashCode(); }

    @Override
    public String toString() { return "User{id=" + id + ", name='" + name + "'}"; }
}
