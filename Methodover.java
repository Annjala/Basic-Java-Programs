package Java;
import java.util.Scanner;
public class Methodover 
{
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the base of triangle: "); 
		float ba=s.nextInt(); 
		System.out.println("Enter the height of triangle: "); 
		float h=s.nextInt(); 
		System.out.println("Enter the length of rectangle: "); 
		int l=s.nextInt(); 
		System.out.println("Enter the breadth of rectangle: "); 
		int b=s.nextInt(); 
		System.out.println("Enter the radius of the circle: "); 
	    double r=s.nextDouble(); 
	    Area c=new Area(); 
	    double tarea=c.area(ba,h); 
	    System.out.println("The area of the triangle is: "+tarea); 
	    int rarea=c.area(l,b); 
	    System.out.println("The area of rectangle is: "+rarea); 
	    double carea=c.area(r); 
	    System.out.println("The area of circle is: "+carea); 
	} 
}

class Area 
{ 
	double area(float ba,float h) 
	{ 
		return 0.5*ba*h; 
	} 
	int area(int l,int b) 
	{ 
		return l*b; 
	} 
	double area(double r) 
	{ 
		return Math.PI*Math.pow(r,2); 
	} 
} 