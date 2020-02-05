import java.util.Scanner;

public class Q15Negative {

	public static void main(String[] args)
	{
		int i;
		int [] arr=new int[3];
		Scanner input=new Scanner(System.in);
		System.out.println("enter the array elements : ");
		for( i=0;i<3;i++)
		{
			 arr[i]=input.nextInt();
			 try
			 {
				 if(arr[i]<0)
					 throw new Myexception("negative size exception");
			 }
			 catch(Myexception e)
			 {
				 System.out.println("exception thrown : "+e);
			 }
		}

	}

	
}
/*the below class is written in a new class
class Myexception extends Exception {
	public Myexception(String s) 
	{
		super(s);
	}

}*/


