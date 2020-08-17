import java.util.*;
public class generic<T>{
	public static <T> void get_result(T n)
	{
		try
		{
			if(n.getClass().getName()=="String")
			{
				throw new Exception();
			}
			else {
				int a=Integer.parseInt(String.valueOf(n));
				System.out.println("2/3 of "+n+" is : " +(((int)a*2)/3));
			}
		} 
		catch(Exception e) 
		{ 
			System.out.println("ERROR! String found");
		} 
	}
	public static void main(String[] args) 
	{
		get_result(300);
		get_result("thirty");
	}
}