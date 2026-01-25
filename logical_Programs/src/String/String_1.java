package String;

public class String_1 {

	public static void main(String[] args) {
	 
		String str = "OMKAR";
		
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='M' || str.charAt(i)== 'K')
			{
				StringBuffer sb1 = new StringBuffer();
	
				System.out.println(sb.append(sb.append(str.charAt(i)).toString().toLowerCase()));
				System.out.println(sb.append(sb1.append(str.charAt(i)).toString().toLowerCase()));
				 
			}
		}
	
	}
}
