package Increment;

public class PreIncrment {

	public static void main(String[] args) 
	{
		  	 int Num=10;
		  	 
		  	//System.out.println(Num+(Num++)+(++Num));
		  	
		  	int Yoo=50;
		  	
		  	//System.out.println(Yoo--);
		  	
		  	//System.out.println(--Yoo);
		  	
		  	int Uoo=70;
		  	
		  	--Uoo;
		  	Uoo++;
		  	++Uoo;
		  	++Uoo;
		  	--Uoo;
		  	
		  //System.out.println(Uoo+(Uoo--)+(Uoo++)+(Uoo--));
		  System.out.println(--Uoo+(Yoo++)+(++Num)+(++Yoo)+(--Uoo));
                            //	69+52+52+69
		  System.out.println(69+52+52+69);
	}

}