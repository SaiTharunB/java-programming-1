import java.util.Scanner;
class Rectangle {
	int height,width;
	void display()
	{
		System.out.println("width :"+this.width+" height :"+this.height);
	}
}
class RectangleArea extends Rectangle
{
	void read_input()
	{
		Scanner sc=new Scanner(System.in);
		width=sc.nextInt();
		height=sc.nextInt();
		sc.close();
	}
	void display(int width,int height)
	{
		System.out.println("Area :"+width*height);
	}
}
public class q2
{
	public static void main(String[] args)
	{
		RectangleArea r=new RectangleArea();
		r.read_input();
		r.display();
		r.display(2,4);
		
	}
}
