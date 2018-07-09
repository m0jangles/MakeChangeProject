## MakeChange

### Intro
This project simulates a cash register.  A user is asked for an item amount.
The user then enters the amount.

Then the user is asked for an amount
tendered, enters the amount, and is given change in the largest
denominations possible.

This project was assigned after Week 1 of Skill Distillery's Java Coding
School.

### Technologies Used
* Java
* Java operators
* vi, a little

### How To
1) User will be prompted for the price of an item
2) User will input price
3) User will be prompted for the amount tendered
4) User will input amount tendered
5) The program will print one of 3 messages: exact amount, more money needed, or amount of change in exact denominations

### Behind the Scenes
*   There are 2 classes for the refactored version of the project: Transaction and MakeChange
*   Transaction holds different methods to test calculations, perform the calculations of each transaction, and to then print the results.
*   a new transaction object is created in the MakeChange class if the amount tendered is more than the price of the item

  For example:
  *   the makeChange method does the calculation for the transaction
  *   the printChange method is for testing purposes to check that the result of makeChange is as expected
  *   the countDenominations method counts the amount of required denominations to dispense as change
  *  the printDenominations method uses the array from countDenominations to print the user's change accordingly

### Lessons Learned
First version of this program was a reflection of what I had retained and also what I understood about Java one week into the course.  It seemed kind of 1-dimensional, in that it could be read line-by-line in a single file.  

The second version brakes that single file down into methods which are placed in a separate class.  I can now use that class (Transaction), to create a new transaction object.  I can use values such as price and amount tendered to compute the correct change.  

By forcing myself to use several different methods and data types, I was able to fill the gaps in my understanding just a little bit more.  For example, I was REALLY having a hard time wrapping my head around objects and arrays.  I feel slightly more comfortable with each of them, now.  I am not fast yet, but I am persistent when I'm in the "zone".
