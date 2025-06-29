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

## Lesson 3: Java Logical Errors
### 1. Understanding Logical Errors
Logical errors can be likened to an instance where you follow a recipe to the letter, measuring all ingredients precisely, only to end up with a dish that doesn't taste as expected. In programming terms, the syntax of your code is flawless, and the program runs without any glitches, but the output isn't what you intended.

Let's explore an example in Java:
    
    int width = 5;
    int height = 10;
    int area = width + height; //logical error
    System.out.println("Area of the rectangle: " + area);
In this instance, we have mistakenly added the `width` and `height` of a rectangle, but the area of a rectangle should be calculated by multiplying them. Although the program runs without any error, it yields an incorrect output. Thus, this is a logical error.

### 2. Common Logical Errors in Java
You may encounter several common logical errors:

* **Off-by-One Error**: This type of error typically occurs in loop control, where you may start or finish a loop one iteration too early or too late.
    
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
This loop should print the integers 1 to 5 (a total of 5 integers) but ends up with a runtime error accessing the non-existing index `numbers.length` due to an Off-by-One Error.

* **Infinite Loop**: These occur when a loop's exit condition is never met, causing the program to run the loop indefinitely.

        int number = 0;
        while (number < 10) {
            System.out.println(number);
        }
The above loop is an example of an infinite loop. The exit condition (`number < 10`) will always remain constant, as the `number` doesn't change inside the loop, leading to an infinite loop.

* **Division by Zero**: Be cautious about the denominator in division operations. If the denominator is zero, it will turn your program into a black hole!
    
        int a = 5;
        int b = 5;
        int divisor = a - b;
        int dividend = 5;
        int quotient = dividend / divisor;
The above code, in which you attempt to divide a number by zero, is an example of a logical error that causes a runtime error.

### 3. Addressing Logical Errors
Debugging to find a logical error involves thinking through your code, adding debug output (via `System.out.println` or using IDE debugging tools), analyzing this output, and reasoning out why it is behaving in such a manner. Here are the corrected versions of the errors we just mentioned:

* Off-by-One Error:

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i); // debugging output - helped us to see that we are entering the loop with `i = numbers.length` that's not expected
            System.out.println(numbers[i]);
        }
* Infinite Loop:

        int number = 0;
        while (number < 10) {
            System.out.println(number); // this print statement itself was a great debugging mechanism, we could see the number doesn't change
            number++; // adding the missing statement
        }
* Division by Zero:

        int a = 5;
        int b = 5;
        int divisor = a - b;
        int dividend = 5;
        System.out.println("Dividing " + dividend + " by "  + divisor); // Adding a debug statement to see that we are dividing by 0
        int quotient = dividend / (divisor + 1);

#### Practice #1
We have a small snippet that calculates and displays the total number of cookies available. There's a bug causing it to show an incorrect amount. Can you find and fix it?

Original

    class Solution {
        public static void main(String[] args) {
            int cookiesInStorage = 10; // the number of cookies in the storage
            int cookiesBakedToday = 3;
            int cookiesTotal = cookiesInStorage - cookiesBakedToday;
            System.out.println("Total cookies we have: " + cookiesTotal);
        }
    }

Error

    Total cookies we have: 7

Fixed

    class Solution {
        public static void main(String[] args) {
            int cookiesInStorage = 10; // the number of cookies in the storage
            int cookiesBakedToday = 3;
            int cookiesTotal = cookiesInStorage + cookiesBakedToday;
            System.out.println("Total cookies we have: " + cookiesTotal);
        }
    }

#### Practice #2
t calculates the total number of space objects in the solar system, given the count of planets and moons. Run the code, identify the bug that causes an incorrect result, and fix it.

Original

    class Solution {
        public static void main(String[] args) {
            int numberOfPlanets = 8;
            int numberOfMoons = 182;
            
            // There is an issue with the following line
            int totalSpaceObjects = numberOfPlanets * numberOfMoons; // This should calculate total space objects
            
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
        }
    }

Error

    solution.java:9: error: unclosed character literal
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                               ^
    solution.java:9: error: ';' expected
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                           ^
    solution.java:9: error: ';' expected
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                                      ^
    solution.java:9: error: ';' expected
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                                                ^
    solution.java:9: error: unclosed character literal
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                                                         ^
    solution.java:9: error: not a statement
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                                                             ^
    solution.java:9: error: ';' expected
            System.out.println('Total space objects in the solar system: ' + totalSpaceObjects);
                                                                                              ^
    7 errors

Fixed

    class Solution {
        public static void main(String[] args) {
            int numberOfPlanets = 8;
            int numberOfMoons = 182;
            
            // There is an issue with the following line
            int totalSpaceObjects = numberOfPlanets + numberOfMoons; // This should calculate total space objects
            
            System.out.println("Total space objects in the solar system: " + totalSpaceObjects);
        }
    }

#### Practice #3
Calculate the average distance of these 3 planets from the sun. Run the given code and see if it displays the correct average. There might be a small bug preventing the accurate calculation!

Original

    class Solution {
        public static void main(String[] args) {
            int planetDistances[] = {58, 108, 150}; // Distances in millions of kilometers
            int totalDistance = 0;
            
            for (int i = 0; i <= planetDistances.length; i++) {
                totalDistance += planetDistances[i];
            }
            int averageDistance = totalDistance / planetDistances.length;
            System.out.println("The average distance of the planets from the sun is: " + averageDistance + " million kilometers");
        }
    }

Error

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at Solution.main(solution.java:7)

Fixed

    class Solution {
        public static void main(String[] args) {
            int planetDistances[] = {58, 108, 150}; // Distances in millions of kilometers
            int totalDistance = 0;
            
            for (int i = 0; i < planetDistances.length; i++) {
                totalDistance += planetDistances[i];
            }
            int averageDistance = totalDistance / planetDistances.length;
            System.out.println("The average distance of the planets from the sun is: " + averageDistance + " million kilometers");
        }
    }

#### Practice #4
Please review the code and correct the error so we can generate an accurate report of the total number of moons.

Original

    class Solution {
        public static void main(String[] args) {
            // Array representing the approximate number of moons for each planet in the solar system
            int[] moonsForEachPlanet = {0, 0, 1, 2, 79, 82, 27, 14}; // Correct data for moon count
            int totalMoons = 0;
    
            // Loop to sum the moons for each planet
            for (int moonCount : moonsForEachPlanet) {
                totalMoons += moonsForEachPlanet[moonCount];
            }
          
            // Output total moons in the solar system
            System.out.println("Total moons in the solar system: " + totalMoons);
        }
    }

Error

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 79 out of bounds for length 8
    	at Solution.main(solution.java:9)

Fixed

    class Solution {
        public static void main(String[] args) {
            // Array representing the approximate number of moons for each planet in the solar system
            int[] moonsForEachPlanet = {0, 0, 1, 2, 79, 82, 27, 14}; // Correct data for moon count
            int totalMoons = 0;
    
            // Loop to sum the moons for each planet
            for (int i = 0; i < moonsForEachPlanet.length; i++) {
                totalMoons += moonsForEachPlanet[i];
            }
          
            // Output total moons in the solar system
            System.out.println("Total moons in the solar system: " + totalMoons);
        }
    }

## Lesson 4: Navigating Through Try, Catch, and Finally Blocks
### 1. Diving into Java Exceptions
Much like asteroids in space, anomalies can occur while coding. Java handles these unexpected events, termed as `exceptions`, to ensure that your program sails smoothly. In the Java cosmos, we differentiate between the cosmic boulders or `Errors` (common occurrences) and space pirates or `Exceptions` (real issues that warrant our intervention). Today, we will meet and conquer the mischief-makers, the `Unchecked Exceptions`:

    public class Main {
        public static void main(String[] args) {
            int[] myArray = new int[]{1, 2, 3};
            System.out.println(myArray[5]); // Oops! We're trying to access the 6th element of an array with only 3 elements. Result: An exception!
        }
    }
You'll see an `ArrayIndexOutOfBoundsException`, signifying an invalid array index access.

### 2. Enter the Try Block
Every spaceship requires a safety mechanism, and so do our Java programs. Let's meet the try block that wraps the segment of code that could potentially raise an exception.

    try {
        // code that may cause an exception
    }
If an exception occurs within the try block, the program control hops right out of the block.

The `catch` block catches and handles any anomalies or exceptions that our `try` block might throw up. It functions in tandem with the `try` block.

    try {
        // code that may cause an exception
    } catch (ExceptionType exc) {
       // code to handle the exception (variable 'exc')
    }
Here's the `catch` block in action:

    try {
        int[] myArray = new int[]{1, 2, 3};
        System.out.println(myArray[5]); // Oops! Unchecked exception: ArrayIndexOutOfBoundsException
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught a cosmic hurdle! Avoided an invalid array index access.\nError message: " + e.getMessage());
    }
    // Prints: Caught a cosmic hurdle! Avoided an invalid array index access.
    // Error message: Index 5 out of bounds for length 3
Our `catch` block waits, ready to swoop in, and voila! It handles the exception smoothly.

### 3. Familiarizing with the Finally Block
The `finally` block executes code persistently, irrespective of whether we have caught an exception or not. Consider `finally` as some kind of cleanup - actions that need to be executed at the end, no matter if the exception happened or not.

Here's its structure and application:

    try {
        // code that may cause an exception
    } catch (ExceptionType e) {
       // code to handle the exception
    } finally {
        // persistent code
    }
And here is an example:

    try {
        int[] myArray = new int[]{1, 2, 3};
        System.out.println(myArray[5]); // Oops! We're trying to access the 6th element of an array with only 3 elements. Result: An exception!
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught a cosmic hurdle! Avoided an invalid array index access.\n Error message: " + e.getMessage());
    } finally {
        System.out.println("Ready for the next hurdle! This code always runs.");
    }
    // Prints:
    // Caught a cosmic hurdle! Avoided an invalid array index access.
    // Error message: Index 5 out of bounds for length 3
    // Ready for the next hurdle! This code always runs.
If the exception doesn't happen (e.g. if we correctly printed `myArray[2]` in the `try` block), the message `Ready for the next hurdle! This code always runs.` would still be printed.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            int[] planets = {100, 200, 300}; // Represents the distance of planets in space units
            
            try {
                int distance = planets[3]; // Trying to access the 4th planet, which does not exist
                System.out.println("Distance: " + distance + " space units");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Oops! We have encountered an unknown planet.");
            } finally {
                System.out.println("Exploration complete. Returning to Earth."); // This code runs regardless of the exception
            }
        }
    }

#### Practice #2
Now, adjust your code so that navigating to the last star won't throw an exception. This small change will demonstrate that the finally block executes regardless of what occurs.

Original

    class Solution {
        public static void main(String[] args) {
            try {
                int[] starCoordinates = {100, 200, 300};
                System.out.println("The third star is at position: " + starCoordinates[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Attempted to travel beyond galaxy limits!");
            } finally {
                System.out.println("Navigation systems recalibrated. Ready for the next adventure!");
            }
        }
    }

Error

    Error: Attempted to travel beyond galaxy limits!
    Navigation systems recalibrated. Ready for the next adventure!

Fixed

    class Solution {
        public static void main(String[] args) {
            try {
                int[] starCoordinates = {100, 200, 300};
                System.out.println("The third star is at position: " + starCoordinates[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Attempted to travel beyond galaxy limits!");
            } finally {
                System.out.println("Navigation systems recalibrated. Ready for the next adventure!");
            }
        }
    }

#### Practice #3
Add a catch block to handle an exception if our array access goes out of bounds, ensuring smooth space travel.
    
    class Solution {
        public static void main(String[] args) {
            int stellarSpeed = 5;
            int[] spaceRoutes = new int[]{8, 2, 4};
            
            try {
                System.out.println(spaceRoutes[stellarSpeed]); // Trying to access an invalid index
            } // TODO: Handle an out-of-bounds access in the array
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            int stellarSpeed = 5;
            int[] spaceRoutes = new int[]{8, 2, 4};
            
            try {
                System.out.println(spaceRoutes[stellarSpeed]); // Trying to access an invalid index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error! Attempted to go nonexistent planet!");
            }// TODO: Handle an out-of-bounds access in the array
        }
    }

#### Practice #4
Create a Java program that anticipates and handles out-of-bounds issues when accessing array elements. Remember to use a try-catch block to manage the exception and add a finally block that always executes.

    class Solution {
        public static void main(String[] args) {
            int[] spaceRocks = {3, 7, 5};
            try {
                System.out.println(spaceRocks[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error! Attemped to go to nonexistent planet!");
            } finally {
                System.out.println("Home sweet home. Mission complete.");
            }
            // TODO: Implement a try block to attempt accessing an index of the `spaceRocks` array
            // TODO: Catch the potential ArrayIndexOutOfBoundsException thrown
            // TODO: Add a 'finally' block that logs a message regardless of the exception outcome
        }
    }

###### feedback: said "doesn't actually trigger an out-of-bounds exception, so the catch block never runs," but didn't specify needed to trigger the esception, just that the finally block executes (as it always does)‼️.




