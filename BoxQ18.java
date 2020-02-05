import java.util.Scanner;

class Box
{
	int length,breadth,height;
	Box(int len,int brea,int hei)
	{
		this.length=len;
		this.breadth=brea;
		this.height=hei;
	}
	Box(Box b)
	{
		this.length=b.length;//this refers to called object and b refers to passed object
		this.breadth=b.breadth;
		this.height=b.height;
	}
	int volume()
	{
		int vol=length*breadth*height;
		return vol;
	}
}
public class BoxQ18 {

	public static void main(String[] args) {
		
		/*Box b1=new Box(10,10,10);
		Box b2=new Box(b1); //here we are initializing values of b1 to b2 by passing b1 values as a object argument to b2 */
		System.out.println("enter the length,breadth,height");
		Scanner input=new Scanner(System.in);
		int len=input.nextInt();
		int bre=input.nextInt();
		int hei=input.nextInt();
		Box b1=new Box(len,bre,hei);
		Box b2=new Box(b1);
		int a=b2.volume();
		System.out.println("the volume is "+a);
		
	}
}
