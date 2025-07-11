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

#### Practice #1
Run the code.

    class Solution {
        static int countDigits(int number) {
            // Base case: if number is less than 10, it's a single-digit number
            if (number < 10) {
                return 1;
            } else {
                // Recursive case: chop off one digit and count the rest
                return 1 + countDigits(number / 10);
            }
        }
    
        public static void main(String[] args) {
            System.out.println("Number of digits in 1234: " + countDigits(1234)); // Should print 4
        }
    }


#### Practice #2
Let's refine our digit counter to be more selective. Modify the existing countDigits function so that it tallies up only the even digits of a number. Use what you've learned about conditional checks and recursion to accomplish this stellar task.

    class Solution {
      // Function to count the number of digits in a number using recursion
      static int countDigits(int num) {
        if(num == 0) {
          return 0;
        } else {
            if (num % 2 == 0) {
              return 1 + countDigits(num / 10) ;
            }
          // Recursive case: reduce the number by dividing by 10 and count the rest
            else {
              return countDigits(num / 10);
          }
        }
      }
    
      public static void main(String args[]) {
        System.out.println("The number of digits in the 'diameter of Mars': " + countDigits(7623));
      }
    }

###### Questions I asked Cosmo:

* Am I supposed to modify the else block?

        Yes, you’ll need to modify the else block! Right now, it counts every digit.
        
        What could you add so it only counts the digit if it’s even? Try thinking about how you’d check if a digit is even, and where that check should go
  
* Do you use n% to check for even or odd?

        Great question! You can use num % 2 to check if a number is even or odd:
        
        If num % 2 == 0, the number is even.
        If num % 2 == 1, the number is odd.
        How could you use this check to only count even digits in your function?
* How am I supposed to add this condition without another conditional block?

        Great observation! To count only even digits, you’ll need two things:
        
        A base case for when the number is 0 (to stop recursion).
        A way to check if the last digit is even, and only add to your count if it is.
        You can use an if...else or a conditional (ternary) operator.
        Would you like a hint on how to structure the condition?

* So I need to add an additional conditional block instead of just adjusting the provided else block?

        Exactly! You’ll want to check two things:
        
        Is the number done (base case)?
        Is the last digit even or odd?
        This usually means you’ll need an if for the base case, and then inside the recursive part, another condition to decide whether to count the digit or not. Want a hint on how to structure that?

#### Practice #3
#### Practice #4
