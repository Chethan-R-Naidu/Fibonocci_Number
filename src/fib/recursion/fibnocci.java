package fib.recursion;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int n = scan.nextInt();
		
		for(int i = 0 ; i < n ; i++)
			System.out.print(fibnocciApp(i) + " ");

	}

	static int fibnocciApp(int n) {
		
		if(n <= 1) {
			return n;
		}
		else {
			return fibnocciApp(n-1) + fibnocciApp(n-2);
		}

	}

}
