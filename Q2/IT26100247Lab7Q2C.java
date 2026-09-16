public class IT26100247Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop goes downwards from 5 to 1
        for (int rowCount = 5; rowCount >= 1; rowCount--) {
            // Inner loop prints the number 'rowCount', 'rowCount' times
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print(rowCount);
            }
            System.out.println(); // Move to the next line
        }
    }
}
