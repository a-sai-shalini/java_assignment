import java.util.Scanner;

public class Q17 {

	public static void main(String[] args)
	{
		String sent;
		int cap=0,low=0,dig=0;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the sentence : ");
		sent=input.nextLine();
		for(int i=0;i<sent.length();i++)
		{
			if(sent.charAt(i)>='A' && sent.charAt(i)<='Z')
			{
				cap++;
			}
			else if(sent.charAt(i)>='a' && sent.charAt(i)<='z')
			{
				low++;
			}
			else if(sent.charAt(i)>='0' && sent.charAt(i)<='9')
			{
				dig++;
			}
		}
		System.out.println("The no. of capital letters are "+cap+"\n The no. of lowercase letters are "+low+"\n The no. of digits are "+dig);

	}

}
