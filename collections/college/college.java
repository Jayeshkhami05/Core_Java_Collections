package collections.college;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class college
{
	List l=new ArrayList();
	Student s;
	static Scanner sc=new Scanner(System.in);
	void addStudent()
	{
		if(l.size()<3)
		{
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter rollno");
			int rollno=sc.nextInt();
			 s=new Student(name,rollno);
			if(marks(s.marks))
			{
				 l.add(s);
				 System.err.println("studetn is added");
			}
			else
			{
				System.out.println("student admission is cancelled");
			}
			 
			
			
		}
		else
		{
			System.err.println("admission is closed please wait for u r next slot");
		}
	}
	
	
	
	void removeStudent()
	{
		System.out.println("Enter your a  Roll number");
		int rollnum1 = sc.nextInt();
		
		if (roll)
	}
	
	
	
	public void display()
	{
		System.out.println(l);
	}
	public boolean marks(int[]a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=35)
				c++;
		}
		if(c==5)
			return true;
		else
			return false;
	}
	public static void main(String[]args)
	{
		college c=new college();
		for(;;)
		{
			System.out.println("1.add student  2. display students 10.exit");
			switch(sc.nextInt())
			{
			case 1:
				c.addStudent();
				break;
				
			case 2:
				c.display();
				break;
				
			case 10:
				System.out.println("application is closed");
				System.exit(0);
				
			}
			
		}
	}

}