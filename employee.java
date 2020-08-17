import java.util.*;
public class employee
{
	 String name;
	 String year;
	 String address;
	employee(String n,String y,String ad)
	{
		name=n;
		year=y;
		address=ad;
	}
	public void p()
	{
		System.out.println(this.name+this.year+this.address);
	}
	public static void main(String[] args)
	{
		System.out.println("name\t"+"year of joining"+"\taddress");
		employee[] o=new employee[3];
		o[0]=new employee("Ram\t","2000","\t\t64C- WallStreet");
		o[1]=new employee("Robert\t","1999","\t\t30F- WallStreet");
		o[2]=new employee("Raheem\t","2005","\t\t28D- WallStreet");
		for(int i=0;i<3;i++)
		{
			o[i].p();
		}
	}
}