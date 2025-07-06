//Course 1.4: Mastering Debugging with Java

class Test4 {
//LESSON 1: Decoding Java Space Signals: Understanding Error Messages
//#### Practice #4: Ensure that the distress signal can be sent without errors. Please review the code and correct any issues so that communication is clear.
/*Original

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

Fixed*/
    public static void main(String[] args) {
        int value = 3;
        String spaceMessage = value == 3 ? null : "Hey, this is a message from Space!";
        System.out.println(spaceMessage);

//LESSON 2: Java's Puzzling Punctuation
//#### Practice #4: A syntax mishap is preventing it from compiling. Your mission is to examine the code and rectify the error so that the program operates flawlessly.
/*Original

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

Fixed*/
        int starsInGalaxy = 1000000; // Counting stars
        System.out.println(starsInGalaxy);

//LESSON 3: Java Logical Errors
//#### Practice #4: Please review the code and correct the error so we can generate an accurate report of the total number of moons.
/*Original

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

Fixed*/
        // Array representing the approximate number of moons for each planet in the solar system
        int[] moonsForEachPlanet = {0, 0, 1, 2, 79, 82, 27, 14}; // Correct data for moon count
        int totalMoons = 0;

        // Loop to sum the moons for each planet
        for (int i = 0; i < moonsForEachPlanet.length; i++) {
            totalMoons += moonsForEachPlanet[i];
        }
      
        // Output total moons in the solar system
        System.out.println("Total moons in the solar system: " + totalMoons);
 
//LESSON 4: Navigating Through Try, Catch, and Finally Blocks
//#### Practice #4: Create a Java program that anticipates and handles out-of-bounds issues when accessing array elements. Remember to use a try-catch block to manage the exception and add a finally block that always executes.
        int[] spaceRocks = {3, 7, 5};
        // TODO: Implement a try block to attempt accessing an index of the `spaceRocks` array
        try {
            System.out.println(spaceRocks[3]);
        // TODO: Catch the potential ArrayIndexOutOfBoundsException thrown
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! Attemped to go to nonexistent planet!");
        // TODO: Add a 'finally' block that logs a message regardless of the exception outcome
        } finally {
            System.out.println("Home sweet home. Mission complete.");
        }
    }
}