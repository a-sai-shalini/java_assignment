import java.util.Scanner;

public class PatQ5 {

	public static void main(String[] args)
	{
		int i,j;
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
