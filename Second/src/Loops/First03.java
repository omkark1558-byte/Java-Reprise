package Loops;

public class First03 {

	public static void main(String[] args) {
		 
		
		int sum=0;
		for(int num=1; num<=100; num++)
		{  
			//sum=sum+num;
			if (num%2==0)
			{
				System.out.println("Even:"+num);
				sum=sum+num;
			}
			else
			{
				System.out.println("ODD :"+num);
			}
		}
	
		System.out.println("Even Summition =" +" "+ sum);
	}
}