# WGU Java Study Guide: CodeSignal Certification Preparation
## Certification Overview
##### The CodeSignal Java certification evaluates your knowledge in core Java programming concepts. While the exam may change at any moment without notice, historically, you can expect four timed coding questions designed to test logic, problem-solving, and command of Java syntax. You will not be graded on style or comments, only on correctness and performance.

### Important Notes:
* Time: ~70 minutes
* Format: 4 coding problems
* Graded automatically on accuracy, efficiency, and test cases passed
* Difficulty: Ranges from basic to advanced

## Core Java Topics to Review
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
4. Methods and Scope
* Method declarations: return types, parameters
* Static vs. instance methods
* Pass-by-value behavior
* Method overloading
5. Object-Oriented Programming (OOP)
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

## Key Java Functions and Concepts
### Task Example
* Parse String to int int x = Integer.parseInt("123");
* Convert int to String String s = String.valueOf(123);
* Sort an array Arrays.sort(myArray);
* Use ArrayList ArrayList<Integer> list = new ArrayList<>();
* Use HashMap HashMap<String, Integer> map = new HashMap<>();
* Loop over array for (int i : arr) { }
* String equality "abc".equals("abc")
* Length of array arr.length
* Length of String str.length()

### Test-Taking Tips
* Start with the easiest problem first.
* Use meaningful variable names, but focus on speed.
* Always test your solution with edge cases.
* If stuck, skip and return later.
* Make use of built-in Java libraries.

### Practice Platforms
* CodeSignal Arcade – Java Section: https://codesignal.com/
* LeetCode Easy & Medium Java Problems: https://leetcode.com/
* HackerRank Java Practice: https://www.hackerrank.com/domains/tutorials/10-days-of-java
* GeeksforGeeks Java Programming: https://www.geeksforgeeks.org/java/

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