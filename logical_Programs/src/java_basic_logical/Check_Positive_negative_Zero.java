package java_basic_logical;

 import java.util.Scanner;

public class Check_Positive_negative_Zero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number :- ");
		
		int i = sc.nextInt();
		
		if(i > 0)
		{
			System.out.println("Positive :");
		}else if(i < 0)
		{
			System.out.println("Negetive :");
		}else {
			System.out.println("Zero :");
		}	
	}
}
