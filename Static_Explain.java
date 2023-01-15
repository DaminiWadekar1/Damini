package com.constr;

public class Static_Explain {
 
//private static 	int a=10;
	
	static int  num;
static
{
	int num=10;
	System.out.println("this is a statsic "+num);
}


public static void ni()
{
	System.out.println("myasdufsadfh");
	 int a=10;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_Explain n=new Static_Explain();
	  //System.out.println(n.a);	
	  Static_Explain.ni();
  System.out.println(num);
	}

}
