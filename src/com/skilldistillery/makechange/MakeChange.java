package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

//	User Story #1
//	The user is prompted asking for the price of the item.
		double price = 0;
		double amtTendered = 0;
		System.out.println("How much is the item? > ");
		price = sc.nextDouble();


//	User Story #2
//	The user is then prompted asking how much money was tendered by the customer.
		System.out.println("How much money did the customer provide? > ");
		amtTendered = sc.nextDouble();


//	User Story #3
//	Display an appropriate message if the customer provided too 
//	little money or the exact amount.
		if (amtTendered == price) {
			System.out.println("This is the exact amount of the item");
		} else if (amtTendered < price) {
			System.out.println("You need more money for this item");
		}

	}

}
//	User Story #4
//	If the amount tendered is more than the cost of the item, display the 
//	number of bills and coins that should be given to the customer.
