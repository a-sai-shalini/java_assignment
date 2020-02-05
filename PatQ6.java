import java.util.Scanner;

public class PatQ6 {

	public static void main(String[] args) 
	{
		int i,j,k;
		System.out.println("enter the no.");
		Scanner input =new Scanner(System.in);
		int n= input.nextInt();
		k=n;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=k;j++)
			{
				System.out.print((i*j)+" ");
					
			}
			k--;
			
			System.out.println();
			System.out.println();
		}

	}

}
