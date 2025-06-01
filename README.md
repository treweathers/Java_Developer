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

Here, `int` is the variable's data type (integer number), `numberOfStars` is the variable's name, and `88` is its value. We will cover data types in the next lesson, so don't worry if the `int` part is not clear for now.

However, there is a shorter way of doing the same - you can create and assign the variable at the same time. Here is an example:

    int numberOfStars = 88; // creating and assigning the variable with a value
    System.out.println(numberOfStars);
### 2. Java Naming Conventions
Just as labeling a box effectively, choosing a name for a Java variable necessitates certain rules and conventions. These ensure that our code remains free of errors and is easy for others to understand.

The variable name should start with a lowercase letter and adhere to the CamelCase convention: if the variable name contains just a single word, all letters should be lowercase; if the variable name contains multiple words, however, the first one should be lowercase, and each of the next ones should start with a capital letter. For example, `age`, `weight`, `myAge`, `firstDayOfWeek`.

Certain characters, such as digits and special characters, are not permissible at the beginning of variable names.

    // Correct variable naming
    int myAge = 20;
    int myWeight = 72;
    int district9Population = 10000;
    
    // Incorrect variable naming (commented intentionally)
    // int 0zero = 0;
    // int ?questionMark = 1;

### 3. Assignment Operations in Java
Assignment in Java involves allocating or changing a value to a variable using the `=` operator. This process resembles placing an item in a box.

    int constellations = 88; // We design a box, label it and deposit a value inside
    System.out.println(constellations); // We inspect its contents. It outputs: 88
        
    constellations = 77; // We change the value of the variable
    System.out.println(constellations); // We inspect the updated contents. It outputs: 77

### 4. Java Constants
While the previous section explains how to change the value of the variable, Java also provides a way to define constants, i.e., variables that cannot change their value once assigned. We use the `final` keyword to declare a constant. The naming convention for constants is to use uppercase letters with words separated by underscore `_`.

It is a good practice to declare a value as `final` if you know that it's not going to change for various reasons such as readability, safety (avoid unintentional modifications), and sometimes for performance.

    final int DAYS_IN_WEEK = 7; // We solidify a constant, akin to etching a fact in stone
    System.out.println(DAYS_IN_WEEK); // We scrutinize our engraved fact. It outputs: 7
    
    // DAYS_IN_WEEK = 6; // This will not compile and run

Here, `DAYS_IN_WEEK` serves as a constant, prohibiting alterations once assigned. The value for this variable cannot be changed after it's assigned.

#### Practice # 1
Run the code

    class Solution {
        public static void main(String[] args) {
            final int SOLAR_SYSTEM_PLANETS = 8;
            System.out.println("Number of planets in the Solar System: " + SOLAR_SYSTEM_PLANETS);
            
            int universeAge = 14;
            System.out.println("The universe is approximately " + universeAge + " billion years old.");
        }
    }

#### Practice #2
Modify the provided starter code to define the speed of light as a constant that does not change. Remember to follow the proper Java syntax for constants.

    class Solution {
        public static void main(String[] args) {
            // Creating a variable for representing the speed of light
            int speedOfLightKmS = 299792;
    
            // Output the speed of light
            System.out.println("The speed of light is: " + speedOfLightKmS);
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            // Creating a variable for representing the speed of light
            final int speedOfLightKmS = 299792;
    
            // Output the speed of light
            System.out.println("The speed of light is: " + speedOfLightKmS);
        }
    }

#### Practice #3
Your mission is to find and fix the bug. Happy debugging!

    class Solution {
        public static void main(String[] args) {
            int earthOrbitRadius = 149600000; // in kilometers
            System.out.println("The Earth's orbit radius is " + earthOrbitRadius + " kilometers.");
    
            int 8planets = 8;
            System.out.println("There are " + 8planets + " planets in the Solar System.");
        }
    }

    class Solution {
        public static void main(String[] args) {
            int earthOrbitRadius = 149600000; // in kilometers
            System.out.println("The Earth's orbit radius is " + earthOrbitRadius + " kilometers.");
    
            int planets8 = 8;
            System.out.println("There are " + planets8 + " planets in the Solar System.");
        }
    }

#### Practice #4
It's time to define a constant for our cosmic journey speed. Add the necessary code to ensure our spaceship's dashboard displays all the crucial information.

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a constant for Earth's orbital speed and set its value to 29 km/s
            int planetsInSolarSystem = 8; // Number of planets in the solar system
            // TODO: Print out the string "Earth's orbital speed: <speed value> km/s
            System.out.println("Number of planets: " + planetsInSolarSystem);
        }
    }

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a constant for Earth's orbital speed and set its value to 29 km/s
            final int EARTHS_ORBITAL_SPEED = 29;
            // TODO: Print out the string "Earth's orbital speed: <speed value> km/s
            System.out.println("Earth's orbital speed: " + EARTHS_ORBITAL_SPEED + "km/s");
        }
    }

#### Practice #5
Let's recap the variables and constants related to our cosmic journey. Create a new constant to represent Earth's orbital speed and a variable for the number of planets, then display their values. Ready to blast off?

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a constant for Earth's orbital speed and give it a value of 108000 (km/h)
            final int EARTHS_ORBITAL_SPEED = 108000;
            // TODO: Declare a variable for the number of planets in the Solar System and assign it to 8
            int planetsInSolarSystem = 8;
            // TODO: Print out both the orbital speed of the Earth and the number of planets using print statements
            System.out.println(EARTHS_ORBITAL_SPEED);
            System.out.println(planetsInSolarSystem);
        }
    }

## Lesson 3: Java Basics: Exploring Primitive Data Types and Strings

### 1. Introducing Numerical Data Types
In Java, we use numerical data types to represent numbers. Specifically, in this lesson, we're focusing on `int` and `float`. The `int` data type is used to represent whole integer numbers, and the `float` data type is used to represent decimal numbers - numbers with a decimal point.

The largest value an `int` can store is `2147483647`, which is  2^31 − 1, and the smallest is `-2147483648`, which is −2^31. Here's an example of using the `int` number:

    int daysInWeek = 7;
    System.out.println(daysInWeek);  // This will print: 7
    
    int maximalInteger = 2147483647;
    System.out.println(maximalInteger);  // This will print: 2147483647
    
    int tooBigInteger = 2147483648; // Oops! Error, the number is too large

Now, let's move on to the `float` data type. `float` is used when dealing with numbers that have decimal points, also known as floating-point numbers. A `float` can hold up to 7 decimal digits of precision. Consider the following example:

    float pi = 3.1415926f;
    System.out.println(pi);  // This will print: 3.1415926

Ensure that the `f` at the end of the number is present; it differentiates a `float` from a `double` - another type for decimal numbers, with higher precision.

### 2. Discovering Boolean and Char Data Types
Now, let's move on to the `boolean` and `char` data types.

The `boolean` data type in Java can hold one of two possible values: `true` or `false`. This data type is widely used in logical expressions and decision-making. Here's a simple example:

    boolean isEarthRound = true;
    System.out.println(isEarthRound);  // This will print: true
    
    boolean isEarthFlat = false;
    System.out.println(isEarthFlat); // This will print: false

The `char` data type is used to store a single character. Java uses Unicode, allowing a `char` to store any character! Here's how it's done:

    char firstLetterOfAlphabet = 'A'; // A character is always surrounded by single quotes
    System.out.println(firstLetterOfAlphabet); // This will print: A

### 3. Exploring String Data Type
You'll find that `String` is as common in Java as stars in the cosmos. Java treats `String` as a basic data type and uses it to store a sequence of characters - just a text. The string is always surrounded by double quotes.

    String welcome = "Welcome to Java!";
    System.out.println(welcome); // This will print: Welcome to Java!

What's interesting to note is the immutability of `String` in Java. Once a `String` is created, its value can't be changed.

### 4. Understanding null
As we conclude this journey, we will discuss a very special value: the `null` value. `null` means "no value" or "nothing", or "unknown". It's not equivalent to an empty string `("")` or 0.

Here's how you assign `null` to a variable:
    
    String unknown = null;
    System.out.println(unknown);  // This will print: null

Note: as `null` is nothing, you can't perform any operations on it, even though it seems to be a `String` in the example above. You can still print the `null` variable or reassign it to an actual value, but you can't perform any other operations on it; they will cause an error known as `NullPointerException`. But no worries, we will cover this in detail in the next lessons!

#### Practice #1
Run the code
    class Solution {
        public static void main(String[] args) {
            float researchResult = 9.81f; // Gravitational constant in m/s^2
            boolean isTheoryConfirmed = true; // The research confirms the theory
            char grade = 'A'; // The quality assessment of the research
            String conclusion = "Hypothesis verified.";
            
            System.out.println(researchResult);
            System.out.println("Is the theory confirmed? " + isTheoryConfirmed);
            System.out.println("Research grade: " + grade);
            System.out.println(conclusion);
        }
    }

Practice #2



