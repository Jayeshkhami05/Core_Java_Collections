package collections.college;

import java.util.Scanner;

public class Student 
{
	String name;
	
	int rollno;
	
	int []marks=new int[5];
	
	Scanner sc=new Scanner(System.in);
	
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		m1();
	}
	public void m1()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println("enter the marks of subject"+i+1);
			marks[i]=sc.nextInt();
		}
	}

}
