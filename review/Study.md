# Java Study Guide
## Part I: WGU Java Study Guide: CodeSignal Certification Preparation
### Certification Overview
##### The CodeSignal Java certification evaluates your knowledge in core Java programming concepts. While the exam may change at any moment without notice, historically, you can expect four timed coding questions designed to test logic, problem-solving, and command of Java syntax. You will not be graded on style or comments, only on correctness and performance.

### Important Notes:
* Time: ~70 minutes
* Format: 4 coding problems
* Graded automatically on accuracy, efficiency, and test cases passed
* Difficulty: Ranges from basic to advanced

### Core Java Topics to Review
1. Data Types and Variables
* Primitive types: int, double, char, boolean, long, etc.
* Reference types: String, arrays, custom classes
* Type casting (implicit and explicit)

2. Control Flow
* if, else, switch
* while, for, do-while
* Enhanced for-loop (for-each)
* break, continue, and return

3. Arrays and Strings
* One-dimensional and multi-dimensional arrays
* Common String methods: .length(), .charAt(), .substring(), .equals(), .split()
* Converting between Strings and arrays: .toCharArray(), String.join()

4. Methods and Scope🚨
* Method declarations: return types, parameters
* Static vs. instance methods
* Pass-by-value behavior
* Method overloading

5. Object-Oriented Programming (OOP)🚨
* Classes and objects
* Constructors
* Inheritance (extends)
* Interfaces (implements)
* Method overriding vs overloading
* Polymorphism

6. Collections and Data Structures
* ArrayList, HashMap, HashSet
* Iteration using for, Iterator, or forEach
* Sorting: Collections.sort(), Arrays.sort()
* Comparing: Comparable vs Comparator

7. Algorithms and Problem Solving
* Searching: linear, binary
* Sorting: bubble, selection, insertion (know time complexity)
* Recursion and iteration
* Greedy and brute-force approaches

### Key Java Functions and Concepts
#### Task Example
* Parse String to int int x = Integer.parseInt("123");
* Convert int to String String s = String.valueOf(123);
* Sort an array Arrays.sort(myArray);
* Use ArrayList ArrayList<Integer> list = new ArrayList<>();
* Use HashMap HashMap<String, Integer> map = new HashMap<>();
* Loop over array for (int i : arr) { }
* String equality "abc".equals("abc")
* Length of array arr.length
* Length of String str.length()

#### Test-Taking Tips
* Start with the easiest problem first.
* Use meaningful variable names, but focus on speed.
* Always test your solution with edge cases.
* If stuck, skip and return later.
* Make use of built-in Java libraries.

#### Practice Platforms
* CodeSignal Arcade – Java Section: https://codesignal.com/
* LeetCode Easy & Medium Java Problems: https://leetcode.com/
* HackerRank Java Practice: https://www.hackerrank.com/domains/tutorials/10-days-of-java
* GeeksforGeeks Java Programming: https://www.geeksforgeeks.org/java/


### Java CodeSignal Certification – Practice Quiz (with Answers)🥇
1. Which of the following is a valid main method signature in Java? B
* A. public void main(String[] args
* B. **public static void main(String[] args)**
* C. static void Main(String args[])
* D. void public static main(String args[])

2. What is the output of the following code? D
 
       int a = 5, b = 2;
       System.out.println(a / b);
* A. 2
* B. 2.5
* C. 2.0
* D. **Compilation error**

3. Which Java data type is used to store 64-bit integer values? B
* A. int
* B. **long**
* C. shorts
* D. double

#### Section 2: Object-Oriented Programming
4. Which keyword is used to inherit a class in Java?: C
* A. implements
* B. inherits
* C. **extends**
* D. super

5. True or False: Java supports multiple inheritance with classes.
**The answer is: False**

6. Which of the following statements is correct about constructors? D🚨
* A. They must have a return type
* B. They can be static
* C. They have the same name as the class
* D. **They can be called explicitly with new.constructorName()**

#### Section 3: Loops and Conditionals
7. What is the output of the following loop? A

       for (int i = 0; i < 3; i++) {
       System.out.print(i + " ");
        }
* A. **0 1 2**
* B. 1 2 3
* C. 0 1 2 3
* D. 1 2

8. Which loop guarantees at least one execution? D
* A. for loop
* B. while loop
* C. do-while loop
* D. **All of the above**

9. What is the correct syntax for an if statement in Java? B
* A. if x > 5 then {...}
* B. **if (x > 5) {...}**
* C. if x > 5: {...}
* D. if (x > 5); {...}

#### Section 4: Data Structures & Arrays
10. How do you declare an array of integers in Java with 5 elements? C
* A. int[] arr = new int(5)
* B. int arr[] = new int[5];
* C. **int[5] arr = new int[]**;
* D. int arr = new int[5];

11. Which interface allows duplicate elements and maintains insertion order? B
* A. Set
* B. **List**
* C. Map
* D. Queue

12. What is the result of the following code? C

        int[] nums = {1, 2, 3};
        System.out.println(nums[3]);
* A. 3
* B. Compilation error
* C. **ArrayIndexOutOfBoundsException**
* D. null

#### Section 5: Exceptions & Libraries
13. Which keyword is used to handle exceptions? A
* A. **catch**
* B. final
* C. error
* D. handle

14. What is the output? D

        try {
        int x = 5 / 0;
        } catch (ArithmeticException e) {
        System.out.println("Error");
        }
* A. No output
* B. Compilation error
* C. Runtime crash
* D. **Error**

15. What does java.util.ArrayList provide that arrays do not? D🚨
* A. Fixed size
* B. Type safety
* C. Dynamic resizing
* D. **Primitive storage**

#### Section 6: Additional Questions & Answers
16. Which of the following is not a valid access modifier in Java? D
* A. public
* B. private
* C. protected
* D. **external**

17. What will be the output of this code snippet? D

        String a = "Hello";
        String b = "Hello";
        System.out.println(a == b);
* A. false
* B. true
* C. Compilation error
* D. **Runtime exception**

18. Which collection class does not allow duplicate elements? B
* A. ArrayList
* B. **HashSet**
* C. LinkedList
* D. Vector

19. What does the final keyword do when used with a variable? B
* A. Prevents the variable from being accesse
* B. **Makes the variable immutable after assignment**
* C. Makes the variable static
* D. Allows changes only inside loops

20. What is method overloading in Java? B
* A. Using the same method name with different return type
* B. **Using the same method name with different parameters**
* C. Redefining a method in a child class
* D. A method that throws multiple exceptions

21. What is the default value of a boolean variable in Java (class-level)? C
* A. true
* B. false
* C. **null**
* D. 0

22. Which of the following is true about static methods? C
* A. They can access instance variables directly
* B. They can be overridden
* C. **They belong to the class, not objects**
* D. They require an object instance to be called

24. Which keyword is used to define an interface in Java? C
* A. class
* B. interface
* C. **abstract**
* D. implements

25. Which of the following can be used to stop a loop immediately? D
* A. stop
* B. exit
* C. continue
* D. **break**

26. Which statement correctly initializes a HashMap? A
* A. **Map map = new HashMap();**
* B. HashMap map = new Map()
* C. Map map = HashMap();
* D. new HashMap map = Map();

27. What is the result of this expression? B

        System.out.println(10 + 20 + "30");
* A. 30
* B. **102030*
* C. 3030
* D. 3030

29. Which of the following is the correct way to declare a constant in Java? A
* A. **const double RATE = 0.05;**
* B. final double RATE = 0.05;
* C. double constant RATE = 0.05;
* D. static RATE = 0.05;

30. Which method must be implemented when a class implements the Runnable interface? A🚨
* A. **execute()**
* B. run()
* C. start()
* D. main()

32. Which operator is used to compare the values of two primitives for equality? B
* A.
* B. **==**
* C. equals()
* D. !=

33. Which exception is thrown when an array is accessed out of bounds? C
* A. ArrayException
* B. NullPointerException
* C. **ArrayIndexOutOfBoundsException**
* D. IndexException

#### Section 7: Additional Questions & Answers
31. What is the result of the following Java code? **Compilation Error**

        int x = 5;
        int y = 2;
        System.out.println(x / y);

32. Which access modifier allows visibility only within the same package? C
* A. public
* B. protected
* C. **private**
* D. default (no modifier)

33. What will this code print? **ello**

        String s = "hello";
        System.out.println(s.substring(1, 4));

34. Which keyword is used to prevent inheritance of a class?
* A. **static**
* B. final
* C. const
* D. immutable

35. How is a HashSet different from a TreeSet in Java? C🚨
* A. HashSet is ordered, TreeSet is not
* B. HashSet allows duplicates, TreeSet does not
* C. **TreeSet maintains sorted order, HashSet does not**
* D. HashSet uses more memory than TreeSet

37. What is the correct way to declare an abstract method in Java? A
* A. **abstract void run() {}**
* B. void run();
* C. abstract void run();
* D. public void abstract run();

38. What is the result of this code? **ArrayIndexOutofBoundsException

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

40. What does the finally block do in exception handling? C
* A. Executes only if an exception is thrown
* B. Executes only if no exception is thrown
* C. **Executes always, whether an exception is thrown or not*
* D. Prevents the program from crashing

41. Which data structure is best suited for a FIFO (first-in-first-out) behavior? C🚨
* A. Stac
* B. Queue
* C. **Tree**
* D. Set

## Part II: Practice Problems with Answers🥈
CodeSignal's "Java Programming for Beginners" path includes various types of problems, with a strong emphasis on single-function challenges and dedicated debugging exercises.

### Single-Function Problems

These problems typically require you to implement a specific function that takes certain inputs and produces a defined output. They are automatically scored based on visible and/or hidden test cases. While the exact problems can vary, common themes for beginners in Java include:

* **String Manipulation:**
    * Reversing a string.
    * Checking for palindromes.
    * Counting characters or words.
    * Pattern matching within strings (e.g., finding occurrences of a pattern with specific vowel/consonant rules).
* **Array Manipulation:**
    * Performing transformations on array elements (e.g., `b[i] = a[i-1] + a[i] + a[i+1]` with edge case handling).
    * Finding missing numbers in a sequence.
    * Sorting or searching within arrays.
    * Problems involving "alternating parity" (even/odd numbers).
* **Basic Algorithms/Logic:**
    * Implementing the Fibonacci sequence (recursive or iterative).
    * Solving problems related to loops and conditional statements.
    * Working with basic data structures like `ArrayLists` and `HashMaps`.
* **Mathematical Problems:**
    * Simple calculations or number manipulations.
    * Problems that might involve understanding concepts like "cyclical t-shifts" or matrix operations for beginners (often simplified).

CodeSignal often uses "progressive single-function questions" where the problem starts with basic requirements and gradually increases in complexity across multiple levels.

### Debugging Problems

CodeSignal has a specific course dedicated to "Mastering Debugging with Java" within their "Java Programming for Beginners" path. These exercises are designed to help you identify and fix errors in existing code. The problems are structured to test your ability to:

* **Identify the Problem:** Understand what's going wrong in a given code snippet (unexpected behavior, errors, exceptions).
* **Reproduce the Issue:** Create scenarios or test cases that consistently trigger the bug.
* **Inspect the Code:** Examine relevant code, variable values, and control flow to narrow down the root cause.
* **Apply Fixes:** Correct errors, optimize algorithms, or address logical issues.
* **Test the Fix:** Verify that your changes resolve the issue without introducing new problems.

Specific examples of debugging problems might include:

* **NullPointerExceptions:** Identifying where a `NullPointerException` occurs and implementing proper null-checking.
* **Logical Errors:** Fixing incorrect logic that leads to unexpected outputs.
* **Runtime Errors:** Resolving issues that cause the program to crash during execution.
* **Syntax Issues:** Though less common in debugging exercises (as these are usually caught by the compiler), sometimes subtle syntax errors can lead to logical issues that need debugging.

Essentially, for debugging problems, you're given a piece of code that doesn't work as intended, and your task is to find and fix the bug(s). The platform often provides error messages or failing test cases to guide you.

CodeSignal assessments for Java beginners often focus on fundamental programming concepts, data structures, and basic algorithms. While specific problems can vary, there are common themes that you should definitely practice.

Here are some standard single-function and debugging problems commonly seen on CodeSignal for Java beginners:

### Common Single-Function Problems

1.  **String Reversal:** Implement a function that takes a string and returns its reversed version. This often involves converting to a character array or using `StringBuilder`.
2.  **Palindrome Check:** Write a function that determines if a given string is a palindrome (reads the same forwards and backward).
3.  **Finding Max/Min in an Array:** Given an array of numbers, find the maximum or minimum value.
4.  **Array Sum/Average:** Calculate the sum or average of elements in an array.
5.  **Array Transformation (e.g., `b[i] = a[i-1] + a[i] + a[i+1]`):** Given an array `a`, create a new array `b` where each element `b[i]` is derived from `a[i]` and its neighbors, often with specific handling for edge cases (first and last elements).
6.  **Counting Vowels/Consonants/Characters:** Given a string, count the occurrences of specific types of characters (e.g., vowels, consonants, digits, specific characters).
7.  **Basic Mathematical Operations:** Implement functions for simple calculations, like checking if a number is prime, finding the factorial, or calculating Fibonacci numbers.
8.  **String Pattern Matching (Vowel/Consonant Rules):** Given a `pattern` string (e.g., "010" where 0 is vowel, 1 is consonant) and a `source` string, count how many substrings of `source` match the `pattern`.
9.  **Array Element Parity (Even/Odd):** Problems involving checking or manipulating elements based on whether they are even or odd, often within a "sliding window" context.
10. **Finding Duplicates/Unique Elements:** Identify duplicate elements in an array or return only unique elements.

### Common Debugging Problems

CodeSignal's "Mastering Debugging with Java" course specifically addresses these:

1.  **`NullPointerException` Debugging:** Fixing code that throws a `NullPointerException`, often by adding null checks or ensuring objects are initialized.
2.  **Logical Errors in Loops:** Identifying and correcting errors in loop conditions (e.g., off-by-one errors, infinite loops) that cause incorrect output or unexpected behavior.
3.  **Incorrect Arithmetic Operations:** Debugging problems where calculations are performed incorrectly (e.g., using addition instead of multiplication for area, division by zero).
4.  **Array Index Out of Bounds:** Fixing errors where the code tries to access an array element at an invalid index.
5.  **Incorrect Conditional Logic:** Debugging `if-else` statements or `switch` cases that lead to unintended branches or results.
6.  **Resource Leaks (though less common for beginners, sometimes introduced):** Problems where resources like file streams or network connections are not properly closed.
7.  **Misunderstanding Method Behavior:** Debugging issues that arise from incorrect assumptions about how a library method or custom method behaves (e.g., `String.reverse()` not existing, or `List.remove()` behavior).

For debugging problems, you're expected to not only find the bug but also understand the error message (if any), use debugging techniques (like mental walkthroughs or adding print statements), and provide a correct fix.

Got it\! Providing solutions for each of the common problems, including sample bugged code and fixed code for a debugging scenario.

-----

### Common Single-Function Problems - Solutions

#### 1\. String Reversal

**Problem:** Implement a function that takes a string and returns its reversed version.

**Solution:**

```java
class Solution {
    String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
}

// Example Usage:
// Solution sol = new Solution();
// String original = "hello";
// String reversed = sol.reverseString(original); // Result: "olleh"
```

#### 2\. Palindrome Check

**Problem:** Write a function that determines if a given string is a palindrome.

**Solution:**

```java
class Solution {
    boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Example Usage:
// Solution sol = new Solution();
// boolean isPal1 = sol.isPalindrome("madam");      // Result: true
// boolean isPal2 = sol.isPalindrome("A man, a plan, a canal: Panama"); // Result: true
// boolean isPal3 = sol.isPalindrome("hello");     // Result: false
```

#### 3\. Finding Max/Min in an Array

**Problem:** Given an array of numbers, find the maximum value.

**Solution (Finding Max - Min is similar logic):**

```java
class Solution {
    int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
// int maxVal = sol.findMax(numbers); // Result: 9
```

#### 4\. Array Sum/Average

**Problem:** Calculate the sum of elements in an array.

**Solution (Sum - Average is sum / count):**

```java
class Solution {
    int sumArray(int[] arr) {
        if (arr == null) {
            return 0; // Or throw IllegalArgumentException
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int[] numbers = {1, 2, 3, 4, 5};
// int totalSum = sol.sumArray(numbers); // Result: 15
```

#### 5\. Array Transformation (e.g., `b[i] = a[i-1] + a[i] + a[i+1]`)

**Problem:** Given an array `a`, create a new array `b` where each element `b[i]` is the sum of `a[i]`, `a[i-1]`, and `a[i+1]`. Handle edge cases for the first and last elements (sum only existing neighbors).

**Solution:**

```java
class Solution {
    int[] transformArray(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }

        int n = a.length;
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = a[i]; // Start with the current element

            // Add left neighbor if it exists
            if (i > 0) {
                sum += a[i - 1];
            }

            // Add right neighbor if it exists
            if (i < n - 1) {
                sum += a[i + 1];
            }
            b[i] = sum;
        }
        return b;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int[] a = {1, 2, 3, 4, 5};
// int[] b = sol.transformArray(a); // Result: {3, 6, 9, 12, 9}
// Explanation:
// b[0] = a[0] + a[1] = 1 + 2 = 3
// b[1] = a[0] + a[1] + a[2] = 1 + 2 + 3 = 6
// b[2] = a[1] + a[2] + a[3] = 2 + 3 + 4 = 9
// b[3] = a[2] + a[3] + a[4] = 3 + 4 + 5 = 12
// b[4] = a[3] + a[4] = 4 + 5 = 9
```

#### 6\. Counting Vowels/Consonants/Characters

**Problem:** Given a string, count the number of vowels (a, e, i, o, u, case-insensitive).

**Solution:**

```java
class Solution {
    int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (char c : lowerStr.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int vowelCount = sol.countVowels("Hello World"); // Result: 3 (e, o, o)
```

#### 7\. Basic Mathematical Operations (e.g., Fibonacci)

**Problem:** Implement a function to calculate the Nth Fibonacci number (iterative approach).

**Solution:**

```java
class Solution {
    int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be negative.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int fib5 = sol.fibonacci(5); // Result: 5 (0, 1, 1, 2, 3, 5)
// int fib10 = sol.fibonacci(10); // Result: 55
```

#### 8\. String Pattern Matching (Vowel/Consonant Rules)

**Problem:** Given a `pattern` string (e.g., "010" where '0' is vowel, '1' is consonant) and a `source` string, count how many substrings of `source` match the `pattern`.

**Solution:**

```java
class Solution {
    // Helper to check if a character is a vowel
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Helper to check if a character is a consonant
    private boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return Character.isLetter(c) && !isVowel(c);
    }

    int countPatternMatches(String source, String pattern) {
        if (source == null || pattern == null || source.length() < pattern.length()) {
            return 0;
        }

        int count = 0;
        int patternLen = pattern.length();
        int sourceLen = source.length();

        for (int i = 0; i <= sourceLen - patternLen; i++) {
            boolean match = true;
            for (int j = 0; j < patternLen; j++) {
                char patternChar = pattern.charAt(j);
                char sourceChar = source.charAt(i + j);

                if (patternChar == '0') { // Expecting vowel
                    if (!isVowel(sourceChar)) {
                        match = false;
                        break;
                    }
                } else if (patternChar == '1') { // Expecting consonant
                    if (!isConsonant(sourceChar)) {
                        match = false;
                        break;
                    }
                } else {
                    // Handle invalid pattern characters if necessary, or throw error
                    match = false;
                    break;
                }
            }
            if (match) {
                count++;
            }
        }
        return count;
    }
}

// Example Usage:
// Solution sol = new Solution();
// String source = "amazing";
// String pattern = "010"; // Vowel, Consonant, Vowel
// int matches = sol.countPatternMatches(source, pattern); // Result: 2 ("ama", "azi")
```

#### 9\. Array Element Parity (Even/Odd)

**Problem:** Given an array of integers, count how many numbers are even.

**Solution:**

```java
class Solution {
    int countEvenNumbers(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

// Example Usage:
// Solution sol = new Solution();
// int[] numbers = {1, 2, 3, 4, 5, 6};
// int evenCount = sol.countEvenNumbers(numbers); // Result: 3
```

#### 10\. Finding Duplicates/Unique Elements

**Problem:** Given an array of integers, return a new array containing only the unique elements.

**Solution:**

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    List<Integer> findUniqueElements(int[] arr) {
        if (arr == null) {
            return new ArrayList<>();
        }
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        return new ArrayList<>(uniqueSet);
    }
}

// Example Usage:
// Solution sol = new Solution();
// int[] numbers = {1, 2, 2, 3, 4, 4, 5};
// List<Integer> unique = sol.findUniqueElements(numbers); // Result: [1, 2, 3, 4, 5] (order might vary with HashSet)
```

-----

### Common Debugging Problem - Sample Bugged Code and Fixed Code

#### Problem: `NullPointerException` Debugging

**Scenario:** A function is supposed to process a list of strings and count the total length, but it crashes if the input list or any string within it is null.

**Sample Bugged Code:**

```java
import java.util.List;
import java.util.ArrayList;

class BuggySolution {
    int calculateTotalLength(List<String> words) {
        int totalLength = 0;
        // Bug: No null check for 'words' list itself
        for (String word : words) {
            // Bug: No null check for individual 'word'
            totalLength += word.length(); // This line will throw NullPointerException
        }
        return totalLength;
    }

    public static void main(String[] args) {
        BuggySolution solver = new BuggySolution();

        // Test Case 1: Null list - will crash
        // List<String> nullList = null;
        // System.out.println("Total length for null list: " + solver.calculateTotalLength(nullList));

        // Test Case 2: List with null elements - will crash
        List<String> listWithNulls = new ArrayList<>();
        listWithNulls.add("hello");
        listWithNulls.add(null); // This null will cause the crash
        listWithNulls.add("world");
        System.out.println("Total length for list with nulls: " + solver.calculateTotalLength(listWithNulls));
    }
}
```

**Explanation of the Bug:**

The `calculateTotalLength` method fails to handle `null` inputs.

1.  If `words` itself is `null`, the `for-each` loop `for (String word : words)` will immediately throw a `NullPointerException`.
2.  If `words` is not `null` but contains `null` elements (e.g., `listWithNulls.add(null);`), then when the loop iterates and `word` becomes `null`, `word.length()` will throw a `NullPointerException`.

**Fixed Code:**

```java
import java.util.List;
import java.util.ArrayList;

class FixedSolution {
    int calculateTotalLength(List<String> words) {
        int totalLength = 0;

        // FIX 1: Check if the input list itself is null
        if (words == null) {
            return 0; // Or throw an IllegalArgumentException, depending on requirements
        }

        for (String word : words) {
            // FIX 2: Check if the individual string is null before calling .length()
            if (word != null) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    public static void main(String[] args) {
        FixedSolution solver = new FixedSolution();

        // Test Case 1: Null list - now handles gracefully
        List<String> nullList = null;
        System.out.println("Total length for null list: " + solver.calculateTotalLength(nullList)); // Expected: 0

        // Test Case 2: List with null elements - now handles gracefully
        List<String> listWithNulls = new ArrayList<>();
        listWithNulls.add("hello");
        listWithNulls.add(null);
        listWithNulls.add("world");
        System.out.println("Total length for list with nulls: " + solver.calculateTotalLength(listWithNulls)); // Expected: 10 (5 for "hello" + 5 for "world")

        // Test Case 3: Normal list
        List<String> normalList = new ArrayList<>();
        normalList.add("java");
        normalList.add("code");
        System.out.println("Total length for normal list: " + solver.calculateTotalLength(normalList)); // Expected: 8
    }
}
```

**Debugging Approach (Mental Steps):**

1.  **Observe the Crash:** The program throws a `NullPointerException`.
2.  **Examine the Stack Trace:** The stack trace points to the line `totalLength += word.length();`.
3.  **Identify the Potential Null:** This means either `word` itself is null, or `words` is null (if the loop wasn't entered properly).
4.  **Consider Input:** What kind of inputs could lead to `word` or `words` being null?
      * Calling the method with `calculateTotalLength(null)`.
      * Adding `null` to the `ArrayList` used as input.
5.  **Formulate a Fix:** Add `null` checks before attempting to use the potentially null variables.
      * Add `if (words == null)` at the beginning.
      * Add `if (word != null)` inside the loop.
6.  **Test:** Run with the original crashing inputs and new valid inputs to ensure the fix works and doesn't introduce new issues.
