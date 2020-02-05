import java.util.Scanner;

public class Date {

	int date,mon;
	public Date(int date,int month)
	{
		this.date=date;
		this.mon=month;
	}
	public void checkVal(int date,int month)
	{
		if(date>28||month>12)
		{
			if(month>12)
			{
				System.out.println("enter a valid month less than or equal to 12");
				Scanner input = new Scanner (System.in);
				this.mon=input.nextInt();
			}
			else if(month==2 && date>28)
			{
				System.out.println("enter a valid date less than or equal to 28");
				Scanner input = new Scanner (System.in);
				this.date=input.nextInt();
			}
			else if(month%2==0 && date>30)
			{
				System.out.println("enter a valid date less than or equal to 30");
				Scanner input = new Scanner (System.in);
				this.date=input.nextInt();
			}
			else if(date>31)
			{
				System.out.println("enter a valid date less than or equal to 31");
				Scanner input = new Scanner (System.in);
				this.date=input.nextInt();
			}
		}
	}
	public void set()
	{
		System.out.println("Present date is "+date+"/"+mon);
	}	
	public void nextDate()
	{
		if(date==30 && mon==12)
			System.out.println("Next date not available");
		else if((mon==2 && date==28)||date==31||date==30)
			System.out.println("Next date is 1/"+(mon+1));
		else
			System.out.println("Next date is "+(date+1)+"/"+mon);
	}
	public static void main(String[] args)
	{
		System.out.println("enter the date and the month as the no.");
		Scanner input = new Scanner (System.in);
		int date=input.nextInt();
		int month=input.nextInt();
		Date obj=new Date(date,month);
		obj.checkVal(date, month);
		obj.set();
		obj.nextDate();
		

	}

}
