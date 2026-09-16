import java.util.Scanner;
public class IT26100247Lab7Q1A {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks for four subjects:");
		
		System.out.print("Enter Subject Mark 1:");
		double mark1 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 2:");
		double mark2 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 3:");
		double mark3 = input.nextDouble();
		
		System.out.print("Enter Subject Mark 4:");
		double mark4 = input.nextDouble();
		
		
	    double average = (mark1 + mark2 + mark3 + mark4) / 4.0;
		
		// Determine the overall grade
		String grade = "";
		if (average >= 75 && average <= 100){
			grade = "Distinction";
		}else if (average >= 50 && average <= 74){
			grade = "Credit";
		}else if (average >= 0 && average <= 49){
			grade = "Fail";
		}else {
			grade = "Invalid Marks";
		}	
		
		System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);
		
		
		input.close();
	}
}