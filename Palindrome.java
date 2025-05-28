package Java;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	 { 
		int flag=0; 
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter a word: "); 
		String str=s.nextLine(); 
		int len=str.length(); 
		str=str.toLowerCase(); 
		for(int i=0;i<len-i-1;i++) 
		{ 
			if(str.charAt(i)!=str.charAt(len-i-1)) 
			{ 
				flag=1; 
				break; 
			} 
		} 
		if(flag==0) 
			System.out.println("It is a palindrome"); 
		else 
			System.out.println("It is not a palindrome"); 
	 }
}
