package java_basic_logical;

public class Factorial_Number {

	public static void main(String[] args) {
		 
		int  num = 5, fact = 1;
		for (int i= 1; i <= num; i++)
		{
			fact *=i;
		}
		System.out.println("Factorial: "+fact);
	}
}
