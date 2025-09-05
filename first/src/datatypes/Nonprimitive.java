package datatypes;

public class Nonprimitive
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr=new int[3];
		
		arr[0]=40;
		arr[1]=50;
		arr[2]=60;
		
		System.out.println(arr[2]);
		
		char[] Charter=new char[5];
		
		Charter[0]='O';
		Charter[1]='M';
		Charter[2]='K';
		Charter[3]='A';
		Charter[4]='R';
		
		System.out.println(Charter);
		
		String[] Names=new String[4];
		Names[0]="Ga";
		Names[1]="Om...!";
		Names[2]="Hey...!";
		Names[3]="Just";
		
		System.out.println(Names[0]+Names[1]+Names[2]+Names[3]);
		
		int Number=200;
		int[] No=new int[1];

		No[0]=200+56;
		

		String[] Num=new String[1];
		Num[0]="200";
		
		System.out.println(Num[0]);
		System.out.println("***************************");
		System.out.println(No[0]+Num[0]);
		
	}
}