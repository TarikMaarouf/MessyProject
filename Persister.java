import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Persister {
    private static final String FILE_NAME = "users.txt";

    public static void save(UserList list) {
        if (list == null) return;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (User u : list.all()) {
                bw.write(u.getName() + ";" + u.getId());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
