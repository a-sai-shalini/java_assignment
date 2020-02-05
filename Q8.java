
public class Q8
{
	//public static Q8 obj;
	int accNum;
	String name;
	int balance;
	
	public Q8(int accNum, String name,int bal)
	{
		this.accNum=accNum;
		this.name=name;
		this.balance=bal;
	}
	public int deposit(int ammount)
	{
		balance=balance+ammount;
		System.out.println("The amount deposited is"+ammount);
		return balance;
	}
	public int withdraw(int ammount)
	{
		balance=balance-ammount;
		System.out.println("The amount withdrawn is"+ammount);
		return balance;
	}
	public void balance( )
	{
		System.out.println("the new balance is"+balance);
	}

}
