import java.util.Scanner;

abstract class Employee
{
	int ID;
	String name;
	Employee(int id,String Ename)
	{
		this.ID=id;
		this.name=Ename;
	}
	public abstract void salary(int ctc,int epf);
	public void display()
	{
		System.out.println("Employee name is "+name+"\nEmployee id is"+ID);
	}
	

}
class Manager extends Employee
{
	int a;
	String department;
	public Manager(int id,String Ename,String dept)
	{
		super(id,Ename);
		this.department=dept;
	}
	public void salary(int ctc,int epf)
	{
		a=ctc-epf;
	}
	public void display()
	{
		super.display();
		System.out.println("Department is "+department+"\nsalary is "+a);
	}
}
class Clerk extends Employee
{
	int a;
	String depart;
	public Clerk(int id,String Ename,String dept)
	{
		super(id,Ename);
		this.depart=dept;
	}

	public void salary(int ctc,int epf)
	{
		a=ctc+epf;
	}
	public void display()
	{
		super.display();
		System.out.println("Department is "+depart+"\nsalary is "+a);
	}
}
public class EmployeeQ13
{
	public static void main(String[] args)
	{
		System.out.println("enter the id and the name ");
		Scanner input=new Scanner(System.in);
		int id=input.nextInt();
		String name=input.next();
		System.out.println("enter the department name of the manager ");
		String dname=input.next();
		Manager man=new Manager(id,name,dname);
		System.out.println("enter the ctc and the epf for manager");
		int ctc=input.nextInt();
		int epf=input.nextInt();
		man.salary(ctc,epf);
		man.display();
		System.out.println("enter the department name of the clerk ");
		String dnamec=input.next();
		Clerk cle=new Clerk(id,name,dnamec);
		System.out.println("enter the ctc and the epf for clerk");
		int cctc=input.nextInt();
		int cepf=input.nextInt();
		cle.salary(cctc,cepf);
		cle.display();
		
		
		
	}
}