/*
I want to walk through different coding practice problems to prepare for the CodeSignal Java Programming for Beginners assessment.
I want you to generate problems that are most likely to show up on the assessment.
We will go one at a time. How many questions should we cover to cover the most common problems?

To prepare for the CodeSignal Java Programming for Beginners assessment, we should focus on the types of problems that commonly appear. Based on information about CodeSignal assessments, here's a breakdown of common problem categories and how many questions we should aim to cover:

**Common Problem Categories:**

* **Java Basics (Syntax, Control Flow, Operators):** These are foundational. Expect questions involving basic arithmetic, conditional statements (if/else), and simple loops (for, while).
* **String Manipulation:** A very common topic. This includes reversing strings, checking for palindromes, character transformations, and pattern matching within strings.
* **Array Manipulation:** Another highly frequent area. Problems might involve finding min/max values, reversing arrays, merging sorted arrays, or performing operations on elements based on their neighbors.
* **Basic Data Structures:** Understanding how to use fundamental data structures like `ArrayLists` and `HashMaps` is important. For beginners, linked lists, stacks, queues, and basic trees might be introduced at a conceptual level or in simpler problem contexts.
* **Functions/Methods:** Writing and utilizing functions effectively.
* **Object-Oriented Programming (OOP) Basics:** For a "beginners" assessment, this would likely cover concepts like creating classes, objects, and understanding basic inheritance/encapsulation.

**How Many Questions?**

CodeSignal assessments typically consist of **4 coding questions**. While the difficulty can vary, a common pattern is:

* **Question 1:** Very easy, a "warm-up" (e.g., FizzBuzz level).
* **Question 2:** Easy to medium, often involving string or array manipulation.
* **Question 3:** Medium to hard, potentially requiring breaking down complex requirements.
* **Question 4:** Medium to hard, often more algorithmic (e.g., two-pointer, sliding window, sometimes dynamic programming).

To cover the most common problems and prepare effectively, I recommend we go through **8-10 targeted problems**. This will allow us to hit the key categories multiple times with varying difficulty, ensuring you're comfortable with the core concepts and common problem-solving patterns. We'll start with easier ones and gradually increase the complexity.

Let's begin with our first problem. Are you ready?

Great\! Let's start with a foundational problem that often appears in beginner assessments to test basic control flow and string/number manipulation.

-----

**Problem 1: FizzBuzz**

Write a Java program that prints numbers from 1 to 100. But for multiples of three, print "Fizz" instead of the number, and for the multiples of five, print "Buzz". For numbers which are multiples of both three and five, print "FizzBuzz".

**Example Output (first few lines):**

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
...
```

Take your time to think about the logic, especially the order of your conditional checks. Once you have a solution, share your Java code.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map; // Important to import Map interface as well

class Solution0 {
    public static void main(String[] args) {
        // for loop that iterates through the numbers 1-100
        for (int i = 1; i <= 100; i++) {
            // if the number is a multiple of 3 AND 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            // if the number is a multiple of 3, print "Fizz"
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }

            // if the number is a multiple of 5, print "Buzz"
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }      

            // if the value matches none of the conditions, print the number
            else {
                System.out.println(i);
            }
        }    
    }
// how do I skip printing the default when the condition is matched? continue!

/*
 Excellent work\! Your `FizzBuzz` solution is **correct and demonstrates a solid understanding of basic control flow and the modulo operator.**

Here's a quick breakdown of why it's good:

  * **Correct Logic:** You correctly prioritized the `(i % 3 == 0 && i % 5 == 0)` condition first. This is crucial because if you checked `i % 3 == 0` or `i % 5 == 0` first, numbers like 15 would incorrectly print "Fizz" or "Buzz" instead of "FizzBuzz".
  * **`continue` Statement:** Using `continue` is a good way to immediately jump to the next iteration of the loop once a condition is met and printed, preventing unnecessary checks for the same number.
  * **Clarity:** The code is clean, readable, and well-commented.

This is a fantastic start\! You've successfully tackled a classic beginner problem.

-----

Ready for the next one? Let's move on to a problem that involves **string manipulation**, which is another very common topic in coding assessments.

-----

Problem 2: Reverse String (Revised with Library Methods Allowed)

Write a Java method public String reverseString(String s) that takes a string s as input and returns the string reversed. You can use any appropriate Java library methods to achieve this.

Examples:

reverseString("hello") == "olleh"
reverseString("Java") == "avaJ"
reverseString("") == ""
reverseString("a") == "a"
Consider the most efficient and concise way to solve this using Java's built-in string manipulation capabilities. Share your Java code when you're ready!

 */
    public String reverseString (String s) {
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }


/*
Excellent\! That's precisely the most straightforward and idiomatic way to reverse a string in Java when library methods are allowed.

Your solution is:

  * **Concise:** Achieves the task in just two lines of effective code.
  * **Efficient:** `StringBuilder` is designed for efficient string modification, as it's mutable, unlike `String` objects which are immutable. The `reverse()` method is highly optimized.
  * **Correct:** It correctly handles all test cases, including empty strings and single-character strings.

This is a perfect solution for an assessment where such methods are permitted.

-----

Let's move on to our third problem. This one will focus on **array manipulation**, another very common topic.

-----

**Problem 3: Find Max Value in Array**

Write a Java method `public int findMax(int[] nums)` that takes an array of integers `nums` as input and returns the largest integer in the array. You can assume the input array `nums` will not be empty.

**Examples:**

```
findMax(new int[]{1, 5, 2, 8, 3}) == 8
findMax(new int[]{100, 10, 50}) == 100
findMax(new int[]{-5, -1, -10}) == -1
findMax(new int[]{7}) == 7
```

Think about how you would iterate through the array and keep track of the maximum value encountered so far. Share your Java code when you're ready\!
 */

 public int findMax (int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    return max;
 }

 // be careful of where the return statment is
 // don't forget to start @ 1 since initialized @ 0

 /*
Excellent work again\! Your solution for `findMax` is **perfectly correct and efficient.**

Here's why it's a great solution:

  * **Correct Initialization:** You correctly initialize `max` with `nums[0]`. Since the problem states the array will not be empty, this is a safe and correct starting point for comparison.
  * **Efficient Iteration:** You start the loop from `i = 1` because `nums[0]` is already considered, avoiding an unnecessary self-comparison.
  * **Clear Logic:** The `if (nums[i] > max)` condition and subsequent update `max = nums[i]` clearly and correctly identify the largest element.
  * **Handles Edge Cases:** It naturally handles arrays with a single element and arrays with negative numbers.

This is a very common pattern for finding min/max values in arrays, and you've implemented it flawlessly.

-----

Let's move on to our fourth problem. This one will combine some of the concepts we've seen and introduce a slightly more complex **array/list manipulation** scenario.

-----

**Problem 4: Count Even Numbers**

Write a Java method `public int countEvenNumbers(int[] nums)` that takes an array of integers `nums` as input and returns the count of even numbers in the array.

**Examples:**

```
countEvenNumbers(new int[]{1, 2, 3, 4, 5, 6}) == 3
countEvenNumbers(new int[]{10, 20, 30}) == 3
countEvenNumbers(new int[]{1, 3, 5, 7, 9}) == 0
countEvenNumbers(new int[]{}) == 0 // Handles empty array
countEvenNumbers(new int[]{2}) == 1
```

Think about how you can determine if a number is even and how you'll keep a running tally of the even numbers found. Share your Java code when you're ready\!
  */

  public int countEvenNumbers(int [] nums) {
    int count = 0;
    for (int num: nums) {
        if (num % 2 == 0 ) {
            count++;
        }
    }
    return count;
  }

   // be careful of where the return statment is - AFTER THE LOOP - other than that, solving in 1 min is impressive for you kid

/*
Excellent job once again\! Your solution for `countEvenNumbers` is **perfectly correct, concise, and efficient.**

Here's why it's great:

  * **Correct Logic:** You correctly use the modulo operator (`% 2 == 0`) to check for even numbers.
  * **Enhanced For Loop:** Using the enhanced for loop (`for (int num : nums)`) is clean and idiomatic for iterating through all elements of an array when you don't need the index.
  * **Correct Initialization and Increment:** `count` is correctly initialized to 0 and incremented only when an even number is found.
  * **Handles Empty Array:** Your code naturally handles an empty array, returning `0`, which is the correct behavior.

You're demonstrating a strong grasp of Java basics and common array operations.

-----

Let's move on to our fifth problem. This one will bring back **string manipulation**, but with a slightly different twist, focusing on character-by-character processing.

-----

**Problem 5: Count Vowels**

Write a Java method `public int countVowels(String s)` that takes a string `s` as input and returns the total number of vowels (a, e, i, o, u, case-insensitive) in the string.

**Examples:**

```
countVowels("hello") == 2 // 'e', 'o'
countVowels("AEIOU") == 5
countVowels("Programming") == 3 // 'o', 'a', 'i'
countVowels("rhythm") == 0
countVowels("") == 0
```

Think about how you'll iterate through the string and check each character. Remember to handle both uppercase and lowercase vowels. Share your Java code when you're ready\!
 */

 public int countVowels (String s) {
    String str = s.toLowerCase();
    char[] vowels = str.toCharArray();
    int count = 0;
    
    for (char vowel: vowels) {
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            count++;
        }
    }
    return count;
 }

 // don't forget to declare the case-insensitive string as new variable and then convert that new one
 // otherwise much better timing and great memory of chracter and string operations + for loops and conditionals and regular logic!

 /*
Your solution for `countVowels` is **absolutely correct and well-implemented\!**

Here's why it's great:

  * **Case-Insensitivity Handled:** You correctly convert the entire string to lowercase (`s.toLowerCase()`) at the beginning. This is a very common and effective way to handle case-insensitivity requirements without needing to check for both 'a' and 'A', 'e' and 'E', etc., within the loop.
  * **Efficient Iteration:** You convert the string to a `char[]` using `toCharArray()` and then use an enhanced for-loop, which is a clean and efficient way to iterate through characters.
  * **Correct Logic:** The `if` condition precisely checks for all five vowels.
  * **Correct Count:** `count` is initialized and incremented properly.
  * **Handles Edge Cases:** It correctly returns `0` for empty strings or strings with no vowels.

This is a robust solution to a very common string manipulation problem.

-----

You're doing very well\! Let's move on to our sixth problem. This one will delve into a common **array manipulation** pattern that often involves comparing elements or summing parts of an array.

-----

**Problem 6: Sum of Even Indexed Elements**

Write a Java method `public int sumEvenIndexedElements(int[] nums)` that takes an array of integers `nums` as input and returns the sum of all elements located at **even indices**. The first element (at index 0) is considered at an even index.

**Examples:**

```
sumEvenIndexedElements(new int[]{1, 2, 3, 4, 5}) == 9  // 1 (index 0) + 3 (index 2) + 5 (index 4)
sumEvenIndexedElements(new int[]{10, 20, 30, 40}) == 40 // 10 (index 0) + 30 (index 2)
sumEvenIndexedElements(new int[]{5}) == 5 // 5 (index 0)
sumEvenIndexedElements(new int[]{}) == 0 // Handles empty array
sumEvenIndexedElements(new int[]{1, 2}) == 1 // 1 (index 0)
```

Think about how you'll iterate through the array to access elements by their index, and how you'll determine if an index is even. Share your Java code when you're ready\!
  */

public int sumEvenIndexedElements(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        if (i % 2 == 0) {
            sum+=nums[i];
        }
    }
    return sum;
}
/*
Excellent once again\! Your solution for `sumEvenIndexedElements` is **perfectly correct and demonstrates a clear understanding of array indexing and conditional summation.**

Here's why your solution is good:

  * **Correct Initialization:** `sum` is correctly initialized to `0`.
  * **Correct Iteration:** You use a standard `for` loop with an index `i`, which is necessary when you need to access elements based on their position (index).
  * **Correct Even Index Check:** The condition `i % 2 == 0` correctly identifies even indices, including index 0.
  * **Accurate Summation:** `sum += nums[i]` correctly adds the value of the element at the even index to the running total.
  * **Handles Edge Cases:**
      * An empty array `nums` will correctly result in `0` because the loop won't execute.
      * An array with a single element `nums[0]` will correctly add that element to the sum.

You're consistently providing robust and correct solutions.

-----

Let's move on to our seventh problem. This one will involve some **basic logic and potentially string or array manipulation**, focusing on a common pattern of checking for specific conditions within a sequence.

-----

**Problem 7: Check if Palindrome**

Write a Java method `public boolean isPalindrome(String s)` that takes a string `s` as input and returns `true` if the string is a palindrome, and `false` otherwise. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward. For this problem, consider only alphanumeric characters and ignore cases.

**Examples:**

```
isPalindrome("racecar") == true
isPalindrome("Madam") == true // Ignores case
isPalindrome("A man, a plan, a canal: Panama") == true // Ignores non-alphanumeric and case
isPalindrome("hello") == false
isPalindrome("") == true // An empty string is often considered a palindrome
isPalindrome("a") == true
isPalindrome("ab@a") == true // Ignores non-alphanumeric
```

**Hints:**

1.  You'll likely want to preprocess the string first to handle the "ignore non-alphanumeric characters and cases" requirement.
2.  After preprocessing, you can compare the processed string with its reversed version.
3.  Consider using `Character.isLetterOrDigit(char c)` to check if a character is alphanumeric.
4.  You can use the `StringBuilder` class for efficient string building and reversing after preprocessing.

Take your time with this one, as it combines several concepts. Share your Java code when you're ready\!
 */
public boolean isPalindrome(String s) {
    String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    StringBuilder reversedString = new StringBuilder(cleanedString);
    reversedString.reverse();
    return cleanedString.equals(reversedString.toString());
}
//don't forget the [] around the alphanumeric code
//make sure you add the .toString on the inside of the .equals comparison

/*
Excellent solution\! You've nailed the `isPalindrome` problem, especially with the preprocessing step.

Here's why your solution is spot on:

  * **Effective Preprocessing:**
      * `s.replaceAll("[^a-zA-Z0-9]", "")`: This is a very concise and powerful use of regular expressions to remove all non-alphanumeric characters. This directly addresses the requirement to ignore spaces, punctuation, etc.
      * `.toLowerCase()`: Correctly converts the string to lowercase, handling the case-insensitivity requirement.
  * **Leveraging `StringBuilder`:** You correctly use `StringBuilder` to reverse the `cleanedString`, which is efficient and straightforward, especially since we've established that library methods are allowed.
  * **Correct Comparison:** `cleanedString.equals(reversedString.toString())` is the right way to compare two strings for equality in Java.

Your solution is robust, handles all the edge cases mentioned (empty string, single character, mixed case, non-alphanumeric characters), and is very clean.

-----

You're doing incredibly well\! We're nearing the end of our targeted common problems. Let's move on to our eighth problem. This one will involve **array manipulation** and often requires a bit more thought on iterating and potentially creating a new array or modifying an existing one based on a condition.

-----

**Problem 8: Remove Duplicates from Sorted Array**

Write a Java method `public int removeDuplicates(int[] nums)` that modifies the input array `nums` in-place such that each unique element appears only once. The relative order of the elements should be kept the same. The method should return the new length of the array after removing duplicates.

**Important Considerations:**

  * You must do this in-place without allocating extra space for another array.
  * The elements beyond the new length do not matter.
  * The input array `nums` will be sorted in non-decreasing order.

**Examples:**

```
// Input: nums = [1,1,2]
// Output: 2, nums will be [1,2,_] (underscore means it doesn't matter what's there)
removeDuplicates(new int[]{1,1,2}) -> returns 2, nums becomes [1,2,X]

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums will be [0,1,2,3,4,_,_,_,_,_]
removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}) -> returns 5, nums becomes [0,1,2,3,4,X,X,X,X,X]
```

**Hint:** Think about a "two-pointer" approach. One pointer to read through the array, and another to write unique elements.

This problem is a classic for in-place array manipulation and is frequently seen in assessments. Take your time to devise the two-pointer logic. Share your Java code when you're ready\!
 */

public int removeDuplicates1(int[] nums) {
    HashSet<Integer> uniqueSet = new HashSet<>();
    for (int num: nums) {
        uniqueSet.add(num);
    }
    ArrayList<Integer> uniqueArray = new ArrayList<>(uniqueSet);
    return uniqueArray.size();
 }


/*
Thanks for providing a solution! This approach using a `HashSet` and `ArrayList` is a common and correct way to get the count of unique elements, and if the goal was just to return the number of unique elements *without* modifying the original array in-place, it would be perfect.

However, the crucial constraint in this particular problem (which is very common in interviews and CodeSignal-style assessments for `removeDuplicates` on a sorted array) is:

* **"modifies the input array `nums` in-place"**
* **"without allocating extra space for another array."** (This implies O(1) extra space complexity)

Your current solution uses `HashSet` and `ArrayList`, which allocate extra space proportional to the number of unique elements, violating the "in-place" and "O(1) extra space" constraints.

Let's revisit the problem statement with these key constraints in mind:

**Problem 8: Remove Duplicates from Sorted Array (Revisited)**

Write a Java method `public int removeDuplicates(int[] nums)` that modifies the input array `nums` in-place such that each unique element appears only once. The relative order of the elements should be kept the same. The method should return the new length of the array after removing duplicates.

**Important Constraints:**

* **You must do this in-place without allocating extra space for another array (O(1) extra space).**
* The elements beyond the new length do not matter.
* The input array `nums` will be sorted in non-decreasing order.

**Hint:** Think about a "two-pointer" approach. One pointer to read through the array (let's call it `i`), and another pointer to write unique elements to the beginning of the array (let's call it `j`).
Since the array is sorted, duplicates will always be adjacent.

Take another shot at it, focusing on modifying the `nums` array directly without creating new data structures. This is a very important and frequently tested pattern!

You're tackling a classic problem that really tests your understanding of **in-place array manipulation** and the importance of **space complexity**. It's tricky because your first instinct might be to use extra data structures, but the constraints push you to think differently.

Here's a sample solution using the **two-pointer approach**, which is the canonical way to solve this problem efficiently in-place:

-----

### Sample Solution: `removeDuplicates` (Two-Pointer Approach)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, there are no duplicates to remove,
        // so the length is 0.
        if (nums.length == 0) {
            return 0;
        }

        // Initialize the 'write' pointer 'j'. This pointer will only advance
        // when a unique element is found and needs to be written to its
        // correct position in the modified array.
        // It also represents the length of the array without duplicates.
        int j = 1; 

        // Iterate through the array with the 'read' pointer 'i', starting from the second element.
        // We compare each element with the one just before it (at i-1).
        for (int i = 1; i < nums.length; i++) {
            // If the current element (nums[i]) is DIFFERENT from the previous element (nums[i-1]),
            // it means we've found a new unique element.
            if (nums[i] != nums[i - 1]) {
                // Write this unique element to the position indicated by 'j'.
                // This effectively moves the unique element to the "front"
                // of the array, overwriting any duplicates that might have been there.
                nums[j] = nums[i];
                // Advance the 'write' pointer to the next available position
                // for the next unique element.
                j++;
            }
            // If nums[i] == nums[i-1], it's a duplicate. We simply
            // skip it and continue to the next iteration. The 'j' pointer
            // does NOT advance, meaning the duplicate is effectively ignored
            // and will eventually be overwritten by a subsequent unique element.
        }

        // The 'j' pointer now holds the new length of the array after removing duplicates.
        return j;
    }
}
```

-----

### Explanation of the Two-Pointer Approach

1.  **`j` (Write Pointer / New Length Counter):**

      * Starts at `1` because the first element `nums[0]` is always unique (or considered unique as the start of the unique sequence). So, the first unique element will occupy index `0`, and the second unique element will start at index `1`.
      * This pointer indicates where the *next unique element* should be placed.
      * Crucially, at the end of the loop, `j` will be the **count of unique elements**, which is also the "new length" of the array.

2.  **`i` (Read Pointer):**

      * Starts at `1` to compare `nums[i]` with `nums[i-1]`.
      * This pointer simply iterates through *all* elements of the original array.

3.  **The Logic:**

      * We compare `nums[i]` (the element currently being read) with `nums[i-1]` (the element just before it).
      * Since the array is **sorted**, if `nums[i]` is **different** from `nums[i-1]`, we know we've found a *new unique element*.
      * When a new unique element is found, we:
          * Copy `nums[i]` to `nums[j]`. This effectively moves the unique element to its correct, de-duplicated position.
          * Increment `j`. This prepares `j` for the next unique element.
      * If `nums[i]` is the **same** as `nums[i-1]`, it's a duplicate. We simply do nothing and let `i` advance. The duplicate element at `nums[i]` will eventually be overwritten by a later unique element.

This two-pointer technique is incredibly efficient for sorted arrays because it allows you to modify the array in-place with **O(1) extra space** and runs in **O(n) time** (you only iterate through the array once).

This was a more challenging problem, but mastering concepts like two-pointers is key for intermediate assessment questions.

Are you ready to try another problem, or would you like to review this solution further?

You're welcome\! Let's dive into **Problem 9**, which focuses on basic **Object-Oriented Programming (OOP)** concepts, a fundamental part of Java programming.

-----

**Problem 9: Simple `Book` Class**

Create a Java class named `Book` with the following characteristics:

1.  **Attributes (Fields):**

      * `title` (String)
      * `author` (String)
      * `pages` (int)

2.  **Constructor:**

      * A constructor that takes `title`, `author`, and `pages` as arguments and initializes the corresponding attributes.

3.  **Methods:**

      * `public String getTitle()`: Returns the title of the book.
      * `public String getAuthor()`: Returns the author of the book.
      * `public int getPages()`: Returns the number of pages of the book.
      * `public void displayBookInfo()`: Prints the book's information in the format:
        `Title: [title], Author: [author], Pages: [pages]`

**Example Usage (how you might test it in a `main` method):**

```java
// In a main method or a test class:
// Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
// book1.displayBookInfo();
// System.out.println(book1.getTitle()); // Should print "The Hobbit"
```

Your task is to provide the complete `Book` class definition. Don't worry about writing a `main` method unless you want to test it yourself. Just provide the class code.

Take your time to define the class, its constructor, and the accessor/display methods. Good luck\!
 */

class Book {
    String title;
    String author;
    int pages;
    
    Book (String title, String author,  int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPages() {
        return this.pages;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", Pages: " + getPages());
    }
}

/*
Excellent\! Your `Book` class implementation is **perfectly correct and demonstrates a solid understanding of fundamental OOP concepts.**

Here's a breakdown of why it's great:

  * **Correct Attributes:** You've correctly defined `title`, `author`, and `pages` as instance variables.
  * **Proper Constructor:** Your constructor correctly takes arguments and uses `this.attribute = argument;` to initialize the instance variables, avoiding naming conflicts. This is exactly how constructors should be implemented.
  * **Correct Getters:** The `getTitle()`, `getAuthor()`, and `getPages()` methods correctly return the values of their respective attributes.
  * **Effective `displayBookInfo()`:** This method correctly prints the information in the requested format, and it's good practice to use the getter methods (`getTitle()`, etc.) within `displayBookInfo()` rather than directly accessing the fields, as this promotes encapsulation (though direct access within the same class is also technically allowed).

You've successfully created a well-formed Java class\! This kind of problem is very common in "Beginner" assessments to ensure you grasp the basics of creating and interacting with objects.

-----

Now, as per our plan, let's move to **reinforce Problem 8**. This is a great opportunity to solidify your understanding of the two-pointer technique for in-place array manipulation.

### **Action Item: Re-attempt Problem 8 (Remove Duplicates from Sorted Array)**

Please try to implement the `removeDuplicates` method again, **without looking at my previous sample solution**.

**Problem 8: Remove Duplicates from Sorted Array**

Write a Java method `public int removeDuplicates(int[] nums)` that modifies the input array `nums` in-place such that each unique element appears only once. The relative order of the elements should be kept the same. The method should return the new length of the array after removing duplicates.

**Important Constraints:**

  * **You must do this in-place without allocating extra space for another array (O(1) extra space).**
  * The elements beyond the new length do not matter.
  * The input array `nums` will be sorted in non-decreasing order.

**Examples:**

```
// Input: nums = [1,1,2]
// Output: 2, nums will be [1,2,_] (underscore means it doesn't matter what's there)
removeDuplicates(new int[]{1,1,2}) -> returns 2, nums becomes [1,2,X]

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums will be [0,1,2,3,4,_,_,_,_,_]
removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}) -> returns 5, nums becomes [0,1,2,3,4,X,X,X,X,X]
```

This is your chance to really cement that two-pointer pattern. Take your time, draw it out on paper if it helps. Share your code when you're ready\!
 */

 public int removeDuplicate (int[] nums) {
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
        if(nums[i] != nums[i -1]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
 }

/*
Perfect\! Another string manipulation problem it is for Problem 10. And absolutely, we can definitely do a quick run-through of sample codes for the other important concepts after that. That's an excellent strategy to maximize your preparation without diving deep into a full problem for each.

-----

Let's tackle **Problem 10: Character Frequency Counter**.

-----

**Problem 10: Character Frequency Counter**

Write a Java method `public Map<Character, Integer> countCharacterFrequencies(String s)` that takes a string `s` as input and returns a `Map` where the keys are the characters from the string and the values are their respective frequencies (counts). The count should be case-sensitive.

**Examples:**

```java
// For "hello":
// countCharacterFrequencies("hello")
// Returns a Map like: {'h': 1, 'e': 1, 'l': 2, 'o': 1}

// For "Programming":
// countCharacterFrequencies("Programming")
// Returns a Map like: {'P': 1, 'r': 2, 'o': 1, 'g': 2, 'a': 1, 'm': 2, 'i': 1, 'n': 1}

// For "":
// countCharacterFrequencies("")
// Returns an empty Map: {}

// For "aA":
// countCharacterFrequencies("aA")
// Returns a Map like: {'a': 1, 'A': 1} (case-sensitive)
```

**Hints:**

  * You'll need a `HashMap` (or `TreeMap` if order matters, but `HashMap` is usually fine for frequencies) to store the character counts.
  * Iterate through the string, character by character.
  * For each character, check if it's already in the map.
      * If it is, increment its count.
      * If it's not, add it to the map with a count of 1.
  * The `getOrDefault` method of `HashMap` can be very useful here.

This problem tests your ability to use a common data structure (`Map`) with string iteration. Good luck\!
 */

/*
No problem at all\! Time management is key, and it's perfectly fine to ask for the solution when you're pressed for time. This problem is an excellent way to see `HashMap` in action for frequency counting, a very common pattern.

Here's the solution for `countCharacterFrequencies`:

-----

### Solution: `countCharacterFrequencies`

```java
import java.util.HashMap;
import java.util.Map; // Important to import Map interface as well

class Solution {
    public Map<Character, Integer> countCharacterFrequencies(String s) {
        // Create a new HashMap to store character frequencies.
        // Keys will be Characters, values will be their Integer counts.
        Map<Character, Integer> charFrequencies = new HashMap<>();

        // Iterate through each character in the input string.
        // Convert the string to a char array for easy iteration.
        for (char c : s.toCharArray()) {
            // Use getOrDefault to check if the character is already in the map.
            // If it is, get its current count and add 1.
            // If it's not, getOrDefault will return the default value (0), and then add 1.
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Return the map containing all character frequencies.
        return charFrequencies;
    }
}
```

-----

### Explanation:

1.  **`import java.util.HashMap;` and `import java.util.Map;`**: These imports are necessary to use the `HashMap` class and the `Map` interface.
2.  **`Map<Character, Integer> charFrequencies = new HashMap<>();`**: We declare a `Map` that will hold `Character` objects as keys and `Integer` objects as their corresponding counts. `HashMap` is chosen for its efficient average-case performance for `put` and `get` operations.
3.  **`for (char c : s.toCharArray())`**: This is an enhanced for-loop that iterates over each character in the string `s`. `s.toCharArray()` converts the string into an array of characters, making iteration straightforward.
4.  **`charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);`**: This is the core logic:
      * `charFrequencies.getOrDefault(c, 0)`: This method attempts to retrieve the value (count) associated with the character `c`.
          * If `c` is already in the map, it returns its current count.
          * If `c` is *not* in the map (meaning it's the first time we've encountered this character), it returns the specified default value, which is `0` in this case.
      * `+ 1`: We then add `1` to whatever value `getOrDefault` returned.
      * `charFrequencies.put(c, ...)`: Finally, we put (or update) the character `c` back into the map with its new, incremented count.
5.  **`return charFrequencies;`**: After iterating through all characters, the map containing all frequencies is returned.

This problem is excellent for beginners because it introduces the powerful `Map` data structure and a common pattern for counting occurrences of items.

-----

Now, as promised, let's quickly review **other important concepts with sample code snippets**. This will give you a good overview of common Java elements that frequently appear in assessments.

We'll cover:

1.  **`ArrayList` Basics**
2.  **Basic Searching in an Array**
3.  **Basic Prime Number Check (Math/Logic)**
4.  **`switch` Statement**

Let's start with `ArrayList`\!
 */

class Solution {
    public Map<Character, Integer> countCharacterFrequencies(String s) {
        // Create a new HashMap to store character frequencies.
        // Keys will be Characters, values will be their Integer counts.
        Map<Character, Integer> charFrequencies = new HashMap<>();

        // Iterate through each character in the input string.
        // Convert the string to a char array for easy iteration.
        for (char c : s.toCharArray()) {
            // Use getOrDefault to check if the character is already in the map.
            // If it is, get its current count and add 1.
            // If it's not, getOrDefault will return the default value (0), and then add 1.
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        // Return the map containing all character frequencies.
        return charFrequencies;
    }
}
}




