package com.arrays;

public class BankDriver extends Bank {
     
	static String branch;
	
	BankDriver(String name,int age,String college,double cgpa, String branch)
	{
		super(name,age,college,cgpa);
		this.branch = branch;
	}
	
	public static void main(String[] args) {
        
        Bank a = new Bank("Aksh",23,"MSSCET",6.78d);
		BankDriver b = new BankDriver("Akash",23,"MSSCET",6.43d,"CSE");
		System.out.println("Student Name : "+b.name);
		System.out.println("Student age : "+b.age);
		System.out.println("Student college : "+b.college);
		System.out.println("Student cgpa : "+b.cgpa);
		System.out.println("Student branch : "+b.branch);
		
		
	}

}
