<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.6: Writing Functions using Java
## Lesson 1: Defining and Executing Java Functions and Procedures
### 1. Understanding Java Syntax for Functions and Procedures
Functions and procedures are similar to recipes. They consolidate instructions to carry out specific tasks. Imagine baking a cake — a procedure — and sharing it — a function. Baking doesn't yield anything, so it's a procedure. However, sharing returns the remaining cakes, making it a function.

The structure of functions and procedures in Java is as follows:

    static returnType functionName(parameters) {
      // Code body
    }
At first, this structure may seem strange, but think of it as a recipe. `static` is just a keyword you have to remember for now. `returnType` is the type of dish you'll get after cooking. `functionName` is the title of the recipe. The `parameters` are the ingredients, with the `{}` brackets containing the cooking method - the recipe itself.

### 2. Writing Our Own Java Function
With those explanations in mind, let's craft some functions and procedures.

    static int addTwoNumbers(int num1, int num2) {
      int sum = num1 + num2; 
      return sum; // returns the sum of num1 and num2
    }
This function is named `addTwoNumbers`, takes two `int` numbers as parameters, and returns an `int` too. Inside the function, it adds two input parameters and returns their sum as the result of the function.

The `return` statement is akin to the chef announcing that the dish is ready. It notifies the program that the function has accomplished its task and produced a result, finishing the function's execution after that. In the `addTwoNumbers` function, `return sum;` indicates that the operation has concluded, and the sum of `num1` and `num2` is the result. You can't execute any other code or statements after `return`.

### 3. Writing Our Own Java Procedure
Next, we'll create a procedure that prints a greeting:

    static void printGreeting(String name) {
      System.out.println("Hello "+ name + ", welcome to Java!");
    }
The procedure is the same function, but with return type `void` - meaning "no return". As you can see, this procedure just prints a simple greeting message to the console and doesn't return anything as a result.

### 4. Executing Java Functions and Procedures
To employ these functions and procedures, we call them from our `main()` function:

    public static void main(String[] args) {
      int result = addTwoNumbers(5, 7); // the function is called with 5 and 7 as arguments
      System.out.println("The sum is: " + result); // outputs: The sum is: 12
      int result2 = addTwoNumbers(10, 20); // just calling with other arguments
      System.out.println("Another sum is: " + result2); // outputs: Another sum is: 30
    
      printGreeting("Explorer"); // Outputs: Hello Explorer, welcome to Java!
    }
Both `addTwoNumbers(5, 7)` and `addTwoNumbers(10, 20)` call the function with two numbers as inputs, while `printGreeting("Explorer")` calls the procedure with `"Explorer"` as the argument. See how easy and reusable functions and procedures are? No need to duplicate the code anymore!

#### Practice #1
Run the code.

    class Solution {
        static void displayBakingResult(int numOfCakes) {
            System.out.println("We baked " + numOfCakes + " delicious cakes!");
        }
        
        static int cookCookies(int batchCount, int cookiesPerBatch) {
            return batchCount * cookiesPerBatch;
        }
        
        public static void main(String[] args) {
            displayBakingResult(3);
            int totalCookies = cookCookies(5, 10);
            System.out.println("We cooked " + totalCookies + " yummy cookies!");
        }
    }

####  Practice #2
Instead of finding out the total number of cakes from two batches, let's calculate the average number of cakes per batch. Please adjust the addBatches function and the print statement in the main method accordingly.

Note: the average is the total number of cakes divided by 2.

    class Solution {
      
      static int addBatches(int batch1, int batch2) {
        return (batch1 + batch2) / 2;
      }
    
      public static void main(String[] args) {
        int totalCakes = addBatches(10, 20); // Represents the total number of cakes from two batches
        System.out.println("The average number of cakes is: " + totalCakes);
      }
    }

####  Practice #3
Modify the bakeCake function to include a parameter for the number of candles and update the message. Then, update the function call to include the new parameter.

    class Solution {
        static void bakeCake(String cakeType, int layers, int candles) {
            System.out.println("Baking a " + layers + "-layer " + cakeType + " cake with " + candles + " candles.");
        }
    
        public static void main(String[] args) {
          bakeCake("Chocolate", 3, 21); // It will print "Baking a 3-layer Chocolate cake."
        }
    }

####  Practice #4
The code below, is designed to calculate and print the total number of cookies sold at a bakery. However, there's a small bug that is preventing the correct execution of the total cookie sales. Can you find and fix the error to ensure the correct number of cookies sold is printed?

    class Solution {
        static void bakeCookies(int batchCount) {
            System.out.println("Baking " + batchCount + " batches cookies!");
        }
    
        static int sellCookies(int batchCount, int cookiesPerBatch) {
            System.out.println(batchCount * cookiesPerBatch); // Returns the total number of cookies
        }
    
        public static void main(String[] args) {
            bakeCookies(3); // Assuming each batch has the same number of cookies
            int totalCookies = sellCookies(3, 10); // Selling 3 batches, 10 cookies each
            System.out.println("Total cookies sold: " + totalCookies);
        }
    }
    
    solution.java:8: error: missing return statement
        }
        ^
    1 error
    
    class Solution {
        static void bakeCookies(int batchCount) {
            System.out.println("Baking " + batchCount + " batches cookies!");
        }
    
        static int sellCookies(int batchCount, int cookiesPerBatch) {
            int cookies = batchCount * cookiesPerBatch; // Returns the total number of cookies
            return cookies;
        }
    
        public static void main(String[] args) {
            bakeCookies(3); // Assuming each batch has the same number of cookies
            int totalCookies = sellCookies(3, 10); // Selling 3 batches, 10 cookies each
            System.out.println("Total cookies sold: " + totalCookies);
        }

####  Practice #5
Let's add the essential piece to calculate the total price of baked goods. Also, let's ensure the bakery displays the number of goods being baked.

    class Solution {
      
      // TODO: Define a function to calculate and return the total price of baking goods.
      // Input parameters: itemCount, pricePerItem
      public static int bakingGoods(int itemCount, int pricePerItem) {
        int totalPrice = itemCount * pricePerItem;
        return totalPrice;
      }
      public static void main(String[] args) {
        // Task to calculate the total cost of cakes
        int cakesCount = 3;
        int pricePerCake = 15;
        // TODO: Call your function here to calculate the total price for cakes, given the quantity and price per cake.
        int cakesPrice = bakingGoods(cakesCount, pricePerCake);
        System.out.println("Total price for cakes: $" + cakesPrice);
      }
    }


####  Practice #6
Bake up your function to calculate the cost of cakes and write a procedure to display freshly baked cookies.

Remember the recipe from earlier: define the right type of function with the correct ingredients and cook your code to perfection!

    class Solution {
      
      // TODO: Create a function to calculate the cost of 'cakes' given the 'costPerCake'
      public static int cakeCost(int totalCakes, int costPerCake) {
        int cost = totalCakes * costPerCake;
        return cost;
      }
      // TODO: Write a procedure to display the number of 'cookies' baked
      public static void bakedCookies(int cookies) {
        System.out.println("There are " + cookies + " cookies baked");
      }
      public static void main(String[] args) {
        // TODO: Call a function that calculates the cost of 3 cakes, each costing $10, and print the total cost
        // Don't forget to print the result of the function to the console
        System.out.println(cakeCost(3, 10));
        // TODO: Call a procedure displaying a message about 15 cookies that have been baked
        bakedCookies(15);
      }
    }

##  Lesson 2: An Introduction to Function Overloading
### 1. Exploring Function Overloading Syntax
Function overloading in Java is akin to performing different tasks with a Swiss Army knife. The function name remains the same; however, by altering the type, order, or number of parameters, we can execute a variety of actions. Think of your function name as your tool and the parameters as versatile attachments that adapt the tool's output!

Within function overloading lies the intersection where the function name meets its parameters. Despite sharing the same name, the compiler can distinguish functions based on their parameters — similar to how distinct features allow us to recognize a face. Let's visualize this theory with a practical Java example:

    public class Main {
        static void print(int number) {
            System.out.println("Printing an integer: " + number); // Outputs: Printing an integer: 10
        }
    
        static void print(String string) {
            System.out.println("Printing a string: " + string); // Outputs: Printing a string: Hello world!
        }
    
        public static void main(String[] args) {
            print(10); // Output: "Printing an integer: 10"
            print("Hello world!"); // Output: "Printing a string: Hello world!"
        }
    }
See? The function name remains the same, but as parameters have different types - the Java compiler can differentiate them.

## 2. Writing Our First Overloaded Java Functions
Let's continue rolling up our sleeves and creating some overloaded functions. Follow this simple exercise closely, and remember, practice makes perfect.

    public class Main {
        static int add(int a, int b) {
            return a + b; 
        }
    
        static int add(int a, int b, int c) {
            return a + b + c;
        }
    
        public static void main(String[] args) {
            System.out.println(add(1, 2)); // Outputs: 3
            System.out.println(add(1, 2, 3)); // Outputs: 6
        }
    }
The `add()` function adapts its action according to the number of arguments. Bear in mind that Java does not allow overloading functions with identical parameter lists.

### 3. Importance of Function Overloading
Function overloading enables us to code in a straightforward and efficient manner. It's like having pets of different species, but all sharing a common name based on their type. Overloading clusters with similar tasks under one function name improves both readability and organization.

#### Practice #1
Run the code.

    class Solution {
        static void print() {
            System.out.println("The office is open!");
        }
        
        static void print(int hours) {
            System.out.println("The office is open for " + hours + " hours today.");
        }
    
        public static void main(String[] args) {
            print();
            print(8);
        }
    }

#### Practice #2
The given code contains two overridden implementations of checkNumber - Modify the checkNumber function variation that takes a double value to fill in the implementation there. Let's see overriding in action!

    class Solution {
        static String checkNumber(int number) {
            if (number > 0) {
                return "Positive";
            } else if (number < 0) {
                return "Negative";
            } else {
                return "Zero";
            }
        }
    
        static String checkNumber(double number) {
            // This function should to the same as `checkNumber(int)`, but now for `double`
          if (number > 0) {
                return "Positive";
            } else if (number < 0) {
                return "Negative";
            } else {
                return "Zero";
            }
        }
    
        public static void main(String[] args) {
            System.out.println(checkNumber(10)); // Positive
            System.out.println(checkNumber(-0.5)); // Negative
            System.out.println(checkNumber(0)); // Zero
            System.out.println(checkNumber(0.0)); // Zero
            System.out.println(checkNumber(0.1)); // Positive
        }
    }

#### Practice #3
Define an overloaded function to display the tool's name in our office environment code.

    class Solution {
        // Print with overloading for different office tool names
        static void printToolName(String toolName) {
            System.out.println("The name of the tool is: " + toolName);
        }
        
        // TODO: Overload the printToolName function to accept a toolName and its quantity.
        // Print how many units of the tool the office has.
        static void printToolName(String tool, int tools) {
          System.out.println("The amount of tool units is: " + tools + ", that is a " + tool);
      }
        public static void main(String[] args) {
          printToolName("Stapler");
          // The below call should print "The office has 2 units of Whiteboard"
          printToolName("Whiteboard", 2);
        }
    }

#### Practice #4
You are tasked with creating a greeting system for our virtual office environment. Write the complete code to overload a method that welcomes employees differently, depending on whether it's just their name or both their name and the day of the week.

    class Solution {
        // TODO: Create an overloaded method to welcome an employee by name
        public static String welcome(String name){
            return "Welcome " + name + " to this job!";                
        }
        // TODO: Overload the welcome method to include a greeting that also prints the day of the week
        public static String welcome(String name, String dayOfWeek){
            return "Welcome " + name + " to this job on " + dayOfWeek + "!";                
        }
        public static void main(String[] args) {
            // TODO: Test your welcome method with just a name
            System.out.println(welcome("Tre"));
            System.out.println(welcome("Beautiful", "Monday"));
            // TODO: Test your welcome method with a name and the day of the week
        }
    }

## Lesson 3: Java's Built-In Functions
### 1. Types of Built-In Functions
Built-in functions are like freebies in Java. They are built-in and ready to use. You just call them, and they respond, making your programming life easier!

Java offers a wide range of built-in functions that mostly fit under three categories — Math, String, and Array. Let's dive in!

### 2. Built-in Functions: Mathematical Functions
Java's `Math` class is your calculator. Key functions include:

* `Math.max(a, b)`: It resolves the "which number is greater" debate! For example, `Math.max(8, 10) = 10`.

* `Math.pow(a, b)`: Raises `a` to the power `b`. For example, `Math.pow(2, 3) = 8.0`, as 2^3 = 8.

* `Math.sqrt(a)`: Calculates the square root of a. For example, `Math.sqrt(16) = 4`, as 
sqrt(16) = 4

*` Math.random()`: Returns a float random number from `0.0` to `1.0`, adding an element of surprise.

### 3. Built-in Functions: String Manipulation Functions
Java strings carry built-in methods for manipulation:

* `str.length()`: Measures the size of string `str`. For example, `"Hello!".length() = 5`.

* `str.charAt(index)`: Finds the character at the index-th location of string str. For example, `"Hello!".charAt(0) = 'H'`.

* `str.substring(startIndex, endIndex)`: Carves out a part of the narrative `str` from `startIndex` (inclusive) to `endIndex` (exclusive). For example, `"Hello".substring(1, 3) = "el"`.

* `str.concat(anotherStr)`: Merges `str` and `anotherStr` into one string. For example, `"Hello".concat(" world") = "Hello world"`.

* `str.equals(anotherStr)`: Checks if `str` and `anotherStr` match completely. For example, `"Hello".equals("Hello") = true`.

### 4. Built-in Functions: Array Functions
Java arrays come with built-in functions:

* `Arrays.toString(arr)`: Translates `arr` into a string.
* `Arrays.sort(arr)`: Organizes `arr` in ascending order, much like arranging books alphabetically. For example,

        int[] a = {5, 2, 4, 3, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // Output: [1, 2, 3, 4, 5]
### 5. Using Built-in Functions
Let's get hands-on with a sample code:

    import java.util.Arrays;
    
    public class Main {
        public static void main(String[] args) {
            // Math functions in action
            System.out.println(Math.max(5, 10));  // prints 10
            System.out.println(Math.pow(3, 2));  // prints 9.0
            System.out.println(Math.sqrt(16));   // prints 4.0
            System.out.println(Math.random());   // prints a random number
    
            // String functions at work
            String str1 = "Hello", str2 = " World!";
            System.out.println(str1.length());         // prints 5
            System.out.println(str1.charAt(1));        // prints 'e'
            System.out.println(str2.substring(1, 4));  // prints 'Wor'
            System.out.println(str1.concat(str2));     // prints 'Hello World!'
            System.out.println(str1.equals(str2));     // prints false
    
            // Array functions used
            int[] arr = {7, 2, 10, 5, 3};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));  // prints '[2, 3, 5, 7, 10]'
        }
    }
Copy this into your environment or the CodeSignal IDE and run it to get a hands-on understanding of Java's built-in functions.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Given a square's side length, calculate its area using the Math.pow function
            double sideLength = 5;
            double area = Math.pow(sideLength, 2);
    
            // Output the area of the square as a double
            String info = "The area of the square with side length " + sideLength + " is " + area + " square units.";
            System.out.println(info);
        }
    }

#### Practice #2
Now, take the given code and transform the areaOfCircle method into the diameterOfCircle method using Java's Math.sqrt() function based on the area you have calculated. Your goal is to calculate the diameter of the circle from its area. Remember to update both the method name and the output message accordingly.

Note: the diameter of the circle equals  2 * sqrt(area/π)

    class Solution {
        // A simple method to calculate the area of a circle
        static double areaOfCircle(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
    
        public static void main(String[] args) {
            // Let's assume the radius of our cosmic circle is 7.5
            double radius = 7.5;
            System.out.println("The area of a circle with radius " + radius + " is: " + areaOfCircle(radius));
        }
    }
    
    class Solution {
        // A simple method to calculate the area of a circle
        static double areaOfCircle(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
    
        static double diameterOfCircle(double radius) {
            return 2 * Math.sqrt((areaOfCircle(radius) / Math.PI));
        }
        
        public static void main(String[] args) {
            // Let's assume the radius of our cosmic circle is 7.5
            double radius = 7.5;
            System.out.println("The diameter of a circle with radius " + radius + " is: " + diameterOfCircle(radius));
        }
    
    }

#### Practice #3
Try to write a line of Java code using the Math function to find the larger of two galaxy populations and create a string that states which galaxy has the greater population.

    class Solution {
        public static void main(String[] args) {
            // The universe is vast and full of numbers. Let's explore with Java functions!
            int galaxyOnePopulation = 1000000;
            int galaxyTwoPopulation = 2000000;
            
            // TODO: Write a line of code to find which galaxy population is greater and build a message string.
            System.out.println("The galaxy with a greater population has " + Math.max(galaxyOnePopulation, galaxyTwoPopulation) + " inhabitants");/* TODO: finish this message */
            // Finding the distance to the Andromeda galaxy in light-years as a String.
            double andromedaDistance = 2.537e6; // 2.537 million light years
            String distanceText = String.valueOf(andromedaDistance);
            
            // Using String.concat to create an information string about the distance to Andromeda galaxy
            String info = "The Andromeda galaxy is " /* TODO: Use a String method to add distance and unit */ + ".";
            String information = info.concat(distanceText);
            System.out.println(information);
        }
    }

###### feedback: did not include instructions to add the word "inhabitants", also includeD "TO-DO" to concat in the middle of a string, making it seem like it should be there instead of on a new line in a new variable.‼️

#### Practice #4
Write a program that computes the area of a square with a given side length, identifies the greater count of galaxies observed, and calculates the square root of an area to simulate space exploration measurements.

    class Solution {
        public static void main(String[] args) {
            // TODO: Calculate the area of a square where the side length is 4.0 light-years using the appropriate Math.pow() function.
            double squareArea = Math.pow(4, 2);
            // TODO: Determine the greater number of galaxies observed between two given counts using the correct Math.max() function.
            double galaxyOne = 1000;
            double galaxyTwo = 1001;
            double galaxies = Math.max(galaxyOne, galaxyTwo);
            // TODO: Compute the side of a square given its area, using a Math.sqrt() function.
            double squareSide = Math.sqrt(squareArea);
            // TODO: Print out the calculated values with descriptive messages.
            System.out.println("The area of the square is " + squareArea + " and the value of the greater galaxy is " + galaxies + " and the side of the square is " + squareSide);
        }
    }

## Lesson 4: Chaining Functions and Juggling Multiple Return Values in Java
### 1. Understanding Function Chaining
Let's demystify "Function Chaining". Have you ever prepared a cup of coffee? You sequentially boil water, brew coffee, and add cream. Now, imagine these steps as functions: `doubleNumber()` and `addFive()`. If we chain these functions together, we have our `doubleAndAddFive()` function — an apt illustration of function chaining!

Take a look:

    public static int doubleNumber(int number) {
        return number * 2;  // doubles the input
    }
    
    public static int addFive(int number) {
        return number + 5;  // adds 5 to the input
    }
    
    public static int doubleAndAddFive(int number) {
        return addFive(doubleNumber(number));  // calls doubleNumber first, then addFive
    }
In `doubleAndAddFive()`, `doubleNumber()` is called first, and then its result fuels `addFive()`. That's function chaining!

### 2. Hands-on with Function Chaining
Now, let's dip our toes into function chaining. Consider the task of finding the square root of the `sum` of two numbers. We call sum() inside `sqrtOfSum()`, feeding its result to `sqrt()`.

    public static void main(String[] args) {
        System.out.println(sqrtOfSum(25, 25));  // prints the square root of the sum
    }
    
    static int sum(int a, int b) {
        return a + b;  // returns the sum
    }
    
    static double sqrt(int number) {
        return Math.sqrt(number);  // returns the square root
    }
    
    static double sqrtOfSum(int a, int b) {
        return sqrt(sum(a, b)); // calls sum first, then sqrt
    }
### 3. Dealing with Multiple Return Values
Consider this scenario: a board game where `throwDice()` simulates the throw of two dice and returns both results. But how do you return both values from the function? This is where Java's List class saves the day!

You can just return a `List` from the function, and it can handle any number of values in it. Let's see on example:

    static List<Integer> throwDice() {
        Random rand = new Random();
        return Arrays.asList(rand.nextInt(6) + 1, rand.nextInt(6) + 1);  // returns a list of two element the dice throws
    }
Here, we created an `ArrayList` of two elements and provided it as a return value - easy and simple! You can access returned elements using the `ArrayList::get` method after that.

#### Practice #1
Run the code.

import java.util.*;

    class Solution {
        public static void main(String[] args) {
            List<Integer> diceRolls = throwTwoDice();
            System.out.println(getHighestRoll(diceRolls));  // prints the higher number of two dice rolls
        }
        
        static List<Integer> throwTwoDice() {
            return Arrays.asList(rollDice(), rollDice());
        }
        
        static int rollDice() {
            return (int) (Math.random() * 6) + 1;
        }
        
        static int getHighestRoll(List<Integer> rolls) {
            return Math.max(rolls.get(0), rolls.get(1));
        }
    }

#### Practice #2
Modify the diceRoll function to return a List containing two roll values. The first roll value is already generated, your task is to generate the second one in the same way and return both values as a result. Update the function to chain these actions using Java's capabilities for handling multiple values.

    import java.util.Arrays;
    import java.util.List;
    
    class Solution {
        static List<Integer> diceRoll() {
            int roll = (int) (Math.random() * 6) + 1;  // simulates a dice roll
            int roll2 = (int) (Math.random() * 6) + 1;
            return Arrays.asList(roll, roll2);
        }
        
        public static void main(String[] args) {
            List <Integer> rolls = diceRoll();
            System.out.println("Dice rolls: " + rolls);
        }
    }

#### Practice #3
Directly apply function chaining in our board game scenario. Implement the missing pieces of code to calculate and store both the average and its square in a List.

    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
    
    class Solution {
        static double average(double a, double b) {
            return (a + b) / 2.0; // calculates the average of two numbers
        }
        static double square(double a) {
            return (a * a);
        }
        static double squareOfAverage(double a, double b) {
            return square(average(a, b));
        }
        static List<Double> calculateResults(double a, double b) {
            List<Double> results = new ArrayList<>();
            double avg = average(a, b);
            // TODO: Add the square of the average to the results list
            results.add(squareOfAverage(a, b));
            // TODO: return a List containing the average and the square of the average
            return Arrays.asList(avg, squareOfAverage(a, b));
        }
        public static void main(String[] args) {
            // TODO: Call calculateResults and print the average and square of the average.
            System.out.println(calculateResults(average(3, 3), square(3)) );
        }
    }

#### Practice #4
In this lesson, you've discovered how function chaining and managing multiple return values with lists operate in Java. Now, it's time for you to roll up your sleeves and dive into writing some code on your own.

    Your objective is to perform a sequence of operations on a given number. Specifically, you will need to double this number and then add seven to the outcome. Your mission involves creating the appropriate functions and then chaining them together to unveil the "lucky number."
    
    class Solution {
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
        public static void main(String[] args) {
            // TODO: Call the method that calculates the lucky number and print it out.
            // Provide number 3 as an integer parameter
            System.out.println(luckyNumber(3));
        }
    }

## Lesson 5:
### 1. 
