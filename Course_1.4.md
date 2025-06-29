<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.4: Mastering Debugging with Java
## Lesson 1: Decoding Java Space Signals: Understanding Error Messages

### 1. Introduction to Error Messages
Error messages in `Java` are crucial signals of problems in our code. Typically, an error message contains three key parts: the type of error, the location of the error (class name and line number), and a brief error description.

Let's examine the following:

    public class Solution {
        public static void main(String[] args) {
            System.out.println("Hello, space travelers);
        }
    }
In this case, the compiler trips over a small error — a missing closing quotation mark. The error message provides our first clue about what's going wrong. The error will be:

Markdown
    
    Solution.java:3: error: unclosed string literal
            System.out.println("Hello, space travelers);
                               ^
    1 error
See? The error mentions the file name, the line where the error happens, as well as the cause itself - the string literal `(")` is not closed.

### 2. Compilation Errors in Java
Every Java program is executed in two steps - first, it compiles code, generating a machine-readable format that is called **bytecode** (located in `.class` files), and once the code is compiled - it is executed.

Compile-time errors appear when our **Java** file is being compiled. These are typically syntax errors — like unclosed string literals and missing semicolons. Let's revisit our previous error:

Markdown

    Solution.java:3: error: unclosed string literal
            System.out.println("Hello, space travelers);
                               ^
    1 error
The error message indicates an `unclosed string literal` issue on line `3` in `Solution.java`.

### 3. Runtime Errors in Java
Runtime errors occur after your code has successfully compiled, they occur while your program is executing. So runtime error means that your code is syntactically correct, but it still wasn't able to correctly execute, and the error occurred while running the compiled code.

Examples of runtime errors include dereferencing `null` values or attempting to access out-of-bound array elements (there are more; these two are just the most common examples). Let's inspect an example:

    public class Solution {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
    }
This program results in an `ArrayIndexOutOfBoundsException:`

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Solution.main(Solution.java:4)
This message shows that we attempted to access index `5` in an array of length `3`. Doing so caused a runtime error at line `4` in `Solution.java`.

#### Practice #1
Review it carefully, identify the error, and fix it. Check the console for clues!
Original

    class Solution {
        public static void main(String[] args) {
            String message = "We have " + (2 + 2) + " rovers exploring Mars!;
            System.out.println(message);
        }
    }

Error

    solution.java:3: error: unclosed string literal
            String message = "We have " + (2 + 2) + " rovers exploring Mars!;
                                                    ^
    1 error

Fixed

    class Solution {
        public static void main(String[] args) {
            String message = "We have " + (2 + 2) + " rovers exploring Mars!";
            System.out.println(message);
        }
    }
#### Practice #2
Can you find and fix the problem so we can continue stargazing?
Original

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000000
            System.out.println("There are " + starsInGalaxy + " stars in the Milky Way Galaxy.");
        }
    }

Error

    solution.java:3: error: ';' expected
            int starsInGalaxy = 1000000000
                                          ^
    1 error

Fixed

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000000;
            System.out.println("There are " + starsInGalaxy + " stars in the Milky Way Galaxy.");
        }
    }
#### Practice #3
There's a bug when we attempt to access one of the compartments. Could you help us identify and fix the issue so that we can inspect the contents safely?
Original

    class Solution {
        public static void main(String[] args) {
            int[] storageCompartment = {5, 10, 15};
            System.out.println(storageCompartment[3]); // Access the last element of the array
        }
    }

Error

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at Solution.main(solution.java:4)

Fixed

    class Solution {
        public static void main(String[] args) {
            int[] storageCompartment = {5, 10, 15};
            System.out.println(storageCompartment[2]); // Access the last element of the array
        }
    }

#### Practice #4
Ensure that the distress signal can be sent without errors. Please review the code and correct any issues so that communication is clear.

Original

    class Solution {
        public static void main(String[] args) {
            int value = 3;
            String spaceMessage = value == 3 ? null : "Hey, this is a message from Space!";
            System.out.println(spaceMessage.length()); // Process the space message
        }
    }

Error

    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local2>" is null
    	at Solution.main(solution.java:5)

Fixed
    
    class Solution {
        public static void main(String[] args) {
            int value = 3;
            String spaceMessage = value == 3 ? null : "Hey, this is a message from Space!";
            System.out.println(spaceMessage);
        }
    }
     

#### Practice #5
#### Practice #6
