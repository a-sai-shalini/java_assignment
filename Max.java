public class Max {

	public static void main(String[] args) 
	{
		int i;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array : ");
		int n =sc.nextInt();
		int num[] =new int[n];*/
		//System.out.println("enter the array : ");
		int num =0;
		for(i=0;i<args.length;i++)//i<n
		{
			//num[i]= sc.nextInt();
			num = Integer.parseInt(args[i]);
		}
		//int max=num[0];
		int max=Integer.parseInt(args[0]);
		for(i=0;i<args.length;i++)
		{
			if(max< num)
				max= num;
		}
		System.out.println(+max);

	}

}
