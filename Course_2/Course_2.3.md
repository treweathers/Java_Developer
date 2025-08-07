<h1 align='center'> Course 2: Mastering Algorithms and Data Structures in Java </h1> 

# Course 2.3: Advanced Data Structures - Stacks and Queues in Java
## Lesson 1: Stacking Up in Java: Understanding Stacks Data Structure
### Overview and Actualization
Hello, dear student! Today's lesson will take you on an exciting journey through **Stacks**, a powerful tool in Java. In programming, **Stacks** are fundamental data structures utilized in various applications. Our goal for this lesson is to understand the concept of Stacks, learn how to implement and manipulate them in Java and delve deep into their complexities. Let's get started!

### 1. Introduction to Stacks
First and foremost, let's understand what a Stack is. Imagine a stack of plates that you can only remove from the top. That's precisely what a Stack is: a Last-In, First-Out (LIFO) structure. Stacks are used in memory management, backtracking algorithms, and more. The key operations involved are `Push` (adding an element to the top of the stack), `Pop` (removing the topmost element), and `Peek` (looking at the topmost element without removing it).

### 2. Stack Implementation
Java provides two common ways to implement Stacks: Array-based and Linked-list-based. In the former, we use an array to store the elements to create the Stack; in the latter, we use a linked list instead. Let's look into creating a Stack using an array in Java:

```java
class Stack{
    int size;
    int top=-1;
    int[] stackArray;
  
    public Stack(int size){
        this.size = size;
        stackArray = new int[size];
    }
}
```
`top` represents the index in the stackArray that is currently the top element of the stack. It is initialized to `-1`, showing the stack is empty, and there is no valid index for the top element.

### 3. Stack Operations – Push
A Stack involves three operations - `Push`, `Pop`, and `Peek`. In an array-based Stack, the `Push` operation adds a new element at the top of the Stack. Here’s how we can write a push function:

```java
public void push(int data){
    if(top < size - 1){
        stackArray[++top] = data;
    } else {
        System.out.println("Stack Overflows");
     }
}
```
Before adding the element, the method checks if the stack is full by comparing `top` with `size-1`(maximum array index). If it's less, we still have room to insert the element; otherwise, it gives a "Stack Overflows" message. The `++top` operation increments the `top` variable (which represents the top element index in the stack) by one and then uses this new value as an index to add the `data` element into the `stackArray`.

### 4. Stack Operations – Pop
The `Pop` operation removes the topmost element from the Stack.
```java
public int pop() {
    if (top > -1) {
        return stackArray[top--];
    } else {
        System.out.println("Stack Underflows");
        return -1;
    }
}
```
This method removes and returns the top item of the stack. It checks if the stack is empty by checking if `top` is greater than `-1`. If it is, it decrements `top` and returns the element that was just removed from the top of the stack. Notice that we do not actually remove the element from the array. We decrease the `top` variable, so it no longer points to the popped element.

### 5. Stack Operations – Peek
Lastly, the `Peek` operation returns the topmost element without removing it from the Stack.

```java
public int peek() {
    if (top > -1) {
        return stackArray[top];
    } else {
        System.out.println("Stack is Empty");
        return -1;
    }
}
```
### 6. Stack Complexity Analysis
Since we perform them at one end of the data structure, the `Push`, `Pop`, and `Peek` operations take constant time, represented as O(1). Space complexity refers to the space taken by the Stack, proportional to the number of elements. Hence, it is represented as O(n), where `n` is the number of elements in the Stack.

### 7. Java's Built-In Stack Class
While understanding the stack's inner structure is vital for knowing its possibilities, we don't need to implement it ourselves. Java provides a built-in Stack class located in the `java.util` package. This class offers methods to perform the necessary operations such as `push()`, `pop()`, `peek()` etc.

Here's an example of how you can use the built-in Stack class.

```java
import java.util.Stack;

class Main { 
    public static void main(String[] args) { 
        Stack<Integer> stack = new Stack<>(); 

        // Performing the push operation
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 

        System.out.println("Stack: " + stack); 

        // Performing the pop operation
        int popped = stack.pop();
        System.out.println("Popped from stack: " + popped);

        // Performing the peek operation
        int peeked = stack.peek();
        System.out.println("Peeked from stack: " + peeked);
    } 
}
```
The output will be:
```java
Stack: [10, 20, 30]
Popped from stack: 30
Peeked from stack: 20
```
This example showcases the creation of a Stack and the utilization of the `push()`, `pop()`, and `peek()` methods. Besides these operations, Java's Stack class also includes methods like `isEmpty()` to check if the stack is empty, `search(Object o)` to find the 1-based position from the top of the stack where an object is located, `remove(Object o)` and `remove(int index)` to remove an object or an object at a specific index, and others.

### Lesson Summary and Practice Announcement
Congratulations, you've completed the lesson on Stacks in Java! You will now proceed to the practice sessions using the concepts learned here. These hands-on practice exercises will help solidify your knowledge and improve your problem-solving skills. So, get ready to roll up your sleeves and dive right in!

#### Practice #1
In the context of managing a restaurant kitchen, you have code that simulates the operations of a stack handling dishes. The chef uses the stack to keep track of the dishes that need to be prepared. Click Run to see how the Stack class manages the addition and removal of dishes.
```java

class Stack {
    private int top = -1;
    private int[] dishesStack;

    public Stack(int capacity) {
        dishesStack = new int[capacity];
    }

    public void push(int dish) {
        if (top < dishesStack.length - 1) {
            dishesStack[++top] = dish;
        } else {
            System.out.println("Kitchen shelf is full!");
        }
    }

    public int pop() {
        if (top > -1) {
            return dishesStack[top--];
        } else {
            System.out.println("No dishes to process!");
            return -1;
        }
    }

    public int peek() {
        if (top > -1) {
            return dishesStack[top];
        } else {
            System.out.println("Kitchen shelf is empty!");
            return -1;
        }
    }
}

class Solution {
    public static void main(String[] args) {
        Stack kitchenStack = new Stack(3); // A stack for holding dishes
        kitchenStack.push(1); // Plate 1 arrives
        kitchenStack.push(2); // Plate 2 arrives
        
        System.out.println(kitchenStack.peek()); // Check the top plate (should be 2)

        kitchenStack.pop(); // Process Plate 2
        kitchenStack.pop(); // Process Plate 1
        kitchenStack.pop(); // Try to process a non-existent plate
    }
 }
```

#### Practice #2
Well done, Space Voyager! Now, let's see if you can implement one of the key methods of a Stack from scratch. It's time to push ahead and add some elements to your dish stack!
```java
class Stack {
    private int maxSize;
    private int[] dishStack;
    private int top;

    public Stack(int s) {
       maxSize = s;
       dishStack = new int[maxSize];
       top = -1;
    }

    // TODO: Add the method to push a new dish onto the stack
    public void push(int dish) {
        if (top < dishStack.length - 1) {
            dishStack[++top] = dish;
    // If the stack is full, let the chef know they can't add more dishes!
        } else {
            System.out.println("Sorry, kitchen shelf is full!");
        }
    }
}

class Solution {
  
    public static void main(String[] args) {
       Stack plateStack = new Stack(3); // A stack to hold 3 plates
       plateStack.push(1); // Add a plate with ID 1
       plateStack.push(2); // Add a plate with ID 2
       plateStack.push(3); // Add a plate with ID 3
       plateStack.push(4); // Fail to add a plate with ID 4 as stack is full
    }
}
```

#### Practice #3
Alright, Space Voyager, I need your keen eye! The chef robot in the kitchen is designed to manage order stacks, but it's acting oddly and not accepting any new orders. Could you check the code and fix what's wrong? Good luck, and pay close attention to how stacks should properly function!
```java
class Stack {
    private int capacity;
    private int[] kitchenOrders;
    private int topIndex = -1;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.kitchenOrders = new int[capacity];
    }

    void addOrder(int order) {
    // this was topIndex > capaxity - 1, needed to be <
        if (topIndex < capacity - 1) {
            kitchenOrders[++topIndex] = order;
        } else {
            System.out.println("Kitchen is too busy, cannot take more orders!");
        }
    }

    int nextOrder() {
        if (topIndex > -1) {
            return kitchenOrders[topIndex--];
        } else {
            System.out.println("No orders to prepare!");
            return -1;
        }
    }
}

class Solution {

    public static void main(String[] args) {
        Stack kitchenStack = new Stack(5);
        kitchenStack.addOrder(101); // Order #101 added
        kitchenStack.addOrder(102); // Order #102 added
        kitchenStack.addOrder(103); // Order #103 added
        kitchenStack.addOrder(104); // Order #104 added
        kitchenStack.addOrder(105); // Order #105 added
        System.out.println("Next order to prepare: " + kitchenStack.nextOrder()); // Should print order #105
    }
}
```

#### Practice #4
Observe how a stack of plates is managed in a restaurant kitchen. The given code simulates the addition of plates to the stack and the washing of the topmost plate. Click Run to observe the stack operations in action!
```java
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        // Create a stack to represent plates
        Stack<String> platesStack = new Stack<>();

        // Add three plates to the stack
        platesStack.push("Plate 1");
        platesStack.push("Plate 2");
        platesStack.push("Plate 3");

        // Wash the topmost plate
        String washedPlate = platesStack.pop();
        System.out.println("Washed: " + washedPlate);
    }
}
```

#### Practice #5
Great work so far! Now let's consolidate your knowledge by implementing from scratch a small Java program that simulates the stacking of plates in a restaurant kitchen. Your task is to create a stack, add plates to it, and then remove all the plates one by one, printing the whole stack after each removal.
```java
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        // TODO: Create a Stack object to simulate a stack of plates
        Stack<Integer> stack = new Stack<>();
        // TODO: Add three plates to the stack (numbered 1, 2, 3)
        stack.add(1);
        stack.add(2);
        stack.add(3);
        // TODO: Remove all the plates from the stack. Print initial stack state and its state after each removal
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
```
## Lesson 2: Mastering Stack Operations in Java: Validating Parentheses and Reversing Strings
### Introduction to the Lesson
Welcome back! As we dive further into stack **operations in Java**, remember how these structures serve similar functions in programming as they do in simple physical tasks. For instance, when you stack plates, the last one you put on top is the first one you'll take off when setting the table. A computer's stack allows us to temporarily put away pieces of data, just as we can pile those plates and retrieve them later in the reverse order of how we placed them away. Today, we will apply the *last-in, first-out* principle to solve two specific problems that will solidify your understanding of stack operations in Java.

### 1. Problem 1: Validating Parentheses
Validating nested structures such as parentheses is common in computing — it's like ensuring that a series of opened boxes are correctly closed. We will create a function to verify that a string of parentheses is properly nested and closed — essentially checking for balance.

### 2. Problem 1: Actualization
Unbalanced parentheses can result in errors in our coding endeavors, much like a misplaced or missing piece in a complex puzzle. Our function will be that of a diligent organizer, confirming that every opened parenthesis finds its rightful closure.

### 2. Problem 1: Naive Approach
If we consider a simple way to approach this problem, we could initialize a counter variable for each type of bracket (parentheses, braces, and square brackets), increment the counters when we encounter an opening bracket, and decrement it when we get a closing bracket. Although this approach checks whether we have a closing bracket for every opening bracket, it completely misses one critical aspect - the order of brackets. For the brackets to be considered balanced, every closing bracket must correspond to the most recently opened bracket of the same type, which is not checked in this approach.

### 3. Problem 1: Efficient Approach
A stack data structure is an efficient way to solve this problem. The stack follows the LIFO (Last In, First Out) principle, which makes it highly suitable to track the opening and closing brackets' order, as the most recently opened bracket needs to be closed before we move on to the next opening bracket.

### 4. Problem 1: Algorithm
We create a dictionary that maps each opening bracket to its corresponding closing bracket and an empty stack. Then, we iterate over each character in the string: If a character is an opening bracket, it gets appended to the stack. If a character is a closing bracket and the top element in the stack is the corresponding opening bracket, we remove the top element from the stack.

If at any point we meet a closing bracket that doesn't match the top bracket in stack, we return `false`.

### 5. Problem 1: Solution Building
First, let's introduce brackets mapping and set:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(areBracketsBalanced("(){}[]"));  // prints: true
    }

    public static boolean areBracketsBalanced(String inputStr) {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        
        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        openPar.add('[');
        openPar.add('{');
    }
}
```
Now, let's implement the solution loop:

```java
        for (int i = 0; i < inputStr.length(); i++) {
            char character = inputStr.charAt(i);
            if (openPar.contains(character)) {
                stack.push(character);
            } else if (!stack.isEmpty() && character == bracketMap.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
```
It returns `false` in three cases:

1. If at any point we find a closing bracket and the stack of opening brackets is empty
2. If at any point we find a closing bracket and the latest opening bracket doesn't match
3. If at the end of the process we have any opening brackets left in the stack

### 6. Problem 2: Reverse a String using a Stack
Next, we will flip the script — quite literally — by reversing strings. It may seem straightforward, but it demonstrates the effective use of data structures in computation.

### 7. Problem 2: Actualization
Imagine you're tasked with building a function in which a user can input a string, and you need to display the reversed string as part of the application features. Or, as a more advanced example, in computer networks, stack buffers are often used to reverse the order of packets that arrive out of order. Understanding how to reverse the order of elements using a Stack is a crucial skill.

### 8. Problem 2: Approach Explanation
Thanks to the stack's Last In First Out (LIFO) feature, it serves as an excellent tool to reverse elements' order. The strategy here is straightforward: push all the characters to a stack and then pop them out. As a result, we get the reversed string.

A stack inverts addition and removal sequences, much like pressing rewind on a video. Pushing items onto a stack and later popping them off effectively turns the sequence on its head, as if by magic.

### 9. Problem 2: Solution Building
```java
Stack<Character> stack = new Stack<>();
for (char c : str.toCharArray()) {
    stack.push(c);
}
StringBuilder reversed = new StringBuilder();
while (!stack.isEmpty()) {
    reversed.append(stack.pop());
}
return reversed.toString();
```
The stack-based solution's effectiveness is apparent, with each operation's intent communicated. We build a reversed string efficiently and expressively by systematically stacking and then unstacking characters.

### Lesson Summary
Today, you've tackled two classic problems using the stack, demonstrating its practical utility. The stack's LIFO nature has allowed us to ensure the correctness of nested structures and simplify sequences' reversal with straightforward and efficient code.

Well done on completing this lesson! The understanding you've gained is crucial for solving problems where the order of operations is paramount. Now, you're better prepared for real-world scenarios where data needs to be processed in reverse or verified for correctness.

Equipped with a deeper understanding of the stack's operations, you can confidently approach the exercises ahead. Happy coding!

##### Practice #1
Hey there, Galactic Pioneer! Let's embark on a new mission - a string of parentheses ( and ), needs your decoding skills. Your job will be to create a function areParenthesesBalanced that takes a string as an input and returns a boolean value where True represents that each parenthesis appropriately finds its pair and they are perfectly nested, whereas False implies a glitch in this alignment. Take for instance, (()) is balanced, but ())( is not. Recollect the teleportation rules of the universe and watch out for edge cases like an empty string or a string with just one parenthesis. Stay sharp, Pioneer!
```java
import java.util.*;
import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(areParenthesesBalanced("(())()"));  // prints: true
        System.out.println(areParenthesesBalanced("())("));  // prints: false
        System.out.println(areParenthesesBalanced("("));  // prints: false
    }

    public static boolean areParenthesesBalanced(String inputStr) {
        // implement the solution
        HashMap<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        
        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < inputStr.length(); i++) {
            char character = inputStr.charAt(i);
            if (openPar.contains(character)) {
                stack.push(character);
            } else if (!stack.isEmpty() && character == parenthesesMap.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            } 
        }
        return stack.isEmpty();
    }
}
```
###### feedback: didn't include Stack declaration in example^⚠️

#### Practice #2
Attention, Space Voyager! You know those alien messages we receive? Let's play with them! Picture every letter's case is reversed, then the whole message is flipped like in a cosmic stack! Your mission is to code this stack.

Once finished, we'll respond with the reversed, case-flipped string! Now, unleash your linguistic skills and establish this interstellar communication!

```java
import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(reverseAndFlipCase("Hello, World!")); // Expected Output: "!DLROw ,OLLEh"
        System.out.println(reverseAndFlipCase("hello")); // Expected Output: "OLLEH"
        System.out.println(reverseAndFlipCase("HELLO")); // Expected Output: "olleh"
    }

    public static String reverseAndFlipCase(String str) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            // fill the stack
            if (Character.isUpperCase(ch)) {
                stack.push(Character.toLowerCase(ch));
            }
            else if (Character.isLowerCase(ch)) {
                stack.push(Character.toUpperCase(ch));
            } else {
                stack.push(ch);
            }
        }

        StringBuilder reversed = new StringBuilder();
        // implement this
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
```

Questions I asked Cosmo:
* By "every letter's case is reversed", do you mean uppercase to lowercase and vise versa?

        Exactly! For each letter, if it's uppercase, make it lowercase; if it's lowercase, make it uppercase. Non-letter characters stay the same. Can you update your code to handle that before pushing to the stack?

* How can you check if a character is uppercase or lowercase?
        
        Great question! In Java, you can use:
        
        Character.isUpperCase(ch) to check if a character is uppercase
        Character.isLowerCase(ch) to check if a character is lowercase
        What do you think you should do after checking the case?
* So I should be converting ch and not just returning it's new value?

        You're close! In Java, Character.toLowerCase(ch) and Character.toUpperCase(ch) return the converted character, but they don't change ch itself.
        
        So, you should push the converted value to the stack, like this:
            
        stack.push(Character.toLowerCase(ch));
        or
        stack.push(Character.toUpperCase(ch));
        Try updating your code so you push the flipped character, not the original one!

## Lesson 3: Decoding Stacks for Technical Interviews: Mastering Efficient Data Management
### Introduction to the Lesson
Hello once again, champion of code! In this session, we will delve into the world of coding interviews by focusing on stack-based problems. We endeavor to decode interview questions that leverage the Last-In, First-Out (LIFO) magic of stacks to offer elegantly efficient solutions. After today, not only will you be able to handle stacks with ease, but you'll also be able to articulate and apply this knowledge when faced with interview questions that dig for depth in data structure understanding.

### 1. Problem 1: Preceding Smaller Elements
Consider a sequence of integers like the peaks and valleys of a mountain range. Each peak has a height represented by an integer, and you're hiking from left to right, recording peaks shorter than the one you're currently on. For each peak, we want to find out the height of the nearest preceding peak that's lower than it — a classic problem where stacks excel.

###  2. Problem 1: Actualization
Envision analyzing daily temperatures over several months. You're interested in knowing the last cooler day for each day you examine. This mirrors our array problem, where we're seeking the previous smaller number before each entry in the array. It’s these kinds of time-sensitive queries that stack operations handle without breaking a sweat.

### 3. Problem 1: Naive Approach
You might be tempted to approach this problem with the vigor of a brute force assault — looking behind each element to find a smaller one. However, this could mean reviewing multiple times and spending unforgiving time as you consider each element repeatedly. In a vast data set, this would be akin to retracing your steps on each day's hike to find a shorter peak, an exhausting proposition!

### 4. Problem 1: Efficient Approach
Enter the stack — our trusty Sherpa. As we progress through the array, we push peaks onto the stack. When we encounter a peak `(arr[i])`, we pop entries from the stack that aren't shorter than the current one. The stack's top now reveals the nearest preceding smaller peak, which we note before adding the current peak to the stack.

### 5. Problem 1: Solution Building
Let's lace up our boots and start the ascent by iterating through the array of peak heights and interacting with our stack.

```java
import java.util.Stack;

public class PrecedingSmallerElements {
    public static int[] findPrecedingSmallerElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 5, 4, 3};
        int[] result = findPrecedingSmallerElements(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
        // Output: -1 3 -1 1 1 1
    }
}
```
In our code, we trek through each element in the array `(arr)`. Our conditions within the loop perform the 'pop' work — discarding any peak that isn't lower than our current one, ensuring that only useful candidates remain. Then, we notate the result — either `-1` if no such peak exists or the last peak remaining on the stack. Before moving on, we add our current peak to the stack.

### 6. Problem 2: Stack with Minimum Trace
Think about a real-time inventory tracking system in a warehouse where items are stacked based on the order of arrival. However, you must keep an ongoing record of the lightest item in stock for quick retrieval. This scenario highlights the need for a system that efficiently maintains a snapshot of the minimum item as stack operations proceed.

### 7. Problem 2: Naive Approach
Consider tagging each item with its weight and then brute-forcing through the stack to find the minimum every time it's needed. However, this is like rummaging through the entire stock each time a request is made — an excessive and inefficient undertaking.

### 8. Problem 2: Efficient Approach
The stroke of genius here is using not one but two stacks. The secondary stack acts as a memory, holding the minimum value attained with each element pushed to the primary stack. This way, when the current minimum leaves the stack, the next one in line is right at the top of the auxiliary stack, ready to be the new champion.

### 9. Problem 2: Solution Building
It's time to manifest this brainchild into Java code. Here's the skeletal structure of our `MinStack`, waiting to be imbued with functionality:

```java
import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minValues = new Stack<>();
    
    // The push method is where most of our logic resides.
    public void push(int x) {
        if (minValues.isEmpty() || x <= minValues.peek()) {
            minValues.push(x);
        }
        stack.push(x);
    }
    
    // Each pop requires careful coordination between our two stacks.
    public void pop() {
        if (!stack.isEmpty() && stack.peek().equals(minValues.peek())) {
            minValues.pop();
        }
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    // The top method reveals the peak of our stack cable car.
    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }
    
    // getMin serves as our on-demand minimum value provider.
    public int getMin() {
        return minValues.isEmpty() ? -1 : minValues.peek();
    }
}
```
The `push` method introduces the key player — our `minValues` stack, which retains the minimum value observed so far every time we add a new entry. Meanwhile, the `pop` operation is like a relay race transition, handing off the title "minimum" to the next contender when the current titleholder is knocked off the podium.

Simulating the pushing of various elements onto the stack and invoking `getMin` would yield the correct minimum every time, thanks to our additional stack, `minValues`.

### Lesson Summary
Our expedition through stack-land today has shown us that stacks can be the clever trick up your sleeve for certain types of interview questions. We have seen how to keep track of past element states with 'Preceding Smaller Elements' and maintain instant access to the minimum element in our 'MinStack'. From trails to inventory — stacks reveal their flexibility and efficiency. Thus, your toolbox of algorithms has just received a shiny new set of tools, bolstering your confidence for what lies ahead — practice!

#### Practice #1
Hello there, Stellar Navigator! Ready for another space adventure? This time, we're navigating through an array of intergalactic integers. Your mission, should you choose to accept it, is to locate the next smallest number for each number in this array. If no smaller number exists in the subsequent elements, flag that number with -1.

Remember, you're only going to be looking at the numbers that FOLLOW the current number in the array. We're not looking back; we're Space Explorers, we only move forward!

Remember to stay curious, bold, and respectful as you journey through the stars ...or in this case, arrays!
```java
import java.util.Stack;

class Solution {
    public static int[] findFollowingSmallerElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        
        // implement this
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1: stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 7, 4, 3};
        int[] result = findFollowingSmallerElements(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
        // Expected Output: 1 1 -1 4 3 -1 

        // Additional tests
        int[] arr2 = {4, 6, 2, 8, 1, 7};
        int[] result2 = findFollowingSmallerElements(arr2);
        for (int n : result2) {
            System.out.print(n + " ");
        }
        // Expected Output: 2 2 1 1 -1 -1 

        int[] arr3 = {1, 1, 1, 1, 1};
        int[] result3 = findFollowingSmallerElements(arr3);
        for (int n : result3) {
            System.out.print(n + " ");
        }
        // Expected Output: -1 -1 -1 -1 -1 
    }
}
```
Questions I asked Cosmo:
* Change* the condition of the for loop like i-- going the opposite direction?

        Yes, you're on the right track! To find the next smaller element to the right, you should:
        
        Start from the end of the array and move left (so use i--).
        But make sure your loop starts at arr.length - 1 and continues while i >= 0.
        Can you spot what’s wrong with your current loop’s start and stop conditions?

#### Practice #2
Alright, Space Voyager, let's work on this fascinating puzzle. Have you ever wondered how to find the maximum value in a stack so far, without removing it, and without taking ages to do it? Well, here’s your chance!

Your task is to design a new stack operation called "getMax", which swiftly returns the maximum element in the stack in constant time. Input will be the set of stack operations including "push", "pop", "top", and your new operation "getMax".

Remember the edge case when the stack is empty. Output will be the maximum value that has ever been pushed into the stack. No pressure, if you get stuck, remember to revisit the lesson! Let’s dive in!
```java
```
