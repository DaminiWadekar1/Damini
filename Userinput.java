package com.constr;
import java.util.Scanner;

public class Userinput {
	int n;
	static int n2;
	int result;
	
	public Userinput()
	{
		System.out.println("print any 2 number");
		Scanner sc=new Scanner(System.in);
		//System.out.println("print any  number");
				int num1=sc.nextInt();
		        int num2=sc.nextInt();
		        this.n=num1;
		        this.n2=num2;
	}
	
	void display()
	{
		if(n>n2)
		{
			System.out.println("num is greateer");
		}
		else
		{
			System.out.println("num 2 is greter");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userinput i=new Userinput();
		i.display();
		
	}

}
