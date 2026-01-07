package String;

public class Logical_02 {

	public static void main(String[] args) {
		 int num = 1234;
		 int reverse = 0;
		 
		 while(num != 0)
		 {
			 int digit = num % 	10;
			 reverse = reverse * 10 + digit;
			 num = num / 10;
			 
		 }

		 System.out.println("Reverse Number : " + reverse);
	}

}
