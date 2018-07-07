package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double price = 0;
		double amtTendered = 0;
		System.out.println("How much is the item? > ");
		price = sc.nextDouble();

		System.out.println("What was the amount tendered? > ");
		amtTendered = sc.nextDouble();

		if (amtTendered == price) {
			System.out.println("You have provided exact payment");
		} else if (amtTendered < price) {
			System.out.println("You need more money for this item");
		}

		int dollars = 0;
		double coins = 0, change = 0;

		if (amtTendered > price) {
			change = amtTendered - price;
			dollars = (int) (change);
			coins = (amtTendered - dollars) - price;
			coins = (coins * 100);
			coins = (int) (coins + .5);

		}

		int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, one = 0;
		while (dollars > 0) {
			if (dollars >= 100) {
				hundred += 1;
				dollars -= 100;
			} else if (dollars >= 50) {
				fifty += 1;
				dollars -= 50;
			} else if (dollars >= 20) {
				twenty += 1;
				dollars -= 20;
			} else if (dollars >= 10) {
				ten += 1;
				dollars -= 10;
			} else if (dollars >= 5) {
				five += 1;
				dollars -= 5;
			} else if (dollars >= 1) {
				one += 1;
				dollars -= 1;
			}
		}

		int penny = 0, nickel = 0, dime = 0, quarter = 0;
		while (coins > 0) {
			if (coins >= 25) {
				quarter += 1;
				coins -= 25;
			} else if (coins >= 10) {
				dime += 1;
				coins -= 10;
			} else if (coins >= 5) {
				nickel += 1;
				coins -= 5;
			} else if (coins >= 1) {
				penny += 1;
				coins -= 1;
			} else if (coins < 1) {
				break;
			}
		}

		String bills = " dollar bills";

		if (hundred == 1) {
			System.out.println(hundred + "  hundred dollar bill");
		} else if (hundred >= 1) {
			System.out.println(hundred + " hundred" + bills);
		}
		if (fifty == 1) {
			System.out.println(fifty + "  fifty dollar bill");
		} else if (fifty >= 1) {
			System.out.println(fifty + "  fifty" + bills);
		}
		if (twenty == 1) {
			System.out.println(twenty + "  twenty dollar bill");
		} else if (twenty >= 1) {
			System.out.println(twenty + "  twenty" + bills);
		}
		if (ten == 1) {
			System.out.println(ten + "  ten dollar bill");
		} else if (ten >= 1) {
			System.out.println(ten + " ten" + bills);
		}
		if (five == 1) {
			System.out.println(five + "  five dollar bill");
		} else if (five >= 1) {
			System.out.println(five + " five" + bills);
		}
		if (one == 1) {
			System.out.println(one + "  one dollar bill");
		} else if (one >= 1) {
			System.out.println(one + " one" + bills);
		}
		if (quarter == 1) {
			System.out.println(quarter + "  quarter");
		} else if (quarter >= 1) {
			System.out.println(quarter + " quarters");
		}
		if (dime == 1) {
			System.out.println(dime + "  dime");
		} else if (dime >= 1) {
			System.out.println(dime + "  dimes");
		}
		if (nickel == 1) {
			System.out.println(nickel + "  nickel");
		} else if (nickel >= 1) {
			System.out.println(nickel + " nickels");
		}
		if (penny == 1) {
			System.out.println(penny + "  penny");
		} else if (penny >= 1) {
			System.out.println(penny + "  pennies");
		}
	}

}
