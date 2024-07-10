package com.arrays;


public class Bank {

	static String name;
	static int age;
	static String college;
	static double cgpa ;

	Bank(String name)
			{
				this.name=name;
			}

	Bank(String name,int age)
			{
			   this(name);
			   this.age=age;
			}

	Bank(String name,int age,String college)
			{
				this(name,age);
				this.college=college;
			}

	Bank(String name,int age,String college,double cgpa)
			{
				this(name,age,college);
				this.cgpa=cgpa;
			}

	Bank()
			{
				
			}

}
