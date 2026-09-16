public class IT26100247Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop for 4 rows
        for (int rowCount = 1; rowCount <= 4; rowCount++) {
            // Inner loop for 5 columns
            for (int columnCount = 1; columnCount <= 5; columnCount++) {
                System.out.print("$");
            }
            System.out.println(); // Move to the next line
        }
    }
}
