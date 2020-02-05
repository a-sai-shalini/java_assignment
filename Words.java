import java.util.Scanner;

public class Words {

	public static void main(String[] args)
	{
		int count=0;
		String sent;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the sentence : ");
		sent=input.nextLine();
		for(int i=0;i<sent.length()-1;i++)
		{
			if(sent.charAt(i)==' ' && sent.charAt(i+1)!=' ')
				count++;
		}
		System.out.println("No. of words are "+(count+1));

	}

}
