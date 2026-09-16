import java.util.Scanner;

public class IT26100247Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 3 students
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();

            // VALIDATION: Check if any entered mark is less than 0 or greater than 100
            if (mark1 < 0 || mark1 > 100 || mark2 < 0 || mark2 > 100 || 
                mark3 < 0 || mark3 > 100 || mark4 < 0 || mark4 > 100) {
                System.out.println("Invalid Marks");
                System.out.println(); // Blank line for next student
                continue; // Skip the rest of the loop and move to the next student
            }

            // Calculate average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
            System.out.println("Average is : " + average);

            // Determine grade
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println(); // Blank line for formatting
        }
        
        scanner.close();
    }
}
