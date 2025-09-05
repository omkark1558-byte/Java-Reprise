package Increment;

public class Age {

	public static void main(String[] args) 
	{
		int Age=60;
		
		System.out.println((Age--)+(Age++)+(++Age)+(--Age));
		                 // 59+70+71+59
		//System.out.println(60+60+60+60);
		System.out.println((Age++)+(++Age));
		                   //60+62.
		//System.out.println(60+62);
	}
}
