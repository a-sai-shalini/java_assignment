import java.util.Scanner;

public class Clock1
{
	int hours,mins,secs;
	public Clock1(int hrs,int mins,int secs)
	{
		this.hours=hrs;
		this.mins=mins;
		this.secs=secs;
	}
	public void set()
	{
		if(hours>12)
			System.out.println("Time is "+(hours-12)+":"+mins+":"+secs+"PM");
		else
			System.out.println("Time is "+(hours)+":"+mins+":"+secs+"AM");

	}
	public static void main(String[] args)
	{
		System.out.println("enter hours below 24,mins and seconds below 61");
		Scanner input =new Scanner(System.in);
		int hrs=input.nextInt();
		int mins=input.nextInt();
		int secs=input.nextInt();
		Clock1 obj =new Clock1(hrs,mins,secs);
		obj.set();
	}
}
