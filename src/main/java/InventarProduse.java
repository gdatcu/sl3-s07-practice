import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventarProduse {
    public static void main(String[] args) {
        // Declaram o lista de mapuri care reprezinta inventarul
        List<Map<String, Object>> inventar = new ArrayList<>();

        // Adăugăm primul produs
        Map<String, Object> produs1 = new HashMap<>();
        produs1.put("id", "SKU-001");
        produs1.put("nume", "Mouse Wireless");
        produs1.put("pret", 150.00);
        produs1.put("inStock", true);
        inventar.add(produs1);

        // Adăugăm al doilea produs
        Map<String, Object> produs2 = new HashMap<>();
        produs2.put("id", "SKU-002");
        produs2.put("nume", "Tastatură Mecanică");
        produs2.put("pret", 350.50);
        produs2.put("inStock", false);
        inventar.add(produs2);

        String idCautat = "SKU-001";
        System.out.println("Se caută detalii pentru produsul cu ID: " + idCautat);

        for (Map<String, Object> produs : inventar) {
            if (produs.get("id").equals(idCautat)) {
                System.out.println("Produs găsit: ");
                System.out.println("- Nume: " + produs.get("nume"));
                System.out.println("- Preț: " + produs.get("pret") + " RON");
                System.out.println("- In stock: " + produs.get("inStock"));
                return; // Oprim căutarea odată ce l-am găsit
            }
        }

        System.out.println("Produsul cu ID-ul " + idCautat + " nu a fost găsit.");
    }
}

