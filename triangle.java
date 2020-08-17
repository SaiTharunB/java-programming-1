import java.util.*;
import java.lang.Math;
public class triangle
{
	public static double area(double a,double b,double c)
	{
		double h=(a+b+c)/2;
		double result=Math.sqrt(h*((h-a)*(h-b)*(h-c)));
		return result;
	}
	public static void get()
		{
		
		}
	public static void main(String[] args)
	{
		
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three parameters of triangle: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(a>0 && b>0 && c>0)
		{
			double res=area(a,b,c);
			System.out.println(res);
		}
		else
		{
			System.out.println("Enter valid parametres");
		}
		
	}
	
}