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

##  Lesson 2:
