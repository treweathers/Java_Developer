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
    System.out.println(sumOfDigits(125)); // Will print out 15 (1+2+3+4+5)
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
        System.out.println("Number of digits in 12334: " + countDigits(1234)); // Should print 4
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

```java
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
```
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
``` java
class Solution {
    static int findBookIndex(int[] ids, int start, int end, int bookId) {
        if (start > end) return -1; // Base case: Book not found
        int mid = start + (end - start) / 2; // Find the midpoint
        if (ids[mid] == bookId) return mid; // Book found
        if (ids[mid] > bookId)
            return findBookIndex(ids, start, mid - 1, bookId); // Check the left half
        return findBookIndex(ids, mid + 1, end, bookId); // Check the right half
    }

    public static void main(String[] args) {
        int[] bookIds = {2, 4, 6, 8, 10, 12}; // Sorted array of books by IDs
        int bookToFind = 2; // ID of the book to find
        System.out.println(findBookIndex(bookIds, 0, bookIds.length - 1, bookToFind)); // Outputs: 0
    }
}
```

#### Practice #4
Now, let’s see if you can find our missing book in the library by implementing Binary Search. Fill in the blanks, and may your logic be ever clear!
```java
class Solution {
    static int findBook(String[] books, int start, int end, String target) {
        // TODO: Add base case condition to stop recursion
        if (start > end) return -1;
        
        int mid = start + (end - start) / 2;
        if (books[mid].equals(target)) return mid; // Book found
        
        // TODO: Compare mid book to target book using String.compareTo() method
        //;
        // TODO: Finish the recursive call for searching halves of the array
        if (books[mid].compareTo(target) > 0)
            return findBook(books, start, mid - 1, target);
        return findBook(books, mid + 1, end, target);
    }
    
    public static void main(String[] args) {
        String[] library = {"Alice in Wonderland", "Moby Dick", "The Great Gatsby", "War and Peace"};
        String bookToFind = "The Great Gatsby"; // Book we want to find
        int result = findBook(library, 0, library.length - 1, bookToFind);
        System.out.println("The book '" + bookToFind + "' is at index: " + result);
    }
}
```
###### Questions I asked Cosmo:
* Should I be adding *2* if statements?

        Good question! You definitely need a base case and then conditions to decide which half to search next. How many distinct cases do you think the comparison between the middle book and the target can produce?

* Remind me of the basics of the String.compareTo method

        Sure! String.compareTo compares two strings lexicographically and returns:
        
        A negative number if the first string is less than the second,
        Zero if they are equal,
        A positive number if the first string is greater than the second.
        How could you use this to decide which half of the array to search next?

#### Practice #5
Run the code.
```java
class Solution {
    static int findBook(int[] books, int bookID) {
        int low = 0;
        int high = books.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (books[mid] == bookID) return mid; // Book found at mid index.
            if (books[mid] < bookID) low = mid + 1; // Search in the right half.
            else high = mid - 1; // Search in the left half.
        }
        return -1; // Book not found.
    }

    public static void main(String[] args) {
      int[] bookCatalog = {1001, 1005, 1010, 1012, 1018, 1023}; // Sorted array of book IDs
      int bookToFind = 1012;
      int bookPosition = findBook(bookCatalog, bookToFind);
      System.out.println(bookPosition); // Expected output is 3 (0-based index)
    }
}
```

#### Practice #6
Add the two key parts of the iterative binary search by yourself. Write down the code to complete the core of the our algorithm!
```java
class Solution {
    static int findBook(int[] catalog, int bookCode) {
        int left = 0;
        int right = catalog.length - 1;
        
        while (left <= right) {
            // TODO: implement this
            int mid = left + (right - left) / 2;
            if (catalog[mid] == bookCode) return mid;
            if (catalog[mid] < bookCode) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Book not found
    }

    public static void main(String[] args) {
        int[] sortedCatalog = {101, 123, 137, 150, 165, 172, 189, 205, 220};
        int bookCode = 150;
        System.out.println("Book found at index: " + findBook(sortedCatalog, bookCode));
    }
}
```
## Lesson 3: Advanced Binary Search Techniques for Complex Data Structures
### 1. Introduction to Advanced Binary Search Problems
In today’s lesson, we’ll stretch our algorithmic muscles by exploring sophisticated variations of binary search. By now, you're familiar with the classic search through sorted data, but what happens when that data becomes more complex? By using advanced binary search, we can efficiently navigate through **bitonic arrays** and **rotated arrays**. Let's dive deeper into each problem and see how we can apply binary search in ways you might encounter during a challenging technical interview or in a complex software development task.

### 2. Problem 1: Searching in a Bitonic Array
Consider a scenario where you're dealing with a dataset akin to a roller coaster ride — you start with a steady climb (ascending values), reach the summit (the peak value), and then take a thrilling dive (descending values). This is precisely what a bitonic array resembles. For instance, if you track the hourly temperature readings over a day, the temperature may increase until noon and then decrease towards the evening, forming a bitonic pattern.

### 3. Naive Approach
Walking through each temperature reading individually to find a specific value would be the most straightforward approach. It's simple but inefficient, especially if you have a large dataset. You'd end up with linear, O(n) complexity because you'd potentially check every single number in the array — quite the opposite of efficient.

### 4. Efficient Approach Explanation
To optimize, we must embrace the bitonic property of the dataset. We'll first target the day's peak temperature with a modified binary search. Once we've found that, the array effectively splits into two: ascending and descending. We conduct another binary search adapted to the respective sequence direction for each of these.

### 5. Solution Building - Finding the Peak
```java
public static int findPeak(int[] temperatures) {
    int low = 0, high = temperatures.length - 1;
    while (low < high) {
        int mid = low + (high - low) / 2;
        if (temperatures[mid] > temperatures[mid + 1]) {
            high = mid;
        } else {
            low = mid + 1;
        }
    }
    return low; // This is the index of the peak temperature.
}
```
In `findPeak`, we're not just looking for a high value; we're searching for the pinnacle. A peak temperature in a bitonic array is greater than its neighbors. We use binary search logic to divide our search area efficiently until we isolate this peak.

### 5. Solution Building - Modified Binary Search
Now, we initiate a binary search to the left (ascending portion) and the right (descending portion) of the peak index to determine if our target temperature exists:

```java
public static int binarySearch(int[] temperatures, int low, int high, int targetTemp, boolean ascending) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (temperatures[mid] == targetTemp) {
            return mid;
        }
        if (ascending ? temperatures[mid] < targetTemp : temperatures[mid] > targetTemp) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}
```

Notice how we've adapted `binarySearch` by adding an `ascending` flag. This determines whether we're on the part of the ride that goes up or down. Our condition for moving the `low` and `high` pointers changes based on the direction we're "searching."

### 6. Solution Building – Final Steps
Our final step is to implement the `searchBitonicArray` function, which first finds peak and then applies binary search to both parts of the array:

```java
public static int searchBitonicArray(int[] temperatures, int targetTemp) {
    int peakIndex = findPeak(temperatures);
    int searchResult = binarySearch(temperatures, 0, peakIndex, targetTemp, true);
    if(searchResult != -1) {
        return searchResult;
    } else {
        return binarySearch(temperatures, peakIndex + 1, temperatures.length - 1, targetTemp, false);
    }
}
```

### 7. Problem 2: Minimum Element in a Rotated Sorted Array
Picture a scenario where you're sorting through a collection of books arranged by publish date, and for some reason, they've gotten mixed up. You now have a series where some books have been shifted from the beginning to the end, and you must find the oldest book. This is the essence of a rotated sorted array.

### 8. Naive Approach
Unshuffling the books to their original order and picking the first one could work, but it isn’t necessary. It would take extra time and might not be practical, especially if you're dealing with a large inventory.

### 9. Efficient Approach Explanation
A smarter way is to use binary search to find the point of rotation, which indicates the oldest book. It's like finding the index of the minimum publish date without re-sorting the entire array.

### 10. Solution Building
```java
public static int findMin(int[] publishDates) {
    int left = 0, right = publishDates.length - 1;
    while (left < right) {
        int mid = left + (right - left) / 2;
        if (publishDates[mid] > publishDates[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }
    return publishDates[left]; // This is the oldest book's publish date.
}
```
With `findMin`, we’re doing almost the same trick as with `findPeak` in the previous problem. We keep narrowing our search region until we hone in on the oldest book.

### 11. Lesson Summary
We've now seen binary search in a new light — as adaptable, precise, and incredibly useful in scenarios that extend beyond straight-line, uniform datasets. Whether tracking temperatures, organizing books, or sorting other ordered information, binary search can serve as our algorithmic compass, helping us efficiently navigate through ordered data that has taken on an unexpected shape. Remember, algorithms are tools, and like any good craftsman, knowing when and how to use them is the hallmark of proficiency. Now it's time to apply these learnings practically, so let's move on to some exercises where you can further refine these advanced binary search skills.

#### Practice #1
You have an array of unique numbers forming a 'bitonic sequence'. Now, that's a fancy term for a sequence that first increases, hits a peak, and then decreases. Just picture a cosmic roller coaster ride!

Your mission? Create a function, findPosition, that returns the 'index' of a given number, 'x', from that array. If 'x' is in hyperspace and not in our sequence, return -1.

Let's be precise: an input to findPosition is a number you want to locate, and the output is either the number's first occurrence position or -1 if the number does not exist. Now, go supe up your code engines, Voyager! You got this!

```java
class Solution {
    public static int findPosition(int arr[], int x) {
        // TODO: find peak
        int peakIndex = findPeak(arr);
        int searchResult = binarySearch(arr, 0, peakIndex, x, true);
        // TODO: search to the left of the peak
        if (searchResult != -1) {
            return searchResult;
        // TODO: search to the right of the peak
        } else {
            return binarySearch(arr, x, peakIndex + 
             + 1, arr.length - 1, false);
        }
    }

    static int findPeak(int arr[]) {
        int low = 0, high = arr.length - 1;
        // TODO: implement this
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (ascending) {
                if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                // TODO: implement the descending binary search logic
                if (ascending ? arr[mid] < x : arr[mid] > x) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-3, -2, 4, 6, 10, 8, 7, 1};
        int x = 7;
        int position = findPosition(arr, x);
        if (position == -1) {
            System.out.println("Element Not Present");
        } else {
            System.out.println("Element Present at Index " + position);
        }
    }
}
```
#### Practice #2
You're navigating through a galaxy of integers, when suddenly your radar picks up a cyclically sorted array. This isn't ordinary sorting, oh no! It's sorted in decreasing order, but a pesky asteroid has bumped some numbers from the tail to the front. Your mission, should you choose to accept it, is to find the largest element in this array.
```java
class Solution {
    public static void main(String[] args) {
       int[] nums = new int[] {4, 3, 2, 1, 7, 6, 5};
       System.out.println(findMax(nums));  // Output: 7
       
       int[] nums2 = new int[] {3, 2, 1};
       System.out.println(findMax(nums2));  // Output: 3
       
       int[] nums3 = new int[] {6, 5, 4, 3, 2, 1, 7};
       System.out.println(findMax(nums3));  // Output: 7
    }

    public static int findMax(int[] nums) {
        int left = 0, right = nums.length - 1;
        // implement iterative binary search
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
```

###### Questions I asked Cosmo:
* What is it reflecting right now?

        Your current code is finding the minimum element in a rotated increasing sorted array, not the maximum in a rotated decreasing one. How could you adjust the comparison to reflect the decreasing order rotation?

## Lesson 4: Sorting with Quick Sort: Understanding the Algorithm and Its Java Implementation
### 1. Introduction
Hello, curious learners! Today, we will embark on a journey through the **Quick Sort** world. Picture yourself organizing various items - like toys or books - by size or color. That's what Quick Sort does with spectacular speed. Are you ready to explore further? Fantastic! Let's get started.

### 2. Quick Sort: A Brief Overview
**Quick Sort** is a clever little algorithm invented by a British computer scientist named Tony Hoare in 1959. It uses a strategy called 'divide-and-conquer' to put elements in order. Quick Sort takes an array, selects a particular "pivot" element, and then places everything smaller than the pivot on one side and everything larger on the other.

### 3. How Quick Sort Operates
Quick Sort has a three-step process:

1. Pick a random "pivot" element from the array.
2. Move all elements smaller than the pivot to one side and bigger ones to the other. This operation effectively divides the array into two parts, guaranteeing that all the elements will be kept within their part until the end of the sorting process.
3. Repeat steps 1 and 2 for each part until there are no more unsorted elements.
For example, if we have nine marbles numbered `[3, 9, 4, 7, 5, 1, 6, 2, 8]` and our chosen marble, or pivot, is 7, then after one round of sorting, we'll get [`3, 4, 5, 1, 6, 2, 7, 9, 8]`. It seems that this is a minor change, but now the pivot element is in its correct position, and we can think of the first half of the array `[3, 4, 5, 1, 6]` and `[9, 8]` separately as they won't ever intersect again.

### 4. Quick Sort in Java - Defining the Partition Process
Let's translate these steps into a concrete `Java` program. We'll tackle it part by part. Our first step is to partition an array around a pivot. In the `Java` world, we need to write a method, let's call it `partition()`, to handle this:

```java
int partition(int[] arr, int start, int end) {
    int pivot = arr[end]; // choosing the last element as pivot
    int i = (start - 1);  // marking the index of smaller element

    for (int j = start; j < end; j++) {
        // checking if the current element is smaller than the pivot
        if (arr[j] <= pivot) {
            i++;

            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
In this portion of the code, we selected the last element as the pivot and placed smaller elements on the left.

1. The function starts by initializing `i` to one index before the `start`. This `i` basically keeps track of the latest position where an element has been swapped because it was less than or equal to the pivot. If `arr[j]` is less than or equal to the pivot, `i` is incremented and then `arr[j]` is swapped with `arr[i]`. Essentially, smaller elements get pushed towards the front of the array (or the given part of the array).

The `start` and `end` parameters control which part of the given array is under the partition operation. Using these parameters, we can apply partition to some part of the array, which will be helpful later.

### 5. Exchanging Pivot and Finalizing Partition
After partitioning, we still need to place the pivot properly in the already partitioned list. We'll add this in the next part of our `partition()` method:

```java
    // Swap arr[i+1] and arr[end] (or pivot)
    int temp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = temp;

    return (i+1); // return the partition point
```
Now our `partition()` method is complete! It partitions the array around the pivot and ensures it is in its correct position.

### 6. Implementing Quick Sort Recursive Mechanism
Next up is the `quickSort()` method. It will use our `partition()` method to sort the left and right portions of the array recursively. Let's code that step-by-step. First, it should call the partitioning process:

```java
void quickSort(int[] arr, int start, int end) {
    if (start < end) {
        int pivot_index = partition(arr, start, end);
    }
    // Ready to split!
}
```
This function has yet to do much, but it's a strong start. We've managed to partition our list around a pivot point.

### 7. Continuously Sorting Left and Right Partitions
We must teach our `quickSort()` method to keep sorting smaller and larger partitions. We do this by simply calling itself recursively for these partitions:

```java
void quickSort(int[] arr, int start, int end) {
    if (start < end) {
        int pivot_index = partition(arr, start, end);
        quickSort(arr, start, pivot_index - 1); // sort left part
        quickSort(arr, pivot_index + 1, end);  // sort right part
    }
}
```
And that's it! Our Quick Sort implementation is complete. It initially partitions the array and then continues sorting each partition until everything is sorted.

### 8. Deciphering Efficiency of Quick Sort
The efficiency or "time complexity" of Quick Sort varies. When sorting items, usually the more unique items, the quicker it is. In the "best" and "average" situations, Quick Sort works like a charm with a time complexity of O(n∗log(n)). However, in the "worst" situation, where many items are the same (like a pile of identical blocks), it may take more time, resulting in a time complexity of O(n^2).

### 9. Summary and Next Steps
Great job! We've untangled the concept of Quick Sort, broken it down piece by piece, and implemented it in Java. Now comes the fun part: we will reinforce what you've learned with practical exercises. Ready to dive in?

#### Practice #1
Imagine you want to sort a small lineup of space rocks by their mass before safely storing them in the ship's cargo bay. But before moving to the actual sorting, you need to utilize the partition process! The given code accomplishes exactly that using the first element as the pivot. Click Run to observe how the space rocks (represented by numbers) are organized around the pivot!
```java
class Solution {
    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;

        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[start] = arr[i];
        arr[i] = pivot;

        return i;
    }

    public static void main(String[] args) {
        int[] items = {7, 3, 2, 10, 9, 5, 6, 9, 2, 3};
        int pivotIndex = partition(items, 0, items.length - 1);

        System.out.println("Pivot Index: " + pivotIndex);
        for (int item : items) {
            System.out.print(item + " ");
        }
    }
}
```
#### Practice #2
Stellar job, Space Wanderer! Now, let's write the code to find the position where we'll label our 'pivot star' amid the galaxy of numbers. It's a small step in the Quick Sort cosmos!
```java
class Solution {
    static int partitionCelestial(int[] magnitudes, int start, int end) {
        int pivot = magnitudes[end];
        int i = start - 1;
        // TODO: Implement the partition loop
        for (int j = start; j < end; j++) {
          if (magnitudes[j] <= pivot) {
            i++;
            int temp = magnitudes[i];
            magnitudes[i] = magnitudes[j];
            magnitudes[j] = temp;
          }
        }
        int temp = magnitudes[i + 1];
        magnitudes[i + 1] = magnitudes[end];
        magnitudes[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
      int[] celestialMagnitudes = {5, 3, 0, -1, -2, 1};
      int pivotPosition = partitionCelestial(celestialMagnitudes, 0, celestialMagnitudes.length - 1);
      // Now, celestialMagnitudes is partitioned, with pivot in the correct position.
    }
}
```
#### Practice #3
In this exercise, you'll apply the Quick Sort algorithm you've mastered to sort space rock sizes collected during your intergalactic travels. Imagine you're cataloging these rocks by size to ensure they're correctly stored on your spaceship. Your challenge is to sort a set of values, much like organizing items by size for efficient storage. Click Run to initiate the sorting sequence and observe the organized list of space rock sizes!
```java
class Solution {
    static void quickSort(int[] sizes, int left, int right) {
        if (left < right) {
            int pi = partition(sizes, left, right);
            quickSort(sizes, left, pi - 1);  // Recursively sort left side
            quickSort(sizes, pi + 1, right); // Recursively sort right side
        }
    }

    static int partition(int[] sizes, int left, int right) {
        int pivot = sizes[right];
        int i = (left - 1);
        for (int j = left; j < right; j++) {
            if (sizes[j] < pivot) {
                i++;
                int temp = sizes[i];
                sizes[i] = sizes[j];
                sizes[j] = temp;
            }
        }
        int temp = sizes[i + 1];
        sizes[i + 1] = sizes[right];
        sizes[right] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] celestialSizes = {3, 5, 2, 1, 9, 5, 7, 8}; // Unsorted space rock sizes
        quickSort(celestialSizes, 0, celestialSizes.length - 1);
        for (int size : celestialSizes) {
            System.out.print(size + " ");
        }
    }
}
```
#### Practice #4
You're doing great, Space Voyager! Now, let's see if you can implement Quick Sort on your own. Specifically, I need you to write the recursive part that deals with sorting the left and right partitions of our space objects. May your code be as swift as comets!

```java
class Solution {
    // Function to perform the Quick Sort
    static void quickSort(int[] spaceObjects, int start, int end) {
        if (start < end) {
            int pivot_index = partition(spaceObjects, start, end);
            // TODO: Implement recursive quickSort call to sort the elements to the left of the pivot
            quickSort(spaceObjects, start, pivot_index - 1);
            // TODO: Implement recursive quickSort call to sort the elements to the right of the pivot
            quickSort(spaceObjects, pivot_index + 1, end);
        }
    }

    // Helper function to partition the array (uses logic from the lesson)
    static int partition(int[] arr, int start, int end) {
        // This part is complete, no changes needed here.
        int pivot = arr[end];
        int i = (start - 1);
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return (i+1);
    }

    // Main method to test the quickSort function (Complete, do not change)
    public static void main(String[] args) {
        int[] spaceObjects = {109, 76, 45, 32, 88}; // Masses of celestial objects (in arbitrary units)
        quickSort(spaceObjects, 0, spaceObjects.length - 1); // Sorting celestial objects by their mass

        // The print statement is ready to verify your result.
        for (int mass : spaceObjects) {
            System.out.print(mass + ", ");
        }
    }
}
```
## Lesson 5: Demystifying Merge Sort: Implementation and Complexity Analysis in Java
### 1. Welcome to Merge Sort
Hello, aspiring programmers! Today's topic is the **"Merge Sort."** Merge Sort is a sorting technique like arranging a deck of shuffled cards in order. But for data on the Internet scale, Merge Sort outperforms your regular techniques. Today, we'll explore Merge Sort, code it in `Java`, and analyze its speed. Ready? Let's get started!

### 2. What is Merge Sort?
In computer science, **Merge Sort** is a popular method to sort elements. Merge Sort uses the same 'divide-and-conquer' strategy for sorting, like the familiar **Quick Sort** algorithm. Imagine if you have one long music playlist mixed up with songs. You want to sort these songs from A to Z. That's what Merge Sort does to an array.

In the three steps of Merge Sort:

1. Split the array into halves.
2. Sort each half separately.
3. Merge the sorted halves back together.

### 3. Understanding the Merge Process
We will start with building a code for merging two sorted parts. The merge process makes two halves play sort and seek. It compares elements from two halves and merges so that the resulting list is sorted as well.

Let's code a `merge()` function in `Java` that will do just that. Note that the final variant of the merge sort function will do every operation "in place," meaning there will not be actual two arrays; we will operate parts of one array. Having this in mind, let's implement the `merge` function to take just one array and treat its parts like separate arrays.

```java
void merge(int arr[], int left, int mid, int right) {
    int n1 = mid - left + 1; // Find number of elements in the left array
    int Left[] = new int[n1]; // Define left array

    int n2 = right - mid; // Find number of elements in the right array
    int Right[] = new int[n2]; // Define right array

    // Let's fill in these arrays
    for (int i = 0; i < n1; i++)
        Left[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
        Right[j] = arr[mid + 1 + j];
}
```
So far, we've divided our original list into two halves, Left and Right.

### 4. Merging the Halves Back Together
Now, we'll sort and merge these halves:

```java
    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2) {
        if (Left[i] <= Right[j]) {
            arr[k] = Left[i];
            i++;
        } else {
            arr[k] = Right[j];
            j++;
        }
        k++;
    }
}
```
Seemingly tricky, the code is very straightforward: We place two pointers, `i` and `j`, at the beginning of the `Right` and `Left` arrays. We choose the smaller element, put it in the final array `arr`, and move the corresponding pointer further. We keep doing this until one of the pointers reaches the end of its array.

### 5. Handling Leftovers
We stop the process when one of the pointers reaches the end of its array, but some elements could be left in the other array.

To handle this, let's copy the remaining elements of both arrays (if any) to the end of the resulting `arr` array.

```java
    // Copy remaining elements of Left[] if any
    while (i < n1) {
        arr[k] = Left[i];
        i++;
        k++;
    }

    // Copy remaining elements of Right[] if any
    while (j < n2) {
        arr[k] = Right[j];
        j++;
        k++;
    }
```
The merge section is completed. It successfully merges two halves back together in the sorted order.

### 6. Implementing Divide and Conquer Strategy
Now, let's implement the method to divide the array into two halves. Coding-wise, we'll need to define a `sort()` method to split the array and manage the merge process. We will split the array and its halves recursively until we end up with small arrays of just one element, which are naturally sorted! Next, we will merge these arrays back together into one big sorted array.

### 7. Splitting the Array into Halves
Let's start building the `sort()` method. Initially, we'll handle the splitting part:

```java
void sort(int arr[], int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2; // Finding the midpoint
    
    }
}
```
Now, we can split our list into two halves, but they still need to be sorted.

### 8. Marshalling the Merge Process
Next, we need to sort these halves and merge them together:

```java
        sort(arr, left, mid); // Sorting the left half
        sort(arr, mid + 1, right); // Sorting the right half
        merge(arr, left, mid, right); // Merging the sorted halves
    }
}
```
Phew! We've now implemented our Merge Sort algorithm in `Java`.

### 9. Decoding Merge Sort Efficiency
In the computing world, performance matters. The less time it takes for a sorting algorithm to run, the better. Merge Sort shows good performance with the time complexity of `O(n log n),` similar to sorting a huge deck of cards quickly. Thus, it excels when dealing with massive data sets.

### 10. Strengths and Pitfalls of Merge Sort
Merge Sort is consistent. It's like a reliable late-night tutor that offers predictable performance, regardless of the initial order of the data input. It mimics a reliable friend who will not let down expectations.

However, it tends to use extra memory, creating new arrays during the merge process.

### 11. Ending Notes and Looking Ahead
Great job! We've broken down Merge Sort and coded it in `Java`. Next up, we have some exciting hands-on exercises for you. Ready to put what you've learned into practice? Let's dive into the fun part! Let's get coding!

#### Practice #1
Imagine sorting a large music library alphabetically to make it easier to search through. Difficult task, isn't it? Not with our algorithmic approach! We'll use the full Merge Sort algorithm to achieve this, focusing on the core sort() and merge() functions. Click Run to watch the harmony unfold!
```java
class Solution {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] musicLibrary = {9, 3, 1, 6, 8, 2, 5, 4, 7};
        mergeSort(musicLibrary, 0, musicLibrary.length - 1);

        for (int songID : musicLibrary) {
            System.out.print(songID + " "); // This will print "1 2 3 4 5 6 7 8 9"
        }
    }
}
```
#### Practice #2
Stellar Navigator, in the code provided, there's a bug causing the music tracks to be sorted incorrectly. Our advanced locators say that the bug should be in the merge process, specifically in the initial while loop. Find and fix the issue to ensure that the playlist is in perfect order for the intergalactic journey ahead.

Good luck!

```java
class Solution {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            // the bug should be somewhere here
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++; // it was missing this increment
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] musicLibrary = {3, 5, 1, 2, 6, 9, 8, 8, 3};
        mergeSort(musicLibrary, 0, musicLibrary.length - 1);

        for (int songID : musicLibrary) {
            System.out.print(songID + " ");
        }
    }
}
```

#### Practice #3
You're doing great! Let's fill in a crucial part of the merging process in our Merge Sort. Complete the missing code to merge the sorted halves.
```java
class Solution {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftPart[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightPart[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j]) {
                arr[k] = leftPart[i];
                i++;
            } else {
                arr[k] = rightPart[j];
                j++;
            }
            k++;
        }

        //TODO append leftover elements from leftPart and rightPart to the resulting array
        while (i < n1) {
            arr[k] = leftPart[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightPart[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] tracks = {11, 2, 5, 7, 8, 3, 6, 9, 10, 1};
        mergeSort(tracks, 0, tracks.length - 1);

        for (int songID : tracks) {
            System.out.print(songID + " "); 
        }
    }
}
```

#### Practice #4
Great progress, Stellar Navigator! Now it's time to take another step forward. In our musical sorting universe, the merge function is like combining melodies in harmony. Can you complete the crucial part of mergeSort function?
Add the missing code to sort the playlist into a perfect tune!
```java
class Solution {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // TODO: find mid element
            int mid = (left + right) / 2;
            // TODO: call mergeSort recursively for the left part
            mergeSort(arr, left, mid);
            // TODO: call margeSort recursively for the right part
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftPart = new int[n1];
        int[] rightPart = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftPart[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightPart[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftPart[i] <= rightPart[j]) {
                arr[k] = leftPart[i];
                i++;
            } else {
                arr[k] = rightPart[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightPart[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] tracks = {11, 2, 5, 7, 8, 3, 6, 9, 10, 1};
        mergeSort(tracks, 0, tracks.length - 1);

        for (int songID : tracks) {
            System.out.print(songID + " ");
        }
    }
}
```
## Lesson 6: Mastering Java's Built-in Sorting Functions: Arrays and Comparators
### 1. Lesson Introduction and Overview
Hello, and welcome back! Our journey today takes us into the sorting universe in Java. We will learn about and use Java's built-in `Arrays.sort()` function. Additionally, we will explore how Java's `Comparator` interface allows us to define custom sorting rules for more complex sorting scenarios.

These ready-to-use tools in Java simplify the task of sorting significantly. Let's get started!

### 2. Understanding Sorting and Its Importance
Sorting refers to arranging data in a specific order, which enhances the efficiency of search or merge operations on data. In real life, we sort books alphabetically or clothes by size. Similar concepts are applicable in programming, where sorting large lists of data for more effective analysis is a frequent practice.

### 3. An Introduction to Java's Built-in Sorting Function
Java offers a built-in sorting method, `Arrays.sort()`, to sort arrays. Here's a demonstration of how we use this method:

### 4. Sorting of Primitive Types and Objects
Sorting with `Arrays.sort()` makes sorting arrays of primitives a breeze. Let's see it in action!

**Sorting Arrays of Primitives**
```java
int[] arr = {4, 1, 3, 2};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4]
```

**Sorting Arrays of Objects**
```java
String[] inventory = {"Bananas", "Pears", "Apples", "Dates"};
Arrays.sort(inventory);
System.out.println(Arrays.toString(inventory));
// Output: [Apples, Bananas, Dates, Pears]
```
As you can see, sorting in Java is as simple as that!

### 5. More Complex Sorting Problem
Java's `Comparator` interface enables us to dictate the sorting order by setting custom rules. Let's sort a list of students by their grades, with alphabetical sorting applied in the event of ties in grades. Firstly, we define the `Student` class:

```java
class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int getGrade() {return this.grade;}
    public String getName() {return this.name;}
    public String toString() {
        return name + ":" + grade;
    }
}
```
Note that it has to have getters for its fields for the Comparator to work.

### 6. Custom Sorting with Comparator
Modern Java makes solving such sorting tasks straightforward. Here is how we do it using the `Comparator` interface:

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Alice", 85),
                        new Student("Bob", 90),
                        new Student("Charlie", 90)
                )
        );

        students.sort(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getName));

        System.out.println(students); // Output: [Bob:90, Charlie:90, Alice:85]
    }
}
```
In the above example, we create an `ArrayList` of `Student` objects and sort it using a custom `Comparator`. The `Comparator.comparing(Student::getGrade).reversed()` portion first creates a Comparator that compares Student objects based on their grades, and `reversed()` is used to reverse the natural ordering of the Comparator, thus ensuring that Students with higher grades come first.

If two students have the same grade, `thenComparing(Student::getName)` then compares the students based on their names in alphabetical order.

### 7. Applying Reverse Order to thenComparing
There is a small problem with the `reversed()` method. Imagine a situation where we want to sort students in ascending order by their grades but in descending order alphabetically. In this case, our previous tools won't work as expected:

```java
students.sort(Comparator.comparing(Student::getGrade).thenComparing(Student::getName).reversed());
// Result: [Charlie:90, Bob:90, Alice:85]
```
The `.reversed()` method reverses the sorted array, making both grades and names in descending order. To tackle this problem, we can pass the `Comparator.reverseOrder()` function as the second parameter of the `.thenComparing()` function:

```java
students.sort(Comparator.comparing(Student::getGrade).thenComparing(Student::getName, Comparator.reverseOrder()));
// [Alice:85, Charlie:90, Bob:90]
```
This way, only the names sorting gets reversed.

### 8. Lesson Summary and Next Steps
Well done! You've learned how sorting functions in Java work, including the use of Java's built-in `Arrays.sort()` function for basic sorting needs. Additionally, you explored how the `Comparator` interface allows you to define custom sorting rules, making it easy to handle more complex sorting scenarios effectively.

In our future lessons, we'll delve deeper into sorting and tackling more intricate problems, such as finding the K-th largest number. So, stay tuned and get ready to sort your way to success! Happy coding!

#### Practice #1
In managing our grocery store inventory, we've listed the initial quantities of some items. The given code will sort these quantities to help us better understand what we have in stock. Click Run to see the sorted list of item quantities.
```java
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] stockQuantities = {15, 60, 35, 2, 14};
        
        Arrays.sort(stockQuantities);
        
        System.out.println("Sorted stock quantities: " + Arrays.toString(stockQuantities));
    }
}
```

#### Practice #2
Great progress, Space Voyager! Now, let's put your skills to the test. We need to sort the grocery inventory alphabetically. Write the line of code that sorts the inventory array and display the sorted inventory.
```java
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        String[] inventory = {"Bananas", "Cherries", "Apples", "Dates"};
        // TODO: Sort the `inventory` array in alphabetical order and print it out.
        Arrays.sort(inventory);
        System.out.println("Grocery Inventory: " + Arrays.toString(inventory));
    }
}
```

#### Practice #3
Imagine you have a list of products for our Grocery store inventory and you want to quickly identify the most expensive items. The provided code will sort the products by price in ascending order. Click Run to see how the inventory is organized from the priciest to the most affordable!
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {return this.price;}

    public String toString() {
        return name + ": $" + price;
    }
}

class Solution {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>(
                Arrays.asList(
                        new Product("Milk", 2.99),
                        new Product("Bread", 1.99),
                        new Product("Eggs", 3.99)
                )
        );

        // Sorting the inventory by price in ascending order using Comparator.comparing
        inventory.sort(Comparator.comparing(Product::getPrice));

        System.out.println(inventory);
    }
}
```

#### Practice #4
Alright, Stellar Navigator! We've observed products sorted in ascending order by price. Your mission is to modify the Comparator logic in the starter code so that the inventory sorts in descending order by price. Remember, descending order means arranging from the highest to the lowest.

Let's enhance our inventory sorting skills!
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public String toString() {
        return name + ": $" + price;
    }
}

class Solution {
    public static void main(String[] args) {
        ArrayList<Product> inventory = new ArrayList<>(
            Arrays.asList(
                new Product("Apple", 1.99),
                new Product("Milk", 2.99),
                new Product("Bread", 2.49)
            )
        );

        // Sort products in descending order by price.
        inventory.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(inventory); 
    }
}
```
#### Practice #5
Excellent progress, Space Voyager! Your task now is to sort the grocery inventory by price in the ascending order. In case of a tie, sort by rating in the descending order. Write your own custom comparator using .comparing and .thenComparing functions to organize these space provisions from the lowest to the highest cost!
```java
import java.util.*;

// Grocery item class
class GroceryItem {
    String name;
    double price;
    double rating; // added field

    GroceryItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating; // added initialization
    }

    String getName() { return name; }
    double getPrice() { return price; }
    double getRating() { return rating; } // added getter

    @Override
    public String toString() {
        return name + ": $" + price + ", rating: " + rating;
    }
}

// Main class should be named 'Solution'.
class Solution {
    public static void main(String[] args) {
        ArrayList<GroceryItem> inventory = new ArrayList<>(
                Arrays.asList(
                        new GroceryItem("Milk", 2.99, 4.5),
                        new GroceryItem("Bread", 2.99, 4.7),
                        new GroceryItem("Eggs", 3.49, 4.3)
                )
        );

        // TODO: Sort grocery items by price and then by rating
        inventory.sort(Comparator.comparing(GroceryItem::getPrice).thenComparing(GroceryItem::getRating, Comparator.reverseOrder()));
        System.out.println(inventory);
    }
}
```
## Lesson 7: Advanced Sorting Techniques: K-th Ordinal Statistics and Counting Inversions
### Introduction to the Lesson
Welcome to this insightful session, where we aim to master the complexities of the illustrious applications of **sorting algorithms**. Today's voyage links two problems: **"Find the K-th Ordinal Statistic in a List" and "Count the Number of Inversions in a List"**. These problems mirror practical scenarios, and the efficient techniques used to solve them present valuable demonstrations of the application of sort algorithms. Solving these two problems, we'll see how Quick Sort and Merge Sort knowledge applies here and helps provide efficient implementations for both questions.

Let's dive into these captivating problems!

### 1. Problem 1: Find the K-th Ordinal Statistic in a List
Our first problem presents a list of integers and the number `k`. The challenge is finding the `k`-th smallest element in that given list. To further elucidate, `k` starts from `1`, so for `k = 1`, you are seeking to find the smallest element; if `k = 2,` you're searching for the second smallest element, and so on. By the conclusion of this lesson, you'll be highly skilled at performing this task!

### 2. Problem 1: Naive Approaches
A primary instinctive solution could involve iteratively identifying and discarding the smallest element from the list until you reach the `k`-th smallest element. While it sounds straightforward, this approach, unfortunately, incurs high time complexity due to the repetitive scans of the list to locate the smallest element. This solution has a O(n^2) complexity.

Another straightforward solution is just to sort the input array and return the `k`-th element:

```java
Arrays.sort(inputArray);
return inputArray[k - 1];
```
This approach has O(nlogn) complexity and is as simple as two lines of code. However, there are more efficient approaches than this, as there is an O(n) solution to this problem, using Quick Sort techniques we covered earlier in this course.

### 3. Problem 1: Efficient Approach Explanation
Sorting steps in here to offer an efficient solution! The Quick Sort algorithm, a splendid application of divide and conquer, can solve this problem more efficiently. By selecting the right pivot for partitioning, the input list is divided into two: a left partition, which contains elements less than the pivot, and a right partition, which includes elements greater than the pivot.

If the pivot's position after elements repartition is the same as `k`, we have the `k`-th smallest element. If `k` is less than the pivot's position, the task is carried forward on the left partition; otherwise, on the right partition.

### 4. Problem 1: Solution Building – Partition
Our Java solution mirrors this efficient approach as follows. Firstly, we define the partition procedure, the same way we do it in the quick sort:
```java
static int partition(int[] arr, int start, int end) {
    int pivot = arr[start];
    int i = start;

    for(int j = start + 1; j <= end; j++) {
        if(arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i];
    arr[i] = arr[start];
    arr[start] = temp;

    return i;
}
```

### 5. Problem 1: Solution Building – Main Logic
Then, we define the `findKthSmallest` algorithm, essentially working as a quicksort, but chasing a different goal:
```java
import java.util.*;

class Solution {
    public static int findKthSmallest(int[] numbers, int k) {
        if(numbers == null || numbers.length < k)
            return Integer.MIN_VALUE;
        return kthSmallest(numbers, 0, numbers.length - 1, k);
    }

    static int kthSmallest(int[] arr, int start, int end, int k) {
        if (k > 0 && k <= end - start + 1) {
            int pos = partition(arr, start, end);

            if (pos - start == k - 1) {
                return arr[pos];
            }

            if (pos - start > k - 1) {
                return kthSmallest(arr, start, pos - 1, k);
            }

            return kthSmallest(arr, pos + 1, end, k - pos + start - 1);
        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 2, 4, 2, 1, 6};
        System.out.println(findKthSmallest(numbers, 5));  // It should print 4
    }
}
```
After we form the partitions, we compare the pivot's position to `k`. If the positions match, our pivot is the `k`-th smallest element. If our `k` is smaller, we look at the left partition; otherwise, the right one.

### 6. Problem 2: Count the Number of Inversions in a List
Our second problem entails a list of integers; your task is to deduce the number of inversions in the list.

An inversion is a pair of elements where the larger element appears before the smaller one. In other words, if we have two indices `i` and `j`, where `i < j` and the element at position `i` is greater than the element at position `j (numbers[i] > numbers[j])`, we have an inversion.

For example, for `numbers = {4, 2, 1, 3}`, there are four inversions: `(4, 2)`, `(4, 1)`, `(4, 3)`, and `(2, 1)`.

### 7. Problem 2: Efficient Approach Explanation
In our quest for efficiency, the Merge Sort algorithm comes into play. At its core, Merge Sort is a divide-and-conquer-based sorting algorithm, providing an optimal efficiency of O(nlogn). However, we can cleverly modify this algorithm to count the number of inversions in the array while sorting it. This additional functionality doesn't impact the time complexity; therefore, it remains O(nlogn). So, how does this work?

The process starts by dividing the array into two halves, similar to how Merge Sort operates. Then, we recursively sort both array halves and merge them back. Here comes the twist in the tale: while merging these sorted halves, we add additional counting logic to keep track of inversions.

As the halves are already sorted, if an element of the right half is smaller than that of the left half, it's inverted. This is because the element from the right half should have been after 'all' the remaining elements of the left half in a sorted array. Thus, we don't just have a single inversion here, we have as many inversions as there are remaining elements in the left half.

By counting these inversions at each merge and adding them up, we get the total number of inversions in the array.

### 8. Problem 2: Solution Building – Supporting Class
Here is the Java solution based on the Merge Sort algorithm. First, let's define a supportive class to store our counter for each subarray:

```java
public class Result {
    public int[] sorted;
    public long inversions;

    public Result(int[] sorted, long inversions) {
        this.sorted = sorted;
        this.inversions = inversions;
    }
}
```
Then, implement the merge sort that keeps track of the amount of inversions:

```java
public Result countInversions(int[] arr) {
    if (arr.length <= 1) {
        return new Result(arr, 0);
    }
    int middle = arr.length / 2;
    Result left = countInversions(Arrays.copyOfRange(arr, 0, middle));
    Result right = countInversions(Arrays.copyOfRange(arr, middle, arr.length));
    Result result = mergeAndCountInversions(left.sorted, right.sorted);
    return new Result(result.sorted, left.inversions + right.inversions + result.inversions);
}

private Result mergeAndCountInversions(int[] left, int[] right) {
    int[] merged = new int[left.length + right.length];
    int i = 0, j = 0;
    long inversions = 0;
    for(int k = 0; k < merged.length; k++) {
        if (i < left.length && (j >= right.length || left[i] <= right[j])) {
            merged[k] = left[i++];
        } else {
            merged[k] = right[j++];
            inversions += left.length - i;
        }
    }
    return new Result(merged, inversions);
}
```
While performing the merge in Merge Sort, we have added an additional counter to track inversions. If we come across an element in the right array that is smaller than an element in the left, we increment the counter by the number of items remaining in the left array. These all form inversions as per our problem's definition.

### Lesson Summary
During today's lesson, we thoroughly inspected the advanced applications of Quick Sort and Merge Sort algorithms through the dissection of two exciting problems. We went from recognizing the issues, proposing naive methods, progressing towards efficient approaches, and executing the Java solutions.

### Practice Exercises
You're now ready to flex those coding muscles! We have covered a substantial amount of theory and strongly advocate that real-world application solidifies the lessons learned. Be prepared for the forthcoming exercises, where you'll apply the logic imbibed in this session to similar problems. Let's get hands-on!

#### Practice #1
Alright, Space Voyager, voyage with me into another intriguing scenario: Imagine you are tuning in to the Space Olympics, and the event you're witnessing features different alien species. You're curious about the top performers. However, all you've got is a huge array of scores, and you want to figure out the k-th highest score. Each integer in this array represents an alien's score and k starts from 1. k = 1 represents the highest score and so forth.

Your mission, should you choose to accept it, is to write a piece of code that gets you this k-th highest score given any set of scores. Handle different values of k and explore various arrays of scores.

Your input will be an array of integers indicating scores and a number k. As for the output, the score corresponding to the k-th highest position is expected.

Now go ahead and show us your cosmic intelligence, Space Voyager!
```java
import java.util.*;

class Solution {
    public static int findKthLargest(int[] numbers, int k) {
        if(numbers == null || numbers.length < k)
            return Integer.MIN_VALUE;
        return kthLargest(numbers, 0, numbers.length - 1, k);
    }

    static int kthLargest(int[] arr, int start, int end, int k) {
        if (k > 0 && k <= end - start + 1) {
            //TODO: use partition to find pivot's position
            int pos = partition(arr, start, end);
            //TODO: if pivot is in correct position, return the answer
            if (pos - start == k - 1) {
                return arr[pos];
            }
            //TODO: call kthLargest recursively in case position is greater than k
            if (pos - start > k - 1) {
                return kthLargest(arr, start, pos - 1, k);
            }
            //TODO: call kthLargest recursively in case position is less than k
            return kthLargest(arr, pos + 1, end, k - pos + start - 1);
        }

        return Integer.MAX_VALUE;
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;

        for(int j = start + 1; j <= end; j++) {
            if(arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] scores = {1, 7, 2, 4, 2, 1, 6};
        System.out.println(findKthLargest(scores, 3));  // It should print 4
    }
}
```

#### Practice #2

