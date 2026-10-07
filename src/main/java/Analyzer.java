import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Analyzer {
    public static void main(String[] args) {
        String[][] testResults = {
                {"TC101", "PASSED", "Chrome"},
                {"TC102", "FAILED", "Firefox"},
                {"TC103", "PASSED", "Chrome"},
                {"TC104", "SKIPPED", "Edge"},
                {"TC105", "FAILED", "Chrome"},
                {"TC106", "PASSED", "Firefox"}
        };

        // Declarăm structurile de date pentru a stoca rezultatele analizate
        List<String> failedTestIds = new ArrayList<>();
        Set<String> uniqueEnvironments = new HashSet<>();
        Map<String, Integer> statusCounts = new HashMap<>();

        // Iterăm prin fiecare rezultat din array-ul 2D
        for (String[] result : testResults) {
            String testId = result[0];
            String status = result[1];
            String environment = result[2];

            // 1. Colectăm ID-urile testelor picate
            if (status.equals("FAILED")) {
                failedTestIds.add(testId);
            }

            // 2. Colectăm mediile unice
            uniqueEnvironments.add(environment);

            // 3. Contorizăm fiecare status
            statusCounts.put(status, statusCounts.getOrDefault(status, 0) + 1);
        }

        // Afișăm rezultatele analizei
        System.out.println("\n--- Rezultatele Analizei ---");
        System.out.println("ID-urile testelor picate: " + failedTestIds);
        System.out.println("Mediile de test unice: " + uniqueEnvironments);

        System.out.println("\nSumarul statusurilor:");
        for (Map.Entry<String, Integer> entry : statusCounts.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue() + " teste");
        }
    }
}