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
     

## Lesson 2: Java's Puzzling Punctuation
### 1.  Unmasking Syntax Errors
**Syntax errors**, or parsing errors, are the most common type of errors you'll encounter as a beginner programmer. They occur when the Java compiler finds any non-conformity with the language syntax, such as forgetting a semicolon at the end of a statement or making a spelling error in a variable name. Here's an example:


    public class Solution {
        public static void main(String[] args) {
            System.out.println("Hello, Java Galaxy")
        }
    }
In this Java snippet, the absence of a semicolon at the end of the `System.out.println()` statement causes a syntax error, which prevents the program from compiling. The good news is that Java will tell you where the error lies! Here is the compilation output for this program:

Markdown

    Solution.java:3: error: ';' expected
            System.out.println("Hello, Java Galaxy")
                                                    ^
    1 error
### 2. Decoding the Types of Syntax Errors
Syntax errors can manifest in several ways. Here, we'll discuss the most frequently encountered types:

* **Variable Declaration Errors**: These occur when a variable isn't properly declared or used, as demonstrated in this snippet:

        int myVariable = 100;
        System.out.println(myVarible); // Typo in a variable name
* **Missing Symbols**: Often resulting from a missing semicolon or unmatched brackets, braces, or parentheses. This example showcases what such an error might look like:


        int x = 10 // missing semicolon (;)
        System.out.println(x);
* **Illegal Type Usage**: Using the correct data type for your variable is always mandatory; choosing the wrong type will result in a syntax error. For example:

        String number = 10; // 10 is an int, not a String.
* **Illegal start of type**: This error occurs when a statement begins without the necessary keyword or the correct structure.

        public class Main {
            public static void main(String[] args) {
                public static void anotherMain() { } // You cannot create method inside another method
            }
        }
Understanding these types will help us detect and rectify errors more efficiently.

### 3. Patching Up Syntax Errors
The journey to resolving a syntax error begins with systemically locating and understanding it. The CodeSignal IDE assists this process by marking errors with a red underline, similar to spell-checkers in word processors.

We can correct our previous example by simply adding a semicolon at the end of the print statement:

    public class Main {
        public static void main(String[] args) {
            System.out.println("Hello, Java Galaxy");
        }
    }
Having made this correction, our program will run without any issues. This example underscores the importance of meticulously cross-checking our code for potential syntax errors before we execute the compile command.

#### Practice #1
Help us debug the code so we can receive status updates from mission control once again. Run the code, check the output, and see if you can spot and fix the mistake.

Original

    class Solution {
        public static void main(String[] args) {
            int missionControl = 3
            System.out.println("Virtual space mission control center status: " + missionControl);
        }
    }

Error

    solution.java:3: error: ';' expected
            int missionControl = 3
                                  ^
    1 error

Fixed
    
    class Solution {
        public static void main(String[] args) {
            int missionControl = 3;
            System.out.println("Virtual space mission control center status: " + missionControl);
        }
    }

#### Practice #2
Identify the correct number of syntax errors to fix in our code module. But Houston, we have a problem! The code is ready to compile, but it appears we've omitted some vital code symbols somewhere within the module. Run diagnostics and correct the issue, ensuring every sequence is complete and our program launches successfully into the Java Galaxy!

Original

    class Solution {
        public static void main(String args) {
            int numOfErrors = 3;
            System.out.println("Number of syntax errors to fix: " + numOfErrors);
        }
    }

Error

    Error: Main method not found in class Solution, please define the main method as:
       public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application

Fixed

    class Solution {
        public static void main(String[] args) {
            int numOfErrors = 3;
            System.out.println("Number of syntax errors to fix: " + numOfErrors);
        }
    }

#### Practice #3
Check the code and ensure all stars are logged. Something small is amiss. Can you spot and fix it?

Original

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000;
            System.out.println(startsInGalaxy);
        }
    }

Error

    solution.java:4: error: cannot find symbol
            System.out.println(startsInGalaxy);
                               ^
      symbol:   variable startsInGalaxy
      location: class Solution
    1 error

Fixed

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000;
            System.out.println(starsInGalaxy);
        }
    }

#### Practice #4
A syntax mishap is preventing it from compiling. Your mission is to examine the code and rectify the error so that the program operates flawlessly.

Original

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000; // Counting stars
            (System.out.println(starsInGalaxy))()
        }
    }

Error

    solution.java:4: error: not a statement
            (System.out.println(starsInGalaxy))()
            ^
    solution.java:4: error: ';' expected
            (System.out.println(starsInGalaxy))()
                                               ^
    2 errors

Fixed

    class Solution {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000; // Counting stars
            System.out.println(starsInGalaxy);
        }
    }

## Lesson 3:
### 1.

## Lesson 4:
### 2.


