<h1 align='center'> Course 2: Mastering Algorithms and Data Structures in Java </h1> 

# Course 2.2: Sorting and Searching Algorithms in Java
## Lesson 1: Recursion Refreshment in Java
### 1. Understanding Recursion
Consider a stack of books. Want the bottom one? You'll need to remove each book above it, one by one. It's a recurring action — an example of recursion. In programming, recursion encompasses a function calling itself repeatedly until a specific condition is met, similar to descending stairs one step at a time until you reach the ground.

Here's a simple `Java` function illustrating recursion:
``` java
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
```
This function keeps calling itself with `x` getting lower by one until `x <= 0`, which is our base case. At this point, it stops the recursion.

### 2. Defining the Base Case
The base case acts like a friendly signpost, telling the recursion when to stop. In our book stack example, reaching a point where no more books are left to remove serves as the signal. Similarly, `x <= 0` is our base case in our function. The base case is crucial as it prevents infinite recursion and related errors.

### 3. Defining the Recursive Case
The recursive case is an essential aspect of recursion — the rule responsible for creating smaller versions of the original problem. Each call brings us a step closer to the base case. Let's use the process of calculating a factorial as an illustrative example.

To find a factorial, we multiply a number by the factorial of the number minus one, and repeat this process until we get to one (our base case):

``` java
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
```
In this case, we call `factorial(3)`, it returns `3 * factorial(2)`, where `factorial(2)` returns `2 * factorial(1)`. As `factorial(1)` is a base case, it returns 1. As a result, the whole recursion chain returns `3 * 2 * 1`.

### 4. Tips for Thinking Recursively
To think recursively, visualize the problem like an onion. Peeling each layer brings you closer to the center. The center of the onion represents the base case, and the peeling process denotes the recursive case.

Remember that a complex problem often contains smaller, simpler sub-problems. You can trust these sub-problems to be solved correctly, culminating in an elegant solution.

### 5. Another Example of Recursive Function
Let's develop a function that calculates the sum of an integer's digits. Normally, it would involve using a `while` loop, but with recursion, it is done much more easily:
``` java
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
```
In this example, we use the same principle as with factorial calculation, but we pass `num / 10` to the next recursion call, chopping off the last digit every time.

#### Practice #1
Run the code.
``` java
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
```

#### Practice #2
Let's refine our digit counter to be more selective. Modify the existing countDigits function so that it tallies up only the even digits of a number. Use what you've learned about conditional checks and recursion to accomplish this stellar task.

``` java
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
```
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
Review this code carefully. There's a subtle space anomaly causing an incorrect number of digits to be counted in our cosmic integer. Find and fix the glitch so we can accurately track the stars again!
``` java
    class Solution {
      static int countDigits(int num) {
        if(num < 10) {
          return 1;
        } else {
          return 1 + countDigits(num / 10); // Recursive execution to count remaining digits
        }
      }
    
      public static void main(String args[]) {
        System.out.println(countDigits(9876)); 
      }
    }
```
###### Questions I asked Cosmo:
* Should I be editing the if block?
        Great question! Yes, the if block is important here.
        
        Ask yourself: for a single-digit number, how many digits should be counted? What should the function return in that case?
        
        Try adjusting the return value in the if block to match the correct count for a single-digit number.

#### Practice #4
You will need to help calculate the sum of all digits in a star code number. Replace the TODO with the recursive magic that will do the trick.

    class Solution {
        // Recursive method to calculate the sum of digits of a number
        static int countStars(int number) {
            if(number == 0) return 0; // Base case: if number is 0, stop recursion
            // TODO: Add the recursive logic to sum up the digits of 'number'
            else 
                return number % 10 + countStars(number / 10);
        }
    
    
        public static void main(String[] args) {
            System.out.println(countStars(4042)); // Will print the sum of digits of the star code 4042
        }
    }

###### Question(s) I asked Cosmo:
* How do you write an else block when the if statement does not start a block?

        Great question! In Java, if your if statement does not use curly braces {}, it only applies to the next single statement. If you want to add an else, you just write it right after the if statement, like this:

        if (condition)
            return something;
        else
            return somethingElse;
        But if you have more than one statement in either branch, use curly braces. Does that help clarify?

## Lesson 2: Binary Search: From Concept to Java Implementation and Complexity Analysis
### 1. Understanding Binary Search
Binary Search begins at the midpoint of a sorted list, halving the search area at each step until it locates the target. For example, if we were to look for the number `8` in a sorted list that ranges from `1` to `10`, we would begin at `5`. Since `8` is larger than the midpoint, we would look within the second half of the list, leaving us with numbers `6` to `10`. Within the remaining list, the middle number is `8`; thus, we've found our number.

### 2. Coding Binary Search in Java
Let's see how Binary Search can be implemented in Java, taking a recursive approach. This process involves a function calling itself—with a base case in place to prevent infinite loops—and a recursive case to solve more minor parts of the problem.

``` java
    public int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) return -1; // Base case
        int mid = start + (end - start) / 2; // Find the midpoint
        if (arr[mid] == target) return mid; // Target found
        if (arr[mid] > target) // If the target is less than the midpoint
            return binarySearch(arr, start, mid - 1, target); // Search the left half
        return binarySearch(arr, mid + 1, end, target); // Search the right half
    }
```
Within this code, the base case is defined first. If the start index is greater than the end index, it indicates the search area is exhausted, resulting in a `-1` return. The code then locates the midpoint. If the midpoint equals our target, it’s returned. Depending on whether the target is less or more than the midpoint, the search continues within the left or right half, respectively.

### 3. Analyzing the Time Complexity of Binary Search
Let's analyze the time complexity of Binary Search, which measures how much time an algorithm takes increases with the input size. Notably, Binary Search halves the list at every step, necessitating log(`n`) steps for an array of size `n`. Therefore, the time complexity of Binary Search is O(log n).

### 4. Implementing Binary Search Iteratively
You can also implement the Binary Search algorithm in an iterative way using a while loop. Here is the Java code for the iterative approach.
``` java
    public int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] == target) return mid;
    
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
```
Instead of dividing the array recursively in this code, we use a while loop, which continues until the start index is equal to or less than the end index.

The middle element is found the same way as in the recursive approach. We have found the target if the target is equal to this middle element. On the other hand, if the target is greater than the middle element, we adjust the start index to be one position after the middle index. However, if the target is less than the middle element, we adjust the end index to be one position before the middle index.

### 5. Comparing Recursive and Iterative Approaches
Both the recursive and iterative versions of the Binary Search algorithm have a time complexity of O(log(n)), which makes them both very efficient.

However, the iterative version generally uses less memory space than the recursive one. Every recursive call adds a layer onto the system call stack, a part of memory where information about the active subroutines in a program is stored. If the recursion gets too deep, it could result in stack overflow errors.

On the upside, some developers find recursive code easier to understand and debug because it often leads to simpler and cleaner code.

Finally, the choice between recursion and iteration can depend on the specifics of the problem being tackled, the performance characteristics of the specific system you're working on, and personal or team preferences. Both methods have their place in a programmer's toolkit.

#### Practice #1
Run the code.

``` java
    class Solution {
        static int binarySearchForBook(int[] bookIDs, int start, int end, int searchID) {
            if (start > end) return -1; // Base case
            int mid = start + (end - start) / 2; // Find the midpoint
            if (bookIDs[mid] == searchID) return mid; // Target found
            if (bookIDs[mid] > searchID) // If the target is less than the midpoint
                return binarySearchForBook(bookIDs, start, mid - 1, searchID); // Search the left half
            return binarySearchForBook(bookIDs, mid + 1, end, searchID); // Search the right half
        }
    
        public static void main(String[] args) {
            int[] bookIDs = {101, 203, 307, 404, 513, 628, 734, 850, 961};
            int searchID = 404;
            int bookIndex = binarySearchForBook(bookIDs, 0, bookIDs.length - 1, searchID);
            if (bookIndex != -1)
                System.out.println("Book with ID " + searchID + " is at index: " + bookIndex);
            else
                System.out.println("Book with ID " + searchID + " not found.");
        }
    }
```
#### Practice #2
Now, for a slight twist: adjust the binarySearchBook method so that it returns the index where the book should be inserted if it's not found. This will require a subtle change to the return value when the book ID is not present in the array. Don't forget to modify the print statement to reflect new logic.

``` java
    class Solution {
        static int binarySearchForBook(int[] bookIDs, int start, int end, int searchID) {
            if (start > end) return start; // Base case
            int mid = start + (end - start) / 2; // Find the midpoint
            if (bookIDs[mid] == searchID) return mid; // Target found
            if (bookIDs[mid] > searchID) // If the target is less than the midpoint
                return binarySearchForBook(bookIDs, start, mid - 1, searchID); // Search the left half
            return binarySearchForBook(bookIDs, mid + 1, end, searchID); // Search the right half
        }
    
        public static void main(String[] args) {
            int[] bookIDs = {101, 203, 307, 404, 513, 628, 734, 850, 961};
            int searchID = 367;
            int bookIndex = binarySearchForBook(bookIDs, 0, bookIDs.length - 1, searchID);
            if (bookIndex != -1)
                System.out.println("Book with ID " + searchID + " should be placed at the new index." + bookIndex);
            else
                System.out.println("Book with ID " + searchID + " should be placed at the new index.");
        }
    }
```
###### Questions I asked Cosmo:
* Should I be editing the base case?

        Great question! Yes, you do need to edit the base case, but not in the way you currently have it.
        
        Think about what index you should return if the searchID is not found. Where would you insert it to keep the array sorted?
        What value of start or end represents the correct insertion point?
        Try to reason about what should be returned when start > end. Give it a shot!

* Should I instantiate the binarySearchForBook function?
    
        No need to instantiate or call the function again in your base case! That’s actually causing your infinite recursion (and the stack overflow error).
        
        Instead, think about what value you should return when start > end.
        
        What index represents the correct place to insert the searchID to keep the array sorted?
        Try returning that index directly in the base case. Give it a try!

* What do you mean the index but not the value?
    
        Great question! In Java, bookIDs[3] gives you the value at index 3 (which is 404), not the index itself.
        
        But you want to return the position (the index) where the new book ID should be inserted. For example, if the correct spot is after index 2, you should return 3 (the index), not bookIDs[3].
        
        So, in your base case, what variable represents the correct index to insert the new ID?

###### feedback:

#### Practice #3
We have a series of book IDs sorted in a space database, and your task is to find a specific book using Binary Search. It appears there is a warp breach in the current code; it's not locating the books correctly, falling into an infinite recursion. Can you identify and repair the malfunction?

Original
``` java
    class Solution {
        static int findBookIndex(int[] ids, int start, int end, int bookId) {
            if (start > end) return -1; // Base case: Book not found
            int mid = start + (end - start) / 2; // Find the midpoint
            if (ids[mid] == bookId) return mid; // Book found
            if (ids[mid] > bookId)
                return findBookIndex(ids, start, end, bookId); // Check the left half
            return findBookIndex(ids, mid, end, bookId); // Check the right half
        }
    
        public static void main(String[] args) {
            int[] bookIds = {2, 4, 6, 8, 10, 12}; // Sorted array of books by IDs
            int bookToFind = 2; // ID of the book to find
            System.out.println(findBookIndex(bookIds, 0, bookIds.length - 1, bookToFind)); // Outputs: 0
        }
    }
```
Fixed



#### Practice #4
#### Practice #5
#### Practice #6
