import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		int i,j,count=0,rem=1;
		System.out.println("enter the size of array");
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array");
		for(i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			count=0;
			for(j=1;j<=arr[i];j++)
			{
				rem=(arr[i])%j;
				if(rem==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	 }
}
