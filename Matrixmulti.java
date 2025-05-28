//Java program to multiply two matrices.

package Java;
import java.util.Scanner; 
public class Matrixmulti 
{
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in); 
		System.out.println("ORDER OF FIRST MATRIX"); 
		System.out.println("Enter the number of rows:"); 
		int m=s.nextInt(); 
		System.out.println("Enter the number of columns:"); 
		int n=s.nextInt(); 
		System.out.println("ORDER OF SECOND MATRIX"); 
		System.out.println("Enter the number of rows:"); 
		int p=s.nextInt(); 
		System.out.println("Enter the number of columns:"); 
		int q=s.nextInt(); 
		int a[][]=new int[m][n]; 
		int b[][]=new int[p][q]; 
		int product[][]=new int[m][q]; 
		if(n!=p) 
			System.out.println("Multiplication not possible"); 
		else 
		{ 
			System.out.println("Enter the elements of first matrix: "); 
			for(int i=0;i<m;i++) 
			{ 
				for(int j=0;j<n;j++) 
					a[i][j]=s.nextInt();  
			} 
			System.out.println("Enter the elements of second matrix: "); 
			for(int i=0;i<p;i++) 
			{ 
				for(int j=0;j<q;j++) 
					b[i][j]=s.nextInt();     
			} 
			System.out.println("The product matrix is:"); 
			for(int i=0;i<m;i++) 
			{ 
				for(int j=0;j<q;j++) 
				{ 
					product[i][j]=0; 
					for(int k=0;k<n;k++)  
						product[i][j]=product[i][j]+a[i][j]*b[k][j]; 
				} 
			} 
			for(int i=0;i<m;i++) 
			{ 
				for(int j=0;j<q;j++)  
					System.out.print(product[i][j]+"\t"); 
				System.out.println("\n"); 
			} 
		}  
	 } 
}
