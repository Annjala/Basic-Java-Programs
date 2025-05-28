package Java;
import java.util.Scanner; 
abstract class Shape 
{ 
	abstract void printArea(); 
} 

public class Abstract 
{ 
	public static void main(String[] args)  
	{ 
		Rectangle r=new Rectangle(); 
		r.printArea(); 
		Triangle t=new Triangle(); 
		t.printArea(); 
		Hexagon h=new Hexagon(); 
		h.printArea(); 
	} 
} 

class Rectangle extends Shape 
{ 
	double areaofr; 
	int l,br; 
	void printArea() 
	{ 
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the length and breadth of rectangle: "); 
		l=s.nextInt(); 
		br=s.nextInt(); 
		areaofr=l*br; 
		System.out.println("The area of rectangle is: "+areaofr); 
	} 
} 

class Triangle extends Shape 
{ 
	double areaoft; 
	int b,h; 
	void printArea() 
	{ 
		Scanner s=new Scanner(System.in); 
		System.out.println("\nEnter the base and height of triangle: "); 
		b=s.nextInt(); 
		h=s.nextInt(); 
		areaoft=0.5*b*h; 
		System.out.println("The area of triangle is: "+areaoft); 
	 } 
} 
	 
class Hexagon extends Shape 
{ 
	double areaofh; 
	int si; 
	void printArea() 
	{ 
		Scanner s=new Scanner(System.in); 
		System.out.println("\nEnter the side of hexagon: "); 
		si=s.nextInt(); 
		areaofh=(3*Math.sqrt(3)*Math.pow(si, 2))/2; 
		System.out.println("The area of hexagon is: "+areaofh); 
	} 
}