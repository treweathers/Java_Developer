<h1 align='center'> Course 2: Mastering Algorithms and Data Structures in Java </h1> 

# Course 2.2: Sorting and Searching Algorithms in Java
## Lesson 1: Recursion Refreshment in Java
### 1. Understanding Recursion
Consider a stack of books. Want the bottom one? You'll need to remove each book above it, one by one. It's a recurring action — an example of recursion. In programming, recursion encompasses a function calling itself repeatedly until a specific condition is met, similar to descending stairs one step at a time until you reach the ground.

Here's a simple `Java` function illustrating recursion:

    public class Main {
      public static void recursiveFunction(int x) {
        if(x <= 0){ // Termination condition --> base case
          System.out.println("Base case reached");
        } else {
          System.out.print(x);
          recursiveFunction(x - 1); // Recursive function call --> recursive case
        }
      }
      public static void main(String[] args) {
        recursiveFunction(5);
      }
    }
    /*Output:
    5
    4
    3
    2
    1
    Base case reached
    */
This function keeps calling itself with `x` getting lower by one until `x <= 0`, which is our base case. At this point, it stops the recursion.

### 2. Defining the Base Case
The base case acts like a friendly signpost, telling the recursion when to stop. In our book stack example, reaching a point where no more books are left to remove serves as the signal. Similarly, `x <= 0` is our base case in our function. The base case is crucial as it prevents infinite recursion and related errors.

### 3. Defining the Recursive Case
The recursive case is an essential aspect of recursion — the rule responsible for creating smaller versions of the original problem. Each call brings us a step closer to the base case. Let's use the process of calculating a factorial as an illustrative example.

To find a factorial, we multiply a number by the factorial of the number minus one, and repeat this process until we get to one (our base case):

    public class Main {
      static int factorial(int n){
        if(n == 1){ // base case
          return 1; 
        } else {
          return n*factorial(n-1); // recursive case
        }
      }
      public static void main(String[] args) {
        System.out.println(factorial(3)); // we expect 6 (3 * 2 * 1)
      }
    }
In this case, we call `factorial(3)`, it returns `3 * factorial(2)`, where `factorial(2)` returns `2 * factorial(1)`. As `factorial(1)` is a base case, it returns 1. As a result, the whole recursion chain returns `3 * 2 * 1`.

### 4. Tips for Thinking Recursively
To think recursively, visualize the problem like an onion. Peeling each layer brings you closer to the center. The center of the onion represents the base case, and the peeling process denotes the recursive case.

Remember that a complex problem often contains smaller, simpler sub-problems. You can trust these sub-problems to be solved correctly, culminating in an elegant solution.

### 5. Another Example of Recursive Function
Let's develop a function that calculates the sum of an integer's digits. Normally, it would involve using a `while` loop, but with recursion, it is done much more easily:

    class Main {
      static int sumOfDigits(int num) {
        // Base case: if num is less than 10, return num itself
        if(num < 10) {
          return num; 
        }
        else {
          return num % 10 + sumOfDigits(num / 10); // Recursive case
        }
      }
    
      public static void main(String args[]) {
        System.out.println(sumOfDigits(12345)); // Will print out 15 (1+2+3+4+5)
      }
    }
In this example, we use the same principle as with factorial calculation, but we pass `num / 10` to the next recursion call, chopping off the last digit every time.

