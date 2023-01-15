package com.constr;

public class Constr {

	 int num1; ;
	private int num2;
	
	public void con()
	{
		System.out.println("it is my method ");
			}
	
	public  Constr(int a)
	{
		
	  this.num1=a;
	 //this. num2=b;
	} 
	static void main(String[] args) {
		
		Constr b=new Constr(10);
		b.con();
		System.out.println(b.num1);
		System.out.println(b.num2);
		
		
	}
}
