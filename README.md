<h1 align='center'> Java Programming for Beginners </h1> 

# Course 1: Getting Started with Java

In Java, we use statements to perform actions, and each statement ends with a semicolon `(;)`. Java employs curly braces `({ })` to define a block of code.

Look at this simple Java syntax example:

## Lesson 1: Java Basics: Syntax, Comments, Semicolons, and Your First Program

### 1. Java Syntax Basics
    
    class MyFirstProgram {
        public static void main(String[] args) {
            System.out.println("Hello, Java World!");
        }
    }

In this example, we've declared a class `MyFirstProgram`, included the `main method`, which is where the program starts executing, and presented a statement that prints `"Hello, Java World!"`. You might not understand every single line of this code right now, but that's fine! We will cover it step-by-step in this and the next lessons.

### 2. Comments
In code, we leave notes for ourselves — these are known as comments. These comments (notes) do not affect code execution in any way and are used to clarify things or leave some helpful notes for future developers (or yourself) working on this code. In Java, we use `//` for single-line comments and `/* */` for multi-line comments.

See how we use comments below:

    class MyFirstProgram {
       //Single-line comment. A very important note for myself
        public static void main(String[] args) {
           /*  
             Multi-line comment
             It spans several lines.
             I can use multi-line comments
             for longer notes that don't fit in a single line.
            */
            System.out.println("Hello, Java World!"); // This line prints "Hello, Java World!"
        }
    }

In this instance, the phrases following `//` and those between `/* */` won't be considered when running the program. We use System.out.println statement to print the provided text to the console.

### 3. Build Your First Java Program
Now, it's time to get a closer look at the first Java program you'll learn to write! Here is a simple Java program we have already explored:

    class MyFirstProgram {
        public static void main(String[] args) {
            System.out.println("Hello, Java World!");
        }
    }

Now, let's understand each part of the program:
* class `MyFirstProgram { }:` Here, we declare our class `MyFirstProgram`.
This is essential because **Java requires all the code to be wrapped into some class**. You can just remember this requirement for now, we will explain classes in details later in our Java courses.
* `public static void main(String[] args) { }`: This is the starting point of our program, known as the **`main` method**. When you run the Java program, this is the method that gets executed.
You can consider this as an entry point. While words like `public`, `static`, `void`, and `String[]` might not make sense to you at this point, you can just remember that **`main method` should always be named like that and defined exactly this way**.
* `System.out.println("Hello, Space Explorer!");`: This statement prints `"Hello, Space Explorer!"` to the console.

* 

#### Practice # 1
Run the code

    class Solution {
        public static void main(String[] args) {
            // This command prints a message to the console
            System.out.println("Greetings from the stars, Java Explorer!");
        }
    }

#### Practice #2
Change the text within the System.out.println to "Journey to the stars begins with Java!"

    class Solution {
        public static void main(String[] args) {
            // This line prints a message about space exploration
            System.out.println("Journey to the stars begins with Java!"); // Please change the message!
        }
    }

#### Practice #3
Find the bug

    class Solution {
        public static void main(String[] args) {
            // Sending a greeting to interstellar explorers
            System.out.println("Greetings, interstellar explorers!")
        }
    }


    solution.java:4: error: ';' expected
            System.out.println("Greetings, interstellar explorers!")
                                                                ^
    1 error


    class Solution {
        public static void main(String[] args) {
            // Sending a greeting to interstellar explorers
            System.out.println("Greetings, interstellar explorers!");
        }
    }

Practice #4
Complete the code to broadcast your greeting across the cosmos!

    class Solution {
        public static void main(String[] args) {
            // TODO: Print a welcome message for new space explorers learning Java.
            System.out.println("Welcome new space explorers learning Java!");
        }
    }


Practice #5
Start the countdown for the launch of our virtual spacecraft. Remember, every Java program starts with a class and a main method.

    // TODO: Declare a class named 'Solution' (other class names won't work)
    // Make sure NOT to make your class 'public'
    class Solution {
         // TODO: Inside your class, define the main 'public static void main' method that Java looks for
         public static void main(String[] args) {
            // TODO: Use a print statement to display a message "3, 2, 1... Lift off!" to the console
            System.out.println("3, 2, 1... Lift off!");
         }
    }


## Lesson 2: Java Variables: Storing Data on Our Journey to the Stars

### 1. What are Java Variables?
Visualize Java variables as tiny boxes filled with data. The short example below demonstrates how a variable is created in Java:

    int numberOfStars; // We declare a variable, akin to opting for a box
    numberOfStars = 88; // We then fill it with a value
    System.out.println(numberOfStars); // Finally, we verify its contents. It outputs: 88

Here, 'int' is the variable's data type (integer number), `numberOfStars` is the variable's name, and `88` is its value. We will cover data types in the next lesson, so don't worry if the `int` part is not clear for now.

However, there is a shorter way of doing the same - you can create and assign the variable at the same time. Here is an example:

    int numberOfStars = 88; // creating and assigning the variable with a value
    System.out.println(numberOfStars);











