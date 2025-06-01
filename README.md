# COURSE 1: Java Programming for Beginners

In Java, we use statements to perform actions, and each statement ends with a semicolon `(;)`. Java employs curly braces `({ })` to define a block of code.

Look at this simple Java syntax example:

## Java Basics: Syntax, Comments, Semicolons, and Your First Program

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
    class Solution {
        public static void main(String[] args) {
            // This command prints a message to the console
            System.out.println("Greetings from the stars, Java Explorer!");
        }
    }

























