package Logical;

public class Binary {

	public static void main(String[] args) {

		int you=14;
		int you1=15;
		int you2=20;
		
		System.out.println(--you<= ++you1 && ++you1 < ++you2 && !false);
                            // 14
	
		
		System.out.println(--you < ++you1 && ++you1 > --you2  && ++you <= --you2);
		
		//System.out.println(--you < ++you1); True
		//System.out.println(++you1 > --you2); False
		//System.out.println(++you <= --you2); True
		                                    // false
		
		
		int you3=40;
		int you4=60;
		
		//System.out.println(++you3 >= --you4 || --you4 > ++you4 && !true);
		
		//System.out.println(++you3 > --you4 && you3++ < --you4);
		
		
		System.out.println(++you3 > --you4);
		
		
		System.out.println(--you < ++you1 && --you2 >= --you3 || ++you1 >= you3);
		
		System.out.println();
		
	}
}

