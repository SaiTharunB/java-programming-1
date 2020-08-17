import java.util.*;
import java.util.stream.Stream;
class Employee{
    int empId,empSalary;
    String empName,empDesignation,empLocation;
    public Employee(int id,String name,String empdes,String emploc,int sal) 
    {
    	this.empId=id;
    	this.empName=name;
    	this.empSalary=sal;
    	this.empDesignation=empdes;
    	this.empLocation=emploc;
    }
    public static void main(String[] args) 
    {  
        List<Employee> li=new ArrayList<Employee>();  
        li.add(new Employee(1371,"Tharun","Founder","Pathankot",1000000));
        li.add(new Employee(3325,"Abhi","Co-Founder","Shimla",50000)); 
        li.add(new Employee(7451,"Baskar","Manager","Mysore",60000));
        li.add(new Employee(7427,"Suneel","Chief Executive Officer","Vizag",110000));
        li.add(new Employee(5501,"Raghu","HR","Jalandhar",10000));
        li.add(new Employee(6687,"Rafi","Traine","Hyderabad",10000));
        li.add(new Employee(7012,"Saddam","Project Manager","Mumbai",40000));
        li.add(new Employee(8989,"Arun","IT Speciali","Patna",72000));
        li.add(new Employee(9730,"Ashiq","Supervisor","Delhi",48000));
        li.add(new Employee(1069,"Rasool","Assistant Manager","Thiruvananthapuram",40000));
        System.out.print("Employee names are : ");
        li.forEach(Employee->System.out.print(Employee.empName+", ")); 
        System.out.println();
        System.out.print("Salaries with IDs which are greater than 50,000 are : ");
        Stream<Employee> sals=li.stream().filter(e->e.empSalary>50000);
        sals.forEach(  
                Employee -> System.out.print(Employee.empId+"->"+Employee.empSalary+" ")  
        );
        System.out.println();
        System.out.print("Locations ending with m are : ");
        Stream<Employee> locs=li.stream().filter(e->e.empLocation.charAt(0)=='M' || e.empLocation.charAt(0)=='m');
        locs.forEach(  
                Employee -> System.out.print(Employee.empLocation+", ")  
        );  
        System.out.println();
        System.out.print("Designations ending with e are : ");
        Stream<Employee> pos=li.stream().filter(e->e.empDesignation.charAt(e.empDesignation.length()-1)=='E' || e.empDesignation.charAt(e.empDesignation.length()-1)=='e');
        pos.forEach(
                Employee -> System.out.print(Employee.empDesignation+" ")  
        );  
        System.out.println();
    }  
}