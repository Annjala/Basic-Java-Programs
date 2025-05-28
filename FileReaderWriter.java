//File handling program in Java with reader/writer.

package Java;
import java.util.*; 
import java.io.*; 
public class FileReaderWriter 
{ 
	public static void main(String args []) 
	{ 
		Scanner sc=new Scanner(System.in); 
		try 
		{ 
			File f=new File("sample.txt"); 
			if(f.exists()==false)  
			{ 
				if(f.createNewFile())  
				{ 
					System.out.println("File Created Successfully"); 
					FileWriter fw=new FileWriter(f); 
					System.out.println("Enter the text to continue"); 
					String text=sc.nextLine(); 
					fw.write(text); 
					fw.flush(); 
					fw.close(); 
					System.out.println("Data Saved Successfully"); 
					System.out.println("The contents of file 'sample.txt' is : "); 
					FileReader fr=new FileReader(f); 
					int chara; 
					while((chara=fr.read())!=-1)  
						System.out.print((char)(chara));  
					fr.close(); 
					File f1=new File("new_sample.txt"); 
					if(f1.exists()==false)  
					{ 
						if(f1.createNewFile())  
						{ 
							System.out.println("\nFile 'new_Sample.txt' created successfully"); 
							FileReader fr1=new FileReader(f); 
							FileWriter fw1=new FileWriter(f1); 
							int character;             
							while((character=fr1.read())!=-1)  
								fw1.write(character); 
							fr1.close(); 
							fw1.close(); 
							System.out.println("The contents are copied successfully."); 
							System.out.println("The contents of file 'new_sample.txt' is : "); 
							FileReader fr2=new FileReader(f1); 
							int charac; 
							while((charac=fr2.read())!=-1) 
								System.out.print((char)charac); 
							fr2.close(); 
						} 
						else 
							System.out.println("File not created"); 
					} 
					else 
						System.out.println("File not created"); 
				} 
				else 
					System.out.println("File not created"); 
			} 
			else 
				System.out.println("File not created"); 
		} 
		catch(IOException e)  
		{ 
			System.out.println("File not created \t File already exists "); 
			e.printStackTrace(); 
		} 
	} 
} 
