class Practice {
    public static void main(String [] args) {
        System.out.println(palindrome("ama"));
        System.out.println(solution(20));
    }

//Only CodeSignal Practice Question: Single Function Question
//You are given a two-digit integer n. Return the sum of its digits.
    static int solution(int n) {
        int first = n/10;
        int second = n%10;
        int sum = first + second;
        return sum;
    }

//Single Function Questions
//1. Write a boolean that returns true if the string is a palindrome and false if it is not.
    static boolean palindrome (String string) {
        //create StringBuilder
        StringBuilder reversedString = new StringBuilder();
        //reverse string
        reversedString.reverse();
        //if reversed string == string, return true
        return true;
    }
}

//2. Write a boolean that returns true if the string is in the "HR:MM" format and false if it is not.

//Find the bug questions
// 3. find the bug that returns this format: (seems to be double the amount of stars for each input). The function is a set of for loops that control "*" additions to string.
/*

 "***
 *abc*
 ***"

 */

/* Sample Question Types
 1. Array Manipulation
Write a method that returns the maximum product of two integers in an array.

2. String Parsing
Return true if a string is a palindrome (case insensitive, ignore non-alphanumerics).

3. HashMap Practice
Return the first non-repeating character in a string.


Java CodeSignal Certification – Practice Quiz (with Answers)
1. Which of the following is a valid main method signature in Java?
A. public void main(String[] args)
B. public static void main(String[] args)
C. static void Main(String args[])
D. void public static main(String args[])

2. What is the output of the following code?
int a = 5, b = 2;
System.out.println(a / b);
A. 2
B. 2.5
C. 2.0
D. Compilation error

3. Which Java data type is used to store 64-bit integer values?
A. int
B. long
C. short
D. double


Section 2: Object-Oriented Programming
4. 5. 6. Which keyword is used to inherit a class in Java?
A. implements
B. inherits
C. extends
D. super

True or False: Java supports multiple inheritance with classes.
The answer is: False
Which of the following statements is correct about constructors?
A. They must have a return type
B. They can be static
C. They have the same name as the class
D. They can be called explicitly with new.constructorName()

Section 3: Loops and Conditionals
7. What is the output of the following loop?
for (int i = 0; i < 3; i++) {
System.out.print(i + " ");
8. }
A. 0 1 2
B. 1 2 3
C. 0 1 2 3
D. 1 2

Which loop guarantees at least one execution?
A. for loop
B. while loop
C. do-while loop
D. All of the above

9. What is the correct syntax for an if statement in Java?
A. if x > 5 then {...}
B. if (x > 5) {...}
C. if x > 5: {...}
D. if (x > 5); {...}

Section 4: Data Structures & Arrays
10. How do you declare an array of integers in Java with 5 elements?
A. int[] arr = new int(5);
B. int arr[] = new int[5];
C. int[5] arr = new int[];
D. int arr = new int[5];

11. Which interface allows duplicate elements and maintains insertion order?
A. Set
B. List
C. Map
D. Queue

12. What is the result of the following code?
int[] nums = {1, 2, 3};
System.out.println(nums[3]);
A. 3
B. Compilation error
C. ArrayIndexOutOfBoundsException
D. null

Section 5: Exceptions & Libraries
13. Which keyword is used to handle exceptions?
A. catch
B. final
C. error
D. handle

14. What is the output?
try {
int x = 5 / 0;
} catch (ArithmeticException e) {
System.out.println("Error");
}
A. No output
B. Compilation error
C. Runtime crash
D. Error


15. What does java.util.ArrayList provide that arrays do not?
A. Fixed size
B. Type safety
C. Dynamic resizing
D. Primitive storage

Section 6: Additional Questions & Answers
16. Which of the following is not a valid access modifier in Java?
A. public
B. private
C. protected
D. external

17. What will be the output of this code snippet?
String a = "Hello";
String b = "Hello";
System.out.println(a == b);
A. false
B. true
C. Compilation error
D. Runtime exception

18. Which collection class does not allow duplicate elements?
A. ArrayList
B. HashSet
C. LinkedList
D. Vector

19. What does the final keyword do when used with a variable?
A. Prevents the variable from being accessed
B. Makes the variable immutable after assignment
C. Makes the variable static
D. Allows changes only inside loops

20. What is method overloading in Java?
A. Using the same method name with different return types
B. Using the same method name with different parameters
C. Redefining a method in a child class
D. A method that throws multiple exceptions

21. What is the default value of a boolean variable in Java (class-level)?
A. true
B. false
C. null
D. 0


22. Which of the following is true about static methods?
A. They can access instance variables directly
B. They can be overridden
C. They belong to the class, not objects
D. They require an object instance to be called

23. Which keyword is used to define an interface in Java?
A. class
B. interface
C. abstract
D. implements

24. Which of the following can be used to stop a loop immediately?
A. stop
B. exit
C. continue
D. break

25. Which statement correctly initializes a HashMap?
A. Map map = new HashMap();
B. HashMap map = new Map();
C. Map map = HashMap();
D. new HashMap map = Map();

26. What is the result of this expression?
System.out.println(10 + 20 + "30");
A. 30
B. 102030
C. 3030
D. 3030

27. Which of the following is the correct way to declare a constant in Java?
A. const double RATE = 0.05;
B. final double RATE = 0.05;
C. double constant RATE = 0.05;
D. static RATE = 0.05;

28. Which method must be implemented when a class implements the Runnable
interface?
A. execute()
B. run()
C. start()
D. main()

29. Which operator is used to compare the values of two primitives for equality?
A. =
B. ==
C. equals()
D. !=

30. Which exception is thrown when an array is accessed out of bounds?
A. ArrayException
B. NullPointerException
C. ArrayIndexOutOfBoundsException
D. IndexException

Section 7: Additional Questions & Answers
31. What is the result of the following Java code?
int x = 5;
int y = 2;
System.out.println(x / y);

32. Which access modifier allows visibility only within the same package?
A. public
B. protected
C. private
D. default (no modifier)


33. What will this code print?
String s = "hello";
System.out.println(s.substring(1, 4));

34. Which keyword is used to prevent inheritance of a class?
A. static
B. final
C. const
D. immutable

35. How is a HashSet different from a TreeSet in Java?
A. HashSet is ordered, TreeSet is not
B. HashSet allows duplicates, TreeSet does not
C. TreeSet maintains sorted order, HashSet does not
D. HashSet uses more memory than TreeSet

36. What is the correct way to declare an abstract method in Java?
A. abstract void run() {}
B. void run();
C. abstract void run();
D. public void abstract run();

37. What is the result of this code?
int[] arr = {1, 2, 3};
System.out.println(arr[3]);

38. What does the finally block do in exception handling?
A. Executes only if an exception is thrown
B. Executes only if no exception is thrown
C. Executes always, whether an exception is thrown or not
D. Prevents the program from crashing

39. Which data structure is best suited for a FIFO (first-in-first-out) behavior?
A. Stack
B. Queue
C. Tree
D. Set
*/



