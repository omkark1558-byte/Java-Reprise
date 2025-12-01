package java_basic_logical;

import java.util.Scanner;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two Number's :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	 
		a = a + b;
		a = a - b;
		a = a - b;
		
		System.out.println(a + " " + b);

	}
}
