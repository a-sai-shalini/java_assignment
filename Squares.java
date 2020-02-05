
public class Squares {

	public static void main(String[] args)
	{
		try
		{
			int n;
			int []arr=new int[10];
			for(int i=1;i<=11;i++)
			{
				n=i*i;
				arr[i-1]=n;
				System.out.println(arr[i-1]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception thrown :" +e);
		}

	}

}
