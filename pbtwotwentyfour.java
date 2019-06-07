// Copyright (c) 2019, Matthew Chalifoux.

/**
   Program to extract dollars and cents from a floating-point value
 */
import java.util.Scanner;

public class pbtwotwentyfour {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
		
		//Input price
		System.out.println("Enter a price with dollars and cents: $");		
		double price = in.nextDouble();
		
		System.out.println("Price = $" + price);
		
		//Turn dollars into integer value
		int dollars = (int) price;
		
		System.out.println("Dollars = $" + dollars);
		
		double difference = price - dollars;
		
		System.out.println("Difference = $" + difference);
		
		//Turn change into integer value
		int change = (int) (difference*100);
		
		System.out.println("Change = " + change);
		
		
	}
}
