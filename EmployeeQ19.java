class Employee1
{
	String name;
	int Id,pf,allow,salary;
	Employee1()
	{
		name="abc";
		Id=123;
		salary=1000;
	}
	Employee1(Employee1 e)
	{
		name=e.name;
		this.Id=e.Id;
		salary=e.salary;
	}
	Employee1 calculate()
	{
		this.pf=salary*10;
		this.allow=salary*100;
		return this;
	}
}
public class EmployeeQ19 {

	public static void main(String[] args)
	{
		Employee1 emp1=new Employee1();
		System.out.println(emp1.Id);
		System.out.println(emp1.name);
		Employee1 emp2 = new Employee1(emp1);
		Employee1 emp3=emp1.calculate();
		System.out.println("pf is "+emp1.pf);
		System.out.println("allowance is "+emp1.allow);
		

	}

}
