import java.util.*;
interface caluclator
{
	void operate(int a,int b);
}
class lamd
{
public static void main(String[] args)
{
	caluclator add=(int a,int b)->{System.out.println(a+b);};
	caluclator sub=(int a,int b)->{System.out.println(a-b);};
	caluclator mul=(int a,int b)->{System.out.println(a*b);};
	caluclator div=(int a,int b)->{if(b!=0){System.out.println(a/b);}else{System.out.println("Invalid parameters");}};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("\nenter the choice of operation:");
	System.out.println("1.add\n2.subtract\n3.multiply\n4.divison");
	int ch=sc.nextInt();
	switch(ch)
	{
		case 1:
		add.operate(a,b);
		break;
		case 2:
		sub.operate(a,b);
		break;
		case 3:
		mul.operate(a,b);
		break;
		case 4:
		div.operate(a,b);
		break;
		default:
		System.out.println("Invalid input");
	}
}	
}