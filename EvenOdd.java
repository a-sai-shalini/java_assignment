import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		int i,e=0,o=0,sum1=0,avg1=0,sum2=0,avg2=0;
		System.out.println("enter array size :");
		Scanner input = new Scanner (System.in);
		int n =input.nextInt();
		System.out.println("enter array :");
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				e++;
				sum1=sum1+arr[i];
			}
			else
			{
				o++;
				sum2=sum2+arr[i];
				
			}
		}
		System.out.println("FOR EVEN NUMBERS \n sum is "+sum1+"\t average is "+sum1/e);
		System.out.println("FOR ODD NUMBERS \n sum is "+sum2+"\t average is "+sum2/o);
		
		

	}

}
