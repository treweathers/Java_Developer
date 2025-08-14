package review.Course_2_Review;
import java.util.*;
//import java.util.Stack;
import java.util.LinkedList;
//import java.util.Queue;

//# Course 2.3: Advanced Data Structures - Stacks and Queues in Java
class Solution {
    public static void main(String[] args) {
        //2.3 - unit 1/5 practice 2
        Stack plateStack = new Stack(3); // A stack to hold 3 plates
        plateStack.push(1); // Add a plate with ID 1
        plateStack.push(2); // Add a plate with ID 2
        plateStack.push(3); // Add a plate with ID 3
        plateStack.push(4); // Fail to add a plate with ID 4 as stack is full
        //2.3 - unit 1/5 practice 3
        Stack kitchenStack = new Stack(5);
        kitchenStack.addOrder(101); // Order #101 added
        kitchenStack.addOrder(102); // Order #102 added
        kitchenStack.addOrder(103); // Order #103 added
        kitchenStack.addOrder(104); // Order #104 added
        kitchenStack.addOrder(105); // Order #105 added
        System.out.println("Next order to prepare: " + kitchenStack.nextOrder()); // Should print order #105
        /*#### 2/3 -  unit 1/5 Practice #4
        Observe how a stack of plates is managed in a restaurant kitchen. The given code simulates the addition of plates to the stack and the washing of the topmost plate. Click Run to observe the stack operations in action!
        */
        // Create a stack to represent plates
        java.util.Stack<String> platesStack = new java.util.Stack<>();
        // Add three plates to the stack
        platesStack.push("Plate 1");
        platesStack.push("Plate 2");
        platesStack.push("Plate 3");
        // Wash the topmost plate
        String washedPlate = platesStack.pop();
        System.out.println("Washed: " + washedPlate);
        /* 2/3 - unit 1/5 #### Practice #5
        Great work so far! Now let's consolidate your knowledge by implementing from scratch a small Java program that simulates the stacking of plates in a restaurant kitchen. Your task is to create a stack, add plates to it, and then remove all the plates one by one, printing the whole stack after each removal.
        */
        // TODO: Create a Stack object to simulate a stack of plates
        java.util. Stack<Integer> stack = new java.util.Stack<>();
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

        //2.3 - unit 2/5 practice 1
        System.out.println(areParenthesesBalanced("(())()"));  // prints: true
        System.out.println(areParenthesesBalanced("())("));  // prints: false
        System.out.println(areParenthesesBalanced("("));  // prints: false
        //2.3 - unit 2/5 practice 2
        System.out.println(reverseAndFlipCase("Hello, World!")); // Expected Output: "!DLROw ,OLLEh"
        System.out.println(reverseAndFlipCase("hello")); // Expected Output: "OLLEH"
        System.out.println(reverseAndFlipCase("HELLO")); // Expected Output: "olleh"

        //2.3 - unit 3/5 practice 1
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
        //2.3 - unit 3/5 practice 2
        MaxStack maxStack = new MaxStack();
        maxStack.push(-2);
        maxStack.push(0);
        maxStack.push(-3);
        System.out.println(maxStack.getMax());  // Expected Output: 0
        maxStack.pop();
        System.out.println(maxStack.top());    // Expected Output: 0
        System.out.println(maxStack.getMax());  // Expected Output: 0

        maxStack.push(10);
        System.out.println(maxStack.getMax());  // Expected Output: 10
        maxStack.push(-1);
        System.out.println(maxStack.getMax());  // Expected Output: 10

        //2.3 - unit 4/5 practice 2
        Queue queue = new Queue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        // TODO: Use dequeue method to remove and display the visitor taking the ride
        System.out.println(queue.dequeue());
        /* 2.3 - unit 4/5 #### Practice #5
        Take control of the Theme Park Queue Management system! You'll need to recreate the queue handling by adding visitors to the queue, allowing the first in line to go on the ride, and then showing who's next. Fill in the code to bring the theme park queue to life!
        */
        // TODO: Initialize a new Queue of type String using LinkedList
        // Add three visitors to the queue
        java.util.Queue<String> queue0 = new LinkedList<>();
        queue0.add("abra");
        queue0.add("ca");
        queue0.add("dabra");
        // TODO: Remove the visitor at the front of the queue and print who is on the ride
        System.out.println(queue0.remove());
        // TODO: Peek at the next visitor in the queue and print who is next in line
        System.out.println(queue0.peek());
    
        //2.3 - unit 5/5 practice 1
        // test case 1
        java.util.Queue<Integer> queue1 = new LinkedList<>();
        queue1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        queue1 = everyAlter(queue1);
        System.out.println(queue1); // Expected Output: [1, 3, 5]
        // test case 2
        java.util.Queue<Integer> queue2 = new LinkedList<>();
        queue2.addAll(Arrays.asList(1, 2));
        queue2 = everyAlter(queue2);
        System.out.println(queue2); // Expected Output: [1]
        // test case 3
        java.util.Queue<Integer> queue3 = new LinkedList<>();
        queue3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        queue3 = everyAlter(queue3);
        System.out.println(queue3); // Expected Output: [1, 3, 5, 7]
        //unit 2.3 - unit 5/5 practice 2
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1)); // returns 1.0 (like a single heart rate reading)
        System.out.println(m.next(10)); // returns 5.5 (the average after a short burst of activity)
        System.out.println(m.next(3)); // returns 4.66667 (normalizing after the burst)
        System.out.println(m.next(5)); // returns 6.0 (the most recent average, taking into account the last three readings)

    }

    /* 2.3 - unit 2/5 ##### Practice #1
    Hey there, Galactic Pioneer! Let's embark on a new mission - a string of parentheses ( and ), needs your decoding skills. Your job will be to create a function areParenthesesBalanced that takes a string as an input and returns a boolean value where True represents that each parenthesis appropriately finds its pair and they are perfectly nested, whereas False implies a glitch in this alignment. Take for instance, (()) is balanced, but ())( is not. Recollect the teleportation rules of the universe and watch out for edge cases like an empty string or a string with just one parenthesis. Stay sharp, Pioneer!
    class Stack {
    */
    public static boolean areParenthesesBalanced(String inputStr) {
        // implement the solution
        HashMap<Character, Character> parenthesesMap = new HashMap<>();
        parenthesesMap.put('(', ')');
        
        Set<Character> openPar = new HashSet<>();
        openPar.add('(');
        
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
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

    /*2/3 - unit 2/5 #### Practice #2
    Attention, Space Voyager! You know those alien messages we receive? Let's play with them! Picture every letter's case is reversed, then the whole message is flipped like in a cosmic stack! Your mission is to code this stack. Once finished, we'll respond with the reversed, case-flipped string! Now, unleash your linguistic skills and establish this interstellar communication!
    */
    public static String reverseAndFlipCase(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

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

    /* 2.3 - unit 3/5 #### Practice #1
    Hello there, Stellar Navigator! Ready for another space adventure? This time, we're navigating through an array of intergalactic integers. Your mission, should you choose to accept it, is to locate the next smallest number for each number in this array. If no smaller number exists in the subsequent elements, flag that number with -1. Remember, you're only going to be looking at the numbers that FOLLOW the current number in the array. We're not looking back; we're Space Explorers, we only move forward! Remember to stay curious, bold, and respectful as you journey through the stars ...or in this case, arrays!
    */
    public static int[] findFollowingSmallerElements(int[] arr) {
        int[] result = new int[arr.length];
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
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

    /* 2.3 - unit 5/5 #### Practice #1
    Alright Space Voyager, let's explore a new galaxy! Say you're in command of a fleet of ships, each represented by a number in a Java Queue, aiming to travel into the unknown, in an order given. But here's an energy-saving hack - every alternate ship starting from the first one (Index 0, because a programmer's count starts from 0) hides in the hyperspace created by its preceding ship (strange, I know!). Your task? Simulate this alternate hyperspace journey! Your input will be a Java Queue of n integers, where n can be any spread of numbers. For example, it can be [1, 2, 3, 4, 5, 6]. Your output? A new Java Queue presenting every alternate ship from the initial fleet. Meaning for the example given, your output would be [1, 3, 5]. Note that you shouldn't lost other numbers! Store them in another queue. In the example above, this other queue will contain [2, 4, 6]. Eager to see your fleet command in action, Space Voyager!
    */
    public static java.util.Queue<Integer> everyAlter(java.util.Queue<Integer> queue) {
        java.util.Queue<Integer> newQueue = new LinkedList<>();
        java.util.Queue<Integer> newestQueue = new LinkedList<>();
        int i = 0;

        // TODO: fill in new queue
        while (!queue.isEmpty()) {
            if (i % 2 == 0) {
                newQueue.add((queue.remove()));
            } else {
                newestQueue.add(queue.remove());
            }
            i++;
        }
        return newQueue;
    }
}

class Stack {
    /* 2.3 - unit 1/5 #### Practice #2
    Well done, Space Voyager! Now, let's see if you can implement one of the key methods of a Stack from scratch. It's time to push ahead and add some elements to your dish stack!
    */
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
    /* 2/3 - unit 1/5 #### Practice #3
    Alright, Space Voyager, I need your keen eye! The chef robot in the kitchen is designed to manage order stacks, but it's acting oddly and not accepting any new orders. Could you check the code and fix what's wrong? Good luck, and pay close attention to how stacks should properly function!
    */
    private int capacity;
    private int[] kitchenOrders;
    private int topIndex = -1;

    public void Stack2(int capacity) {
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

/* 2.3 - unit 3/5 #### Practice #2
Alright, Space Voyager, let's work on this fascinating puzzle. Have you ever wondered how to find the maximum value in a stack so far, without removing it, and without taking ages to do it? Well, here’s your chance! Your task is to design a new stack operation called "getMax", which swiftly returns the maximum element in the stack in constant time. Input will be the set of stack operations including "push", "pop", "top", and your new operation "getMax". Remember the edge case when the stack is empty. Output will be the maximum value that has ever been pushed into the stack. No pressure, if you get stuck, remember to revisit the lesson! Let’s dive in!
}
*/
class MaxStack {
    private java.util.Stack<Integer> stack = new java.util.Stack<>();
    private java.util.Stack<Integer> maxValues = new java.util.Stack<>();

    public void push(int x) {
        // implement this
        if (maxValues.isEmpty() || x >= maxValues.peek()) {
            maxValues.push(x);
        }
        stack.push(x);
    }
    
    public void pop() {
        // implement this
        if(!stack.empty() && stack.peek().equals(maxValues.peek())) {
            maxValues.pop();
        }
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }
    
    public int getMax() {
        // implement this
        return stack.isEmpty() ? -1 : maxValues.peek();
    }
}

/* 2.3 - unit 4/5
#### Practice #2
Stellar Navigator, let's see if you can get our theme park queue rolling! It's your turn to control the ebb and flow. Write the code that adds a new visitor to the back of the queue and then allows the first visitor to take the ride.
*/
class Queue {
    int front, rear, capacity, size;
    int[] elements;
    
    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[this.capacity];
    /* 
    somtimes like this, difference?
    front = size = 0;
    this did not have the - 1 - added it*/
    rear = capacity - 1;

        front = 0;
        rear = 0;
        size = 0;
    }
    //
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }
    
    // Adds an element to the rear of the queue
    public void enqueue(int element) {
        // Check if queue is not full
        if (isFull(this)) return;
        // TODO: If not full, add element to the queue and adjust the rear
        rear = (rear + 1) % this.capacity;
        elements[rear] = element;
        size++;
    }
    
    // Removes and returns an element from the front of the queue
    public int dequeue() {
        // Check if queue is not empty
        if (isEmpty(this)) return Integer.MIN_VALUE;
        // TODO: If not empty, return the front element and move the front forward
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element; // Placeholder return value to indicate queue is empty (remove when implementing)
    }
}


/* 2.3 - unit 5/5 #### Practice #2
Hey there, Space Voyager! Time for another adventure! Let's expand your skill set with the MovingAverage class. Stellar idea, isn't it? Here's your challenge: fill in the missing code parts to correctly update the sum whenever a new element enters or leaves the sliding window. Initiate launch sequence and go for it!
 */
class MovingAverage {
    private int size;
    private java.util.Queue<Integer> window;
    private double sum;

    public MovingAverage(int size) {
        this.size = size;
        this.window = new LinkedList<>();
        sum = 0.0;
    }

    public double next(int val) {
        // implement this
        if (window.size() == size) {
            sum -= window.remove();
        }
        window.add(val);
        sum+= val;
        return sum / window.size();
    }
}
/* COURSE 3 PRACTICE PROBLEM
### 💻 Solution

Here is a complete Java solution that implements the logic for the "Stellar Message Decoder" problem. This solution demonstrates how to use a `Queue` for maintaining order and a `Stack` for reversing a specific portion of the data, which is a key concept from your review.
### ⚙️ Explanation

1.  **Reversing with a Stack:** The key to solving this problem is understanding that a `Stack` can be used as a temporary storage to reverse the order of elements. By taking the first `n` characters from the `Queue` and `pushing` them onto a `Stack`, the last character dequeued becomes the first one to be popped. When we `pop` and `enqueue` them back into the `Queue`, they are placed in reverse order.
2.  **Maintaining Order with a Queue:** The remaining elements in the `Queue` must maintain their original relative order but be moved to the back. A simple and efficient way to do this is to `dequeue` each remaining element one by one and immediately `enqueue` it back into the same queue. This cycles the elements from the front to the back without changing their order relative to each other.
3.  **Combining Operations:** The solution combines these two principles into a single function. It first handles the reversal of the first `n` elements using a stack, and then it handles the repositioning of the remaining elements using the queue itself. This approach is both clear and efficient, as each operation is performed in a straightforward manner.
 */


class StellarDecoder {

    /**
     * Decrypts a scrambled message by reversing the first n characters of a queue
     * and moving the rest of the queue to the back.
     * @param message The scrambled message as a Queue of characters.
     * @param n The number of characters to reverse.
     * @return The decrypted message as a Queue of characters.
     */
    public static java.util.Queue<Character> decryptMessage(java.util.Queue<Character> message, int n) {
        // Use a Stack to reverse the first n characters
        java.util.Stack<Character> tempStack = new java.util.Stack<>();
        
        // Dequeue the first n elements and push them onto the stack
        for (int i = 0; i < n; i++) {
            if (!message.isEmpty()) {
                tempStack.push(message.remove());
            }
        }
        
        // Pop elements from the stack and enqueue them back into the message queue.
        // This reverses their order and places them at the end.
        while (!tempStack.isEmpty()) {
            message.add(tempStack.pop());
        }

        // The remaining elements in the queue are already in their correct relative order.
        // We simply need to move them to the back of the queue.
        // We move (queue size - n) elements to the end.
        int remainingElements = message.size() - n;
        for (int i = 0; i < remainingElements; i++) {
            message.add(message.remove());
        }
        
        return message;
    }

    public static void main(String[] args) {
        // Example 1
        java.util.Queue<Character> message1 = new LinkedList<>();
        message1.add('A');
        message1.add('B');
        message1.add('C');
        message1.add('D');
        message1.add('E');
        message1.add('F');
        int n1 = 3;
        
        System.out.println("Original Message: " + message1);
        System.out.println("N value: " + n1);
        java.util.Queue<Character> decryptedMessage1 = decryptMessage(message1, n1);
        System.out.println("Decrypted Message: " + decryptedMessage1); // Expected: [D, E, F, C, B, A]
        System.out.println("--------------------");

        // Example 2: With n = 1
        java.util.Queue<Character> message2 = new LinkedList<>();
        message2.add('X');
        message2.add('Y');
        message2.add('Z');
        int n2 = 1;
        
        System.out.println("Original Message: " + message2);
        System.out.println("N value: " + n2);
        java.util.Queue<Character> decryptedMessage2 = decryptMessage(message2, n2);
        System.out.println("Decrypted Message: " + decryptedMessage2); // Expected: [Y, Z, X]
        System.out.println("--------------------");
    }
}