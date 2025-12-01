package java_basic_logical;

public class Prime_Number_Check {

	public static void main(String[] args) {
		 int num = 7;
		 boolean isprime = true;
		 
		 for (int i = 2; i <= num/2; i++)
		 {
			 if (num % i==0)
			 {
				 isprime = false;
				 break;
			 }
		 }
		 if (isprime)
			 System.out.println("Prime");
		 else 
			 System.out.println("Not Prime");
		 
	}
}
