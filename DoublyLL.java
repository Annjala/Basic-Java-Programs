//Java program that implements Doubly Linked List.

package Java;
import java.util.*;
public class DoublyLL 
{
	static LinkedList<Integer> list=new LinkedList<Integer>();
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int element,notExit=1;
		System.out.print("1.Add element to List"+"\n2.Delete from front"+"\n3.Delete from end"+"\n4.Delete from a position"+"\n5.Display List"+"\n6.Exit");
		while(notExit==1)
		{
			System.out.print("\n\nSelect an operation: \n");
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter element to add: ");
					element=scan.nextInt();
					list.add(element);
					System.out.println("["+element+" added to list]");
					display();
					break;
				case 2:
					try
					{
						element=list.getFirst();
						list.removeFirst();
						System.out.println("["+element+" deleted from list]");
						display();
					}
					catch(NoSuchElementException e)
					{
						System.out.println("[List is empty]");
					}
					break;
				case 3:
					try
					{
						element=list.getLast();
						list.removeLast();
						System.out.println("["+element+" deleted from list]");
						display();
					}
					catch(NoSuchElementException e)
					{
						System.out.println("[List is empty]");
					}
					break;
				case 4:
					System.out.print("Enter position: ");
					int position=scan.nextInt();
					try
					{
						element=list.get(position - 1);
						list.remove(position - 1);
						System.out.println("["+element+" deleted from list]");
						display();
					}
					catch(IndexOutOfBoundsException e)
					{
						System.out.println("[Invalid position]");
					}
					break;
				case 5:
					display();
					break;
				case 6:
					scan.close();
					System.out.println("Exited!");
					notExit=0;
					break;
				default:
					System.out.println("[Invalid choice. Please try again]");
			}
		}
	}
	
	static void display()
	{
		System.out.print("List: ");
		Iterator<Integer>itr=list.iterator();
		while (itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}	
