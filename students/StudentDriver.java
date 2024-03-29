package students;

public class StudentDriver
{

	public static void main(String[] args) 
	{
		StudentDataBase sb=new StudentDataBase();
		
		for(;;)
		{
			System.out.println("1.add student");
			System.out.println("2.remove  student");
			System.out.println("3.update student");
			System.out.println("4.display student");
			System.out.println("5.Stop");
			System.out.println("6.sort");
			switch(sb.sc.nextInt())
			{
			case 1:
				sb.addStudent();
				break;
			case 2:
				sb.removeStudent();
				break;
			case 4:
				sb.display();
				break;
			case 3:
				sb.updateStudent();
				break;
			case 5:
				System.err.println("application is closed");
				System.exit(2);
			case 6:
				sb.doSorting();
				break;
				
			}
		}
	}
}
