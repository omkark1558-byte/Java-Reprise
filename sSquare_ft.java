package SquareFit;

import java.util.Scanner;

public class sSquare_ft {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		SquareFit fits= new SquareFit();
		
		System.out.println("Enter Your Name:");
		
		String Name=sc.nextLine();
		String name=Name;
		fits.setName(name);
		
		System.out.println("Enter Ur Contact No:");
		
	
		String Contact_No=sc.nextLine();
		
		String contact=Contact_No;
		fits.setContact_No(contact);
		 
		
		System.out.println("Enter Ur Email Id :");
		
		String Email=sc.nextLine();
//		String email=Email;
		fits.setEmail(Email);
		
		
		System.out.println("Enter Your Square Feet.");
		double Sq_Ft=sc.nextDouble();
//		double sqft=Sq_Ft;
		fits.setSq_Ft(Sq_Ft);
		
		System.out.println("Enter You Per Square Feet Price.");
		double Price=sc.nextDouble();
//		double price=Price;
		fits.setPrice(Price);
		
		double Total = fits.CaluculateValuvation();
		
		System.out.println("!...Your Property Details...!");
					System.out.println();
		
		System.out.println("Name: "+fits.getName());
		System.out.println("Contact No: 91+ "+fits.getContact_No());
		System.out.println("Email id: "+fits.getEmail());
		System.out.println("Square Feet : " +fits.getSq_Ft());
		System.out.println("Per Square Feet Price : "+fits.getPrice());
		
		System.out.println("----¥ Your Square Feet Total Price And Valuation ¥----");
		
		System.out.printf("Total Property Valuation : ₹%.2f\n",Total);  

	}
}

class SquareFit
{
	private String Name;
	private String Email;
	private double Sq_Ft;
	private double Price;
	String Contact_No;
	
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setContact_No(String Contact_No)
	{
		if(Contact_No.length()==10)
	{
		this.Contact_No=Contact_No;
		}else
	{
			System.out.println("⚠️ Warning: Invalid Number !⚠️");
		}
		
	}
	
	public String getContact_No()
	{
		return this.Contact_No;
	}
	
	
	public void setEmail(String Email)
	{
		if(Email.endsWith("@gmail.com"))
		{
		this.Email=Email;
		}else
		{
			System.out.println("Please Inter Vaild Mail !");
		}
	}
	
	
	public String getEmail()
	{
		return this.Email;
		}
	public void setSq_Ft(double Sq_Ft)
	{
		if(Sq_Ft > 0) 
		this.Sq_Ft=Sq_Ft;
		else
			System.out.println("⚠️ Invaild Square Feet !");
		}
	public double getSq_Ft()
	{
		 return this.Sq_Ft;
		}	
	
	public void setPrice(double Price)
	{
		if(Price > 0)
		
		this.Price=Price;
		else
			System.out.println("Invaild Rate !");
	}
	public double getPrice()
	{
		return this.Price;
		}
	//------ Calculated Valuvation Method -------//
	public double CaluculateValuvation()
	{
		 return this.Sq_Ft*this.Price;
	}
	
	}