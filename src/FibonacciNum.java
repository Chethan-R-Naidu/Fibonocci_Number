import java.util.Scanner;

public class FibonacciNum {
	public static void main(String[] args) { // Define the main method

		Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

		System.out.print("Enter the number of terms: "); // Prompt the user to enter the number of terms

		int n = scanner.nextInt(); // Read the number of terms entered by the user

		scanner.close(); // Close the scanner to prevent resource leak

		fibnocci(n);

	}

	static void fibnocci(int n) {
		
		System.out.println("Fibonacci Series up to " + n + " terms:"); // Print a message indicating the Fibonacci series will be printed up to n terms

		int firstTerm = 0, secondTerm = 1; // Initialize the first and second terms of the Fibonacci series

		for (int i = 1; i <= n; i++) { // Loop to generate Fibonacci series up to n terms

			System.out.print(firstTerm + " "); // Print the current term of the Fibonacci series

			int nextTerm = firstTerm + secondTerm; // Calculate the next term of the Fibonacci series

			firstTerm = secondTerm; // Update the value of the first term with the value of the second term

			secondTerm = nextTerm; // Update the value of the second term with the value of the next term

		}

	}

}
