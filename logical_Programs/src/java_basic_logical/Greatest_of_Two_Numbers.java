package java_basic_logical;

import java.util.Scanner;

public class Greatest_of_Two_Numbers {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A Number... :~ ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int max = (a > b) ? a : b;
		System.out.println("Greatest = "+ max);
		
	}
}
