import java.util.Scanner;
//import pdhg.Q8

public class Bank {
	

	public static void main(String[] args)
	{
		System.out.println("enter accnum,name,balance");
		Scanner input=new Scanner(System.in);
		int accnum=input.nextInt();
		String name=input.next();
		int balance=input.nextInt();
		
		Q8 obj=new Q8(accnum,name,balance);
		System.out.println("enter the amount to be deposited : ");
		int ammtdep=input.nextInt();
		obj.deposit(ammtdep);
		System.out.println("enter the amount to be withdrawn : ");
		int ammtwith=input.nextInt();
		obj.withdraw(ammtwith);
		obj.balance();

	}
}
