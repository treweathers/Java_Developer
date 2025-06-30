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
