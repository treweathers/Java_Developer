<h1 align='center'> Course 2: Mastering Algorithms and Data Structures in Java </h1> 

# Course 2.4: Fundamental Data Structures - Linked Lists in Java
## Lesson 1: Navigating Linked Lists in Java: Fundamentals to Functional Mastery
### Introduction to Linked Lists
Hello there! Today, we will explore **Linked Lists**, a core data structure crucial for organized data management and establishing relationships between data.

We will mark some essential milestones: an introduction to Linked Lists, their real-world applications, their implementation in Java, and the different operations you can perform on them.

By the end of this lesson, you will be well-equipped to implement and operate Linked Lists in Java. Let's get started!

### 1. Understanding the Concept
A Linked List is a linear data structure similar to arrays. But, unlike arrays, they are not stored in contiguous memory locations. Each element in a Linked List is part of a `node`. A `node` comprises data and a reference (or link) to the next `node` in the sequence. This structure facilitates efficient insertions and deletions.

The `head` is also an essential concept in Linked Lists. It is the first `node` in the list and a reference to the entire list. The `head` is a null reference if the Linked List is empty.

Singly linked lists come up quite often in coding interviews. Interviewers from tech giants, start-ups, and just about every company testing your coding abilities will pose challenges based on this concept.

Here's another interesting point: While singly linked lists might not be extensively used in real-world applications, they form the foundational knowledge for understanding doubly linked lists, which are indeed quite common.

### 2. Implementing Linked Lists - Creating Node
To begin implementing Linked Lists, we first need to understand the structure of a `node`, the building block of a Linked List. Regarding Java code, we need to create a class acting as a blueprint for a `node`.

A `Node` class mainly consists of `data` (the data you want to store) and `next` (the reference to the next `node`). In our case, we'll create a Node class to store integer data.

```java
class Node {
    int data;
    Node next; 
}
```
Fantastic! You now know how to set up a `node` in a Linked List.

### 3. Implementing Linked Lists - Append Method
In this section, we'll learn how to add a new node at the end of our Linked List. We'll implement an `append` function in our LinkedList class for this.

```java
class Node {
    int data;
    Node next;  
}

public class LinkedList {
    Node head;

    public void append(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }
}
```
The code checks if `head` is `null`, which would be the case for an empty list. If that's true, `head` is set to the new node, meaning this new node is the first and only node in the list. If the linked list is not empty (`head` is not `null`), the code enters a while loop, which runs as long as the `next` attribute of the current node it's looking at is not `null` (i.e., there are still nodes in the list). This loop is used to navigate to the end of the list. The new node is then appended after the last node in the list.

### 4. Implementing Linked Lists - AddFirst Method
Now, what if we want to add a new node at the beginning of our list? We'll write a function `addFirst` to achieve this operation.

```java
public void addFirst(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head != null) {
            node.next = head;
        }
        head = node;
    }
```
It simply reassigns the head.

### 5. Implementing Linked Lists - Delete Method
Removing a node from a Linked List is also an essential functionality. We will add a `delete` function to our LinkedList class to remove a node with a particular data value.

```java
public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
```
We traverse the list like in the `append` operation, searching for a node with specific data. If found, it is removed from the list by retargeting the previous node to the node after the target.

### 6. Complexity Analysis
While understanding the implementation of Linked Lists is great, it's equally crucial to comprehend the performance of our operations. This understanding generally comes through complexity analysis, examining the time (number of operations) and space (memory used) needed for an operation.

Here's a summary of the performance of particular operations in Linked Lists:

* Accessing an element: It has O(n) time complexity because, in the worst-case scenario, we'd have to traverse through the entire list.
* Inserting or deleting a node: It's O(1) if we're adding or removing from the front of the list. However, if it's at the end or in the middle, it would be O(n) because we'd have to traverse the list to find the position.

### Summary and What's Next
Great job sticking with it throughout this intriguing journey, from understanding the concept of Linked Lists to implementing them in Java, exploring critical operations, and understanding their performance!

Up ahead, we have lined up some practice sessions. These sessions will provide you with real-time experience implementing and manipulating Linked Lists in Java.

#### Practice #1
Imagine we're building a rail network in a new game, and your task is to observe how the game adds new stations to a train route. In the provided code, you can see how a Linked List represents the train route, with stations being added sequentially. Click Run to bring the train route to life!
```java
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class RailwayNetwork {
    Node head;

    // Method to add a new station to the network
    void addStation(int stationData) {
        Node newStation = new Node(stationData);
        if (head == null) {
            head = newStation;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newStation;
        }
    }

    void deleteStation(int stationData) {
        Node temp = head, prev = null;

        // If head station itself holds the station to be deleted
        if (temp != null && temp.data == stationData) {
            head = temp.next; // Change head
            return;
        }

        // Search for the station to be deleted, keep track of the
        // previous station as we need to change temp.next
        while (temp != null && temp.data != stationData) {
            prev = temp;
            temp = temp.next;
        }

        // If station was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-");
            current = current.next;
        }
        System.out.println(current.data);
    }

}

class Solution {
    public static void main(String[] args) {
        RailwayNetwork network = new RailwayNetwork();
        // Adding stations with their station IDs
        network.addStation(101);
        network.addStation(202);
        network.addStation(303);
        network.deleteStation(101);
        network.show();
        network.deleteStation(303);
        network.show();
    }
}
```
🚄

#### Practice #2
The train route is expanding! Let's create a code that adds the new station to the beginning of our train route. Follow the scenario to implement the missing part.
```java
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class RailwayNetwork {
    Node head;

    // Method to add a new station to the network
    void addStation(int stationData) {
        // TODO: reassign head
        Node node = new Node(stationData);
        node.data = stationData;
        node.next = null;
        if(head != null) {
            node.next = head;
        }
        head = node;
    }

    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-");
            current = current.next;
        }
        System.out.print(current.data);
    }

}

class Solution {
    public static void main(String[] args) {
        RailwayNetwork network = new RailwayNetwork();
        // Adding stations with their station IDs
        network.addStation(101);
        network.addStation(202);
        network.addStation(303);
        network.show();
    }
}
```
#### Practice #3
Great progress, Stellar Navigator! Now, use your skills to help our railway network grow. Write the code to create a new station node, and then find the last station in our list to connect it to the new one.
```java
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class RailwayNetwork {
    Node head;

    // Method to add a new station to the network
    void addStation(int stationData) {
        Node newStation = new Node(stationData);
        // TODO: check if head is null. If it is, initialize head with newStation
        if (head == null) {
            head = newStation;
        // TODO: else append the newStation to the end of the list
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newStation;
        }
    }

    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-");
            current = current.next;
        }
        System.out.print(current.data);
    }

}

class Solution {
    public static void main(String[] args) {
        RailwayNetwork network = new RailwayNetwork();
        // Adding stations with their station IDs
        network.addStation(101);
        network.addStation(202);
        network.addStation(303);
        network.show();
    }
}
```
#### Practice #4
Great journey so far! Now, test your skills by writing the missing piece of code to delete a station from the railway network. Pay close attention to the deletion logic, as it's key to understanding linked list manipulations.
```java
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class RailwayNetwork {
    Node head;

    // Method to add a new station to the network
    void addStation(int stationData) {
        Node newStation = new Node(stationData);
        if (head == null) {
            head = newStation;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newStation;
        }
    }

    void deleteStation(int stationData) {
        Node temp = head, prev = null;

        // If head station itself holds the station to be deleted
        if (temp != null && temp.data == stationData) {
            head = temp.next; // Change head
            return;
        }

        // TODO: Search for the station to be deleted, keep track of the previous station as we need to change temp.next
        while(temp != null && temp.data != stationData) {
            prev = temp;
            temp = temp.next;
        }
        // TODO: Unlink the node from linked list
        if (temp == null) return;
        prev.next = temp.next;
    }

    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-");
            current = current.next;
        }
        System.out.println(current.data);
    }

}

class Solution {
    public static void main(String[] args) {
        RailwayNetwork network = new RailwayNetwork();
        // Adding stations with their station IDs
        network.addStation(101);
        network.addStation(202);
        network.addStation(303);
        network.deleteStation(101);
        network.show();
        network.deleteStation(303);
        network.show();
    }
}
```
#### Practice #5
Let's give our railway network's nodes a more meaningful initialization. Update the Node class to accept stationName as an argument in its constructor. Also, ensure that you modify the calls to the addStation method in our Solution class, passing the station numbers when creating new nodes. Finally, update the show method to display station names connected with " ----> ". Don't forget to test your code by creating station with names!
```java
class Node {
    int data;
    Node next;
    String stationName;
    // TODO: introduce station names
    Node(int d, String stationName) {
        data = d;
        next = null;
        this.stationName = stationName;
    }
}

class RailwayNetwork {
    Node head;

    // TODO: Add station name here
    void addStation(int stationData, String stationName) {
        Node newStation = new Node(stationData, stationName);
        if (head == null) {
            head = newStation;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newStation;
        }
    }
    
    // TODO: modify the show method to include station names
    void show() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.stationName + " ----> ");
            current = current.next;
        }
        System.out.println(current.data);
    }

}

class Solution {
    public static void main(String[] args) {
        RailwayNetwork network = new RailwayNetwork();
        // TODO: Add station names here 
        network.addStation(101, "Big");
        network.addStation(202, "Bang");
        network.addStation(303, "Theory");
        network.show();
    }
}
```
Questions I asked Cosmo:
* Add stationName as an argument in addStation?

        Great question! You did add stationName as an argument in addStation, but are you actually using it when creating the new Node?
        
        Check your Node constructor—does it accept a stationName parameter?
        When you create a new Node in addStation, are you passing both the data and the station name?
        Try updating both so the name gets stored in each node!

* Should we be including the stationName in show in the print statement?

        Yes, exactly! Right now, your show method only prints the data (the station ID).
        To display the station names, update the print statements to use stationName instead.
        
        Does your Node class actually store the stationName?
        Are you printing it in the show method?
        Try printing current.stationName instead of current.data!


* What's wrong?

        Nice progress! The main issue is in your Node constructor:
        
```java
Node(int d, String stationName) {
    data = d;
    next = null;
}
```
        You never assign the stationName parameter to the stationName field, so it stays null.
        What line should you add to store the name in each node?


* A line initializing it, but what is it supposed to be equal to?

        Great question! In your constructor, you want to assign the parameter value to the instance variable.
        Right now, you have:

  ```java
  stationName = stationName;
  ```
      But this just assigns the parameter to itself.
      How can you refer to the instance variable inside the constructor? (Hint: Try using this!)
  

## Lesson 2: Reversing and Measuring: Mastering Linked List Operations in Java
### Introduction to the Lesson
Today's lesson will build upon our foundational understanding of **linked lists** by diving into practical implementation exercises using **Java**. These problems sharpen your coding skills and prepare you for scenarios you might encounter in technical interviews.

### 1. Problem 1: Reverse Linked List Traversal
Picture a scenario in which you have a sequence of events stored in a linked list. Your task is to look back in time — essentially, to reverse the chronology of these events. In technical terms, this means traversing a **singly linked list** in reverse order while keeping its structure intact. This skill is critical, whether for reversing transaction logs or simply navigating through a playlist from end to start.

### 2. Problem 1: Problem Actualization
Consider a browser's back-button functionality, where the most recently visited pages must be revisited reversely. This operation mirrors our task of reverse traversal in a linked list, capturing the essence of a real-world application.

### 4. Problem 1: Naive Approach
One may consider creating a new linked list while iterating over the original list, inserting each element at the head of the new list. Although this approach might work, it's an overcomplicated approach that results in extra processing and memory usage that we can avoid.

### 5. Problem 1: Efficient Approach Explanation
A more sophisticated solution would use a **stack**. Using a stack, we ensure an orderly collection of the nodes' values as we navigate the list. Once the traversal is complete, we extract the values in reverse, thanks to the stack's *Last-In-First-Out property*.

Let's visualize it with a deck of cards: We pick each card from the top (the head of the linked list) and place it into a pile (the stack). When we finish, we pick up the cards from the pile now in reverse order.

### 6. Problem 1: Solution Building
Let's tackle it with **Java**:

```java
// Instantiate a stack to hold node values.
Stack<Integer> stack = new Stack<>();

// Traverse the linked list and push node values to the stack.
ListNode currentNode = head;
while (currentNode != null) {
    stack.push(currentNode.value);
    currentNode = currentNode.next;
}

// Pop from the stack to obtain elements in reversed order.
while (!stack.isEmpty()) {
    System.out.println(stack.pop());
}
```
In this code, we create a `Stack` object to store integers. We then iterate through the linked list using a `while` loop. For each node visited, we push its value onto the stack. After traversing the entire list, we pop the values off the stack. This reversal is possible because stacks operate on a Last In, First Out (LIFO) principle, which means the last element added to the stack will be the first one removed, thus reversing the order of the elements.

### 7. Problem 2: Calculate Linked List Length
Next up, we face a seemingly simple task: determining the size of a linked list. Imagine it as a conga line at a party. You'd like to know how many people are in the line without disturbing the dance. Start at the beginning and count each person until you reach the end.

### 8. Problem 2: Problem Actualization
In scenarios such as buffering data streams or executing batch operations, we often need to know the size of a list of tasks to allocate resources efficiently. This real-world implication highlights the utility of accurately determining the length of a linked list.

### 9. Problem 2: Naive Approach
While it may be tempting to convert the linked list to an array and use its `length` property, such an approach is needlessly burdensome. We would create a new data structure when a more straightforward method can be employed.

### 10. Problem 2: Efficient Approach Explanation
To calculate the length efficiently, we'll employ a classic traversal technique. It's a counting exercise: start at the first node (like the first person in the conga line) and increment a counter as we follow the links until we reach the end. The counter then reflects the conga line's length.

### 11. Problem 2: Solution Building
Implementing this strategy in **Java** is straightforward:

```java
// Initialize a counter for the length.
int length = 0;

// Iterate through the list, incrementing the length counter.
ListNode currentNode = head;
while (currentNode != null) {
    length++;
    currentNode = currentNode.next;
}

// Return the final count.
return length;
```
In this code, we initialize an integer `length` to zero, which will serve as our counter. We then loop through each node of the linked list, incrementing `length` by one each time a new node is encountered. When the end of the list is reached (which we know occurs when `currentNode` is `null`), we exit the loop and return the total count.

### Lesson Summary
Today, we practiced critical operations on linked lists, namely reversing a list's traversal and calculating its length. Both solutions involved traversing the linked list but with different goals in mind. We efficiently solved these problems using structurally simple yet powerful techniques in **Java**. We will transition to a series of exercises designed to reinforce your understanding of linked lists and prepare you for tackling similar problems in real-world scenarios or technical interviews.

#### Practice #1
Stellar Navigator, here's your mission: construct a function that navigates a given singly linked list from end to start, retrieving and printing the last n data points. We assure that n won't exceed the linked list's length. Ace this space chase using your coding toolkit, and be prepared for unexpected challenges on this celestial journey!
```java
import java.util.Stack;
import java.util.ArrayList;

class LinkedList {
    static class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
            next = null;
        }
    }

    ListNode head;

    public void append(int value) {
        if (head == null) {
            head = new ListNode(value);
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }
}

class Solution {
    public static void lastNElements(LinkedList.ListNode head, int n) {
        // implement this
        Stack<Integer> stack = new Stack<>();
        LinkedList.ListNode current = head;
        while (current != null)  {
            stack.push(current.value);
            current = current.next;
        }
       for (int i = 0; i < n; n--) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        lastNElements(list.head, 3);

        // prints: 5 4 3
    }
}
```
Questions I asked Cosmo:
* Explain the difference between the examples in the lesson and this problem.

        Great question! Here’s the key difference:
        
        Lesson Example: You printed all elements of the linked list in reverse order.
        This Problem: You only need to print the last n elements in reverse order (not the whole list).
        So, you’ll need to adjust your logic to print just the last n values, not everything. How might you change your code to do that?


* So the rest of the coding logic is exactly the same?

        Almost! Your logic currently prints all elements in reverse, just like the lesson. But this practice only wants the last n elements in reverse order.
        
        What could you change so you only print n values from the stack, instead of all of them?


* Adjust the while loops in the lastElements function

        Nice effort so far!
        
        Now, for the while loops:
        
        Your first loop (pushing values onto the stack) is good.
        The second loop currently pops and prints all elements.
        But you only want to print the last n elements.
        How could you change the second loop so it only runs n times? (Hint: Maybe a for loop with n iterations?)

#### Practice #2
Brace yourself, Space Voyager! This mission circles cosmos navigation. Given a pathway between planets - represented as a singly linked list- you must pinpoint a planet and uncover its position. You must traverse the linked list and calculate the number of nodes we visit before meeting the given value, including the target node itself. If the target number is not in the list, return -1. Remember, the universe is limitless, and the planet could be any real value. Good luck, Detective! Uphold your adventurous spirit and happy coding!
```java
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public void append(int value) {
        if(head == null) {
            head = new ListNode(value);
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }
}

class Solution {
    public static int indexOfX(LinkedList list, int x) {
        // TODO: implement this
        int length = 1;
        ListNode current = list.head;
        
        while (current != null) {
            if (current.value == x) {
                return length;
            } else {
                current = current.next;
                length++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        int index = indexOfX(list, 15);
        System.out.println("The value 15 first occurs at position " + index);
    }
}
```

Questions I asked Cosmo
* Explain the difference between the examples in the lesson and this problem.

        Great question! Here’s how they differ:
        
        In the lesson, you learned how to:
        
        Traverse a linked list to reverse its order (using a stack).
        Count the total number of nodes in a linked list.
        In this practice, you need to:
        
        Traverse the list and count nodes only up to (and including) the first node with a specific value.
        Return the count (position), or -1 if the value isn’t found.
        So, instead of counting all nodes or reversing, you’re searching for a value and counting as you go. What do you think you’d need to change in your traversal to stop at the right moment?

* For loop?

        Nice catch! A for loop like that isn’t the best fit here. Remember, you want to:
        
        Start at the head of the linked list.
        Move through each node, one by one.
        Count how many nodes you visit until you find the value x.
        What kind of loop would let you walk through each node of a linked list? And how would you check each node’s value?

* While loop

        Exactly! A while loop is perfect for traversing a linked list. Here’s a quick guide:
        
        Start with a pointer at the head node.
        Use a while loop to move through each node (while (current != null)).
        At each step, check if the current node’s value matches x.
        Don’t forget to count how many nodes you’ve visited!
        Can you try rewriting your function using a while loop and a counter?

* Incrementing inside the if block?
        
        You're on the right track thinking about where to increment! But first, notice that your current loop doesn't actually traverse the linked list—it just loops over numbers.
        
        Instead, you want to:
        
        Use a pointer (like current) to move through the nodes.
        Increment your counter each time you visit a node.
        Check inside the loop: if current.value == x, return the counter.
        Where do you think you should move the pointer to the next node?


* Why does current.value give an error?

        Great question! The error happens because current is a LinkedList, not a ListNode. The value field exists only in ListNode.
        
        To traverse the list, you should set current to list.head (which is a ListNode), and then use current.value. Can you update your code so current is a ListNode?


        Before you move on, here are a couple of things to check:
        
        Make sure your while loop actually moves to the next node each time (otherwise, it could get stuck).
        Only return -1 after the loop, not inside it—otherwise, you’ll stop after checking just the first node.
        Try updating those parts and see what happens!

        Try updating your loop to:
        
        Loop while current != null
        Inside the loop, check if current.value == x
        If yes, return the counter (don’t forget to start counting from 1, since the first node is position 1)
        If not, move to the next node and increment the counter
        Want to give it another shot with these adjustments?

## Lesson 3: Deciphering Linked List Puzzles: Removing Duplicates and Calculating Intervals in Java
### Introduction to Linked Lists and Interview Challenges
Welcome back! As we continue to master the art of interview-oriented problems using linked lists in Java, we're setting our sights on practical, algorithmic challenges you will likely face.

### 1. Problem 1: Eliminating Duplicates in Linked Lists
Consider the following real-life problem: You’re tasked with organizing a digital library where some books have been accidentally duplicated. You aim to identify and remove these redundant entries to ensure each title is unique in your catalog.

### 2. Problem 1: Naive Approach and Its Drawbacks
A naive approach would be to browse each book and compare it with every other title in a nested loop fashion. As with any large library, this approach would be cumbersome, with a time complexity of O(n^2). It also scales poorly with larger datasets because the time taken to process increases exponentially with each additional book — much like searching an entire library to check for duplicates each time a new book is added.

### 3. Problem 1: Efficient Approach Explanation and Comparison
To address the issues of the naive approach, we use a more strategic method akin to maintaining a checklist: marking off each book we come across. This method, replicated in our algorithm, employs a `HashSet` to record unique titles. Consequently, we reduce our time complexity to O(n).

### 4. Problem 1: Step-by-Step Solution with Detailed Explanation
Let's delve into the step-by-step code:

```java
public ListNode removeDuplicates(ListNode head) {
    // If the library is empty or has only one book, no duplicates can exist.
    if (head == null || head.next == null) {
        return head;
    }
    
    // We initiate our checklist to keep track of unique books we've already checked out.
    HashSet<Integer> seenBooks = new HashSet<>();
    ListNode current = head; // Start checking from the first book on the shelf.
    seenBooks.add(current.value); // The first book is always unique.

    while (current.next != null) {
        if (seenBooks.contains(current.next.value)) {
            // We've already seen this book, so we remove it from the shelf by 
            // redirecting the current pointer to the next unique book.
            current.next = current.next.next;
        } else {
            // Upon detecting a unique book, we add it to the checklist and move to the next on the shelf.
            seenBooks.add(current.next.value);
            current = current.next;
        }
    }
    
    // The cleaned-up library with no duplicate titles.
    return head;
}
```
With this explanation, we've clarified the importance of each line of code in the context of the overall strategy for duplicate elimination. We implemented a systematic approach to traverse the list and used a `HashSet` to avoid repetitively processing the same value while maintaining efficient traversal.

### 5. Problem 2: Finding the Average of Every Third Element
Now, think of a long-distance race where you must analyze the runners' performance at every third checkpoint to gauge the race's progress.

### 6. Problem 2: Problem Actualization
The task requires calculating the average time at regular intervals throughout the racecourse. This problem aligns with our linked list scenario, wherein the list represents checkpoint timings, and the objective is to find the average time at every third checkpoint.

### 7. Problem 2: Efficient Approach
We will simply traverse the given linked list and track the sum and amount of every third element. It sounds easy, but let's examine the solution to see if everything is clear!

### 8. Building the Solution Step-by-Step with Detailed Explanation
Here is our strategy translated into code, explained in detail:

```java
public double averageOfEveryThird(ListNode head) {
    // A race with fewer than three checkpoints doesn't provide enough data for averaging.
    if (head == null || head.next == null || head.next.next == null) {
        return 0.0;
    }
    
    // Here, we'll record the total times at selected checkpoints.
    int sum = 0; 
    // The number of checkpoints that have contributed to our sum.
    int count = 0; 
    ListNode current = head; // The start of the race.

    // We use 'index' as our countdown timer, ticking off each checkpoint as we pass.
    for (int index = 1; current != null; current = current.next, index++) {
        // Our timer activates at every third checkpoint.
        if (index % 3 == 0) {
            sum += current.value; // Add the checkpoint time to our total.
            count++; // Another checkpoint contributes to the average.
        }
    }
    
    // The average timing at every third checkpoint, calculated just as a timing system might do.
    return (double) sum / count;
}
```
The detailed commentary for each code block elucidates the purpose behind the lines of code, aligning them with our race-timing analogy. This enhances understanding by connecting the implementation directly to the problem-solving strategy.

### Lesson Summary
Through this lesson, we've explored optimization strategies for common linked list challenges, addressing the reasoning behind efficient algorithms and their practical coding implementation. We've moved from understanding the 'how' to grasping the 'why,' deploying tailored, scalable solutions that will serve you well in technical interviews. Having navigated through the theory and dissected the code, it's your turn to practice and embed these concepts!

#### Practice #1
Hey Stellar Navigator, we’ve got a job. Our digital library has some duplicate books due to a mishap by my assistant. Your task? Remove the duplicates from our new book list, represented by a singly linked list. Each node is a book, denoted by non-negative integers. Rest assured, the input list will always be non-empty. After eliminating duplicates, return the cleaned-up list. Time to get coding and tidy up our library!
```java
import java.util.HashSet;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;

    public LinkedList(int value) {
        this.head = new ListNode(value);
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        ListNode current = head;

        if (current.next == null) {
            current.next = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeDuplicates() {
        // implement this
        if (head == null || head.next == null) {
            return;
        }
        HashSet<Integer> seenBooks = new HashSet<>();
        ListNode current = head;
        seenBooks.add(current.value);
        while (current.next != null) {
            if (seenBooks.contains(current.next.value)) {
                current.next = current.next.next;
            } else {
                seenBooks.add(current.next.value);
                current = current.next;
            }
        }
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
```
Questions I asked Cosmo:
* Why is my head void?

        Great question! In your removeDuplicates method, you might notice that you don’t return anything—it's a void method. That’s because your LinkedList class manages the head node internally, so you just modify the list in place.
        
        The head field is private and always points to the start of your list.
        When you remove duplicates, you update the nodes directly—no need to return a new head.
        Does that help clarify why void is used here?


* So what should it return instead?

        In this design, it’s best for removeDuplicates to stay void—it just updates the list in place. If you wanted to return something, you could return the head node, but since your class already manages head, it’s not necessary.
        
        Keeping it void is clean and standard for methods that modify the object itself.
        Returning head is only useful if you need the updated list outside the class.
        Do you see a reason you’d want to return the head here?


* No return, if conditional?

        Nice catch! You don’t need a return, but you should handle the case where the list is empty or has only one node. That’s what the if (head == null || head.next == null) check is for.
        
        If true, just use return; to exit the method early.
        This prevents errors when trying to access current.value on a null node.
        Try adding that check at the start of your method! Why do you think it’s important?
#### Practice #2
Alright, Stellar Navigator, let's take it up a notch. We're handing you a baton relay race where each runner is a node in a linked list, each holding the runner's checkpoint timing. Your task is to find the total time of every alternating runner, pretty much like a leapfrog race! Just so there's fairness in the race, if our linked list has only one or fewer runners, your function should return 0. Fair enough, right? Remember, your function accepts a linked list of integers: the checkpoint timings, with no limit to the number of nodes, and it returns an integer, the total time. To infinity, and beyond!
```java
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public void append(int value) {
        if(head == null) {
            head = new ListNode(value);
            return;
        }
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }
}

class Solution {
    public static int sumOfEverySecond(LinkedList list) {
        // TODO: implement this
        ListNode current = list.head;
        if (current.next == null) {
            return 0;
        }
        int sum = 0;
        for (int index = 1; current != null; current = current.next, index ++) { 
            if (index % 2 == 0) {
                sum += current.value;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(5);
        int sum = sumOfEverySecond(list);
        System.out.println("Sum of Every Second Node Value: " + sum);
        list.append(10);
        list.append(15);
        sum = sumOfEverySecond(list);
        System.out.println("Sum of Every Second Node Value: " + sum);
    }
}
```
Questions I asked Cosmo:
* Explain the difference between the examples in the lesson and this problem.

        Great question! Here’s a quick breakdown:
        
        In the lesson, you worked with:
        
        Removing duplicates (using a HashSet)
        Calculating the average of every third node’s value
        In this practice, you need to:
        
        Calculate the sum of every second node’s value (not the average, and not every third node)
        No need to remove duplicates or use a HashSet
        What do you notice about the pattern of nodes you need to sum here compared to the lesson’s average calculation?

## Lesson 4: Exploring Java's Built-in LinkedList
### Introduction
Hello! Sometimes, you don't have to implement the linked list yourself. Java has a built-in **LinkedList** class — a fundamental tool for implementing data structures. We have even used it a bit for initializing queues and stacks. In this lesson, you will learn to use Java's `LinkedList`, understand its methods, and see them in action.

### 1. Overview of Java's LinkedList
Java's `LinkedList` is part of the Java Collections Framework. It represents a doubly-linked list and provides numerous methods for performing operations like adding and removing elements, searching elements, and iterating through the list.

A doubly-linked list is similar to a singly-linked list, but with one key difference. While a singly-linked list has nodes containing a reference to the next node in the sequence, in a doubly-linked list, each node contains a reference to both the next node and the previous node in the sequence. This gives more flexibility in navigating through the list, allowing both forward and backward traversals, but at the cost of increased complexity and resource usage for maintaining references in both directions.

### 2. Working with Java's LinkedList
Let’s begin by creating a `LinkedList` in Java. You start by instantiating the `LinkedList` class, as shown below:

```java
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> students = new LinkedList<>();
  }
}
```
In the above code, we create a `LinkedList` called `students` that will store `String` type data. However, it's currently empty. Let's see how we can operate on this `LinkedList`.

### 3. Methods in LinkedList
Java's `LinkedList` class comes loaded with many powerful methods. We'll focus on some basic yet very important ones:

* `add(E element)`: This method appends the specified element to the end of the list.
* `add(int index, E element)`: This method inserts the specified element at the specified position in the list.
* `remove()`: This method retrieves and removes the list's head (the first element).
* `get(int index)`: Returns the element at the specified position in the list.

These methods are demonstrated in the following code:

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("John");
        students.add(0, "Alice");
        System.out.println(students.get(0));  // prints Alice
        students.remove();
        System.out.println(students.get(0));  // prints John
    }
}
```
### 4. Exploring LinkedList Traversal
To visit each element in the `LinkedList`, we must traverse from the start node to the end node. Java's `ListIterator` interface helps with this and provides the methods for such iterations. Let's look at an example:

```java
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.add("John");
        students.add("Alice");

        ListIterator li = students.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }
        /*
        Output:
        John
        Alice
         */
    }
}
```
### 5. Advanced LinkedList Operations
Now, let's learn a few more exciting methods of Java's LinkedList:

* `addFirst(E e)`: This method inserts the specified element at the beginning of the list.
* `addLast(E e)`: This method appends the specified element at the end of the list.
* `clear()`: This method removes all elements from the list.
* `contains(Object obj)`: This method returns true if the list contains the specified element.
* `isEmpty()`: This method returns true if the list contains no elements.

Here is an instance where we use these methods:

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("John");
        students.addLast("Alice");
        System.out.println(students.contains("Alice"));  // prints true
        System.out.println(students.isEmpty());  // prints false
        students.clear();
        System.out.println(students.isEmpty());  // prints true
    }
}
```

### 6. Complexities Associated with LinkedList Operations
Understanding the time complexities involved in `LinkedList` operations becomes critical as we journey further. We'll discuss these complexities using Big O notation:

* `add(int index, E element)`: The worst-case time complexity is O(n) as it needs to traverse the list.
* `add(E element)`: The time complexity is O(1) as it adds an element at the end of the list.
* `remove()`: It is also O(1) as it removes the first element of the list.

### Lesson Summary and Practice
Congratulations! We've covered Java's' LinkedList' creation, operations, traversal, and complexities. To encourage practice, which is central to mastering these operations and understanding their utility, this lesson is followed by several exercises that will take you one step closer to becoming a pro in using `LinkedList`. So, get ready, and happy coding!

#### Practice #1
magine you have a list of tasks for the day and need to adjust your schedule by adding, inserting, and removing tasks. Initially, you planned to start with Task 5, then move on to Task 10. However, you realize Task 7 is more urgent and should be completed right after the first task. Moreover, it turns out you can skip the first task altogether. Run the code by clicking the RUN button to see how your updated task list looks!
```java
class Solution {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> taskList = new java.util.LinkedList<>();
        taskList.add(5);   // adds Task 5 at the end
        taskList.add(10);  // adds Task 10 at the end
        taskList.add(1, 7); // inserts Task 7 at index 1
        taskList.remove(); // removes the first task
        
        System.out.println(taskList); // Check the updated list of tasks [7, 10]
    }
}
```

#### Practice #2
Great progress! Your mission now is to add the task to the list and then remove the first task once it is completed. Can you do it?
```java
class Solution {
    public static void main(String[] args) {
        java.util.LinkedList<String> tasks = new java.util.LinkedList<>();

        // Adding tasks for the day
        tasks.add("Email team meeting agenda");
        tasks.add("Review project proposal");
        // TODO: Add the task "Prepare presentation slides".
        tasks.add("Prepare presentation slides");
        // TODO: Remove the first task after completion.
        tasks.remove();
        // The remaining tasks in the list
        System.out.println(tasks);
    }
}
```

#### Practice #3
#### Practice #4
#### Practice #5
