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

```
