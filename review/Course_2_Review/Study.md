## Part 1: Common Types of Problems

The most common types of questions in the CodeSignal Mastering Algorithms and Data Structures in Java assessment focus on core computer science concepts that are essential for technical interviews. The questions are designed to test your understanding and application of various data structures and algorithms, as well as your ability to write efficient and clean code.

***

### Data Structures 🗂️

Questions frequently involve manipulating and using different data structures. You should be familiar with:

* **Arrays**: Problems often require you to traverse, sort, or manipulate elements in one-dimensional and multi-dimensional arrays. Questions can involve tasks like finding a missing number in a sorted array or performing complex manipulations on 2D arrays (matrices).
* **Linked Lists**: Expect questions that require you to perform operations on linked lists, such as reversing a list, merging two sorted lists, or detecting a cycle.
* **Hash Maps and Hash Sets**: These are frequently used for tasks involving counting, aggregation, and finding duplicates, as they provide efficient look-up times. A classic example is using a hash map to count the occurrences of each character in a string.
* **Stacks and Queues**: You may be asked to solve problems that use these structures for tasks like checking for balanced parentheses or implementing a "first-in, first-out" (FIFO) system. 

***

### Algorithms ⚙️

The assessment tests your ability to apply and implement common algorithms. Key topics include:

* **Sorting and Searching**: You'll encounter problems that require you to sort data or search for specific elements. Binary search is a common technique for sorted arrays, while other problems may require you to implement a sorting algorithm or choose the most optimal one for a given scenario.
* **String Manipulation**: Problems often involve working with strings, such as reversing a string, finding patterns within a string, or performing other complex text-based operations.
* **Recursion and Iteration**: Many problems, particularly those involving trees or the Fibonacci sequence, can be solved using either recursive or iterative approaches. The questions often test your ability to understand and implement both.
* **Two-Pointer Technique**: This is a useful approach for solving problems that involve searching for a pair of elements in a sorted array. It's an efficient way to find a solution without having to use nested loops.

## Part 2: Example Problems
Based on the types of questions common in the CodeSignal Mastering Algorithms and Data Structures in Java assessment, here are some example problems with solutions and explanations.

-----

### 1\. Array Manipulation: `adjacentElementsProduct` 🔢

**Problem**: Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

**Example**: For `inputArray = [3, 6, -2, -5, 7, 3]`, the output should be `21` (from `7 * 3`).

**Solution**:

```java
class Solution {
    int adjacentElementsProduct(int[] inputArray) {
        // Start with the product of the first two elements.
        int largestProduct = inputArray[0] * inputArray[1];
        
        // Loop through the array starting from the second element.
        // We stop at inputArray.length - 1 because we're looking at pairs (i, i+1).
        for (int i = 1; i < inputArray.length - 1; i++) {
            // Calculate the product of the current adjacent pair.
            int currentProduct = inputArray[i] * inputArray[i + 1];
            
            // If the current product is greater than the largest one found so far,3
            // update the largestProduct.
            if (currentProduct > largestProduct) {
                largestProduct = currentProduct;
            }
        }
        
        return largestProduct;
    }
}
```

**Explanation**:
This problem is a straightforward example of array traversal. The solution initializes a variable `largestProduct` with the product of the first two elements. It then iterates through the rest of the array, calculating the product of each adjacent pair and comparing it to `largestProduct`. If a larger product is found, `largestProduct` is updated. This approach ensures that we find the maximum product in a single pass through the array.

-----

### 2\. String Manipulation: `checkPalindrome` ✍️

**Problem**: Given the string `inputString`, check if it's a palindrome. A palindrome is a string that reads the same backward as forward.

**Example**: For `inputString = "aabaa"`, the output should be `true`. For `inputString = "abac"`, the output should be `false`.

**Solution**:

```java
class Solution {
    boolean checkPalindrome(String inputString) {
        // Convert the string to a character array for efficient manipulation.
        char[] charArray = inputString.toCharArray();
        
        // Use two pointers, one starting from the beginning and one from the end.
        int left = 0;
        int right = charArray.length - 1;
        
        // Loop while the left pointer is less than the right pointer.
        while (left < right) {
            // If the characters at the left and right pointers don't match,
            // it's not a palindrome.
            if (charArray[left] != charArray[right]) {
                return false;
            }
            
            // Move the pointers inward.
            left++;
            right--;
        }
        
        // If the loop completes without finding any mismatches, it's a palindrome.
        return true;
    }
}
```

**Explanation**:
This is a classic two-pointer problem. We use two pointers, `left` and `right`, to check if the string is a palindrome. The `left` pointer starts at the beginning of the string, and the `right` pointer starts at the end. In each iteration, we compare the characters at these two pointers. If they are not equal, the string cannot be a palindrome, and we return `false`. If they are equal, we move both pointers one step closer to the center of the string (`left++` and `right--`). The loop continues until the pointers meet or cross. If the loop finishes without returning `false`, it means the string is a palindrome.

-----

### 3\. Hash Map: `firstDuplicate` 🗺️

**Problem**: Given an array `a` that contains only numbers in the range from 1 to `a.length`, find the first duplicate number for which the second occurrence has the minimal index. In other words, if there are multiple duplicates, return the one whose second occurrence is the earliest. If there are no duplicate numbers, return -1.

**Example**: For `a = [2, 1, 3, 5, 3, 2]`, the output should be `3`. The duplicates are 2 and 3. The second occurrence of 3 is at index 4, while the second occurrence of 2 is at index 5. Since index 4 is smaller, we return 3.

**Solution**:

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    int firstDuplicate(int[] a) {
        // Use a HashSet to store numbers we've seen.
        Set<Integer> seenNumbers = new HashSet<>();
        
        // Iterate through the array.
        for (int number : a) {
            // If we have already seen this number, it's a duplicate.
            // Since we're iterating from the beginning, this is the first
            // duplicate with the minimal second-occurrence index.
            if (seenNumbers.contains(number)) {
                return number;
            }
            
            // If we haven't seen the number, add it to the set.
            seenNumbers.add(number);
        }
        
        // If the loop finishes without finding any duplicates, return -1.
        return -1;
    }
}
```

**Explanation**:
This problem is a great use case for a **Hash Set**. A hash set provides constant-time average complexity for adding and checking for the existence of an element. We iterate through the array from left to right. For each number, we check if it already exists in our `seenNumbers` hash set. If it does, we've found our first duplicate (in terms of the minimal second-occurrence index) and can return it immediately. If the number is not in the set, we add it and continue. If the loop completes without finding any duplicates, we return -1. This approach is much more efficient than using nested loops, which would be O(n²).


-----


## Part 3: LeetCode Sample Problems
Yes, many of the problem types on CodeSignal's assessment are similar to those found on LeetCode. While CodeSignal's assessments are tailored for a hiring context with standardized scoring and proctoring, the underlying algorithmic challenges are fundamental to computer science and are widely used for interview preparation. The "Mastering Algorithms and Data Structures in Java" path on CodeSignal Learn directly parallels many of the most common LeetCode problems.

Here are some additional examples of common problems, often found on LeetCode, that test the same skills required for CodeSignal.

-----

### 4\. Linked List: `removeKFromList` 🔗

**Problem**: Given a singly linked list and an integer `k`, remove all nodes from the list that have a value equal to `k`.

**Example**: For `l = [3, 1, 2, 3, 4, 5]` and `k = 3`, the output should be `[1, 2, 4, 5]`.

**Solution**:

```java
// Definition for singly-linked list:
// class ListNode {
//   int value;
//   ListNode next;
//
//   ListNode(int value) {
//     this.value = value;
//   }
// }

class Solution {
    ListNode removeKFromList(ListNode l, int k) {
        // Handle the case where the head of the list has the value k.
        // We advance the head pointer until we find a node with a different value.
        while (l != null && l.value == k) {
            l = l.next;
        }

        // If the list is now empty, we can return null.
        if (l == null) {
            return null;
        }

        // Use a 'current' pointer to iterate through the rest of the list.
        ListNode current = l;

        while (current.next != null) {
            // Check if the next node's value is k.
            if (current.next.value == k) {
                // If it is, we skip it by linking the current node to the node after the next.
                current.next = current.next.next;
            } else {
                // If the next node's value is not k, we move to the next node.
                current = current.next;
            }
        }

        // The updated head of the list is 'l'.
        return l;
    }
}
```

**Explanation**:
This problem requires careful manipulation of pointers in a linked list. The solution first handles the edge case where the head of the list itself needs to be removed. It then iterates through the rest of the list with a `current` pointer. The key insight is to check the `next` node's value rather than the `current` node's value. If `current.next.value` is equal to `k`, we simply bypass that node by setting `current.next` to `current.next.next`, effectively "deleting" the node. If the value is not `k`, we move `current` to the next node. This prevents us from losing the reference to the node we're currently on.

-----

### 5\. Binary Search: `isPowerOfTwo` 🔎

**Problem**: Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`. An integer `n` is a power of two if there exists an integer `x` such that `n == 2^x`.

**Example**: For `n = 8`, the output should be `true` because `8 = 2^3`.

**Solution**:

```java
class Solution {
    boolean isPowerOfTwo(int n) {
        // Powers of two are positive, so we handle non-positive numbers.
        if (n <= 0) {
            return false;
        }

        // A power of two in binary representation has only one bit set to '1'.
        // For example:
        // 1 (2^0) -> 0001
        // 2 (2^1) -> 0010
        // 4 (2^2) -> 0100
        // 8 (2^3) -> 1000

        // The expression 'n & (n - 1)' will clear the lowest set bit.
        // For example, if n = 8 (1000 in binary), n - 1 = 7 (0111).
        // 1000 & 0111 = 0000.
        // If n is a power of two, it has only one '1' bit, so 'n & (n - 1)' will be 0.
        return (n & (n - 1)) == 0;
    }
}
```

**Explanation**:
While this problem can be solved with a simple loop, the most elegant and efficient solution uses a **bit manipulation** trick. The key property of a power of two is that in its binary representation, there is exactly one bit set to `1`. For any integer `n` that is a power of two, `n-1` will have all the bits below the most significant bit set to `1`. Therefore, performing a bitwise AND operation (`&`) between `n` and `n-1` will always result in `0`. This is a classic pattern recognition problem.

-----

### 6\. Stack: `validParentheses` 🧠

**Problem**: Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid. An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.

**Example**: For `s = "()[]{}"`, the output should be `true`. For `s = "(]"` the output should be `false`.

**Solution**:

```java
import java.util.Stack;

class Solution {
    boolean validParentheses(String s) {
        // Use a Stack to keep track of open brackets.
        Stack<Character> stack = new Stack<>();

        // Iterate through each character of the string.
        for (char c : s.toCharArray()) {
            // If the character is an open bracket, push it onto the stack.
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                // If the stack is empty, it means we have a closing bracket
                // with no corresponding open bracket.
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top of the stack and check for a match.
                char top = stack.pop();

                // If the brackets don't match, the string is invalid.
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        
        // After iterating, the stack should be empty if all brackets were closed correctly.
        return stack.isEmpty();
    }
}
```

**Explanation**:
This is a standard **stack-based** problem. A stack's LIFO (Last-In, First-Out) nature is perfect for validating nested structures like parentheses. We iterate through the string, pushing every opening bracket onto the stack. When we encounter a closing bracket, we check two things:

1.  Is the stack empty? If so, we have a closing bracket with no corresponding opening one.
2.  Does the closing bracket match the most recently opened bracket at the top of the stack? If not, the order is incorrect.
    If both conditions are met, we pop from the stack and continue. Finally, after the loop, if the stack is empty, it means all opening brackets were correctly closed.


## Part 4: Hashing, Sorting & Searching Stacks, Queues, and LinkedLists
Here are some common problems and solutions for each of the requested topics, with a focus on core concepts and practical examples.

-----

### 1\. Hashing, Dictionaries, and Sets 🗺️

Hashing is all about using a **hash function** to map data to a unique key. **Dictionaries** (or HashMaps) use this to store key-value pairs, while **Sets** use it to store unique elements. A common application is to quickly check for the existence of an element or to count frequencies.

#### Problem: Two Sum

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the `target`.

**Solution using a HashMap**
The naive approach is to use a nested loop, but this has a time complexity of O(n²). A more efficient solution uses a HashMap to store the numbers you've already seen and their indices. This approach reduces the time complexity to O(n) because each lookup in a HashMap takes, on average, O(1) time.

```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1.  Initialize an empty HashMap.
        Map<Integer, Integer> numMap = new HashMap<>();
       
       //2.  Iterate through the array `nums` with a single loop.
        for (int i = 0; i < nums.length; i++) {
            
            //3.  For each number `currentNum`, calculate its `complement` (`target - currentNum`).
            int complement = target - nums[i];
            
            //4.  Check if the `complement` exists as a key in the HashMap.
            if (numMap.containsKey(complement)) {
                //If it does, you've found the pair\! Return the index of the `complement` (from the HashMap) and the index of the `currentNum`.
                return new int[] { numMap.get(complement), i };
            }
            //If it doesn't, add the `currentNum` and its index to the HashMap.
            numMap.put(nums[i], i);
        }
        // This part should not be reached if a solution is guaranteed
        throw new IllegalArgumentException("No two sum solution");
    }
}
```

-----

### 2\. Sorting and Searching Algorithms 🔍

Sorting and searching are fundamental to many algorithms. **Sorting** organizes data to make other operations more efficient, and **binary search** is a powerful technique for quickly finding an element in a sorted collection.

#### Problem: First Bad Version

You are a product manager and want to find the first bad version of a product. You have an API `boolean isBadVersion(version)` which will return whether a version is bad. Given `n` versions, find the first bad one.

**Solution using Binary Search**
This problem is a classic application of binary search. The search space is the range of versions from 1 to `n`. Since the versions are "sorted" (all versions after a bad one are also bad), we can use binary search to find the transition point.

1.  Set up `left` and `right` pointers to represent the search range (1 to `n`).
2.  Use a `while` loop that continues as long as `left` is less than or equal to `right`.
3.  Calculate the `mid` point. It's crucial to use `left + (right - left) / 2` to prevent integer overflow.
4.  Call the `isBadVersion(mid)` API.
      * If `isBadVersion(mid)` is true, it means the first bad version could be `mid` or somewhere before it. We store `mid` as a potential answer and narrow our search to the left half by setting `right = mid - 1`.
      * If `isBadVersion(mid)` is false, the first bad version must be after `mid`. We narrow our search to the right half by setting `left = mid + 1`.
5.  After the loop, the stored potential answer will be the first bad version.

<!-- end list -->

```java
// The isBadVersion API is defined in the parent class.
// boolean isBadVersion(int version);

public class Solution {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBad = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                firstBad = mid;
                right = mid - 1; // Try to find an even earlier bad version
            } else {
                left = mid + 1; // The bad version must be after mid
            }
        }
        return firstBad;
    }
}
```

-----

### 3\. Stacks and Queues 🥞

**Stacks** are LIFO (Last-In, First-Out) data structures, great for problems involving nested structures or backtracking. **Queues** are FIFO (First-In, First-Out), perfect for problems where processing order is important, like in breadth-first search.

#### Problem: Valid Parentheses

Given a string `s` containing just the characters `(`, `)`, `{`, `}`, `[`, and `]`, determine if the input string is valid.

**Solution using a Stack**
This problem is a perfect use case for a stack. We process the string one character at a time.

1.  Initialize an empty `Stack`.
2.  Iterate through the string:
      * If the character is an **opening bracket** (`(`, `{`, `[`), push it onto the stack.
      * If the character is a **closing bracket** (`)`, `}`, `]`), check two conditions:
          * Is the stack empty? If so, there's no matching opening bracket, so the string is invalid.
          * Does the top of the stack match the corresponding opening bracket? If not, the order is wrong, and the string is invalid. If it matches, pop the opening bracket off the stack.
3.  After the loop, if the stack is **empty**, all brackets were matched correctly. The string is valid. If the stack is not empty, there are unmatched opening brackets, so the string is invalid.

<!-- end list -->

```java
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
```

-----

### 4\. Linked Lists ⛓️

**Linked Lists** are collections of nodes, where each node contains data and a pointer to the next node. They're great for dynamic data where frequent insertions or deletions are needed.

#### Problem: Reverse Linked List

Given the `head` of a singly linked list, reverse the list, and return the reversed list's head.

**Solution using Iteration**
Reversing a linked list involves re-pointing the `next` pointers of each node. A common iterative approach uses three pointers: `prev`, `current`, and `nextTemp`.

```java
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        // 1.  Initialize three pointers: `prev` to `null`, and `current` to `head`.
        ListNode prev = null;
        ListNode current = head;

        // 2.  Iterate through the list using a `while` loop that runs as long as `current` is not `null`.
        while (current != null) {
            // 3.  Inside the loop:
            // Store the **next** node in a temporary variable (`nextTemp = current.next`). This is crucial so you don't lose the rest of the list.
            ListNode nextTemp = current.next;

            // Reverse the current node's pointer: `current.next = prev`.
            current.next = prev;

            // Move the `prev` and `current` pointers one step forward: `prev = current` and `current = nextTemp`.
            prev = current;
            current = nextTemp;
        }
        // 4.  After the loop, `prev` will be pointing to the original tail of the list, which is now the new head. Return `prev`.
        return prev;
    }
}
```


Yes, you can absolutely review the concepts efficiently without doing every single practice problem. The key is to understand the **logic and purpose** behind the use of each data structure and then apply that knowledge to the problems. This approach will be much faster and more effective for your other courses as well.

***

### 🎯 1\.Core Concepts: Sets and Maps

This course review focuses on two fundamental Java data structures: **Sets** and **Maps**. Understanding what they are and their main use cases is the most important part.

* **Set:** A collection that stores **unique** elements. It's a great tool for checking for the existence of an element or removing duplicates. 
    * **Main Idea:** The `add()` method in a `HashSet` is very efficient, and the `contains()` method is extremely fast. This makes Sets ideal for problems where you need to check if something has been seen before or find duplicates. 
* **Map:** A collection that stores **key-value pairs**. It's perfect for looking up a value based on a specific key. 
    * **Main Idea:** The `get()` and `put()` methods in a `HashMap` provide quick access to values by using a key. This is perfect for problems involving counting occurrences, mapping one piece of data to another (like an ISBN to a book title), or any scenario where you need to associate data. 

***

### 🧠 Reviewing the Logic of Each Problem

Instead of solving the code, focus on why a Set or Map was used. Here's a breakdown of the logic for each practice problem in your review file:

#### **Hashing, Dictionaries, and Sets**

* **Problem `2.1 - 1/6 Practice #3` & `2.1 - 2/6 Practice #2` (Unique Visitor IDs, Unique Addresses):**
    * **Logic:** The goal is to store **only unique items**. A `HashSet` is the perfect tool for this because it automatically handles duplicates. You just add all the elements to the set, and it takes care of the rest. To get the size or convert it back to an array, you just access the set's properties.
* **Problem `2.1 - 2/6 Practice #1` (Audience Overlap):**
    * **Logic:** The task is to see if any user ID from `blog2` exists in `blog1`. The most efficient way to do this is to first put all the IDs from `blog1` into a `HashSet`. Then, iterate through `blog2` and use the `contains()` method on the set to check for a match. If a match is found, you can immediately return `true` because you've found an overlap. This is much faster than using nested loops.
* **Problem `2.1 - 3/6 Practice #1` (First Duplicate ID):**
    * **Logic:** This problem requires you to find the **first** duplicate. You can solve this by iterating through the array and using a `HashSet`. For each ID, try to add it to the set. If the `add()` method returns `false`, it means the ID already exists in the set, and you've found your first duplicate. This approach is very efficient as it avoids a full second loop or sorting.
* **Problem `2.1 - 3/6 Practice #2` (Anagrams):**
    * **Logic:** The core of this problem is to identify anagrams. Anagrams have the same characters, just in a different order. The trick is to create a "canonical" representation for each word. The most straightforward way is to **sort the characters** of each word alphabetically. For example, "cat" and "tac" both become "act" after sorting. You can use a `HashSet` to store these sorted strings from the first array. Then, for the second array, you sort each word and check if it exists in the set of sorted words.

#### **Maps**

* **Problem `2.1 - 4/6 Practice #4` (Bookstore Inventory):**
    * **Logic:** This is a classic example of using a `HashMap`. You need to associate one piece of data (the book's ISBN) with another (the book's title). A `HashMap` is the ideal choice for this, with the ISBN as the **key** and the title as the **value**. Adding, removing, or looking up books becomes a very simple, single-line operation.
* **Problem `2.1 - 5/6 Practice #1` & `2.1 - 6/6 Practice #2` (Word Count):**
    * **Logic:** These problems are about **counting occurrences**. A `HashMap` is the best tool for this. The word itself becomes the **key**, and the count becomes the **value**. The pattern for this is to iterate through your list of words. For each word, you check if it's already in the map. If it is, you get its current count and increment it. If it's not, you add it to the map with a count of 1. The `getOrDefault()` method is a convenient way to handle this logic in one line.
* **Problem `2.1 - 5/6 Practice #2` (Total Inventory):**
    * **Logic:** The goal is to sum up all the values in a `HashMap`. The simplest way to do this is to iterate over the **values** of the map directly. Most map implementations provide a `.values()` method that returns a collection of just the values, making it easy to loop through them and add them up.
* **Problem `2.1 - 6/6 Practice #1` (Frequent User):**
    * **Logic:** This problem combines the concept of counting occurrences with a specific condition. You'd use a `HashMap` to count each user's visits, just like in the word count problem. However, as you update the count for each user, you also check if their new count exceeds the `n/4` threshold. This allows you to find and return the frequent user as soon as you identify them, without needing to process the entire array first.

Sure, here's a single practice problem that combines the concepts of Sets and Maps, similar to what you might encounter on a coding assessment.

***

### 📝 Practice Problem: "Alien Dictionary" Word Count

You are given a list of words from an alien language. You need to write a function that determines which words are "duplicates." A word is considered a duplicate if it's an anagram of a word that appeared earlier in the list.

Your task is to return a `HashMap<String, Integer>` where:

* The **keys** are the unique words that have at least one anagram somewhere else in the list.
* The **values** are the total count of how many times that group of anagrams (including the original word) appeared in the list.

**Example 1:**
`words = {"cat", "tac", "act", "dog"}`
* "cat", "tac", and "act" are all anagrams of each other.
* "dog" has no anagrams.
* The total count for the "cat" anagram group is 3.
* The output should be `{"cat": 3}`.

**Example 2:**
`words = {"listen", "silent", "rat", "tar", "bat"}`
* "listen" and "silent" are anagrams (count 2).
* "rat" and "tar" are anagrams (count 2).
* "bat" has no anagrams.
* The output should be `{"listen": 2, "rat": 2}`.

**Constraints:**
* Words will only contain lowercase English letters.
* The input `List<String>` can be empty.
* If no anagrams exist, return an empty `HashMap`.

**Hint:**
Think about how you can use a **Map** to store the counts and a **Set** (or a Map) to efficiently identify anagram groups. The key insight is to create a **canonical representation** for each word to group its anagrams together.

***

### 💡 Suggested Solution Logic

1.  **Create a canonical representation for each word.** A good way to do this is to sort the letters of the word alphabetically. For example, "listen" and "silent" both become "eilnst".
2.  **Use a `HashMap` to count anagram groups.** Iterate through the input list of words. For each word, create its canonical representation. Use this canonical string as the **key** in your `HashMap`. The **value** will be an integer count. If the key already exists, increment the count; otherwise, add the key with a count of 1.
3.  **Use another `HashMap` to format the final output.** After counting all anagram groups, iterate through the first map. If a group's count is greater than 1, you know it's a "duplicate" group. You'll need to figure out which original word to use as the key in your final output map (for example, the first word from the original list that belongs to that anagram group).

The core idea for efficiently reviewing this course is to focus on the **purpose and mechanics** of each algorithm rather than memorizing code. Sorting and searching are about finding the right tool for a given scenario.

***

### 🎯 2\.Core Concepts: Sorting and Searching

This course covers a few fundamental algorithms for arranging and finding data.

* **Searching:**
    * **Linear Search:** Checks every element one by one. Simple but slow, especially for large datasets.
    * **Binary Search:** Drastically faster than linear search, but it **requires the data to be sorted**. It works by repeatedly dividing the search interval in half.
* **Sorting:**
    * **Quick Sort:** A highly efficient **divide-and-conquer** algorithm. It works by picking a "pivot" element and partitioning the array around it. The key idea is that the pivot ends up in its final, sorted position. Quick Sort is often fast in practice, but its performance can degrade on certain types of input.
    * **Merge Sort:** Another **divide-and-conquer** algorithm that is more stable and predictable than Quick Sort. It works by recursively dividing the array into smaller halves, sorting those halves, and then **merging** them back together.
* **Recursion:** A key technique used in many of these algorithms (Binary Search, Quick Sort, Merge Sort). It involves a function calling itself to solve smaller subproblems until a simple "base case" is reached.

***

### 🧠 Reviewing the Logic of Each Problem

Instead of re-writing the code, focus on the "why" and "how" of each solution.

#### **Recursion and Binary Search**

* **Problem `2.2 - 1/7 Practice #2 & #4` (Count Digits/Sum Stars):**
    * **Logic:** These are classic examples of **recursion**. The core idea is to handle one digit at a time (e.g., `num % 10`) and then recursively call the function on the rest of the number (`num / 10`) until the number is 0 (the **base case**). 
* **Problem `2.2 - 2/7 Practice #2, #4, #6` (Binary Search):**
    * **Logic:** Binary search's power comes from its requirement for a **sorted array**. The logic is always the same: find the midpoint, compare the target to the midpoint, and then discard half of the array. The variations (recursive vs. iterative, returning index vs. insertion point) all stem from this fundamental process.
* **Problem `2.2 - 3/7 Practice #1` (Bitonic Array Search):**
    * **Logic:** This problem combines two key concepts. First, you need to find the "peak" of the bitonic array. You can do this with a modified binary search. Once the peak is found, you know the array is divided into an ascending part and a descending part. You can then perform a standard binary search on the ascending side and a modified descending binary search on the other side.
* **Problem `2.2 - 3/7 Practice #2` (Find Max in a Cyclically Sorted Array):**
    * **Logic:** This is another clever use of binary search. The maximum element is the only one where its neighbor is smaller than it. The binary search logic is to compare the middle element with the rightmost element. If `nums[mid] < nums[right]`, the maximum element is in the left half, so you narrow your search there. Otherwise, the maximum is on the right.

#### **Sorting Algorithms**

* **Problem `2.2 - 4/7 Practice #2 & #4` (Quick Sort):**
    * **Logic:** Quick Sort is all about **partitioning**. The `partition` function is the most important part. It rearranges the array so that a pivot element is in its correct sorted position, with all smaller elements to its left and all larger elements to its right. The `quickSort` function then just recursively calls itself on the left and right subarrays.
* **Problem `2.2 - 5/7 Practice #4` (Merge Sort):**
    * **Logic:** Merge Sort is about **dividing and merging**. It first recursively splits the array in half until it gets to single-element arrays (which are, by definition, sorted). The `merge` function is the crucial part that takes two sorted subarrays and combines them into one large, sorted array.
* **Problem `2.2 - 6/7 Practice #2, #4, #5` (Custom Sorting):**
    * **Logic:** These problems highlight the power of **Java's built-in sorting methods** (`Arrays.sort` and `List.sort`). The key concept here is the **`Comparator`** interface. You don't need to write the sorting algorithm yourself; you just provide a `Comparator` that tells Java *how* to compare two elements. `Comparator.comparing()` and `thenComparing()` allow for chaining multiple sorting criteria, like sorting by price and then by rating.

#### **Advanced Concepts**

* **Problem `2.2 - 7/7 Practice #1` (Kth Largest Element):**
    * **Logic:** This is an application of the Quick Sort's partitioning logic, known as **Quick Select**. Instead of sorting the entire array, you only need to find the correct position for the Kth element. After partitioning, if the pivot's position is `k-1`, you've found the answer. If the position is too large, you search the left partition; if it's too small, you search the right partition. This avoids sorting the whole array and is much more efficient.
* **Problem `2.2 - 7/7 Practice #2` (Count Inversions):**
    * **Logic:** This problem is a clever modification of **Merge Sort**. The counting of inversions happens during the `merge` step. When you merge two sorted halves, if an element from the right half is smaller than an element from the left half, you know it forms an inversion with **all** the remaining elements in the left half. By adding `left.length - i` to your inversion count at this moment, you efficiently count a whole group of inversions at once.

Sure, here is a single practice problem that combines sorting and searching concepts, similar to what you might find on a coding assessment.

***

### 📝 Practice Problem: "Stellar Signal Decryption"

You've intercepted a signal from a distant star system. The signal is a sequence of integers representing the magnitude of stellar objects. Your task is to decode this signal by finding the `k` closest stellar objects to a given target magnitude. The closer an object's magnitude is to the target, the higher its priority.

Your function should take three arguments:
1.  An array of integers `magnitudes` (representing stellar objects' magnitudes).
2.  An integer `k` (the number of closest objects to find).
3.  An integer `target` (the target magnitude).

You need to return an array of `k` integers, representing the magnitudes of the `k` closest stellar objects to the `target`. The returned array should be sorted in ascending order. If two objects have the same difference from the target, the smaller magnitude should be considered "closer."

**Example:**
* `magnitudes = {10, 2, 14, 4, 12, 16}`
* `k = 3`
* `target = 10`

**Step-by-step logic:**
1.  **Calculate differences:**
    * `|10 - 10| = 0`
    * `|2 - 10| = 8`
    * `|14 - 10| = 4`
    * `|4 - 10| = 6`
    * `|12 - 10| = 2`
    * `|16 - 10| = 6`
2.  **Find the 3 closest:** The magnitudes with the smallest differences are `10` (diff 0), `12` (diff 2), and `14` (diff 4).
3.  **Handle ties:** Notice that `4` and `16` both have a difference of `6`. The problem states that the smaller magnitude is considered closer, but in this case, neither `4` nor `16` are among the top 3 closest.
4.  **Sort the final result:** The magnitudes `10, 12, 14` should be sorted in ascending order.

**Expected Output:** `[10, 12, 14]`

**Constraints:**
* `1 <= k <= magnitudes.length`
* The `magnitudes` array may not be sorted.
* Duplicates in the input array should be treated as separate objects.

***

### 💡 Suggested Solution Logic

The most efficient solution will involve a combination of **sorting** and a specialized **data structure**.

1.  **Custom Sorting:** You could sort the original `magnitudes` array based on a custom `Comparator`. This `Comparator` would prioritize elements with the smallest absolute difference from the `target`. If the differences are equal, it would then use the magnitude values themselves as a tie-breaker.
2.  **Extract the `k` elements:** After sorting, the `k` closest elements will be at the beginning of the array. You can then simply take the first `k` elements.
3.  **Final Sort:** The problem asks for the **final output** to be sorted by magnitude, so you'll need one more sort on just those `k` elements.

This approach demonstrates the power of custom sorting and using built-in methods to solve a complex problem efficiently.

Okay, let's efficiently review the concepts for Course 2.3 on Stacks and Queues. The key is to understand the **core principle** of each data structure and then apply that principle to the various problem scenarios.

***

### 🎯 3\.Core Concepts: Stacks and Queues

Stacks and Queues are both linear data structures, but they manage data in fundamentally different ways based on specific rules.

* **Stack:** A **LIFO** (Last-In, First-Out) data structure. Think of a stack of plates—you can only add a new plate to the top, and you can only remove the plate that is currently on top.
    * **Operations:** `push()` (add to top), `pop()` (remove from top), `peek()` (look at top), and `isEmpty()`. 
    * **Use Cases:** Ideal for problems involving reversing order, tracking a history of actions, or checking for balanced symbols (like parentheses).

* **Queue:** A **FIFO** (First-In, First-Out) data structure. Think of a line at a theme park ride—the first person in line is the first person to get on the ride.
    * **Operations:** `enqueue()` (add to back/rear), `dequeue()` (remove from front), `peek()` (look at front), and `isEmpty()`. 
    * **Use Cases:** Perfect for managing tasks in order, processing requests, or simulating waiting lines.

---

### 🧠 Reviewing the Logic of Each Problem

Instead of focusing on the code, let's analyze the problem-solving approach for each practice problem.

#### **Stacks**

* **Problems `2.3 - 1/5` (Stack implementation):**
    * **Logic:** These problems are about building a stack from scratch. The core logic involves using an array and a `top` index. `push()` increments `top` and adds the element. `pop()` returns the element at `top` and then decrements `top`. The `maxSize` and `capacity` checks are crucial for preventing errors like `ArrayIndexOutOfBoundsException`.
* **Problem `2.3 - 2/5 Practice #1` (Balanced Parentheses):**
    * **Logic:** This is a classic stack problem. You iterate through the string. When you see an opening parenthesis, you `push` it onto the stack. When you see a closing parenthesis, you check if the stack is not empty and if the top of the stack is its corresponding opening parenthesis. If it is, you `pop` the stack. If at any point the conditions aren't met, or if the stack is not empty at the end, the parentheses are not balanced.
* **Problem `2.3 - 2/5 Practice #2` (Reverse and Flip Case):**
    * **Logic:** This problem directly leverages the LIFO nature of a stack. You iterate through the input string, convert each character's case, and `push` it onto the stack. When you've processed the whole string, you `pop` each character off the stack and append it to a `StringBuilder`. Because a stack reverses the order, this effectively reverses the string.
* **Problem `2.3 - 3/5 Practice #1` (Following Smaller Elements):**
    * **Logic:** This is a more advanced stack problem. The key is to iterate through the array **from right to left**. You use the stack to keep track of elements you've seen so far. For each element `arr[i]`, you pop from the stack any elements that are greater than or equal to `arr[i]`. The element that remains at the top of the stack is the first smaller element to its right. If the stack becomes empty, there are no smaller elements to its right. Then, you push `arr[i]` onto the stack for the next elements to compare against.
* **Problem `2.3 - 3/5 Practice #2` (MaxStack):**
    * **Logic:** This problem optimizes the `getMax()` operation to constant time, $O(1)$. The trick is to use a **second stack** to track the maximums. When you `push` an element onto the main stack, you also push it onto the `maxValues` stack if it is greater than or equal to the current maximum (the top of the `maxValues` stack). When you `pop` from the main stack, you also pop from the `maxValues` stack if the element being removed is the current maximum. This way, the top of the `maxValues` stack is always the current maximum element.

#### **Queues**

* **Problems `2.3 - 4/5` (Queue implementation):**
    * **Logic:** Similar to stacks, these problems focus on the fundamental operations. A queue is typically implemented with a `LinkedList` or an array with `front` and `rear` pointers. `enqueue()` adds to the `rear` and increments the index. `dequeue()` removes from the `front` and increments the index. The use of the modulo operator (`%`) is crucial for creating a circular queue in an array-based implementation.
* **Problem `2.3 - 5/5 Practice #1` (Every Alter):**
    * **Logic:** This problem directly demonstrates the FIFO principle. You iterate through the input queue. For every element, you `dequeue` it. You use a counter to check if the element is at an even or odd index. If it's an even index, you `enqueue` it into the new queue (the final result). If it's an odd index, you `enqueue` it into a temporary queue. This process preserves the original relative order while filtering out the alternate elements.
* **Problem `2.3 - 5/5 Practice #2` (MovingAverage):**
    * **Logic:** This is a perfect use case for a queue as a **sliding window**. The queue holds the most recent `size` number of elements. When a new element arrives, you `enqueue` it. If the queue is now larger than `size`, you `dequeue` the oldest element (the one at the front). A running `sum` is maintained, and it is updated by adding the new element and subtracting the element that was removed. The average is then simply `sum / queue.size()`.

    Here's a single practice problem that combines the concepts of Stacks and Queues, similar to what you might find on a coding assessment.

***

### 📝 Practice Problem: "Stellar Message Decoder"

You are tasked with decoding a mixed-up message received from a distant star system. The message is a series of characters, and it's been scrambled into a queue. The decryption process works as follows:

1.  Take the first `n` characters from the front of the queue.
2.  Reverse the order of these `n` characters.
3.  Place the reversed characters back at the end of the queue.
4.  The remaining characters in the queue (the ones that were not part of the first `n`) are moved to the back of the queue, maintaining their original order.
5.  Repeat this process until the queue is empty.

Your function should take a `Queue<Character>` representing the scrambled message and an integer `n`. You must return a `Queue<Character>` with the decrypted message.

**Example:**
* **Input Queue:** `[ 'A', 'B', 'C', 'D', 'E', 'F' ]`
* **n:** `3`

**Step-by-step logic:**
1.  Take the first `n=3` characters: `A`, `B`, `C`.
2.  Reverse their order using a stack: `C`, `B`, `A`.
3.  Place the reversed characters at the end of the queue. The queue now looks like `[ 'D', 'E', 'F', 'C', 'B', 'A' ]`.
4.  The remaining characters (`D`, `E`, `F`) are moved to the back of the queue. Since they are already at the front of the queue, this step effectively does nothing in this simple case. In a more complex scenario, this would apply to the rest of the queue.

**Expected Output:** `[ 'D', 'E', 'F', 'C', 'B', 'A' ]`

**Constraints:**
* The input queue will not be empty.
* `1 <= n <= queue.size()`

***

### 💡 Suggested Solution Logic

The most efficient solution will use both a **Queue** and a **Stack** to handle the required operations.

1.  **Use a Stack for Reversal:** You can use a stack to easily reverse the first `n` elements. `dequeue` the first `n` elements from the input queue and `push` them onto a temporary stack. Because of the LIFO principle, when you `pop` them back off, they will be in reversed order.
2.  **Use a Queue for Manipulation:** The queue itself will be your primary data structure for the process. After reversing the first `n` elements and placing them back in the queue, you need to handle the remaining elements. The easiest way to do this is to simply `dequeue` the remaining elements and `enqueue` them back into the same queue. This moves them from the front to the back while preserving their relative order.
3.  **Combine the steps:** First, `dequeue` and `push` the first `n` elements onto a stack. Then, `pop` the elements from the stack and `enqueue` them back into the main queue. Finally, `dequeue` the rest of the elements and `enqueue` them back into the main queue.

To review Course 2.4 on Linked Lists efficiently, focus on the core logic and properties of this data structure rather than the code itself. Linked lists are defined by how their nodes connect and how you traverse that connection.

***

### 🎯 4\.Core Concepts: Linked Lists

A Linked List is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element (a **node**) contains a value and a **pointer** (or reference) to the next node in the sequence.

* **Nodes:** The fundamental building block of a linked list. Each node consists of a `value` and a `next` pointer.
* **Head:** The first node in the list. This is the entry point for all traversals.
* **Traversal:** The process of visiting each node in the list, typically starting from the head and following the `next` pointers. This is done with a `while (current != null)` loop.
* **Insertion & Deletion:** Unlike arrays, these operations can be very fast in a linked list, especially at the beginning or end. You just need to update a few pointers, not shift every element.

---

### 🧠 Reviewing the Logic of Each Problem

Let's break down the logic behind each problem from your review file.

#### **Basic Operations and Traversal**

* **Problems `2.4 - 1/4 Practice #5` & `2.4 - 4/4 Practice #2, #3, #4, #5` (Adding/Removing Nodes):**
    * **Logic:** These problems highlight the mechanics of adding and removing nodes.
        * **Adding to the end:** You must traverse the list until you find the last node (`while (current.next != null)`). The new node is then appended by setting `last.next = newNode`.
        * **Adding to the beginning:** You simply create a new node, set its `next` pointer to the current `head`, and then make the new node the new `head`.
        * **Removing:** To remove a node, you update the `next` pointer of the node **before** it to point to the node **after** it, effectively skipping the target node. Java's garbage collector will handle the removal of the unreferenced node.
* **Problem `2.4 - 2/4 Practice #2` (Index of X):**
    * **Logic:** This is a straightforward **traversal** problem. You start at the `head` and use a `while` loop to move from node to node. A counter variable keeps track of the current position. You stop when you find the target value and return the counter, or when you reach the end of the list and return -1.

#### **Advanced Operations**

* **Problem `2.4 - 2/4 Practice #1` (Last N Elements):**
    * **Logic:** This problem requires you to access the list from the end, which is difficult for a singly linked list. The simplest and most intuitive solution is to use a **Stack** (a LIFO data structure). You traverse the linked list once, pushing each node's value onto the stack. Then, you pop `n` elements from the stack. This gives you the last `n` elements in reverse order. A more advanced, but more memory-efficient solution would be a **two-pointer approach**, where one pointer is `n` nodes ahead of the other.
* **Problem `2.4 - 3/4 Practice #1` (Remove Duplicates):**
    * **Logic:** This problem requires a way to track which values have already been seen. The most efficient way to do this is with a `HashSet`. You traverse the list with a `current` pointer. For each node, you check its `next` node's value. If the value is already in the `HashSet`, you remove the `next` node by setting `current.next = current.next.next`. If the value is not in the `HashSet`, you add it and move on to the next node (`current = current.next`). This ensures a single pass through the list.
* **Problem `2.4 - 3/4 Practice #2` (Sum of Every Second):**
    * **Logic:** This is another simple **traversal** problem. You start at the `head` and use a loop to move through the list. A counter or a boolean flag can be used to track whether you are on the "first" or "second" node. You add the value of every second node to a running `sum`.

This review file focuses on the fundamental traversal and manipulation of singly linked lists. The key takeaway is that linked lists are excellent for efficient insertions and deletions, but they require a different approach for searching or accessing elements from the end compared to arrays.

Sure, here's a single practice problem that reinforces the key concepts of linked lists, similar to what you might encounter on a coding assessment.

***

### 📝 Practice Problem: "Stellar Traversal"

You're a space explorer navigating a cosmic wormhole, represented by a singly linked list. Each node in the list represents a data packet with an integer value. Unfortunately, some packets are corrupted and have the same value as the previous one. Your mission is to write a function that **removes all consecutive duplicate nodes** from a **sorted singly linked list**.

The linked list is guaranteed to be sorted in non-decreasing order. Your function should return the head of the modified list.

**Example 1:**
* **Input Linked List:** `1 -> 2 -> 2 -> 3 -> 3 -> 3 -> 4`
* **Output Linked List:** `1 -> 2 -> 3 -> 4`
* **Explanation:** The consecutive duplicates `2 -> 2` and `3 -> 3 -> 3` were removed, leaving only one instance of each value.

**Example 2:**
* **Input Linked List:** `5 -> 5 -> 5 -> 5`
* **Output Linked List:** `5`
* **Explanation:** All four consecutive nodes had the same value, so only a single node with the value `5` remains.

**Constraints:**
* The list may be empty.
* The list is sorted.
* The values in the nodes are integers.

***

### 💡 Suggested Solution Logic

The most efficient way to solve this is with a **single pass** through the linked list.

1.  **Iterate and Compare:** Start a pointer (let's call it `current`) at the head of the list. You will traverse the list with this pointer.
2.  **Look Ahead:** Inside your loop, compare the value of the `current` node with the value of the `next` node (`current.next`).
3.  **Handle Duplicates:** If `current.value` is equal to `current.next.value`, you have found a duplicate. Instead of moving `current` forward, you should update the `next` pointer of `current` to skip the duplicate node. The key line of code would be `current.next = current.next.next`. You continue this loop until you find a non-duplicate node or reach the end of the list.
4.  **Advance the Pointer:** If `current.value` is **not** equal to `current.next.value`, you know you are at a unique node. In this case, you can safely move `current` to the next node: `current = current.next`.
5.  **Edge Cases:** Remember to handle edge cases like an empty list, a list with only one node, and a list with duplicates at the end. Your loop condition should be `while (current != null && current.next != null)`.

This approach demonstrates a fundamental linked list manipulation technique that is both memory-efficient and time-efficient.


