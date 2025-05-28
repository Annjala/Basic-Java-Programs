package Java;
import java.util.Scanner;
public class Frequency 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str=s.nextLine();
		System.out.println("Enter the element to be searched in lower case: ");
		char ch=s.next().charAt(0);
		int length=str.length();
		str=str.toLowerCase();
		for(int i=0;i<length-1;i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		System.out.println("Frequency of "+ch+" is "+count);
	}
}
