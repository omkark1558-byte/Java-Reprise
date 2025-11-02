package Loops;

public class primeNo {

	public static void main(String[] args) {
		
		
		int num=10;
		
		boolean flag=false;
		
		for(int l=2;l<=13;l++) {
			
			if(num%2==0)
			{
				flag=false;
			}
		}
			if(flag=false)
			{
				
			System.out.println("not Prime");		
			}
			else
			{
				System.out.println("PRime");
			}
	}
}