package com.skilldistillery.makechange;

import java.util.Scanner;

//THIS IS THE REFACTORED VERSION

public class MakeChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";

		int i = 1;
		while (i > 0) {
			System.out.println("How much is the item? >");
			double price = sc.nextDouble();
			System.out.println("Enter amount tendered: >");
			double amtTendered = sc.nextDouble();

			if (amtTendered == price) {
				System.out.println("The amount tendered is the exact amount of the item");
			} else if (amtTendered < price) {
				System.out.println("Inadequate payment");
				continue;
			} else if (amtTendered > price) {
				Transaction tr = new Transaction();

				tr.price = price;
				tr.amtTendered = amtTendered;
				System.out.println("Your change is: ");
				tr.printDenominations();
				
				System.out.println("Would you like to start a new transaction? (Y) or (N)");
				answer = sc.next();
				if (answer.equalsIgnoreCase("Y"))
					continue;
				
				else if (answer.equalsIgnoreCase("N")) {
					System.out.println("Goodbye");
					System.exit(0);
					sc.close();
				} else {
					System.out.println("That was not a valid answer, try again another time");
					System.exit(0);
					sc.close();
				}
				i++;
			}

			
		}

	}
}
