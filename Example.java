package com.constr;

public class Example {
	int age;
	String name;
	String address;
	
	public Example(int a, String j, String k)
	{
		age=a;
		name=j;
	 address=k;
	}

	public Example(int a, String j)
	{
		age=a;
		name=j;
	 //address=k;
	}
	public Example(int a)
	{
		age=a;
		//name=j;
	 //address=k;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example b=new Example(4,"damini");
		System.out.println(b);
		Example c=new Example(9);
		System.out.println(c);
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Example [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

}
