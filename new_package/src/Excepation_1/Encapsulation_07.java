package Excepation_1;

public class Encapsulation_07 {

	public static void main(String[] args) {
		 

			Tocix t = new Tocix();
			
			
		t.settickets("Mumbai");
		System.out.println(t.gettickets());
		
	}

}
class Tocix
{
	private String tickets;
	private int number;
	private String name;
	
	public String gettickets()
	{
		return this.tickets;
	}
	public void settickets(String tickets)
	{
		this.tickets = tickets;
	}
}
