
public class Fact1 {

		public static void main(String[] args) 
		{
			/*System.out.println("enter the no.");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();*/
			int n = Integer.parseInt(args[0]);
			
			int fact=1,i=n;
			if(n==0 || n==1)
			{
				System.out.println(1);
			}
			else
			{
				for(i=n;i>0;i--)
				{
					fact=fact*i;
				}
				System.out.println(fact);
			}
			
		}

	}

