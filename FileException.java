package Java;
import java.util.Scanner; 
import java.io.File; 
import java.io.IOException; 
import java.io.FileWriter; 
import java.io.FileReader; 
public class FileException  
{ 
	public static void main(String[] args)  
	{ 
		Scanner scan = new Scanner(System.in); 
		System.out.println("Operations:"); 
		System.out.println("1. Create file"); 
		System.out.println("2. Write to file"); 
		System.out.println("3. Read from file"); 
		System.out.println("4. Delete file"); 
		System.out.println("5. Exit"); 
		String filename=null; 
		int notExit=0; 
		while(notExit==0)  
		{ 
			System.out.println("\nEnter your choice: "); 
			int choice=scan.nextInt(); 
			switch(choice)  
			{ 
				case 1: 
					System.out.println("Enter file name: "); 
					filename=scan.next(); 
					CreateFile createFile=new CreateFile(); 
					createFile.create(filename); 
					break; 
				case 2: 
					if(filename!=null)  
					{ 
						System.out.println("Enter contents of the file: "); 
						scan.nextLine(); 
						String s=scan.nextLine(); 
						WriteToFile writeToFile=new WriteToFile(); 
						writeToFile.write(filename,s); 
					} 
					else 
						System.out.println("Please create a file first (Option 1)."); 
					break; 
				case 3: 
					if (filename!=null)  
					{ 
						ReadFile readFile=new ReadFile(); 
						readFile.read(filename); 
					} 
					else  
						System.out.println("Please create a file first (Option 1)."); 
					break; 
				case 4: 
					DeleteFile deleteFile=new DeleteFile(); 
					deleteFile.delete(filename); 
					filename=null;  
					break; 
				case 5: 
					System.out.println("Exiting program."); 
					scan.close(); 
					notExit=1; 
					break; 
				default: 
					System.out.println("Invalid choice. Please enter a number between 1 and 5."); 
			} 
		} 
	} 
} 

class CreateFile  
{ 
	public void create(String filename)  
	{ 
		try  
		{ 
			File myObj=new File(filename); 
			if(myObj.createNewFile())  
				System.out.println("File created: "+myObj.getName()); 
			else  
				System.out.println("File already exists."); 
		}  
		catch(IOException e)  
		{ 
			System.out.println("An error occurred."); 
			e.printStackTrace(); 
		} 
	}
}

class WriteToFile  
{ 
	public void write(String filename,String content)  
	{ 
		try  
		{ 
			FileWriter myWriter=new FileWriter(filename); 
			myWriter.write(content); 
			myWriter.close(); 
			System.out.println("Successfully wrote to the file."); 
		} 
		catch(IOException e)  
		{ 
			System.out.println("An error occurred."); 
			e.printStackTrace(); 
		} 
	} 
} 

class ReadFile  
{ 
	public void read(String filename)  
	{ 
		try  
		{ 
			File file=new File(filename); 
			FileReader reader=new FileReader(file); 
			int i; 
			while((i=reader.read())!=-1) 
				System.out.print((char)i); 
			reader.close(); 
		}  
		catch(IOException e)  
		{ 
			System.out.println("An error occurred."); 
			e.printStackTrace(); 
		} 
	} 
} 

class DeleteFile  
{ 
	public void delete(String filename)  
	{ 
		File file=new File(filename); 
		if(file.delete())  
			System.out.println("File deleted: " + file.getName()); 
		else 
			System.out.println("File not found or cannot be deleted."); 
	} 
}