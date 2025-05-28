//Java program to implement the concept of Interface and Polymorphism.

package Java;
abstract class Animal  
{ 
	protected int legs; 
	protected Animal(int l) 
	{ 
		legs=l; 
	} 
	abstract void eat(); 
	void walk()  
	{} 
} 

class Spider extends Animal  
{ 
	Spider(int l) 
	{ 
		super(l); 
		System.out.println("Spider has 8 legs"); 
	} 
	void eat()  
	{ 
		System.out.println("Spider eats insects"); 
	} 
} 

interface Pet   
{ 
	void getName(); 
	void setName(String name); 
	void play(); 
} 

class Cat extends Animal implements Pet 
{ 
	String n; 
	Cat(int l) 
	{ 
		super(l); 
	} 
	public void getName()  
	{ 
		System.out.println("Name of cat: "+n); 
	} 
	public void setName(String name)  
	{ 
		n=name; 
	} 
	public void play()  
	{ 
		System.out.println("Cat likes to play ball"); 
	} 
	public void eat()  
	{ 
		System.out.println("Cat likes to eat fish"); 
	} 
} 

class Fish extends Animal implements Pet 
{ 
	String n; 
	Fish(int l) 
	{ 
		super(l); 
	} 
	public void getName()  
	{ 
		System.out.println("Name of fish: "+n); 
	} 
	public void setName(String name)  
	{ 
		n=name; 
	} 
	public void play()  
	{ 
		System.out.println("Fish likes to swim"); 
	} 
	public void eat()  
	{ 
		System.out.println("Fish likes to eat small fishes"); 
	} 
	public void walk()  
	{
		System.out.println("Fish doesn't walk"); 
	} 
} 

public class Interface  
{ 
	public static void main(String args[])  
	{ 
		Spider s=new Spider(8); 
		s.eat(); 
		Cat c=new Cat(4); 
		c.setName("Eren"); 
		c.getName(); 
		c.play(); 
		c.eat(); 
		Fish f=new Fish(0); 
		f.setName("Levi"); 
		f.getName(); 
		f.play(); 
		f.eat(); 
		f.walk(); 
	} 
} 
