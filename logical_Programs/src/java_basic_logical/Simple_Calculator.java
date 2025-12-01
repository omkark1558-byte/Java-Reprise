package java_basic_logical;

public class Simple_Calculator {

	public static void main(String[] args) {
		
		int a = 10 , b= 5;
		
		char op = '+';
		
		switch(op)
		{
		case '+' :System.out.println(a + b); break;
		case '-' :System.out.println(a - b); break;
		case '*' :System.out.println(a * b); break;
		case '/' :System.out.println(a / b); break;
		default: System.out.println("Invalid"); 
		}
	}
}
