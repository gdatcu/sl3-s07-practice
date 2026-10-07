import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetectareDuplicate {
    public static void main(String[] args) {
        List<String> usernameuri = new ArrayList<>();
        usernameuri.add("test_user_01");
        usernameuri.add("test_user_02");
        usernameuri.add("admin_user");
        usernameuri.add("test_user_01"); // Duplicat

        Set<String> setUnic = new HashSet<>(usernameuri);

        if (setUnic.size() < usernameuri.size()) {
            System.out.println("Atenție: Lista conține username-uri duplicate!");
        } else {
            System.out.println("Toate username-urile sunt unice.");
        }
    }
}