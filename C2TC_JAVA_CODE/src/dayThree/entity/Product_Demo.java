package dayThree.entity;

import java.util.Scanner;

public class Product_Demo {
	public static void main(String[] args) {
		Product o1=new Product();
		Product o2=new Product(102,"mouse",250.4f);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the product details : ");
		
		int sid=sc.nextInt();
		sc.nextLine();
		String prod_name=sc.nextLine();
		float price = sc.nextFloat();
		
		Product o3=new Product(sid,prod_name,price);
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
	}
}
