<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.3: Iterations and Loops in Java
## Lesson 1: For Loops and Beyond

### 1. Understanding the Basic For Loop in Java
Understanding the Basic For Loop in Java
Imagine lining up your favorite planet toys in order. You take one, put it in line, and repeat until you run out of toys. This is precisely how the basic `for` loop works in Java!

Here's the syntax:

    for (initialization; condition; post-iteration actions) {
        // Some task to do
    }
This loop does the following:
* First, we do the `initialization`
* Then, while the `condition` is true, we keep executing the `task` inside the loop body
* After each iteration, we execute `post-iteration` actions that change the state in some way
* Now, let's demonstrate this with code that prints numbers 1 through 5:

        for (int i = 1; i <= 5; i++) {
            // The following command will print the number i
            System.out.println(i);
        }
        // Prints:
        // 1
        // 2
        // 3
        // 4
        // 5

Here, we defined an `int` variable `i`, assigned it to `1` first, and then repeated `System.out.println(i);` while `i <= 5`, incrementing `i` by `1` after every iteration. By the way, `i++` is a short form for `i += 1`, which is `i = i + 1` - so it's just adding `1` to the current value of i, but in a short way! This operation is called increment.

### 2. Enhanced For Loop
Now, remember flipping pancakes? You pour one pancake, let it cook, then pour the next one, continuing until the batter is finished. Guess what? The enhanced `for` loop operates in a similar fashion!

Here's an example of printing all elements of an array:

    int[] numbers = {5, 4, 3, 2, 1};
    
    // The loop below will take each element num from numbers and print it
    for (int num: numbers) {
        System.out.println(num);
    }
    // Prints:
    // 5
    // 4
    // 3
    // 2
    // 1
Quite the pancake flipper, isn't it?

### 3. Difference Between the Basic For Loop and the Enhanced For Loop
You'd typically use a basic `for` loop when you need to perform a task a specific number of times. In contrast, an enhanced `for` loop is your go-to when you have a collection (like an array, list, map, or set) and need to perform an action for each item in that collection.

Let's illustrate with both loops printing numbers from an array:

##### Basic for loop:

    // This loop will print all numbers from the numbers array using its indices
    int[] numbers = {1, 2, 3, 4, 5};
    
    // `i` goes through all array indices - 0, 1, 2, ..., numbers.length - 1
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    // Prints:
    // 1
    // 2
    // 3
    // 4
    // 5
###### Enhanced for loop:

    // This loop will print all numbers from the numbers array, directly taking each of them
    int[] numbers = {1, 2, 3, 4, 5};
    
    for (int num: numbers) {
        System.out.println(num);
    }
    // Prints:
    // 1
    // 2
    // 3
    // 4
    // 5

#### Practice #1
Run the code.
    
    class Solution {
        public static void main(String[] args) {
            // Create an array representing planets in the solar system
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            
            // Using basic for-loop to iterate through all planets
            for (int i = 0; i < planets.length; i++) {
                System.out.println("Visiting planet: " + planets[i]);
            }
            System.out.println();
            
            // Use enhanced for loop to visit each planet and print its name
            for (String planet : planets) {
                System.out.println("Visiting planet: " + planet);
            }
        }
    }

#### Practice #2
Instead of using the enhanced for loop, switch to a basic for loop and list the planets with their ordinal numbers (1, 2, ..., 9). 

    class Solution {
        public static void main(String[] args) {
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            for (String planet : planets) {
                System.out.println("Exploring planet: " + planet);
            }
        }
    }

    class Solution {
        public static void main(String[] args) {
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            for (int i = 0; i < planets.length; i++) {
                System.out.println(i+1 + " - Exploring planet: " + planets[i]);
            }
        }
    }

#### Practice #3
Investigate the following code and correct the spaceship's course so we can visit every planet in our array. 

    class Solution {
        public static void main(String[] args) {
            int[] distancesFromSun = {1, 2, 3, 4, 5, 6, 7, 8};
    
            for (int i = 0; i <= distancesFromSun.length; i--) {
                System.out.println(distancesFromSun[i]);
            }
        }
    }
    
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 8
    	at Solution.main(solution.java:6)
    
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at Solution.main(solution.java:6)
    
    class Solution {
        public static void main(String[] args) {
            int[] distancesFromSun = {1, 2, 3, 4, 5, 6, 7, 8};
    
            for (int i = 0; i < distancesFromSun.length; i++) {
                System.out.println(distancesFromSun[i]);
            }
        }
    }

#### Practice #4
We're going to practice using the enhanced for loop. Let's explore the solar system, one loop at a time.

    class Solution {
        public static void main(String[] args) {
            // Array of planet names in our solar system for space exploration analogy
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            
            for (String planet : planets) {
               System.out.println("Visiting planet: " + planet);
            }
            // TODO: Write an enhanced for loop to traverse the array 'planets'
            // TODO: Inside the loop, print "Exploring the planet: " followed by the planet name.
        }
    }

#### Practice #5
Write code that visits each planet in our solar system, but now in reversed order.

    class Solution {
        public static void main(String[] args) {
            // TODO: Create an array with the names of the planets of our solar system
            // Here is the list of planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
            String [] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            // TODO: Use a basic for loop to visit (print the name of) each planet, **in reversed order**
            // Neptune should go first, then Uranus, etc.
            // Hint: for decrementing the variable in the loop, use `i--`, which is the same as `i = i - 1`
            for (int i = planets.length - 1; i >= 0;  i--) {
                System.out.println("Visiting: " + planets[i]);
            }
        }
    }


## Lesson 2: Java Space Loops: Mastering While and Do-While
### 1. Introduction to 'while' Loops
Loops automate repetitive tasks, like spiraling around a galaxy until a specific star is spotted. Imagine a race track: our code is the runner, circling laps (repeating the same block of code) until the required number of laps (loop's condition) is completed.

A Java `while` loop repeatedly executes a block of code as long as its given condition remains true.

Here is the `while` loop's structure:

    while (condition) {
        do some action
    }
Here's a simple `while` loop example that counts down from 5 to 0:

    int countdown = 5;
    while (countdown >= 0) {
        // The countdown will print the current number and decrease it by 1 in each loop
        System.out.println(countdown);
        countdown--;
    }
    // Prints:
    // 5
    // 4
    // 3
    // 2
    // 1
    // 0
Notice the decrementing command `countdown--`? Without it, our code would become an infinite loop, circling around indefinitely. Be cautious!

### 2. Journey with the 'do-while' Loop
`Do-while` loops execute a block of code once and continue repeating it until the condition becomes false. The syntax is slightly different:

    do {
        // code executed at least once
    } while (condition);
This loop fits perfectly into scenarios that require at least one execution of the code before checking conditions.

Here's a simple `do-while` loop example that counts down from 5 to 0:

    int countdown = 5;
    do {
        // The countdown will print the current number and decrease it by 1 in each loop
        System.out.println(countdown);
        countdown--;
    } while (countdown >= 0);
    // Prints:
    // 5
    // 4
    // 3
    // 2
    // 1
    // 0

### 3.'while' vs. 'do-while': When to Use Which One
Use a `while` loop when the execution of the code depends on the condition. Use a `do-while` loop when you are sure about running it at least once and checking the condition thereafter.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // A "while" loop to count up to 5 stars, like a sensor detecting celestial objects
            int starsCounted = 0;
            while (starsCounted < 5) {
                System.out.println("Star " + (starsCounted + 1) + " spotted!");
                starsCounted++;
            }
            
            // A "do-while" loop to simulate automatic space probe activation
            // and power reserve management
            int probeBattery = 3;
            do {
                System.out.println("Space probe is active. Checking systems. Battery level: " + probeBattery);
                probeBattery--;
            } while (probeBattery > 0);
        }
    }

#### Practice #2
Change the starter code so the loop starts at mission day 1 and increases to day 5. This alteration will require updating the loop condition and the mission day progression within the while loop construct.

    class Solution {
        public static void main(String[] args) {
            // Initialize missionDay with day 5 of our space exploration
            int missionDay = 5;
            while (missionDay >= 1) { // Loop from mission day 5 to day 1
                System.out.println("Spacecraft is orbiting on Day " + missionDay);
                missionDay--; // Move to the previous mission day
            }
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            // Initialize missionDay with day 5 of our space exploration
            int missionDay = 1;
            while (missionDay <= 5) { // Loop from mission day 5 to day 1
                System.out.println("Spacecraft is orbiting on Day " + missionDay);
                missionDay++; // Move to the previous mission day
            }
        }
    }

#### Practice #3
Can you spot the malfunction and correct the code?

    class Solution {
        public static void main(String[] args) {
            int fuelLevel = 5;
            do {
                System.out.println("Current fuel level: " + fuelLevel + " units.");
            } while (fuelLevel > 0); 
    
            int astronautsToBoard = 3;
            while (astronautsToBoard > 0) {
                System.out.println(astronautsToBoard + " astronauts remaining to board.");
            }
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            int fuelLevel = 5;
            do {
                System.out.println("Current fuel level: " + fuelLevel + " units.");
                fuelLevel--;
            } while (fuelLevel > 0); 
    
            int astronautsToBoard = 3;
            while (astronautsToBoard > 0) {
                System.out.println(astronautsToBoard + " astronauts remaining to board.");
                astronautsToBoard--;
            }
        }
    }

    class Solution {
        public static void main(String[] args) {
            // While loop for counting down until liftoff
            
            int liftoffCount = 5;
            while (liftoffCount >= 0) { // TODO: Write the condition for continuing the countdown
                System.out.println(liftoffCount + " seconds.");
                liftoffCount--;
                // TODO: Print the log message with the current countdown status
                // TODO: What else needs to be done after each countdown print to prevent an infinite loop?
            }
            
            // Do-while loop for simulating at least one orbit around a planet
            int orbitsCompleted = 0;
            do {
                // TODO: Print out the completion of the first orbit.
                System.out.println(orbitsCompleted + " orbits completed.");
                orbitsCompleted++;
            } while (orbitsCompleted < 1);
        }
    }

#### Practice 4
Add the code necessary to initiate the liftoff countdown and execute an orbit maneuver. Remember what ensures that the loop does not run indefinitely and how to guarantee at least one successful orbit completion.

    class Solution {
        public static void main(String[] args) {
            // While loop for counting down until liftoff
            int liftoffCount = 5;
            while (liftoffCount >= 0) { // TODO: Write the condition for continuing the countdown
            System.out.println(liftoffCount + " seconds");
            liftoffCount--;
                // TODO: Print the log message with the current countdown status
                // TODO: What else needs to be done after each countdown print to prevent an infinite loop?
            }
            
            // Do-while loop for simulating at least one orbit around a planet
            int orbitsCompleted = 0;
            do {
                // TODO: Print out the completion of the first orbit.
                System.out.println("There are " + orbitsCompleted + " orbits completed");
                orbitsCompleted++;
            } while (orbitsCompleted < 1);
        }
    }
#### Practice #5
Write a program from scratch that simulates the collection of stars in space until you have 5? Your ship's dashboard will display the number of stars you have collected after each loop!
