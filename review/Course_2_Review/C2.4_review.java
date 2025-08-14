package review.Course_2_Review;
import java.util.Stack;
import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.ListIterator;

//# Course 2.4: Fundamental Data Structures - Linked Lists in Java
class Solution {
    public static void main(String[] args) {
        //2.4 - unit 1/4 practice 5
        RailwayNetwork network = new RailwayNetwork();
        // TODO: Add station names here 
        network.addStation(101, "Big");
        network.addStation(202, "Bang");
        network.addStation(303, "Theory");
        network.show();
        //2.4 - unit 2/4 practice 1
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        lastNElements(list.head, 3);
        // prints: 5 4 3
        //2.4 - unit 2/4 practice 2
        LinkedList list2 = new LinkedList();
        list2.append(5);
        list2.append(10);
        list2.append(15);
        int index = indexOfX(list, 15);
        System.out.println("The value 15 first occurs at position " + index);

        //2.4 - unit 3/4 practice 2
        LinkedList list3 = new LinkedList();
        list3.append(5);
        int sum = sumOfEverySecond(list);
        System.out.println("Sum of Every Second Node Value: " + sum);
        list3.append(10);
        list3.append(15);
        sum = sumOfEverySecond(list);
        System.out.println("Sum of Every Second Node Value: " + sum);

        /*2.4 - unit 4/4 #### Practice #2: Managing Daily Tasks with LinkedList in Java
        Great progress! Your mission now is to add the task to the list and then remove the first task once it is completed. Can you do it?*/
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
        /*2.4 - unit 4/4 #### Practice #3: Clear and Check LinkedList Status
        Great journey so far, Space Voyager! Now, can you take the helm? You need to clear all the tasks from the task list and then check if the list is empty. Look for the missing lines*/
        // Let's pretend we are organizing daily tasks using Java's LinkedList.
        java.util.LinkedList<String> dailyTasks = new java.util.LinkedList<>();
        // Adding some tasks to our list.
        dailyTasks.add("Wake up");
        dailyTasks.add("Brush teeth");
        dailyTasks.add("Code Java");
        // TODO: Remove all elements from the dailyTasks linked list.
        dailyTasks.clear();
        // TODO: Print out if the list is empty now, expecting a true value.
        System.out.print(dailyTasks.isEmpty());
        /* 2.4 - unit 4/4 #### Practice #4: Add Daily Task Management to LinkedList
        Alright, navigator, are you ready for the next leap through the cosmos of code? Initialize the task list with the most important and final tasks of your busy space day.
         */
        // Create a LinkedList to manage daily tasks.
        java.util.LinkedList<String> tasks2 = new java.util.LinkedList<>();
        tasks2.add("Dinner break");
        // TODO: Set the first task of the day in your tasks list.
        tasks2.addFirst("Gym");
        // TODO: Set the last task of the day in your tasks list.
        tasks2.addLast("Sleep");
        // Check what tasks we have at the start and end of the day.
        System.out.println("Morning Task: " + tasks2.getFirst());
        System.out.println("End of Day Task: " + tasks2.getLast());
        /*2.4 - unit 4/4 #### Practice #5: Add New Tasks to Daily List and Display Them
        Great job so far! Now, let's put your knowledge into action. I need you to add two missing lines: one to insert a task into our daily management list, and another to traverse the list. Remember, tasks can pop up at any time! */
        java.util.LinkedList<String> tasks3 = new java.util.LinkedList<>();
        tasks3.add("Review tasks"); 
        tasks3.add("Get coffee"); 
        tasks3.add("Take a nap");
        // TODO: Add a task "Morning meeting" between "Get coffee" and "Take a nap"
        tasks.add(2, "Morning meeting");
        // TODO: Traverse the list with a for loop and print out each task
        for (String task:tasks) {
        System.out.println(task);
        }
    }
    //2.4 - unit 2/4 practice 1
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
    //2.4 - unit 2/4 practice 2
    public static int indexOfX(LinkedList list, int x) {
        // TODO: implement this
        int length = 1;
        LinkedList.ListNode current = list.head;
        
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
    //2.3 - unit 3/4 practice 1
    public static int sumOfEverySecond(LinkedList list) {
        // TODO: implement this
        LinkedList.ListNode current = list.head;
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
}
/* 2/4 - unit 1/4 #### Practice #5
Let's give our railway network's nodes a more meaningful initialization. Update the Node class to accept stationName as an argument in its constructor. Also, ensure that you modify the calls to the addStation method in our Solution class, passing the station numbers when creating new nodes. Finally, update the show method to display station names connected with " ----> ". Don't forget to test your code by creating station with names!
*/
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


/* 2.4 - unit 2.4 #### Practice #1
Stellar Navigator, here's your mission: construct a function that navigates a given singly linked list from end to start, retrieving and printing the last n data points. We assure that n won't exceed the linked list's length. Ace this space chase using your coding toolkit, and be prepared for unexpected challenges on this celestial journey!
*/
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
/* 2.4 - unit 2/4 #### Practice #2
Brace yourself, Space Voyager! This mission circles cosmos navigation. Given a pathway between planets - represented as a singly linked list- you must pinpoint a planet and uncover its position. You must traverse the linked list and calculate the number of nodes we visit before meeting the given value, including the target node itself. If the target number is not in the list, return -1. Remember, the universe is limitless, and the planet could be any real value. Good luck, Detective! Uphold your adventurous spirit and happy coding!
*/
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList2 {
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


/* 2.4 - unit 3/4 #### Practice #1
Hey Stellar Navigator, we’ve got a job. Our digital library has some duplicate books due to a mishap by my assistant. Your task? Remove the duplicates from our new book list, represented by a singly linked list. Each node is a book, denoted by non-negative integers. Rest assured, the input list will always be non-empty. After eliminating duplicates, return the cleaned-up list. Time to get coding and tidy up our library!

 */
class ListNode2 {
    int value;
    ListNode next;

    ListNode2(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList3 {
    private ListNode head;

    public LinkedList3(int value) {
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
/*2.4 - unit 3/4 #### Practice #2
Alright, Stellar Navigator, let's take it up a notch. We're handing you a baton relay race where each runner is a node in a linked list, each holding the runner's checkpoint timing. Your task is to find the total time of every alternating runner, pretty much like a leapfrog race! Just so there's fairness in the race, if our linked list has only one or fewer runners, your function should return 0. Fair enough, right? Remember, your function accepts a linked list of integers: the checkpoint timings, with no limit to the number of nodes, and it returns an integer, the total time. To infinity, and beyond!
 */
class ListNode3 {
    int value;
    ListNode next;

    ListNode3(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList4 {
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
/* COURSE 4 PRACTICE PROBLEM
### 💻 Solution

Here is a complete Java solution that implements the logic for the "Stellar Traversal" problem. This solution is a great example of how to perform efficient in-place modifications on a linked list.
### ⚙️ Explanation

1.  **Iterative Approach:** The solution uses a single `while` loop and a `current` pointer to iterate through the list from the beginning. This makes it very efficient, as it only requires one pass over the data.
2.  **`current.next` is Key:** The core of the logic is to look ahead at the next node. The condition `while (current != null && current.next != null)` is crucial because it ensures we don't get a `NullPointerException` when checking `current.next`.
3.  **In-Place Deletion:** When a duplicate is found (`current.value == current.next.value`), we don't need a separate deletion method. We simply update the `next` pointer of the `current` node to point to the node **after** the duplicate (`current.next = current.next.next`). This effectively "unlinks" the duplicate from the list.
4.  **Advancing the Pointer:** The `current` pointer is only advanced (`current = current.next`) when a unique value is found. This is important because if there are multiple consecutive duplicates (e.g., `3 -> 3 -> 3`), the loop will continue to process the `current` node (which is still the first `3`) until all the duplicate `3`s are skipped.
 */

class ListNode4 {
    int value;
    ListNode next;

    ListNode4(int value) {
        this.value = value;
        this.next = null;
    }
}

class Solution2 {
    
    /**
     * Removes all consecutive duplicate nodes from a sorted singly linked list.
     * @param head The head of the linked list.
     * @return The head of the modified linked list.
     */
    public static ListNode removeDuplicates(ListNode head) {
        // Handle edge cases: an empty list or a list with only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Use a 'current' pointer to traverse the list
        ListNode current = head;

        // Iterate through the list as long as 'current' and 'current.next' are not null
        while (current != null && current.next != null) {
            // Compare the current node's value with the next node's value
            if (current.value == current.next.value) {
                // If they are the same, skip the duplicate node by
                // updating the 'next' pointer of the current node
                current.next = current.next.next;
            } else {
                // If the values are different, move the current pointer to the next node
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        // Example 1: 1 -> 2 -> 2 -> 3 -> 3 -> 3 -> 4
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(3);
        head1.next.next.next.next.next = new ListNode(3);
        head1.next.next.next.next.next.next = new ListNode(4);

        System.out.println("Original List 1:");
        printList(head1);
        
        ListNode result1 = removeDuplicates(head1);
        
        System.out.println("List after removing duplicates:");
        printList(result1); // Expected: 1 -> 2 -> 3 -> 4
        System.out.println("------------------------------------");

        // Example 2: 5 -> 5 -> 5 -> 5
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(5);
        head2.next.next.next = new ListNode(5);

        System.out.println("Original List 2:");
        printList(head2);
        
        ListNode result2 = removeDuplicates(head2);
        
        System.out.println("List after removing duplicates:");
        printList(result2); // Expected: 5
        System.out.println("------------------------------------");
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }
}


