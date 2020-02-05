import java.util.Scanner;

class Person
{
	String name;
	int Id;
	int salary;
	public Person(String name,int Id)
	{
		this.name=name;
		this.Id=Id;
	}
	int salary(int ctc,int epf,int grat)
	{
		this.salary=ctc-(epf+grat);
		return salary;
	}
	void display()
	{
		System.out.println("Salary is "+salary);
	}
}
class Sportsman extends Person
{
	String Sname;
	Sportsman(String name,int Id,String Sname)
	{
		super(name,Id);
		this.Sname=Sname;
	}
	void display()
	{
		System.out.println("Sportname is :"+Sname);
	}
	
}
class Politician extends Person
{
	String Pname;
	Politician(String name,int Id,String Pname)
	{
		super(name,Id);
		this.Pname=Pname;
	}
	void display()
	{
		super.display();
		System.out.println("Party name is :"+Pname);
	}
}
public class Person1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the sportname,partyname,ctc,epfand grat");
		String sname=input.next();
		String pname=input.next();
		int ctc=input.nextInt();
		int epf=input.nextInt();
		int grat=input.nextInt();
		Politician obj1=new Politician("abc",123,pname);
		Sportsman obj2=new Sportsman("abc",123,sname);
		obj1.salary(ctc,epf,grat);
		obj1.display();
		obj2.salary(ctc,epf,grat);
		obj2.display();
	}
}