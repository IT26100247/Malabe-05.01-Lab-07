public class IT26100247Lab7Q2B {
    public static void main(String[] args) {
        // Loop from 1 to 5
        for ( int rowCount = 1; rowCount <= 5; rowCount++) {
            System.out.print(rowCount + " - ");
            
            // Print asterisks matching the current line number
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
