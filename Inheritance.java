package Java;
import java.util.Scanner;
public class Inheritance 
{
	public static void main(String[] args)  
	 { 
		String name,address,specialisation,department; 
		int age; 
		double salary; 
		long phone_number; 
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter officer details"); 
		System.out.print("Name: "); 
		name=sc.next(); 
		System.out.print("Address: "); 
		address=sc.next(); 
		System.out.print("Age: "); 
		age=sc.nextInt(); 
		System.out.print("Phone Number: "); 
		phone_number=sc.nextLong(); 
		System.out.print("Salary: "); 
		salary=sc.nextDouble(); 
		System.out.print("Specialisation: "); 
		specialisation=sc.next(); 
		Officer o = new Officer(name,address,age,phone_number,salary,specialisation); 
		o.display();  
		System.out.println("\nEnter manager details"); 
		System.out.print("Name: "); 
		name=sc.next(); 
		System.out.print("Address: "); 
		address=sc.next(); 
		System.out.print("Age: "); 
		age=sc.nextInt(); 
		System.out.print("Phone Number: "); 
		phone_number=sc.nextLong(); 
		System.out.print("Salary: "); 
		salary=sc.nextDouble(); 
		System.out.print("Department: "); 
		department=sc.next();  
		Manager m = new Manager(name,address,age,phone_number,salary,department); 
		m.display(); 
	 } 
} 
	   
class Employee 
{ 
	String name,address; 
	double salary; 
	int age; 
	long phone_number; 
	Employee(String name,String address,int age,long phone_number,double salary) 
	{ 
		this.name=name; 
		this.address=address; 
	    this.age=age; 
	    this.salary=salary; 
	    this.phone_number=phone_number; 
	} 
	
	void displayDetails() 
	{ 
		System.out.println("Name: "+name+"\nAddress: "+address+"\nAge: "+age+"\nPhone Number: "+phone_number); 
	} 
	   
	void printSalary() 
	{ 
		System.out.println("Salary of "+name+" is "+salary); 
	} 
} 
	   
class Officer extends Employee 
{ 
	String specialisation; 
	Officer(String name,String address,int age,long phone_number,double salary,String specialisation) 
	{ 
		super(name,address,age,phone_number,salary); 
	    this.specialisation=specialisation; 
	} 
	   
	void display()  
	{ 
	    super.displayDetails(); 
	    System.out.println("Specialisation: "+specialisation); 
	    super.printSalary(); 
	} 
} 
	   
class Manager extends Employee 
{ 
	String department; 
	Manager(String name,String address,int age,long phone_number,double salary,String department) 
	{ 
		super(name,address,age,phone_number,salary); 
	    this.department=department; 
	} 
	   
	void display() 
	{ 
		super.displayDetails(); 
	    System.out.println("Department: "+department); 
	    super.printSalary(); 
	} 
}