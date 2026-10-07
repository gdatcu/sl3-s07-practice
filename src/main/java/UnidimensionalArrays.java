public class UnidimensionalArrays {
    public static void main(String[] args) {
        // --- Metoda 1: Declarare și alocare de memorie, apoi populare ---

        // Declarăm un array de 4 string-uri. Dimensiunea este fixată la 4.
        String[] browsere = new String[5];

        // Populăm array-ul folosind indecșii
        browsere[0] = "Chrome";  // Primul element este la indexul 0
        browsere[1] = "Firefox";
        browsere[2] = "Edge";
        browsere[3] = "Safari";
//        browsere[4] = "IE";


        // Încercarea de a accesa un index în afara limitelor va produce o eroare!
        // browsere[4] = "Opera"; // Aruncă excepția ArrayIndexOutOfBoundsException

        // --- Metoda 2: Declarare și inițializare în aceeași linie (mai concis) ---
        int[] noteTest = {10, 8, 9, 7, 10, 5};
        System.out.println("Lungime noteTest: " + noteTest.length);

        String string = "Salut!";
        System.out.println("Lungime string: " + string.length());

        // Accesarea și afișarea elementelor
        System.out.println("Primul browser din listă este: " + browsere[0]);
        System.out.println("A treia notă de test este: " + noteTest[2]); // Indexul 2 este al treilea element

        System.out.println("A 6-a nota este: " + noteTest[5]);
        // Aflarea dimensiunii unui array
        System.out.println("Avem " + browsere.length + " browsere de testat.");

        // Parcurgerea unui array cu o buclă for
        System.out.println("\n--- Lista completă de browsere ---");
        for (int i = 0; i < browsere.length; i++) {
            System.out.println("Index " + i + ": " + browsere[i]);
        }

        for (int nota : noteTest) {
            System.out.print(nota + " ");
        }
    }
}