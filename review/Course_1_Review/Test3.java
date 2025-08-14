//Course 1.3: Iterations and Loops in Java

class Test3 {
//LESSON 1: For Loops and Beyond
//#### Practice #4: We're going to practice using the enhanced for loop. Let's explore the solar system, one loop at a time.
    public static void main(String[] args) {
        // Array of planet names in our solar system for space exploration analogy
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        // TODO: Write an enhanced for loop to traverse the array 'planets'        
        for (String planet : planets) {
        // TODO: Inside the loop, print "Exploring the planet: " followed by the planet name.
           System.out.println("Visiting planet: " + planet);
        }

//#### Practice #5: Write code that visits each planet in our solar system, but now in **reversed order**.
        // TODO: Create an array with the names of the planets of our solar system
        // Here is the list of planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune
        String [] planets2 = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        // TODO: Use a basic for loop to visit (print the name of) each planet, **in reversed order**
        // Neptune should go first, then Uranus, etc.
        // Hint: for decrementing the variable in the loop, use `i--`, which is the same as `i = i - 1`
        for (int i = planets2.length - 1; i >= 0;  i--) {
            System.out.println("Visiting: " + planets[i]);

//LESSON 2: Java Space Loops: Mastering While and Do-While
//#### Practice #4: Add the code necessary to initiate the liftoff countdown and execute an orbit maneuver. Remember what ensures that the loop does not run indefinitely and how to guarantee at least one successful orbit completion.
        // While loop for counting down until liftoff
        int liftoffCount = 5;
        while (liftoffCount >= 0) { // TODO: Write the condition for continuing the countdown
            // TODO: Print the log message with the current countdown status
            System.out.println(liftoffCount + " seconds.");
            // TODO: What else needs to be done after each countdown print to prevent an infinite loop?
            liftoffCount--;
        }
        
        // Do-while loop for simulating at least one orbit around a planet
        int orbitsCompleted = 0;
        do {
            // TODO: Print out the completion of the first orbit.
            System.out.println(orbitsCompleted + " orbits completed.");
            orbitsCompleted++;
        } while (orbitsCompleted < 1);

//#### Practice #5: Write a program from scratch that simulates the collection of stars in space until you have 5? Your ship's dashboard will display the number of stars you have collected after each loop!
        // TODO: Declare a variable to keep track of how many stars have been collected
        int starsCollected = 0;
        // TODO: Write a while loop that collects stars until you have 5 of them.
        while (starsCollected <= 5) {
            // Inside the loop, print out the current count of stars collected, then increment the count.
            System.out.println("There are " + starsCollected + " stars collected");
            starsCollected++;

//LESSON 3: Navigating Conditional Asteroids: Java Loops and Decisions
//#### Practice #5: Write a Java program that loops through days, checks the temperature, and prints whether it's suitable for exploration.
        // TODO: Set an array of temperatures during the week (7 elements)
        int [] temperatures = {11, 22, 33, 44, 55, 66, 77};
        // TODO: Use a for loop to go through each day of the week

//**Q: HOW KNOW IF TO DO .length - 1 OR NOT?**: Use i < array.length - 1 or i < string.length() - 1: This is necessary when your loop's body accesses elements at i and i + 1 (or i + k for some k > 0). Subtracting 1 from the length prevents an ArrayIndexOutOfBoundsException or StringIndexOutOfBoundsException when i + 1 (or i + k) would go beyond the valid index range.

        for (int ii = 0; ii <= temperatures.length - 1; ii++) {
            // TODO: Use an if-else statement to check if the temperature is too high for exploration. Let's assume the temperature is too high if it's more than 24 degrees Celsius
            if (temperatures[ii] <= 24) {
                // TODO: Print the day and whether it's too hot or suitable for exploration
                System.out.println("Day " + ii + " with temp " + temperatures[ii] + " is good");
            } else {
                System.out.println("Day " + ii + " with temp " + temperatures[ii] + " ain''t great");
            } 
       }

//LESSON 4: Understanding Nested Loops
//#### Practice #5: Create a Java program that prints out the tasks needed to plan and prepare each meal of the day, utilizing nested loops to accomplish the task.
        // TODO: Create an array containing the names of each meal of the day
        String [] daysOfWeek = {"Breakfast", "Lunch", "Dinner"};
        // TODO: Create an array containing the names of tasks for meal planning
        String [] mealsOfDay = {"Plan", "Prepare", "Cook"};
        // TODO: Use a nested loop to iterate over each meal and its associated tasks and print them
        for (int iii = 0; iii < daysOfWeek.length; iii++) {
            for (int j = 0; j < mealsOfDay.length; j++) {
                System.out.println(mealsOfDay[j] + " " + daysOfWeek[iii]);
            }
        }

//LESSON 5: Navigating Loop Control: Mastering Break and Continue in Java
//#### Practice #6: Write a program for controlling amusement park rides! Remember to skip a certain ride that's under maintenance and close the park after reaching a specific ride number.
        // TODO: Create a loop for the amusement park rides from 1 to 10
        int totalRides = 10;
        int ride = 1;
        for (ride = 1; ride < totalRides; ride++) {
            // TODO: Skip ride #6, it's under maintenance right now
            if (ride == 6) {
                continue;
            }
            // TODO: End your trip early when reaching ride #9
            if (ride == 9) {
                break;
            }
            // TODO: Print out the ride numbers that visitors enjoy on the way
            System.out.println( "Enjoying ride number: " + ride);
        }
      }
        }
    }
}
