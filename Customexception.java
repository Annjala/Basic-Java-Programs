//Java program that creates custom exception and handle various exception handling methods.


package Java;
import java.util.Scanner; 
class InvalidAmountException extends Exception 
{ 
	public InvalidAmountException(String msg) 
	{ 
		super(msg); 
	} 
} 
 
class InsufficientFundsException extends Exception 
{ 
	public InsufficientFundsException(String msg) 
	{ 
		super(msg); 
	} 
} 
 
public class Customexception 
{ 
	public static void main(String args[]) 
	{ 
		int flag=1,n; 
		long accno[]=new long[20]; 
		String name[]=new String[20]; 
		int amount[]=new int[20]; 
		String type[]=new String[20]; 
		Scanner scan=new Scanner(System.in); 
		System.out.print("Enter number of accounts:"); 
		n=scan.nextInt(); 
		Customexception ex=new Customexception(); 
		ex.accounts(n,accno,type,name,amount); 
		System.out.println("\nBanking System"); 
		System.out.println("1.Display All Accounts"); 
		System.out.println("2.Search Account"); 
		System.out.println("3.Deposit Amount"); 
		System.out.println("4.Withdraw Amount"); 
		System.out.println("5.Exit"); 
		while(flag==1) 
		{ 
			System.out.print("\nEnter your choice: "); 
			int ch=scan.nextInt(); 
			switch(ch) 
			{ 
				case 1: 
					ex.display(n,accno,type,name,amount); 
					break; 
				case 2: 
					ex.search(n,accno,type,name,amount); 
					break; 
				case 3: 
					ex.deposit(n,accno,type,name,amount); 
					break; 
				case 4: 
					ex.withdraw(n,accno,type,name,amount); 
					break; 
				case 5: 
					System.out.println("Exited!"); 
					flag=0; 
					break; 
				default: 
					System.out.println("Invalid choice"); 
					break; 
			} 
		} 
	} 
 
	void accounts(int n,long accno[],String type[],String name[],int amount[]) 
	{ 
		int i; 
		Scanner scan=new Scanner(System.in); 
		for(i=1;i<=n;i++) 
		{ 
			System.out.print("\nEnter account number "+i+": "); 
			accno[i]=scan.nextLong(); 
			System.out.print("Enter account type: "); 
			type[i]=scan.next(); 
			System.out.print("Enter name: "); 
			name[i]=scan.next(); 
			System.out.print("Enter balance: "); 
			amount[i]=(int) scan.nextInt(); 
		} 
	}

	void display(int n,long accno[],String type[],String name[],int amount[]) 
	{ 
		int i; 
		for(i=1;i<=n;i++) 
		{ 
			System.out.println("Name: "+name[i]); 
			System.out.println("Account number: "+accno[i]); 
			System.out.println("Account type: "+type[i]); 
			System.out.println("Balance: "+amount[i]); 
		} 
	} 

	void search(int n,long accno[],String type[],String name[],int amount[]) 
	{ 
		long num; 
		int i; 
		Scanner scan=new Scanner(System.in); 
		System.out.print("Enter account number: "); 
		num=scan.nextLong(); 
		for(i=1;i<=n;i++) 
		{ 
			if(accno[i]==num) 
			{ 
				System.out.println("Name: "+name[i]); 
				System.out.println("Account number: "+accno[i]); 
				System.out.println("Account type: "+type[i]); 
				System.out.println("Balance: "+amount[i]); 
			} 
		} 
	} 

	void deposit(int n,long accno[],String type[],String name[],int amount[]) 
	{ 
		int dep,i; 
		long acc; 
		Scanner scan=new Scanner(System.in); 
		System.out.print("Enter account number: "); 
		acc=scan.nextLong(); 
		for(i=1;i<=n;i++) 
		{ 
			if(accno[i]==acc) 
			{
				System.out.print("Enter amount to be deposited: "); 
				dep=scan.nextInt(); 
				try 
				{ 
					if(dep<=0) 
						throw new InvalidAmountException("\nInvalid amount"); 
					else 
					{ 
						amount[i]=amount[i]+dep; 
						System.out.println("Balance is: "+amount[i]); 
					} 
				} 
				catch(InvalidAmountException e) 
				{ 
					System.out.println(e); 
				} 
			} 
		} 
	} 
	 
	void withdraw(int n,long accno[],String type[],String name[],int amount[]) 
	{ 
		Scanner scan=new Scanner(System.in); 
		System.out.print("Enter account number: "); 
		long acc=scan.nextInt(); 
		for(int i=1;i<=n;i++) 
		{ 
			if(accno[i]==acc) 
			{ 
				System.out.print("Enter amount: "); 
				int withd=scan.nextInt(); 
				try 
				{ 
					if(withd>amount[i]) 
						throw new InsufficientFundsException("\nInsufficient balance"); 
					else 
					{ 
						amount[i]=amount[i]-withd; 
						System.out.println("Balance is: "+amount[i]); 
					} 
				} 
				catch(InsufficientFundsException e) 
				{ 
					System.out.println(e);   
				} 
				try 
				{ 
					if(withd<=0)  
						throw new InvalidAmountException("\nInvalid amount");   
					else  
						amount[i]=amount[i]-withd;  
				} 
				catch(InvalidAmountException e) 
				{ 
					System.out.println(e); 
				} 
			} 
		} 
	} 
}
