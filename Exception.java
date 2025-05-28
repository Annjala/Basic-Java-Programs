//Java program that shows the usage of try, catch, throws, and finally.

package Exception;
import java.util.*; 
class Exception  
{ 
    static void arithmetic(int a,int b) throws ArithmeticException 
    { 
        if (b==0) 
        	throw new ArithmeticException("Enter a number greater than 0"); 
        else 
        { 
        	int result=a/b; 
        	System.out.println("result="+result); 
        }  
    } 
 
    public static void main(String args[]) 
    { 
        Exception obj=new Exception(); 
        Scanner s=new Scanner(System.in); 
        int notExit=1; 
        System.out.println("MENU:\n1.Arithmetic Exception\n2.Array Index Out Of Bounds Exception\n3.Exit"); 
        while (notExit==1)  
        { 
        	System.out.print("\nEnter the option: "); 
            int opt=s.nextInt(); 
            switch (opt) 
            { 
                case 1: 
                	try 
                	{  
                		int a,b; 
                		System.out.println("PROGRAM TO PERFORM DIVISION"); 
                		System.out.println("Enter the first number:"); 
                		a=s.nextInt(); 
                		System.out.println("Enter the second number:"); 
                		b=s.nextInt(); 
                		obj.arithmetic(a,b);  
                	} 
                	catch (ArithmeticException e) 
                	{ 
                		System.out.println(e); 
                	} 
                	finally 
                	{ 
                		System.out.println("My block is free from exception\n"); 
                	}                  
                    break; 
                case 2: 
                	try 
                	{ 
                		int si,pos; 
                		System.out.println("Enter the size of array: "); 
                		si=s.nextInt(); 
                		int c[]=new int[si]; 
                		System.out.println("Enter the elements of array: "); 
                		for(int i=0;i<si;i++) 
                			c[i]=s.nextInt(); 
                		System.out.println("Enter the position:"); 
                		pos=s.nextInt(); 
                		System.out.println("The element is: "+c[pos]); 
                	} 
                	catch(ArrayIndexOutOfBoundsException e) 
                	{ 
                		System.out.println(e); 
                	} 
                	finally 
                	{ 
                		System.out.println("My block is free from exception\n"); 
                	} 
                	break; 
                case 3: 
                	notExit=0; 
                	System.out.println("Exited!"); 
                	break; 
                	default: 
                		System.out.print("Invalid option ");                         
            	} 
        } 
    } 	
}
