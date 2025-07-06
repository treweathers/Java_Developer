//Course 1.6: Writing Functions using Java

import java.util.Arrays;
import java.util.List;

class Test6 {
//####  Practice #6: Bake up your function to calculate the cost of cakes and write a procedure to display freshly baked cookies. Remember the recipe from earlier: define the right type of function with the correct ingredients and cook your code to perfection!
//LESSON 1: Defining and Executing Java Functions and Procedures
    // TODO: Create a function to calculate the cost of 'cakes' given the 'costPerCake'
    public static int cakeCost(int totalCakes, int costPerCake) {
      int cost = totalCakes * costPerCake;
      return cost;
    }
    // TODO: Write a procedure to display the number of 'cookies' baked
    public static void bakedCookies(int cookies) {
      System.out.println("There are " + cookies + " cookies baked");
    }

//LESSON 2: An Introduction to Function Overloading
//#### Practice #4: You are tasked with creating a greeting system for our virtual office environment. Write the complete code to overload a method that welcomes employees differently, depending on whether it's just their name or both their name and the day of the week.
    // TODO: Create an overloaded method to welcome an employee by name
    public static String welcome(String name){
        return "Welcome " + name + " to this job!";                
    }
    // TODO: Overload the welcome method to include a greeting that also prints the day of the week
    public static String welcome(String name, String dayOfWeek){
        return "Welcome " + name + " to this job on " + dayOfWeek + "!";                
    }

//LESSON 4: Chaining Functions and Juggling Multiple Return Values in Java
//#### Practice #2: Modify the diceRoll function to return a List containing two roll values. The first roll value is already generated, your task is to generate the second one in the same way and return both values as a result. Update the function to chain these actions using Java's capabilities for handling multiple values.
    static List<Integer> diceRoll() {
        int roll = (int) (Math.random() * 6) + 1;  // simulates a dice roll
        int roll2 = (int) (Math.random() * 6) + 1;
        return Arrays.asList(roll, roll2);
    }
//#### Practice #4: In this lesson, you've discovered how function chaining and managing multiple return values with lists operate in Java. Now, it's time for you to roll up your sleeves and dive into writing some code on your own. Your objective is to perform a sequence of operations on a given number. Specifically, you will need to double this number and then add seven to the outcome. Your mission involves creating the appropriate functions and then chaining them together to unveil the "lucky number."
    // TODO: Create a function that doubles the integer number passed to it.
    static double doubled(double a) {
        return a + a;
    }
    // TODO: Create a function that adds 7 to the integer number passed to it.
    static double seven(double a) {
        return a + 7;
    }
    // TODO: Create a function `luckyNumber` that chains the doubling and adding seven operations for a given integer number.
    // Given `x`, the function should return `2 * x + 7`
    static double luckyNumber(double a) {
        return seven(doubled(a));
    }

//**Q: WHAT IS THE DIFFERENCE BETWEEN public, static, void etc. methods?**
/*
public (Access Modifier):
Meaning: public is an access modifier that grants the broadest visibility to a method. A public method can be accessed and invoked from any other class, regardless of its package. 
When to use: Use public when a method needs to be accessible from outside the class or package where it is defined, such as utility methods, API methods, or methods that form part of a class's public interface.

static (Non-Access Modifier):
Meaning: static signifies that a method belongs to the class itself, rather than to any specific instance (object) of that class. Static methods can be called directly on the class name without creating an object.
When to use: Use static for methods that do not depend on instance-specific data or state. Examples include utility methods (e.g., Math.sqrt()), methods that perform operations on static variables, or the main() method, which is the entry point for Java applications and must be callable without an object.

void (Return Type):
Meaning: void is a return type that indicates a method does not return any value. It performs an action but does not produce a result that can be used elsewhere in the code. 
When to use: Use void when a method's primary purpose is to perform an action or side effect, such as printing output to the console, modifying an object's state, or interacting with external resources, without needing to return a computational result.

In summary:
* public defines who can access the method.
* static defines how the method is associated with the class (class-level vs. instance-level).
* void defines what the method returns (nothing in this case).
*/

    public static void main(String[] args) {
//FROM LESSON 1
        // TODO: Call a function that calculates the cost of 3 cakes, each costing $10, and print the total cost
        // Don't forget to print the result of the function to the console
        System.out.println(cakeCost(3, 10));
        // TODO: Call a procedure displaying a message about 15 cookies that have been baked
        bakedCookies(15);
    
// FROM LESSON 2
        // TODO: Test your welcome method with just a name
        System.out.println(welcome("Tre"));
        System.out.println(welcome("Beautiful", "Monday"));
        // TODO: Test your welcome method with a name and the day of the week

//FROM LESSON 4: PRACTICE 2
        List <Integer> rolls = diceRoll();
        System.out.println("Dice rolls: " + rolls);
//FROM LESSON 4: PRACTICE 4
    // TODO: Call the method that calculates the lucky number and print it out.
    // Provide number 3 as an integer parameter
    System.out.println(luckyNumber(3));

//LESSON 3: Java's Built-In Functions
//#### Practice #4: Write a program that computes the area of a square with a given side length, identifies the greater count of galaxies observed, and calculates the square root of an area to simulate space exploration measurements.
        // TODO: Calculate the area of a square where the side length is 4.0 light-years using the appropriate Math.pow() function.
        double squareArea = Math.pow(4, 2);
        double galaxyOne = 1000;
        double galaxyTwo = 1001;
        // TODO: Determine the greater number of galaxies observed between two given counts using the correct Math.max() function.
        double galaxies = Math.max(galaxyOne, galaxyTwo);
        // TODO: Compute the side of a square given its area, using a Math.sqrt() function.
        double squareSide = Math.sqrt(squareArea);
        // TODO: Print out the calculated values with descriptive messages.
        System.out.println("The area of the square is " + squareArea + " and the value of the greater galaxy is " + galaxies + " and the side of the square is " + squareSide);

//LESSON 5: Exception Handling in Functions
//#### Practice #5: You are running an employee management system and you need to access the employee IDs from an array. Write code to access an ID and handle the case where it doesn't exist using exception handling.
        int[] employeeIds = {101, 102, 103};
        // TODO: Try accessing an employee ID that might not exist in the array
        try {
            int employee = employeeIds[5];
        }
        // TODO: Catch the ArrayIndexOutOfBoundsException exception that occurs if the index is out of bounds and print an error message
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Employee Id does not exist");
        }
    }

  }
