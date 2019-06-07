// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to compute book price and shipping cost with tax
 */
import java.util.Scanner;

public class bptwotwentytwo {	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		
		//Enter books cost and number of books
		System.out.println("Enter the total book price : $");		
		double bookPrice = in.nextDouble();
		
		System.out.println("Enter the number of books : ");		
		int numBooks = in.nextInt();
		
		
		//Compute shipping costs and tax costs
		int shipCost = 2*numBooks;
						
		System.out.println("Book Price : " + bookPrice + "  Number of books : " + numBooks);
		
		double tax = bookPrice*.07;
		
		System.out.println("Shipping cost = $" + shipCost + "  Tax = $" + tax);
		
		
		//Compute final price and output final price
		double finalPrice = bookPrice + tax + shipCost;		
		
		
		
		System.out.print("Final Price = $");
		
		System.out.printf("%.2f", finalPrice);
		
		
	}
}
