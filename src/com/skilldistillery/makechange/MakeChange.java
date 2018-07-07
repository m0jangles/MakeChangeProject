package com.skilldistillery.makechange;

import java.util.Scanner;

//THIS IS THE REFACTORED VERSION

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("How much is the item? >");
		double price = sc.nextDouble();
		System.out.println("Enter amount tendered: >");
		double amtTendered = sc.nextDouble();

		if (amtTendered == price) {
			System.out.println("The amount tendered is the exact amount of the item");
		}
		else if (amtTendered < price) {
			System.out.println("Inadequate payment");
		}

		else if (amtTendered > price) {
			
			CashRegister cr = new CashRegister();
			
			cr.price = price;
			cr.amtTendered = amtTendered;
			cr.printDenominations(); ;

		} 
		
		sc.close();
	}
}
