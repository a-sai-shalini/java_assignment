import java.util.Scanner;

class Student
{
	String name;
	int id;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	/*Student(Student s)
	{
		this.name=s.name;
		this.id=s.id;
	}*/
	boolean isEqual(Student s)
	{
		if((this.name.compareTo(s.name))==0 && this.id==s.id)
			return true;
		return false;
	}
}
public class StudentQ20 {

	public static void main(String[] args)
	{
		System.out.println("enter the name and id");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		int id=in.nextInt();
		Student s1= new Student(name,id);
		//Student s3=new Student(s1);
		System.out.println("enter the name and id");
		String name1=in.next();
		int id1=in.nextInt();
		Student s2=new Student(name1,id1);
		//Student s4=new Student(s2);
		boolean a=s1.isEqual(s2);
		System.out.println(a);

	}

}
