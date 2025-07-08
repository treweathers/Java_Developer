<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.1: Getting Started with Java
## Lesson 1: Java Basics: Syntax, Comments, Semicolons, and Your First Program
### 1. Java Syntax Basics
In Java, we use statements to perform actions, and each statement ends with a semicolon `(;)`. Java employs curly braces `({ })` to define a block of code.

Look at this simple Java syntax example:

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

#### Practice #1
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

#### Practice #2
Change the countdownStart variable to a decimal number with a value of 10.5.

    class Solution {
        public static void main(String[] args) {
            // Define a variable with 'int' type representing days until the space launch
            float countdownStart = 10.5f;
    
            System.out.println("There are " + countdownStart + " days until the launch.");
        }
    }

#### Practice #3
Run the code, identify the error, and provide the necessary fix.

    class Solution {
        public static void main(String[] args) {
            int numOfPlanets = 8;
            float rocketWeight = 1500.5;
            String message = "Ready for space exploration!";
            System.out.println("There are " + numOfPlanets + " known planets.");
            System.out.println("Our rocket weighs " + rocketWeight + " tons.");
            System.out.println(message);
        }
    }
    
    solution.java:4: error: incompatible types: possible lossy conversion from double to float
            float rocketWeight = 1500.5;
                                 ^
    1 error
    
#### Practice #4
You have learned much about Java's primitive data types. Write a Java program from scratch that declares these details using the appropriate data types and prints them out.

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a float variable to store the distance from Earth to the Sun in kilometers         - 149600000.0 kilometers
            float distanceFromEarth = 149600000.0f;
            // TODO: Declare an int variable to store the number of days Earth takes to orbit the Sun - 365 days
            int daysToOrbit = 365;
            // TODO: Print the distance of Earth from the Sun followed by " km from the Sun."
            System.out.println(distanceFromEarth + " km from the Sun.");
            // TODO: Print the number of days Earth takes to orbit the Sun, followed by " days to orbit the Sun."
            System.out.println(daysToOrbit + " days to orbit the Sun.");
            // TODO: Declare a boolean variable to store the truth about whether space is dark - it is!
            boolean isSpaceDark = true;
            // TODO: Use a char variable to represent the first letter of 'Cosmos' - C
            char firstLetterOfCosmos = 'C';
        }
    }

## Lesson 4: Understanding Java's Comparison Operators

### 1. Exploring Java Comparison Operators
Imagine piloting a starship in space. Here, destinations depend on evaluating conditions such as the distances to planets. These decisions boil down to comparisons, mirroring situations in programming. In Java, we utilize comparison operators to make such decisions.

Java has six comparison operators, including equal to `(==)`, not equal to `(!=)`, greater than `(>)`, less than`(<)`, greater than or equal to `(>=)`, and less than or equal to `(<=)`. They return `true` or `false`, also known as boolean values.

For instance, consider this comparison of a spaceship's speed with that of an asteroid:

    int spaceshipSpeed = 20000;  // speed in mph
    int asteroidSpeed = 15000;   // speed in mph
    System.out.println("Is spaceship faster than an asteroid? " + (spaceshipSpeed > asteroidSpeed));
    // Prints: Is a spaceship faster than an asteroid? true

In the code above, we compared `spaceshipSpeed` and `asteroidSpeed` using the `>` operator. The result is `true` because `spaceshipSpeed` is indeed higher than `asteroidSpeed`.

### 2. Exploring == and != Operators
Let's explore the equal to `(==)` and not equal to `(!=)` operators. These are essential when you need to compare values, such as comparing the current fuel level to the required one:

    int currentFuelLevel = 90;  // current fuel level in %
    int requiredFuelLevel = 100;  // required fuel level in %
    
    boolean isEnoughFuel = currentFuelLevel == requiredFuelLevel;  // this results in 'false'
    boolean isFuelLow = currentFuelLevel != requiredFuelLevel;  // this results in 'true'

The `==` operator checks whether `currentFuelLevel` equals `requiredFuelLevel`, producing a `false` result. Conversely, the `!=` operator verifies their inequality, returning `true`.

### 3. Exploring <, >, <=, and >= Operators
Next, let's examine the less than `(<)`, greater than `(>)`, less than or equal to `(<=)`, and greater than or equal to `(>=)` operators. These are primarily used for the comparison of numeric data. Suppose you're observing two planets and want to determine which one is closer. You can use these operators to find out:

    int distanceToPlanetA = 5000; // distance in kms
    int distanceToPlanetB = 3000; // distance in kms
    
    boolean isACloser = distanceToPlanetA < distanceToPlanetB;  // this results in 'false'
    boolean isBCloserOrSame = distanceToPlanetA >= distanceToPlanetB;  // this results in 'true'

We compared the distances to two planets. Our spaceship isn't closer to planet A, thus `isACloser` yields `false`. However, the spaceship is closer or at an equal distance to planet B, so `isBCloserOrSame` returns `true`.

#### Practice #1
Run the code

    class Solution {
        public static void main(String[] args) {
            int crewMembersOnboard = 5;
            int maxCapacity = 8;
    
            boolean canAddMoreCrew = crewMembersOnboard < maxCapacity;
            System.out.println("Can we add more crew members? " + canAddMoreCrew);
        }
    }

#### Practice #2
modify the starter code to check if a spacecraft is moving too quickly for a safe landing. You will need to change the comparison operator and update the variable name to accurately reflect the new logic.

    class Solution {
        public static void main(String[] args) {
            // Scenario: Determining if a spacecraft is in safe velocity range for landing
            int safeLandingMaxSpeed = 1000; // maximum safe landing speed in km/h
            int spacecraftSpeed = 1200; // current spacecraft speed in km/h
    
            // TODO: Create a new boolean variable "isTooFastForLanding" and update the print statement accordingly
            boolean canLandSafely = spacecraftSpeed <= safeLandingMaxSpeed;
            System.out.println("Can the spacecraft land safely? " + canLandSafely);
            // If spacecraftSpeed is 1200, it will print: Can the spacecraft land safely? false
        }
    }

    class Solution {
        public static void main(String[] args) {
            // Scenario: Determining if a spacecraft is in safe velocity range for landing
            int safeLandingMaxSpeed = 1000; // maximum safe landing speed in km/h
            int spacecraftSpeed = 1200; // current spacecraft speed in km/h
    
            // TODO: Create a new boolean variable "isTooFastForLanding" and update the print statement accordingly
            boolean isTooFastForLanding = spacecraftSpeed > safeLandingMaxSpeed;
            System.out.println("Is the spacecraft moving too fast? " + isTooFastForLanding);
            // If spacecraftSpeed is 1200, it will print: Can the spacecraft land safely? false
        }
    }

###### feedback: instructions unclear - left a comment saying output should be false with the same print message! It needed to be true, and the message needed to be changed⚠️.

#### Practice #3
Your mission is to calculate whether our spacecraft can outrun starlight. Provide the missing logic to complete the code!

    class Solution {
        public static void main(String[] args) {
            int starLightSpeed = 299792; // Speed of light from a star in km/s
            int spacecraftSpeed = 40000; // Speed of spacecraft in km/s
    
            // TODO: Determine if our spacecraft can travel faster than starlight and print the result
            System.out.println("Can our spacecraft outrun starlight? " + /* TODO: Add the missing logic here */);
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            int starLightSpeed = 299792; // Speed of light from a star in km/s
            int spacecraftSpeed = 40000; // Speed of spacecraft in km/s
    
            // TODO: Determine if our spacecraft can travel faster than starlight and print the result
            boolean isSpaceCraftFaster = spacecraftSpeed > starLightSpeed;
            System.out.println("Can our spacecraft outrun starlight? " + isSpaceCraftFaster /* TODO: Add the missing logic here */);
        }
    }

#### Practice #4

    class Solution {
        public static void main(String[] args) {
            // TODO: Assign the distance to the Moon (384400 kilometers) to a variable
            int distanceToMoon = 384400;
            // TODO: Assign the distance to Mars (225000000 kilometers) to another variable
            int distanceToMars = 225000000;
            // TODO: Compare the distance to the Moon to see if it's less than 1 million kilometers
            boolean distanceMoon = distanceToMoon < 1000000;
            // TODO: Check if the distance to Mars is greater than the distance to the Moon
            boolean distanceMarsMoon = distanceToMars > distanceToMoon;
            // TODO: Print results of these two comparisons to the console
            
            System.out.println("Is the distance to the Moon less than 1 million kilometers? " + distanceMoon);
            System.out.println("Is the distance to Mars greater than the distance to the Moon? " + distanceMarsMoon);
        }
    }

###### feedback: not clear in comments, also in feedback said to be "descriptive" when printing, even though not directly in instrustions, just said to print results⚠️.


## Lesson 5: Arithmetic and Logical Operations in Java
### 1. Arithmetic Operations Uncovered
Recall from our previous sessions that Java's primitive data types include `int` for whole numbers, `float` for decimal numbers, `boolean` for true/false values, and `char` for single characters. Both `int` and `float` have limitations on their numerical range, which will come into play when we discuss overflow later in this lesson.

We can perform arithmetic operations — addition `(+)`, subtraction `(-)`, multiplication `(*)`, division `(/)`, and modulus - the remainder of the division `(%)` — on numerical types. For example,

    int a = 10;
    int b = 2;
    System.out.println(a + b); // Outputs: 12
    System.out.println(a - b); // Outputs: 8
    System.out.println(a * b); // Outputs: 20;
    System.out.println(a / b); // Outputs: 5
    System.out.println(a % b); // Outputs: 0

Java allows order alteration using parentheses and provides the modulus `(%)` operation — useful for identifying whether numbers are even or odd!

### 2. Logical Operations Explained
Logical operators — `&&` (AND), `||` (OR), `!` (NOT) — serve as decision-makers in Java and evaluate to `boolean` values — `true` or `false`. Here's how we can use them with two `boolean` values:

    System.out.println(true && true); // true
    System.out.println(true && false); // false
    System.out.println(false && true); // false
    System.out.println(false && false); // false
    
    System.out.println(true || true); // true
    System.out.println(true || false); // true
    System.out.println(false || true); // true
    System.out.println(false || false); // false
    
    System.out.println(!true); // false
    System.out.println(!false); // true

Here, `&&` produces `true` only if both boolean values are `true`. `||` delivers true if either is `true`. And `!` reverses the boolean value.

But, of course, the main application of logical operations is for variables. Here is a quick, simple example of how they can help to make decisions:

    int speed = 60;
    int minSpeed = 30;
    int maxSpeed = 70;
    // Check if the speed is inside the expected bounds.
    System.out.println(speed > minSpeed && speed < maxSpeed); // Prints: true

### 3. Overflow Phenomenon
The term **overflow** describes what happens when we exceed the range of an integer variable. This occurs when attempting to store a value larger than what the variable's type can contain:

    int maxInt = Integer.MAX_VALUE; // the maximal integer, equals to 2^31 - 1
    int overflow = maxInt + 1; // causes an overflow, there is no integer after the maximal one.
    System.out.println(overflow); // Prints: -2147483648, which is -2^31 - the minimal integer number

Here, `maxInt` is the maximum value an `int` can store. When we add one to it, it 'overflows' to the smallest possible integer value! This brings us to the fact that integer values are "looped" under the hood.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            int starsCount = 7;
            int newStarsDiscovered = 2;
            System.out.println("Total stars in the sky: " + (starsCount + newStarsDiscovered));
            System.out.println("Stars left after a black hole event: " + (starsCount - newStarsDiscovered));
            System.out.println("Stars observed through telescope enhancement: " + (starsCount * newStarsDiscovered));
            System.out.println("Result of dividing stars into constellations: " + (starsCount / newStarsDiscovered));
            System.out.println("Is there an odd number of stars? " + ((starsCount + newStarsDiscovered) % 2 != 0));
        }
    }

#### Practice #2
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Define the maximum integer value
            int maxIntVal = Integer.MAX_VALUE;
            System.out.println(maxIntVal);
            // Add 10 to the maximum value to demonstrate overflow
            int result = maxIntVal + 10;
            // Observe the unexpected result due to overflow
            System.out.println(result); // What will this print?
        }
    }

    2147483647
    -2147483639

#### Practice #3
There might be a logic glitch in the launch sequence that needs your sharp eye. Please fix the error!

    class Solution {
        public static void main(String[] args) {
            // Constants representing the level of fuel in the spaceship and the required minimum before launch.
            int currentFuel = 300;
            int requiredFuel = 300;
            boolean engineCheckComplete = true;
    
            // Check if there is adequate fuel and if the pre-launch engine check is complete.
            System.out.println(currentFuel >= requiredFuel || engineCheckComplete);
        }
    }

    class Solution {
        public static void main(String[] args) {
            // Constants representing the level of fuel in the spaceship and the required minimum before launch.
            int currentFuel = 300;
            int requiredFuel = 300;
            boolean engineCheckComplete = true;
    
            // Check if there is adequate fuel and if the pre-launch engine check is complete.
            System.out.println(currentFuel >= requiredFuel && engineCheckComplete);
        }

#### Practice #4
Can you calculate the totals in our cosmic inventory and check our findings against our mission criteria?

    class Solution {
        public static void main(String[] args) {
            int starsCounted = 17;
            int galaxiesCounted = 3;
            boolean darkMatterFound = false;
    
            // TODO: Calculate how many cosmic bodies we've found in total.
            int totalBodies = starsCounted + galaxiesCounted;
            System.out.println("Total cosmic bodies counted: " + totalBodies);
    
            // TODO: Use a logical AND operation to check: "Found more than 15 stars and the dark matter: " 
            int minStars = 15;
            System.out.println(starsCounted > minStars && darkMatterFound == true);
        }
    }

#### Practice #5
Calibrate our spacecraft's fuel gauge by calculating the remaining fuel after a short flight. Determine if there's enough to take us beyond the next nebula. Use math operations and logical comparisons you've learned.
    
    class Solution {
        public static void main(String[] args) {
            // TODO: Declare and initialize variables for fuel capacity (1500 gallons), consumption (120 gallons/hour), and flight duration (2 hours)
            int fuelCapacity = 1500;
            int fuelConsumption = 120;
            int flightDuration = 2;
            // TODO: Calculate the remaining fuel after the flight
            int remainingFuel = fuelCapacity - (fuelConsumption * flightDuration);
            // TODO: Use a logical operation to determine if the remaining fuel is more than half of the fuel capacity
            boolean remainingCapacity = remainingFuel > (0.5 * fuelCapacity);
            
            // TODO: Print out the result in a format: "Enough fuel for the next journey? true/false"
            System.out.println("Enough fuel for the next journey? " + remainingCapacity);
        }
    }

## Lesson 6: Navigating Primitive Data Type Conversion
### 1. Automatic (Implicit) Conversions
Data type conversion or **type casting** involves transforming values between different data types. Imagine a transformation from a human (a representation of an integer type) to a spaceship (symbolizing a double type): the integer fits into a double with ease (widening). However, fitting a double into an `int` (a process of narrowing), necessitates explicit conversion and may result in data loss.

When types are compatible and the target type is larger (similar to a spaceship's spacious cockpit), Java performs the automatic conversion. Here's an example of automatic (implicit) conversion from an `int` to a `double`:

    int i = 10;  // an integer 
    double d = i;  // automatic conversion to double
    
    System.out.println("The value of d: " + d);   // Output: The value of d: 10.0

### 2. Manual (Explicit) Conversions
Just like squeezing a spaceship into a human, there are times when a larger value must fit into a smaller type. This situation necessitates explicit casting. Take a look at how we cast a `double` to an `int`:

    double d = 10.25; // a double number
    int i = (int) d;  // casting the double to int
    
    System.out.println("The value of i: " + i);  // Output: The value of i: 10

Notice how the decimal part of `10.25` is truncated during the casting process, leaving just `10` as a result.

### 3. Converting to and from Strings
A common type of conversion in Java is converting to and from `String` values. We often need to convert numbers to strings for output or parse strings as numbers for computation.

    int ten = 10; // an integer with value 10
    String tenString = Integer.toString(ten); // A string with value "10"
    System.out.println("The value of tenString: " + tenString);    // Output: The value of tenString: 10
    
    String twentyFiveString = "25";
    int twentyFive = Integer.parseInt(twentyFiveString);
    System.out.println("The value of twentyFive: " + twentyFive);    // Output: The value of twentyFive: 25
    
    String invalidNumber = "25abc";
    int number = Integer.parseInt(invalidNumber); // Oops! This will throw an error, "25abc" is not a number!

In the conversion to `String`, we use the `Integer.toString(n)` method for `int` type. Other types have similar methods - `Float.toString(f)`, `Double.toString(d)`, etc. For the conversion from `String` to a number, we use the `Integer.parseInt(s)` method. Similarly, `Float.parseFloat(s)` and `Double.parseDouble(s)` are used to obtain `float` and `double` numbers from the string, respectively.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
          // Imagine converting the speed of a spaceship from kilometers per hour (double) to space-units per minute (int)
          double spaceshipSpeedInKmph = 12450.5; // Spaceship speed in kilometers per hour
          int spaceshipSpeedInSum = (int) (spaceshipSpeedInKmph / 60); // Explicitly casting to int
          
          System.out.println("Spaceship speed converted to space-units per minute: " + spaceshipSpeedInSum); 
        }
    }

#### Practice #2
The star temperature reading is currently a double, but mission control needs it as text. Change the starter code to convert the double value into a String.

    class Solution {
        public static void main(String[] args) {
            // A star's temperature in Kelvin
            double starTemperature = 15000.95;
            
            // TODO: Convert the temperature from a double to a String
            String temperatureText = Double.toString(starTemperature);
            
            // Displaying the temperature as text
            System.out.println("Mission control, the star's temperature is: " + temperatureText + "K");
        }
    }

#### Practice #3
Run the code and utilize your new skills in data type conversion to find and fix the issue. 

    class Solution {
        public static void main(String[] args) {
            double starDistance = 142.5; // Distance in light years as a double
            int roundedDistance = starDistance; // There's an error related to types here
            
            String message = "The star is " + roundedDistance + " light years away.";
            System.out.println(message); // Is the printed message right?
        }
    }

    solution.java:4: error: incompatible types: possible lossy conversion from double to int
            int roundedDistance = starDistance; // There's an error related to types here
                                  ^
    1 error

    class Solution {
    public static void main(String[] args) {
        double starDistance = 142.5; // Distance in light years as a double
        int roundedDistance = (int) starDistance; // There's an error related to types here
        
        String message = "The star is " + roundedDistance + " light years away.";
        System.out.println(message); // Is the printed message right?
    }
}

#### Practice #4
Use the knowledge from our journey to convert different Java primitive types and strings. Follow the steps below using type casting and concatenation!

    class Solution {
        public static void main(String[] args) {
            int planetNumber = 7;
    
            // TODO: Convert the planetNumber integer to a double using casting.
            double planetNumberInt = planetNumber;
            // TODO: Now, convert the new double to a String
            String planetNumberStr = Double.toString(planetNumberInt);
            // Printing out the String value after conversion.
            System.out.println("In our galaxy, the planet count is: " + planetNumberStr);
        }
    }

## Lessson 7: Navigating Java Conditional Statements: If-Else, Switch, Ternary Operator
### 1. If and If-Else Structure
The structure of `if` and `if-else` blocks is the following:

    if (condition) {
        // action if condition is true
    }
    
    // and
    
    if (condition) {
        // action if condition is true
    } else {
        // action if condition is false
    }

So, when the provided `condition` is true, we enter the action in the `if` block, and when the `condition` is false, we enter an optional `else` block.

### 2. Java If-Else Statement
An `if` statement is simple yet powerful, instructing the computer to perform actions only under specific conditions. Let's imagine deciding to land on a planet with breathable air:

    int oxygenLevel = 78; // The level of oxygen on the planet
    
    if (oxygenLevel > 20) {
        System.out.println("Planet has breathable air!"); // Oxygen level is suitable
    } else {
        System.out.println("Oxygen level too low!"); // Oxygen level is not high enough
    }
    // The code prints: Planet has breathable air!

In the example above, the statement `if (oxygenLevel > 20)` checks if the oxygen level exceeds 20. If the condition proves `true`, it prints: `"Planet has breathable air!"`. If it's `false`, `else` guides us to an alternative command, printing: `"Oxygen level too low!"`.

### 3. Multiple conditions: Else If Statement
For multiple conditions, we rely on `else if`:

    int oxygenLevel = 58;
    if (oxygenLevel > 70) {
        System.out.println("Excellent Oxygen level!");
    } else if (oxygenLevel > 50) {
        System.out.println("Oxygen level is acceptable.");
    } else {
        System.out.println("Oxygen level is too low!");
    }
    // The code prints: Oxygen level is acceptable.

The `else if` keyword provides alternate paths until a suitable one is found, ensuring we react appropriately to varying oxygen levels. Once the first condition is met, the program ignores all remaining `else if` conditions below.

### 4. Java's Switch Statement
A `switch` statement enables us to navigate multiple outcomes based on the value of a variable. Let's envision visiting different planets, each requiring a unique set of preparations:

    int planetNumber = 3; // The chosen planet number
    
    switch (planetNumber) {
        case 1:
            System.out.println("Gearing up for Planet 1!"); // Case for planet 1
            break;
        case 2:
            System.out.println("Preparing for Planet 2!"); // Case for planet 2
            break;
        case 3:
            System.out.println("Get ready for Planet 3!"); // Case for planet 3
            break;
        default:
            System.out.println("Resting at the spaceship."); // Default case
    }
    // The code prints: Get ready for Planet 3!

In the code above, each `case` corresponds to a planetary number. The `default` command indicates no particular planet has been selected.

Note the `break` statement at the end of each `case` operation - it's required for the correct execution flow. Otherwise, the `case` will go down further to the next `case` scenario. So, `break` is used to finish the `switch` execution when the value has matched some `case` and processed all the required actions.

For example, the code below will print two statements to the console:

    int planetNumber = 3; // The chosen planet number
    
    switch (planetNumber) {
        case 1:
            System.out.println("Gearing up for Planet 1!"); // Case for planet 1
            break;
        case 2:
            System.out.println("Preparing for Planet 2!"); // Case for planet 2
            break;
        case 3:
            System.out.println("Get ready for Planet 3!"); // Case for planet 3
            // Missing break here!
        default:
            System.out.println("Resting at the spaceship."); // Default case
    }
    // The code prints:
    // Get ready for Planet 3!
    // Resting at the spaceship.

This code will print both `"Get ready for Planet 3!"` and `"Resting at the spaceship."` messages! Be careful!

### 5. Java Ternary Operator
The `ternary operator` serves as a condensed one-line `if-else`, ideal for basic condition checks. The structure of the operator is the following:

    // if condition is true, then do 'action1', otherwise - do 'action2'
    result = condition ? action1 : action2;
    
Consider it an evaluative measure of signal presence before landing:
    
    boolean detection = true; // Whether a signal can be detected
    
    String message = detection ? "Signal detected, safe to land!" : "No signal detected, abort mission!";
    System.out.println(message); // Prints: "Signal detected, safe to land!"

In the code above, `message` receives `"Signal detected, safe to land!"`, as `detection` is `true`. Otherwise, it'd receive `"No signal detected, abort mission!"`.

#### Practive #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            int starTemperature = 5000; // Temperature in Kelvin
            String starType;
    
            // Determine star type based on temperature
            if (starTemperature > 3000) {
                starType = "Red Dwarf";
            } else if (starTemperature > 1000) {
                starType = "Brown Dwarf";
            } else {
                starType = "Cold, dark Star";
            }
    
            System.out.println("The star is categorized as: " + starType);
        }
    }

#### Practice #2
Change the starter code to use the ternary operator instead of the if-else statement. 
    
    class Solution {
        public static void main(String[] args) {
            int objectSpeed = 42; // Example speed in km/s
            
            // Decide if an object is moving fast using a ternary operator
            String speedEvaluationMessage = objectSpeed >= 50 ? "Object is moving very fast!" : "Object is moving slowly.";
            System.out.println(speedEvaluationMessage);
        }
    }
    
    /*
    class Solution {
        public static void main(String[] args) {
            int objectSpeed = 42; // Example speed in km/s
    
            // Decide if an object is moving fast using a ternary operator
            String speedEvaluationMessage;
            if (objectSpeed >= 50) {
                speedEvaluationMessage = "Object is moving very fast!";
            } else {
                speedEvaluationMessage = "Object is moving slowly.";
            }
            System.out.println(speedEvaluationMessage);
        }
    }
    */

#### Practice #3
Something isn't quite right. Run the code to observe its behavior. Can you determine what needs to be fixed to ensure it follows the proper execution logic for the switch cases?

    class Solution {
        public static void main(String[] args) {
            int starBrightness = 2; // Brightness of the observed star on a scale from 1 to 10
            
            // Let's use a switch statement to decide what to do based on star brightness
            switch(starBrightness) {
                case 1:
                    System.out.println("Star is too dim, use a bigger telescope.");
                    break;
                case 2:
                    System.out.println("Star could be more visible, try to adjust the lens.");
                case 3:
                    System.out.println("Star is fairly bright, let's start the analysis.");
                    break;
                default:
                    System.out.println("This star is so bright, it's visible to the naked eye!");
            }
        }
    }
    
    Star could be more visible, try to adjust the lens.
    Star is fairly bright, let's start the analysis.
    
    class Solution {
        public static void main(String[] args) {
            int starBrightness = 2; // Brightness of the observed star on a scale from 1 to 10
            
            // Let's use a switch statement to decide what to do based on star brightness
            switch(starBrightness) {
                case 1:
                    System.out.println("Star is too dim, use a bigger telescope.");
                    break;
                case 2:
                    System.out.println("Star could be more visible, try to adjust the lens.");
                    break;
                case 3:
                    System.out.println("Star is fairly bright, let's start the analysis.");
                    break;
                default:
                    System.out.println("This star is so bright, it's visible to the naked eye!");
            }
        }
    }

#### Practice #4
Run the existing diagnostic code and fix the issue to ensure we get an accurate count of the moons.

    class Solution {
        public static void main(String[] args) {
            int numberOfMoons = 2;  // Number of moons observed on a new planet
    
            if (numberOfMoons < 1) {
                System.out.println("No moons to explore here.");
            } elif (numberOfMoons < 3) {
                System.out.println("A few moons detected!");
            } else {
                System.out.println("Wow, that's a lot of moons!");
            }
        }
    }
    
    solution.java:7: error: ';' expected
            } elif (numberOfMoons < 3) {
                                      ^
    solution.java:9: error: 'else' without 'if'
            } else {
              ^
    2 errors
    
    class Solution {
        public static void main(String[] args) {
            int numberOfMoons = 2;  // Number of moons observed on a new planet
    
            if (numberOfMoons < 1) {
                System.out.println("No moons to explore here.");
            } else if (numberOfMoons < 3) {
                System.out.println("A few moons detected!");
            } else {
                System.out.println("Wow, that's a lot of moons!");
            }
        }
    }

#### Practice #5
Fill in the missing conditions and print statements in the provided if-else block.

    class Solution {
        public static void main(String[] args) {
            int cloudCoveragePercentage = 30; // Amount of cloud cover expected
            
            if (cloudCoveragePercentage < 20) { // TODO: check if the coverage percentage is less than 20
                // Print message for clear skies
                System.out.println("clear skies!");
            } else if (cloudCoveragePercentage < 50) { // TODO: check if the coverage percentage is less than 50
                // Print message for partly cloudy skies
                System.out.println("partly cloudy skies, sigh.");
            } else {
                // Print message for too cloudy skies
                System.out.println("way too cloudy judy...");
            }
        }
    }

#### Practice #6
Write code to make a decision about chasing a comet based on its speed. Remember the ternary operator from our lesson? Let it guide your spaceship's actions!

    class Solution {
        public static void main(String[] args) {
            // TODO: Define a variable to store the comet's speed in km/s
            int cometSpeed = 100;
            
            // TODO: Use the ternary operator to decide what action to take based on the comet's speed
            // and store the result in a variable
            // Check if the comet's speed is less than 50 - if so, save the "Chasing comet!" message, otherwise - "Comet too fast, let it go!".
            String speed = cometSpeed < 50 ? "Chasing comet!" : "Comet too fast, let it go!";
            // TODO: Print out the action to take
            System.out.println(speed);
        }
    }

## Lesson 8: Understanding Concatenation Operations
### 1. Understanding Concatenation
Think of concatenation as a glue that sticks strings together to form a meaningful sentence. Imagine you have two strings — "Neil" and "Armstrong". We can concatenate these into one string, "Neil Armstrong". Here's how:

    String firstName = "Neil";
    String lastName = "Armstrong";
    String fullName = firstName + " " + lastName; // Concatenation operation
    
    System.out.println(fullName);  // Output: Neil Armstrong
    
The '+' operator joins `firstName`, a space, and `lastName` to form the `fullName` string. Looks familiar? Of course! We already implicitly used this technique in our `System.out.println` statements earlier in the course.

### 2. String Concatenation with '+' Operator in Java
In Java, the '+' operator can handle different data types when used with strings. Here’s an example:

    String name = "Alice";
    int apples = 5;
    String message = name + " has " + apples + " apples."; // The '+' operator handles the 'int' type as well
    
    System.out.println(message);  // Output: Alice has 5 apples.
What's truly remarkable here is that Java implicitly converts the integer `apples` to a string before performing the concatenation. Pretty useful, isn't it?

### 3. String Concatenation with 'concat' Method in Java
Java's String class provides another string concatenation tool — the `concat` method. Let's examine how we use it to join "Hello, " and "World!":

    String str1 = "Hello, ";
    String str2 = "World!";
    String combinedStr = str1.concat(str2); // Using 'concat' method
    
    System.out.println(combinedStr);  // Output: Hello, World!
The `concat` method joins the strings in a manner similar to the '+' operator, but it's designed solely for strings.

### 4. 'StringBuilder' in Java
Remember - `String` instances are immutable in Java, once created, the string cannot be changed. However, there are some nifty tools provided by Java, e.g., `StringBuilder` is a mutable sequence of characters, meaning you can alter its content without creating a new object. It provides an optimized way to concatenate strings, which is particularly useful when concatenating a large number of strings.

Here's a simple example:

    StringBuilder sb = new StringBuilder();
    sb.append("Hello, ").append("World!")
    sb.append(" What ").append("a wonderful ").append("day out there!");
    
    System.out.println(sb.toString());  // Output: Hello, World! What a wonderful day out there!
In the above code, we first created a `StringBuilder` object, then used the `append` method to add strings to it. Finally, we used `toString` to get the final combined string.

Compared to using the '+' operator or `concat` method, `StringBuilder` can significantly improve performance when concatenating large amounts of data. It's your go-to choice when you need efficient and flexible string manipulation!

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Using + operator to concatenate parts of a greeting message
            String greeting = "Hello, " + "Java " + "programmer!";
            System.out.println(greeting);
    
            // Using StringBuilder to concatenate parts of a greeting message
            StringBuilder greetingSb = new StringBuilder();
            greetingSb.append("Hello, ").append("Java ").append("programmer!");
            
            System.out.println(greetingSb.toString());
        }
    }

#### Practice #2
Modify the starter code by changing the use of the + operator to StringBuilder for string concatenation. We can do it, let's go!

    class Solution {
        public static void main(String[] args) {
            String socialMessage = "Hello, " + "Explorer! " + "Hope you're enjoying the Java Journey to the Stars course.";
            
            System.out.println(socialMessage);
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            StringBuilder socialMessage = new StringBuilder();
            
            socialMessage.append("Hello, ").append("Explorer! ").append("Hope you're enjoying the Java Journey to the Stars course.");
            
            System.out.println(socialMessage);
        }
    }

#### Practice #3
Now, try adding a piece of code that uses concatenation to create a report about space discoveries. Then, add excitement to the report by using a different method of concatenation.

    class Solution {
        public static void main(String[] args) {
            String spaceExplorer = "Cosmo";
            int discoveredPlanets = 7;
            
            // TODO: Use the '+' operator to concatenate spaceExplorer, discoveredPlanets and helper message strings to create a report.
            String report1 = spaceExplorer + discoveredPlanets + " is promising!"; // Replace this with your concatenation code using '+'
    
            String excitement = " This is amazing!";
            
            // TODO: Complete the following line to concatenate the excitement message to the report using the 'concat' method.
            String report2 = report1.concat(excitement);
            
            System.out.println(report2);
        }
    }

###### feedback: be clear about non-technical things wanted like non-specific "helpful" messages⚠️

#### Practice #4
Combine your knowledge of concatenation and strings to craft a message that celebrates the moons of the giant planets. Use a StringBuilder or just a + operator to construct the final output.

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare and initialize variables 'planet1', 'planet2' - planet names.
            String planet1 = "Jupiter";
            String planet2 = " Mars";
            // TODO: Define two more integers - the number of moons each planet has.
            int planet1Moons = 95;
            int planet2Moons = 2;
            // TODO: Use the StringBuilder or + operator to append the planet names and the total number of moons.
            StringBuilder planetNames = new StringBuilder();
            planetNames.append(planet1).append(" and" + planet2 + " have ").append(planet1Moons + planet2Moons + " moons!");
            // TODO: Display the final message about the total moons of these giant planets.
            System.out.println(planetNames);
        }
    }

###### feeedback: be concatenation exercise but adding to get total moons instead of concatenating the value, want total value (insted of concatenating them) but concatenating the part before that?⚠️







