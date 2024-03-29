package students;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentDataBase
{
	LinkedList con=new LinkedList();
	Student s;
	Scanner sc=new Scanner(System.in);
	
	public void addStudent()
    {
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter rollno");
		int rollNo=sc.nextInt();
		System.out.println("enter age");
		int age=sc.nextInt();
		s=new Student(name,rollNo,age);
		if(con.add(s))
			System.out.println("student is added");
		else
			System.out.println("astudent is not aDDED");
		
		
	}
	public void removeStudent()
	{
		System.out.println("enter roll no");
		int rollno=sc.nextInt();
		for(int i=0;i<con.size();i++)
		{
		  Object obj=con.get(i);	
		  Student s=(Student)obj;
		  if(s.rollno==rollno)
		  {
			  con.remove(s);
		  System.out.println("student object is removed");
		  return ;
		  }
		}
		System.out.println("student data not found");
	}
	public void updateStudent()
	{
		System.out.println("enter roll no");
		int rollno=sc.nextInt();
		for(int i=0;i<con.size();i++)
		{
		  Object obj=con.get(i);	
		  Student s=(Student)obj;
		  if(s.rollno==rollno)
		  {
		      System.out.println("1.name 2.age");
		      switch(sc.nextInt())
		      {
		      case 1:
		    	  System.out.println("please enter name");
		    	  s.name=sc.next();
		    	  System.err.println("Updated name !!!");
		    	  
		    	 return;
		      case 2:
		    	  System.out.println("please etner new age ");
		    	  s.age=sc.nextInt();
		    	  System.err.println("Updated age !!!");
		    	 return;
		      }
		  }
		}
		System.out.println("student data not found");
		
	}
	public void display()
	{
		for(int i=0;i<con.size();i++)
		{
			System.out.println(con.get(i));
		}
		
	}
	public void doSorting()
	{
		Collections.sort(con);
		display();
	}
}