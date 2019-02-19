package com.capgemini.takehome.ui;
import java.util.Scanner;
import com.capgemini.takehome.exceptions.InvalidProductCodeException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;
public class Client {
	public static void main(String[] args) throws InvalidProductCodeException {
		mainScreen();
	}
	public static void mainScreen() throws InvalidProductCodeException{
		IProductService service=new ProductService();
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------Welcome to the Billing Application--------------------------");
			System.out.println("Enter the ProductId");
			int productId=sc.nextInt();
			System.out.println("Enter Quantity");
			int quantity=sc.nextInt();
			service.calculateLineTotal(productId, quantity);
	}

}
