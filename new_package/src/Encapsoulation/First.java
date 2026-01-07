package Encapsoulation;

public class First {

	public static void main(String[] args) {
		 
		Student_01 S = new Student_01();
		
//		 S.setName("SATESH MUNDE");
//		 S.setNumber(7057);
		 S.setDivision('H');
		
		 
//		 System.out.println(S.Number);
//		 System.out.println(S.getName());
		 System.out.println(S.getNumber());
		 System.out.println(S.getdivision());
		 
		 S.setNumber(5000);
		 System.out.println(S.getNumber());
		 
		 S.setValue(410.50);
		 System.out.println(S.getValue());
		 
		 S.setName("omkarksrty");
		 System.out.println(S.getName());
	}

}

class Student_01
{
	 
	String Name ;
	private double Value;
	int Number = 101;
	char Division;
	
	
	public void setValue(double Value)
	{
		if(Value > 5000) {
			System.out.println("Less Than Five Hundred..!");
		}
		else 
		{
		this.Value = Value;
		}
	}
	public double getValue()
	{
		return this.Value;
	}
	
	public void setName(String Name)
	{
	 
		if(Name.length()==10)
		{
			this.Name = Name;
		}else
		{
			System.out.println("Please Enter Valid NAME..!");
		}
	}
	public String getName()
	{
		return this.Name;
	}
	 
	public void setNumber(int Number)
	{
		this.Number = Number;
	}
	
	public int getNumber()
	{
		return this.Number;
	}
	
	public void setDivision(char Division)
	{
		this.Division = Division;
	}
	public char getdivision()
	{
		return this.Division = Division;
	}
}