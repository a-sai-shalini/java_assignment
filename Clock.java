import java.util.Scanner;

public class Clock
{
	int  hours,min,sec;
	public Clock (int hrs,int mins,int secs)
	{
		this.hours=hrs;
		this.min=mins;
		this.sec=secs;
	}
	public void checkValidity(int hrs,int mins,int secs)
	{
		if(secs>=60||mins>=60)
		{
			min=mins+(secs/60);
			sec=secs%60;
			hours=hours+(mins/60);
			min=mins%60;
		}
		else if(hrs>=24)
		{
			System.out.println("enter hrs below 24 ");
			Scanner input=new Scanner(System.in);
		    this.hours=input.nextInt();
	
		}
			
	}
	public void set()
	{
		if(hours>12)
			System.out.println("Time is "+(hours-12)+":"+min+":"+sec+"PM");
		else
			System.out.println("Time is "+(hours)+":"+min+":"+sec+"AM");
	}

	public static void main(String[] args) 
	{
		System.out.println("enter the hours,mins,seconds");
		Scanner input = new Scanner(System.in);
		int hours=input.nextInt();
		int mins=input.nextInt();
		int secs=input.nextInt();
		Clock obj=new Clock(hours,mins,secs);
		obj.checkValidity(hours,mins,secs);
		obj.set();
		

	}

}
