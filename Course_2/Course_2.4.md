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
        
        Java
        Copy to clipboard
        Node(int d, String stationName) {
            data = d;
            next = null;
        }
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
  ```

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

## Lesson 3
## Lesson 4
