import java.util.Scanner;

public class IncomeTax {
	
	public static void main(String[] args)
	{
		/*System.out.println("enter the slab rate :");
		Scanner sc = new Scanner(System.in);
		int sr = sc.nextInt();*/
		int sr= Integer.parseInt(args[0]);
		int ea;
		if(sr<=50000)
		{
			ea = sr ;
			System.out.println("income tax is 0");
		}
		else if(sr<=60000)
		{
			ea=sr-50000;
			System.out.println("income tax is "+(ea*10/100));
		}
		else if(sr<=150000)
		{
			ea=sr-60000;
			System.out.println("income tax is "+(ea*20/100));
		}
		else if(sr>150000)
		{
			ea=sr-150000;
			System.out.println("income tax is "+(ea*30/100));
		}
	}

}
