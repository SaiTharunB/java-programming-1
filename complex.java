import java.util.*;
public class complex {
	double real,imag;
	complex(double r,double i)
	{
		this.real=r;
		this.imag=i;
	}
	static void sum(complex a,complex b)
	{
		System.out.println("Sum is : "+(a.real+b.real)+" + "+(a.imag+b.imag)+"i");
	}
	static void diff(complex a,complex b)
	{
		System.out.println("Difference is : "+(a.real-b.real)+" + "+(a.imag-b.imag)+"i");
	}
	static void product(complex a,complex b)
	{
		double c=(a.real*b.imag)+(a.imag*b.real);
		double s=(a.real*b.real)+(-(a.imag*b.imag));
		System.out.println("Product is : "+s+" + "+c+"i");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<complex> obj=new ArrayList<complex>();
		obj.add(new complex(sc.nextDouble(),sc.nextDouble()));
		obj.add(new complex(sc.nextDouble(),sc.nextDouble()));
		sum(obj.get(0),obj.get(1));
		diff(obj.get(0),obj.get(1));
		product(obj.get(0),obj.get(1));
		sc.close();
	}
}
