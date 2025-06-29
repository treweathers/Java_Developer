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


#### Practice #4
Add the code necessary to initiate the liftoff countdown and execute an orbit maneuver. Remember what ensures that the loop does not run indefinitely and how to guarantee at least one successful orbit completion.

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
#### Practice #5
Write a program from scratch that simulates the collection of stars in space until you have 5? Your ship's dashboard will display the number of stars you have collected after each loop!

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a variable to keep track of how many stars have been collected
            int starsCollected = 0;
            // TODO: Write a while loop that collects stars until you have 5 of them.
            while (starsCollected <= 5) {
                System.out.println("There are " + starsCollected + " stars collected");
                starsCollected++;
            }
            // Inside the loop, print out the current count of stars collected, then increment the count.
        }
    }

## Lesson 3: Navigating Conditional Asteroids: Java Loops and Decisions
### 1. Reviewing Java Loop Structures
Before charging forward, it's essential to revisit the foundation: loops. Within the vast cosmos of Java, we've navigated two primary types of loops: the `for` and `while` loops.

A `for` loop iterates a predetermined number of times, much like a reliable spaceship following a set route:

    for (int i = 0; i < 5; i++) { // Iterates five times
        System.out.println(i); // Prints 0 to 4
    }
The `while` loop, on the other hand, repeats actions until a specified condition turns false:

    int i = 0;
    while (i < 5) { // Condition for the loop to continue
        System.out.println(i); // Prints 0 to 4
        i++; // Increment the counter
    }
### 2. Reviewing Java Conditional Statements
Let's now revisit the `if-else` construct, which is Java's machinery for making decisions.

    int asteroidsDistance = 10;
    
    if (asteroidsDistance > 15) { // If this condition is true
        System.out.println("Navigate through the asteroids."); // This line executes
    } else {
        System.out.println("Steer clear of the asteroids."); // Else, this line executes
    }
The `if-else` statement enables the spaceship to decide whether to navigate through the asteroids based on their distance.

### 3. Combining Loops and Conditional Statements
Next, consider how the for loop integrates with an if-else statement:

    for (int i = 0; i < 6; i++) { // Our loop will iterate 6 times
        if (i % 2 == 0) { // If the number is divisible by 2 (Even)
            System.out.println(i + " is even."); // It'll print "X is even."
        } else { // If not divisible by 2 (Odd)
            System.out.println(i + " is odd."); // It'll print "X is odd."
        }
    }
    // Prints:
    // 0 is even.
    // 1 is odd.
    // 2 is even.
    // 3 is odd.
    // 4 is even.
    // 5 is odd.
In a similar fashion, an `if-else` statement can be applied within a `while` loop:

    int i = 0;
    while (i < 7) { // Our loop will iterate 10 times
        if (i % 3 == 0) { // If the number is divisible by 3
            System.out.println(i + " is divisible by 3."); // It'll print "X is divisible by 3."
        } else { // If not divisible by 3
            System.out.println(i + " is not divisible by 3."); // It'll print "X is not divisible by 3."
        }
        i++; // Increments the counter.
    }
    // Prints:
    // 0 is divisible by 3.
    // 1 is not divisible by 3.
    // 2 is not divisible by 3.
    // 3 is divisible by 3.
    // 4 is not divisible by 3.
    // 5 is not divisible by 3.
    // 6 is divisible by 3.
### 4. Real-life Examples
Picture this scenario: you've prepared a shopping list (an array). As you proceed through the market (akin to the `for` loop), you check items (the `if` condition) off your list. If discounts are available, you purchase the luxury goods; if not, you buy them only if they're essential.

    String[] shoppingList = {"Potatoes", "Tomatoes", "Luxury Martian Rice"};
    boolean discount = true;
    
    for (String item : shoppingList) { // Iterating over the shopping list
        // If a discount is available on a luxury item, it will be purchased.
        // Else, if it's an essential item, it will be purchased.
        // Otherwise, the luxury item will be skipped.
        if (item.equals("Luxury Martian Rice") && discount) {
            System.out.println("Buy " + item + " with discount.");
        } else if (!item.equals("Luxury Martian Rice")) {
            System.out.println("Buy essential " + item);
        } else {
            System.out.println("No discount. Skip " + item);
        }
    }
In another setting, consider a space game. As long as you have life points (represented by a `while` loop), your points increase if you hit an alien (an `if` condition)!

    int score = 0;
    int lifePoints = 5;
    
    while (lifePoints > 0) { // As long as life-points remain
        // Random generator for hit (true) or miss (false)
        boolean isAlienHit = Math.random() > 0.5;
    
        // If you hit, it awards 10 points.
        // If you missed, it deducts a life point.
        if (isAlienHit) {
            System.out.println("Alien vessel hit! +10 points");
            score += 10;
        } else {
            System.out.println("Missed! -1 life point");
            lifePoints -= 1;
        }
    }
    
    // Displays the final score when the game ends.
    System.out.println("Game Over. Your score is " + score);

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            for (int planet = 1; planet <= 5; planet++) {
                if (planet % 2 == 0) {
                    System.out.println("Planet " + planet + " has water!");
                } else {
                    System.out.println("Planet " + planet + " is dry.");
                }
            }
        }
    }

#### Practice #2
Convert the for loop in the starter code to a while loop to practice controlling your program's flow with a different type of loop. Ensure you maintain the same logic when scanning rock samples suitable for analysis.

    class Solution {
        public static void main(String[] args) {
            // Astronaut's task is to report the area of rock samples that are multiples of 4
            int rockSample = 1;
            while (rockSample <= 8) {
                if (rockSample % 4 == 0) {
                    System.out.println("Rock sample " + rockSample + " is suitable for analysis.");
                }
                rockSample++;
            }
        }
    }

#### Practice #3
The probe should increase its thruster burn every third day. Can you find the miscalculation in the days and fix it so that the probe can complete its 30-day journey correctly?

    class Solution {
        public static void main(String[] args) {
            int spaceProbeDistance = 0;
            int day = 1;
    
            while (spaceProbeDistance <= 30) { // Simulate distance check for 30 days
                if (day % 3 == 0) {
                    spaceProbeDistance += 3;
                    System.out.println("Day " + day + ": Increased thruster burn. Distance: " + spaceProbeDistance);
                } else {
                    spaceProbeDistance += 1;
                    System.out.println("Day " + day + ": Standard thruster burn. Distance: " + spaceProbeDistance);
                    day++;
                }
            }
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            int spaceProbeDistance = 0;
            int day = 1;
    
            while (spaceProbeDistance <= 30) { // Simulate distance check for 30 days
                if (day % 3 == 0) {
                    spaceProbeDistance += 3;
                    System.out.println("Day " + day + ": Increased thruster burn. Distance: " + spaceProbeDistance);
                } else {
                    spaceProbeDistance += 1;
                    System.out.println("Day " + day + ": Standard thruster burn. Distance: " + spaceProbeDistance);
                }
                day++;
            }
        }
    }

#### Practice #4
In the main code, find the spot to determine if it's a good day for a spacewalk. Remember, acceptable conditions range between 18 and 22 degrees. Your task awaits!

    class Solution {
        public static void main(String[] args) {
            int[] temperatures = {21, 19, 20, 22, 18, 17, 19};
            for (int temp : temperatures) {
                if(temp >= 18 && temp <= 22) {
                    System.out.println(temp + " degrees - Get out now.");
                }
                // TODO: Check if the temperature is between 18 and 22 degrees and print the appropriate message.
                else {
                System.out.println(temp + " degrees - Better stay inside the station.");
                }
            }
        }
    }

#### Practice #5
Write a Java program that loops through days, checks the temperature, and prints whether it's suitable for exploration.

    class Solution {
        public static void main(String[] args) {
            // TODO: Set an array of temperatures during the week (7 elements)
            int [] temperatures = {11, 22, 33, 44, 55, 66, 77};
            // TODO: Use a for loop to go through each day of the week
            for (int i = 0; i <= temperatures.length - 1; i++) {
                if (temperatures[i] <= 24) {
                    System.out.println("Day " + i + " with temp " + temperatures[i] + " is good");
                } else {
                    System.out.println("Day " + i + " with temp " + temperatures[i] + " ain''t great");
                } 
           }
            
                // TODO: Use an if-else statement to check if the temperature is too high for exploration
                // Let's assume the temperature is too high if it's more than 24 degrees Celsius
                
                // TODO: Print the day and whether it's too hot or suitable for exploration
        }
    }

## Lesson 4: Understanding Nested Loops
### 1. Nested Loops: The Basics
Imagine each day involves multiple tasks like cooking and eating for each meal: breakfast, lunch, and dinner. Here, the meals represent the outer loop, and the tasks represent the inner loop. Similarly, in Java, we can write a `for` or `while` loop (inner loop) inside another `for` or `while` loop (outer loop).

    for (initialization; condition; iteration) {
        // outer loop code
        for (initialization; condition; iteration) {
            // inner loop code
        }
    }
Evaluate the condition of the outer loop. If it's true, enter the loop and complete the iterations of the inner loop before proceeding to the next iteration of the outer loop.

### 2. Java Nested 'for' Loops
Writing nested `for` loops in Java is simple. To demonstrate, let's print a 5x5 star pattern using nested loops:

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("* "); // print "* "
        }
        System.out.println(); // move to the next line
    }
    // Prints:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * * 
Here, the outer loop governs the rows, while the inner one controls columns. The result: a diagonal pattern of stars printed on the console!

### 3. Java Nested 'while' Loops
Nested `while` loops function similarly to nested `for` loops. The following example prints five sequences, each descending from 5 to 1:

    int i = 5;
    while (i > 0) {
        int j = i;
        while (j > 0) {
            System.out.print(j + " "); // print number
            j--; // decrement the value of j
        }
        System.out.println(); // move to the next line
        i--; // decrement the value of i
    }
    // Prints:
    // 5 4 3 2 1
    // 4 3 2 1
    // 3 2 1
    // 2 1 
    // 1 
Upon executing this, you'll see five lines, containing decreasing numbers, as shown in the comment.

### 4. Advanced Tasks with Nested Loops
Nested loops are particularly useful for tasks such as traversing multi-dimensional arrays and performing complex searches.

Given a 2D array, let's print all elements using nested loops:

    int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
    for (int i = 0; i < intArray.length; i++) { // iterates over rows
        for (int j = 0; j < intArray[i].length; j++) { // iterates over columns
            System.out.print(intArray[i][j] + " "); // prints each element
        }
        System.out.println(); // moves to the next line
    }
    // Prints:
    // 1 2 3
    // 4 5 6
    // 7 8 9
To search for a number in a 2D array, nested loops work superbly. Here's a demonstration that searches for the number 7:

    int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int searchNumber = 7;
    boolean isFound = false;
    
    for (int i = 0; i < intArray.length; i++) { // iterates over rows
        for (int j = 0; j < intArray[i].length; j++) { // iterates over columns
            if (intArray[i][j] == searchNumber) {
                System.out.println("Number " + searchNumber + " found at [" + i + ", " + j + "]");
                isFound = true;
            }
        }
    }
    
    if (!isFound) {
        System.out.println("Number " + searchNumber + " not found in the array.");
    }
    // Prints: Number 7 found at [2, 0]
When we run the code, our nested loops find the number `7` in the third row.

### 5. Quick Nested Loops Tips and Warnings
Though nested loops are extraordinarily powerful, be sure to avoid common pitfalls such as infinite loops (ensure your loop will eventually exit). Remember, the proper controls and conditional statements are significant.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Daily meal preparation routine for three days
            String[] days = {"Monday", "Tuesday", "Wednesday"};
            String[] meals = {"Breakfast", "Lunch", "Dinner"};
    
            for (int i = 0; i < days.length; i++) {
                System.out.println("Day: " + days[i]);
                for (int j = 0; j < meals.length; j++) {
                    System.out.println(" - Preparing " + meals[j]);
                }
            }
        }
    }

#### Practice #2
Transform the loop that prints our meal tasks from a for-in-collection loop into a while loop (while (condition) { ... }). Remember to keep the number of tasks constant and to maintain the same output format.

    class Solution {
        public static void main(String[] args) {
            String[] meals = {"Breakfast", "Lunch", "Dinner"};
            String[] tasks = {"Plan", "Cook", "Eat"};
    
            int i = 0;
            while (i < meals.length) {
                System.out.println("For " + meals[i] + ":");
                i++;
                int j = 0;
                while (j < tasks.length) {
                    System.out.println("- " + tasks[j]);
                    j++;
                }
            }
        }
    }

#### Practice #3
We've accidentally mixed up something in our code. They're not displaying in the order we planned. Identify the issue in our meal planning code and fix it.

    class Solution {
        public static void main(String[] args) {
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String[] mealsOfTheDay = {"Breakfast", "Lunch", "Dinner"};
    
            // Outer loop for days of the week
            for (int i = 0; i < daysOfWeek.length; i++) {
                // Inner loop for each meal of the day
                for (int j = 0; j < mealsOfTheDay.length; j++) {
                    System.out.println("Day: " + daysOfWeek[j] + ", Meal: " + mealsOfTheDay[i]);
                }
            }
        }
    }
    
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at Solution.main(solution.java:10)
    
     class Solution {
        public static void main(String[] args) {
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String[] mealsOfTheDay = {"Breakfast", "Lunch", "Dinner"};
    
            // Outer loop for days of the week
            for (int i = 0; i < daysOfWeek.length; i++) {
                // Inner loop for each meal of the day
                for (int j = 0; j < mealsOfTheDay.length; j++) {
                    System.out.println("Day: " + daysOfWeek[i] + ", Meal: " + mealsOfTheDay[j]);
                }
            }
        }
    }

#### Practice #4
A piece of code has mysteriously vanished. I need your help to add code that will print tasks for each meal of the day. Can you code the missing part where we loop through the tasks and output them?

    class Solution {
        public static void main(String[] args) {
            String[] meals = {"Breakfast", "Lunch", "Dinner"};
            String[] tasks = {"Plan", "Cook"};
            
            int i = 0;
            for (String meal : meals) {
                if (i < meals.length) {
                // TODO: Loop through the tasks and output "<Task> <Meal>", e.g. "Plan Breakfast"
            }
            int j = 0;
            for (String task: tasks) {
                if (j < tasks.length) {
                    System.out.println(task + " " + meal);
                }
                }
            }
        }
    }


#### Practice #5
Create a Java program that prints out the tasks needed to plan and prepare each meal of the day, utilizing nested loops to accomplish the task.

    class Solution {
        public static void main(String[] args) {
            // TODO: Create an array containing the names of each meal of the day
            String [] daysOfWeek = {"Breakfast", "Lunch", "Dinner"};
            // TODO: Create an array containing the names of tasks for meal planning
            String [] mealsOfDay = {"Plan", "Prepare", "Cook"};
            // TODO: Use a nested loop to iterate over each meal and its associated tasks and print them
            for (int i = 0; i < daysOfWeek.length; i++) {
                for (int j = 0; j < mealsOfDay.length; j++) {
                    System.out.println(mealsOfDay[j] + " " + daysOfWeek[i]);
                }
            }
        }
    }

## Lesson 5: Navigating Loop Control: Mastering Break and Continue in Java
### 1. Break Statement
Think of the `break` command as representing the moment the music stops during a game of musical chairs, prompting you to exit the loop. It ends the loop regardless of the loop's original condition.

Here is a quick example:

    for (int i = 0; i < 10; i++) {
        if(i == 7) { // When `i` reaches 7
            System.out.println("7 found! Break!"); // Message before the break
            break; // Terminating the loop
        }
        System.out.println("Number: " + i); // Print i until we hit "break"
    }
    // Prints:
    // Number: 0
    // Number: 1
    // Number: 2
    // Number: 3
    // Number: 4
    // Number: 5
    // Number: 6
    // 7 found! Break!
Our loop operates on numbers from 0 to 6 and breaks when it reaches 7, taking an early exit and skipping all remaining iterations.

### 2. Continue Statement
The keyword `continue` in Java is analogous to skipping a boring view during a walk. It disregards the current loop iteration and jumps ahead to the next one.

Here is an example:

    for (int j = 1; j <= 10; j++) {
        if (j == 4 || j == 7) { // Skip the 4th and 7th buildings
            continue;
        }
        System.out.println("Admiring building number: " + j); // Continue with the rest
    }
    // Prints:
    // Admiring building number: 1
    // Admiring building number: 2
    // Admiring building number: 3
    // Admiring building number: 5
    // Admiring building number: 6
    // Admiring building number: 8
    // Admiring building number: 9
    // Admiring building number: 10
Our output presents admiration logs for all buildings except numbers 4 and 7, which our `continue` statement omits.

### 3. Break and Continue in Nested Loops
Nested loops, like a spiral galaxy with numerous orbits, are loops within loops. Even in these spinning spirals, `break` and `continue` function distinctly. It is important to mention that both `break` and `continue` will exit/skip only the corresponding inner loop, not affecting the outer loop. Let's illustrate this with a couple of examples.

Consider a nested loop running on a `5x5` grid.

    for (int i = 1; i <= 5; i++) {
        System.out.print(i + ": ");
        for (int j = 1; j <= 5; j++) {
            if (i == 3 && j == 3) {
                // break the inner loop
                break;
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }
    // Prints:
    // 1: 1 2 3 4 5
    // 2: 1 2 3 4 5
    // 3: 1 2
    // 4: 1 2 3 4 5
    // 5: 1 2 3 4 5
Here, `break` ends the inner loop when `i` and `j` both equal `3`. Thus, when `i` becomes 3, the inner loop runs only up to `j = 2` and then breaks. However, the outer loop continues until `i = 5`.

Meanwhile, let's introduce 'continue' in a similar setup.

    for (int i = 1; i <= 5; i++) {
        System.out.print(i + ": ");
        for (int j = 1; j <= 5; j++) {
            if (i == 3 && j == 3) {
                continue;
            }
            System.out.print(j + " ");
        }
        System.out.println();
    }
    // Prints:
    // 1: 1 2 3 4 5
    // 2: 1 2 3 4 5
    // 3: 1 2 4 5
    // 4: 1 2 3 4 5
    // 5: 1 2 3 4 5
`continue`, once it meets the `i == 3 && j == 3` condition, skips the rest of the code inside its loop and instantly moves to the next iteration. In this case, it means we skip printing `j` when both `i` and `j` are equal to `3`.


#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            for (int spin = 1; spin <= 10; spin++) {
                if (spin == 5) {
                    continue;
                }
                if (spin == 9) {
                    break;
                }
                System.out.println("The carousel has spun " + spin + " times");
            }
        }
    }

#### Practice #2
Run the code.

    class Solution {
        public static void main(String[] args) {
            int ride = 1;
            while (ride <= 5) {
                if (ride == 2) {
                    ride++;
                    continue;
                }
                System.out.println("Riding attraction number: " + ride);
                for (int turn = 1; turn <= 3; turn++) {
                    if (ride == 4) {
                        System.out.println("Wow, that's intense! Let's do a different ride.");
                        break;
                    }
                    System.out.println("Turn " + turn + " on attraction " + ride);
                }
                ride++;
            }
        }
    }

#### Practice #3
Please change the code so that it skips not just ride number 7, but also ride number 8. Use what you've learned about the continue statement and logical operators to make this happen.

    class Solution {
        public static void main(String[] args) {
            // A tiny merry-go-round loop:
            for (int rideNumber = 1; rideNumber <= 10; rideNumber++) {
                if (rideNumber == 7 || rideNumber == 8) { // We want to skip ride number 7.
                    continue; // We use 'continue' to skip to the next ride.
                }
                if (rideNumber == 9) { // We want to stop the loop at ride number 9.
                    System.out.println("Ride " + rideNumber + " is so fun, let's end on a high note!");
                    break; // We use 'break' to stop the loop prematurely.
                }
                System.out.println("Enjoying ride number: " + rideNumber);
            }
        }
    }

#### Practice #4
#### Practice #5
#### Practice #6
