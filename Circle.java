import java.util.*;
public class Circle {
		private double radius;
		private String color="red";
	Circle()
	{
		this.radius=1.0;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	void getRadius()
	{
		System.out.println("Radius if circle is : "+this.radius);
	}
	void getArea()
	{
		System.out.println("Area of circle is : "+(3.14)*this.radius*this.radius);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Circle c1=new Circle();
		System.out.print("Enter the radius of the circle: ");
		c1.radius=sc.nextDouble();	
		sc.close();
		c.getRadius();
		c.getArea();
		c1.getRadius();
		c1.getArea();
	}
}
