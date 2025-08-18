package BufferedReader;

import java.io.*;

public class BufferedReaderDemo { 
	public static void main(String[] args) throws IOException
	{
		
		/*Before sending or Receiving a data we have to convert the object */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name: ");
		
		String name= br.readLine();
		
		System.out.println("Enter the Age: ");
		
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter the salary: ");
		
		double Sal=Double.parseDouble(br.readLine());
		
		System.out.println("Name: "+name);
		System.out.println("Name: "+age);
		System.out.println("Name: "+Sal);
	}
}
