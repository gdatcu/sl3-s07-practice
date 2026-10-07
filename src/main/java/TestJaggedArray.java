import java.util.Arrays;

public class TestJaggedArray {

    public static void main(String[] args) {
        // --- Your code snippet ---
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};       // First row has 2 columns
        jaggedArray[1] = new int[]{3, 4, 5};   // Second row has 3 columns
        jaggedArray[2] = new int[]{6};// Third row has 1 column

//        System.out.println(jaggedArray[0][2]);
        // --- End of your code snippet ---

        // --- Code to test/verify the array ---
        System.out.println("Jagged Array Contents:");

        // Loop through each row
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Row " + i + ": ");
            // Loop through each element in the current row
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            // Print a newline after each row for better formatting
            System.out.println();
        }

        // Alternative way to print using Arrays.deepToString (simpler for quick checks)
        System.out.println("\nUsing Arrays.deepToString:");
        System.out.println(Arrays.deepToString(jaggedArray));
    }
}