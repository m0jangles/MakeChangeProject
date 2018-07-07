package com.skilldistillery.makechange;
// THIS IS PART OF THE REFACTORED VERSION
public class CashRegister {

	public int changeConverted;
	double amtTendered = 0;
	double price = 0;
	double change = 0;
	int hundred;
	int fifty;
	int twenty;
	int ten;
	int five;
	int one;
	int quarter;
	int dime;
	int nickel;
	int penny;
	String bill = " dollar bill";
	String bills = " dollar bills";

	public int makeChange() {

		change = amtTendered - price;       //formula to get the amount of change from the transaction
//		System.out.println(change);    		//test for what you think will print out first
		change = change * 100; 				// formula to turn amount into pennies
		change = (int) (change + .5); 		// formula to round to nearest penny
		changeConverted = (int) (change); 	// formula to cast result into an integer

		return (int) changeConverted;   

	}
	/* this method is for testing calling a method 
	   from the makeChange method, this will print the result of the calculations in the makeChange method
	*/
	public void printChange() { 
		int converted = makeChange(); 
		System.out.println(converted);
	}

	public int[] countDenominations() { // this method keeps a count of the quantities of each denomination
		int converted = makeChange();
		int[] denominations = new int[10];

		while (converted > 0) {
			if (converted >= 10000) {
				hundred += 1;
				denominations[0] = hundred;
				converted -= 10000;
			} else if (converted >= 5000) {
				fifty += 1;
				denominations[1] = fifty;
				converted -= 5000;
			} else if (converted >= 2000) {
				twenty += 1;
				denominations[2] = twenty;
				converted -= 2000;
			} else if (converted >= 1000) {
				ten += 1;
				denominations[3] = ten;
				converted -= 1000;
			} else if (converted >= 500) {
				five += 1;
				denominations[4] = five;
				converted -= 500;
			} else if (converted >= 100) {
				one += 1;
				denominations[5] = one;
				converted -= 100;
			} else if (converted >= 25) {
				quarter += 1;
				denominations[6] = quarter;
				converted -= 25;
			} else if (converted >= 10) {
				dime += 1;
				denominations[7] = dime;
				converted -= 10;
			} else if (converted >= 5) {
				nickel += 1;
				denominations[8] = nickel;
				converted -= 5;
			} else if (converted >= 1) {
				penny += 1;
				denominations[9] = penny;
				converted -= 1;
			}

		}
		return denominations;
	}

	public void printDenominations() { // print the denominations in the correct quantities
		int denominationsCount[] = countDenominations();

		for (int i = 0; i < denominationsCount.length; i++) {
			if (i == 0) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 one hundred" + bill);
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " one hundred" + bills);
				}
			}
			if (i == 1) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 fifty" + bill);
				}
			}
			//purposely left out conditions for more than one fifty, ten, and five dollar bill because there
			//shouldn't be multiple of these bills if the program is working correctly
			//example: 2 five dollar bills should have been dispense as 1 ten dollar bill
			if (i == 2) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 twenty" + bill);
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " twenty" + bills);
				}
			}
			if (i == 3) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 ten" + bill);
				}
			}
			if (i == 4) {
				if (denominationsCount[i] == 1) {  		
					System.out.println("1 five" + bill); 
				}
			}
			if (i == 5) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 one" + bill);
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " one" + bills);
				}
			}
			if (i == 6) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 quarter");
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " quarters");
				}
			}
			if (i == 7) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 dime");
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " dimes");
				}
			}
			if (i == 8) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 nickel");
				}
			}
			if (i == 9) {
				if (denominationsCount[i] == 1) {
					System.out.println("1 penny");
				} else if (denominationsCount[i] > 1) {
					System.out.println(denominationsCount[i] + " pennies");
				}
			}

		}
	}
}
