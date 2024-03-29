package students;

public  class Student implements Comparable 
{
	String name;
	int rollno;
	int age;
	public Student(String name, int rollno, int age) {
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	public String toString()
	{
		return "name :"+name+"rollno "+rollno+"age ="+age;
	}
	public int compareTo(Object o1)
	{
		Student s1=(Student)o1;
		if(this.age==s1.age)
			return 0;
		else if(this.age>s1.age)
			return 1;
		else
			return -1;
				
	}
}