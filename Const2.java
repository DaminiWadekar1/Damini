package com.constr;

public class Const2 {
	
	int num1;
	int roll_no;
	String name;
	String addrress;
	float percentage;
	
	 public Const2(int n1, int n2, String n, String add, float perc)
	 {
		  this.num1=n1;
		  this.roll_no=n2;
		  this.name=n;
		  this.addrress=add;
		  this.percentage=perc;
	 }
	 public Const2(int n1, int n2, String n, String add)
	 {
		  this.num1=n1;
		  this.roll_no=n2;
		  this.name=n;
		  this.addrress=add;
		  //this.percentage=perc;
	 }

	@Override
	public String toString() {
		return "Const2 [num1=" + num1 + ", roll_no=" + roll_no + ", name=" + name + ", addrress=" + addrress
				+ ", percentage=" + percentage + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Const2 n=new Const2(1,50,"gxhaga","gdjagsja",80);
		System.out.println(n);
		
	}

}
