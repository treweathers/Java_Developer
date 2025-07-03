//COURSE 1.1: Getting Started with Java
//LESSON 1: Java Basics: Syntax, Comments, Semicolons, and Your First Program
//Practice #1
    class Solution {
        public static void main(String[] args) {
            // This command prints a message to the console
            System.out.println("Greetings from the stars, Java Explorer!");
        }
    }
//Practice #2: Change the text within the System.out.println to "Journey to the stars begins with Java!"
    class Solution2 {
        public static void main(String[] args) {
            // This line prints a message about space exploration
            System.out.println("Journey to the stars begins with Java!"); // Please change the message!
        }
    }
//Practice #3: Find the bug
    class Solution3 {
        public static void main(String[] args) {
            // Sending a greeting to interstellar explorers
            //needed ; at end of line
            System.out.println("Greetings, interstellar explorers!");
        }
    }
    class Solution4 {
        public static void main(String[] args) {
            // Sending a greeting to interstellar explorers
            System.out.println("Greetings, interstellar explorers!");
        }
    }
//Practice #4: Complete the code to broadcast your greeting across the cosmos!
    class Solution5 {
        public static void main(String[] args) {
            // TODO: Print a welcome message for new space explorers learning Java.
            System.out.println("Welcome new space explorers learning Java!");
        }
    }
//Practice #5: Start the countdown for the launch of our virtual spacecraft. Remember, every Java program starts with a class and a main method.
    // TODO: Declare a class named 'Solution' (other class names won't work)
    // Make sure NOT to make your class 'public'
    class Solution6 {
         // TODO: Inside your class, define the main 'public static void main' method that Java looks for
         public static void main(String[] args) {
            // TODO: Use a print statement to display a message "3, 2, 1... Lift off!" to the console
            System.out.println("3, 2, 1... Lift off!");
         }
    }

//LESSON 2: Java Variables: Storing Data on Our Journey to the Stars
//Practice #1
    class Solution7 {
        public static void main(String[] args) {
            final int SOLAR_SYSTEM_PLANETS = 8;
            System.out.println("Number of planets in the Solar System: " + SOLAR_SYSTEM_PLANETS);
            
            int universeAge = 14;
            System.out.println("The universe is approximately " + universeAge + " billion years old.");
        }
    }
//Practice #2: Modify the provided starter code to define the speed of light as a constant that does not change. Remember to follow the proper Java syntax for constants.
    class Solution8 {
        public static void main(String[] args) {
            // Creating a variable for representing the speed of light
            final int speedOfLightKmS = 299792;
    
            // Output the speed of light
            System.out.println("The speed of light is: " + speedOfLightKmS);
        }
    }
//Practice #3: Your mission is to find and fix the bug. Happy debugging!
    class Solution9 {
        public static void main(String[] args) {
            int earthOrbitRadius = 149600000; // in kilometers
            System.out.println("The Earth's orbit radius is " + earthOrbitRadius + " kilometers.");
            //this was int 8planets = 8; - same for the print statement
            int planets8 = 8;
            System.out.println("There are " + planets8 + " planets in the Solar System.");
        }
    }
//Practice #4: It's time to define a constant for our cosmic journey speed. Add the necessary code to ensure our spaceship's dashboard displays all the crucial information.
    class Solution10 {
        public static void main(String[] args) {
            // TODO: Declare a constant for Earth's orbital speed and set its value to 29 km/s
            final int EARTHS_ORBITAL_SPEED = 29;
            // TODO: Print out the string "Earth's orbital speed: <speed value> km/s
            System.out.println("Earth's orbital speed: " + EARTHS_ORBITAL_SPEED + "km/s");
        }
    }
//Practice #5: Let's recap the variables and constants related to our cosmic journey. Create a new constant to represent Earth's orbital speed and a variable for the number of planets, then display their values. Ready to blast off?
    class Solution11 {
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

//LESSON 3: Java Basics: Exploring Primitive Data Types and Strings
//#### Practice #1
    class Solution12 {
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
//#### Practice #2 : Change the countdownStart variable to a decimal number with a value of 10.5.
    class Solution13 {
        public static void main(String[] args) {
            // Define a variable with 'int' type representing days until the space launch
            float countdownStart = 10.5f;
    
            System.out.println("There are " + countdownStart + " days until the launch.");
        }
    }
//#### Practice #3: Run the code, identify the error, and provide the necessary fix.
    class Solution14 {
        public static void main(String[] args) {
            int numOfPlanets = 8;
            // was float, but incorrect data type - needed double
            double rocketWeight = 1500.5;
            String message = "Ready for space exploration!";
            System.out.println("There are " + numOfPlanets + " known planets.");
            System.out.println("Our rocket weighs " + rocketWeight + " tons.");
            System.out.println(message);
        }
    }
 /*  
    solution.java:4: error: incompatible types: possible lossy conversion from double to float
            float rocketWeight = 1500.5;
                                 ^
    1 error
*/  
//#### Practice #4: You have learned much about Java's primitive data types. Write a Java program from scratch that declares these details using the appropriate data types and prints them out.
    class Solution15 {
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

//LESSON 4: Understanding Java's Comparison Operators
//#### Practice #1
    class Solution16 {
        public static void main(String[] args) {
            int crewMembersOnboard = 5;
            int maxCapacity = 8;
    
            boolean canAddMoreCrew = crewMembersOnboard < maxCapacity;
            System.out.println("Can we add more crew members? " + canAddMoreCrew);
        }
    }
//#### Practice #2: modify the starter code to check if a spacecraft is moving too quickly for a safe landing. You will need to change the comparison operator and update the variable name to accurately reflect the new logic.
    class Solution17 {
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
//#### Practice #3: Your mission is to calculate whether our spacecraft can outrun starlight. Provide the missing logic to complete the code!
    class Solution18 {
        public static void main(String[] args) {
            int starLightSpeed = 299792; // Speed of light from a star in km/s
            int spacecraftSpeed = 40000; // Speed of spacecraft in km/s
    
            // TODO: Determine if our spacecraft can travel faster than starlight and print the result
            boolean isSpaceCraftFaster = spacecraftSpeed > starLightSpeed;
            System.out.println("Can our spacecraft outrun starlight? " + isSpaceCraftFaster /* TODO: Add the missing logic here */);
        }
    }
//#### Practice #4
    class Solution19 {
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
    };

//LESSON 5: Arithmetic and Logical Operations in Java
//#### Practice #1: Run the code.
    class Solution20 {
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
//#### Practice #2
    class Solution21 {
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
/* output:
    2147483647
    -2147483639
*/
//#### Practice #3: There might be a logic glitch in the launch sequence that needs your sharp eye. Please fix the error!
    class Solution22 {
        public static void main(String[] args) {
            // Constants representing the level of fuel in the spaceship and the required minimum before launch.
            int currentFuel = 300;
            int requiredFuel = 300;
            boolean engineCheckComplete = true;
    
            // Check if there is adequate fuel and if the pre-launch engine check is complete.
            //m - there needed to be && instead of ||
            System.out.println(currentFuel >= requiredFuel && engineCheckComplete);
        }
//#### Practice #4: Can you calculate the totals in our cosmic inventory and check our findings against our mission criteria?
    class Solution23 {
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
//#### Practice #5: Calibrate our spacecraft's fuel gauge by calculating the remaining fuel after a short flight. Determine if there's enough to take us beyond the next nebula. Use math operations and logical comparisons you've learned.
    class Solution24 {
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
}
//LESSON 6: Navigating Primitive Data Type Conversion
//#### Practice #1
    class Solution25 {
        public static void main(String[] args) {
          // Imagine converting the speed of a spaceship from kilometers per hour (double) to space-units per minute (int)
          double spaceshipSpeedInKmph = 12450.5; // Spaceship speed in kilometers per hour
          int spaceshipSpeedInSum = (int) (spaceshipSpeedInKmph / 60); // Explicitly casting to int
          
          System.out.println("Spaceship speed converted to space-units per minute: " + spaceshipSpeedInSum); 
        }
    }
//#### Practice #2: The star temperature reading is currently a double, but mission control needs it as text. Change the starter code to convert the double value into a String.
    class Solution26 {
        public static void main(String[] args) {
            // A star's temperature in Kelvin
            double starTemperature = 15000.95;
            
            // TODO: Convert the temperature from a double to a String
            String temperatureText = Double.toString(starTemperature);
            
            // Displaying the temperature as text
            System.out.println("Mission control, the star's temperature is: " + temperatureText + "K");
        }
    }
//#### Practice #3: Run the code and utilize your new skills in data type conversion to find and fix the issue. 
/*
    solution.java:4: error: incompatible types: possible lossy conversion from double to int
            int roundedDistance = starDistance; // There's an error related to types here
                                  ^
    1 error
*/
    class Solution27 {
        public static void main(String[] args) {
            double starDistance = 142.5; // Distance in light years as a double
            int roundedDistance = (int) starDistance; // There's an error related to types here
            //needed to add (int) in front of starDistance)
            String message = "The star is " + roundedDistance + " light years away.";
            System.out.println(message); // Is the printed message right?
    }
}
//Practice #4: Use the knowledge from our journey to convert different Java primitive types and strings. Follow the steps below using type casting and concatenation!
    class Solution28 {
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

//LESSON 7: Navigating Java Conditional Statements: If-Else, Switch, Ternary Operator
//#### Practive #1
    class Solution29 {
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
//#### Practice #2: Change the starter code to use the ternary operator instead of the if-else statement. 
    /* Before
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
    class Solution30 {
        public static void main(String[] args) {
            int objectSpeed = 42; // Example speed in km/s
            
            // Decide if an object is moving fast using a ternary operator
            String speedEvaluationMessage = objectSpeed >= 50 ? "Object is moving very fast!" : "Object is moving slowly.";
            System.out.println(speedEvaluationMessage);
        }
    }
//#### Practice #3: Something isn't quite right. Run the code to observe its behavior. Can you determine what needs to be fixed to ensure it follows the proper execution logic for the switch cases?
    class Solution31 {
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
                    //case 2 was missing a break statement
                case 3:
                    System.out.println("Star is fairly bright, let's start the analysis.");
                    break;
                default:
                    System.out.println("This star is so bright, it's visible to the naked eye!");
            }
        }
    }
//#### Practice #4: Run the existing diagnostic code and fix the issue to ensure we get an accurate count of the moons.
    class Solution32 {
        public static void main(String[] args) {
            int numberOfMoons = 2;  // Number of moons observed on a new planet
    
            if (numberOfMoons < 1) {
                System.out.println("No moons to explore here.");
            } else if (numberOfMoons < 3) {
                //this was elif, needed to change to else if
                System.out.println("A few moons detected!");
            } else {
                System.out.println("Wow, that's a lot of moons!");
            }
        }
    }
//#### Practice #5: Fill in the missing conditions and print statements in the provided if-else block.
    class Solution33 {
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
//#### Practice #6: Write code to make a decision about chasing a comet based on its speed. Remember the ternary operator from our lesson? Let it guide your spaceship's actions!
    class Solution34 {
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

//LESSON 8: Understanding Concatenation Operations
//#### Practice #1
    class Solution35 {
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
//#### Practice #2: Modify the starter code by changing the use of the + operator to StringBuilder for string concatenation. We can do it, let's go!
/* Before
    class Solution {
        public static void main(String[] args) {
            String socialMessage = "Hello, " + "Explorer! " + "Hope you're enjoying the Java Journey to the Stars course.";
            
            System.out.println(socialMessage);
        }
    }
 */   
    class Solution36 {
        public static void main(String[] args) {
            StringBuilder socialMessage = new StringBuilder();
            
            socialMessage.append("Hello, ").append("Explorer! ").append("Hope you're enjoying the Java Journey to the Stars course.");
            
            System.out.println(socialMessage);
        }
    }
//#### Practice #3: Now, try adding a piece of code that uses concatenation to create a report about space discoveries. Then, add excitement to the report by using a different method of concatenation.
    class Solution37 {
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
//#### Practice #4: Combine your knowledge of concatenation and strings to craft a message that celebrates the moons of the giant planets. Use a StringBuilder or just a + operator to construct the final output.
    class Solution38 {
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


//Course 1.2: Learning Simple Data Structures in Java
//LESSON 1: Exploring Java Arrays: Creation, Accessing, and Properties
//#### Practice #1: Run the code.
//  import java.util.Arrays;
    class Solution39 {
        public static void main(String[] args) {
            int[] sportsInventory = {7, 8, 10, 3, 6}; // Represents inventory for 5 sports: soccer balls, tennis rackets, cricket bats, basketballs, volleyball
            
             // Print out the whole array
             System.out.println("Sports inventory: " + Arrays.toString(sportsInventory));
    
            // Print out the number of items for soccer balls (index 0)
            System.out.println("Soccer balls in inventory: " + sportsInventory[0]);
            
            // Finding and printing the total types of items in sports inventory
            int totalTypes = sportsInventory.length;
            System.out.println("Total types of sports items in the inventory: " + totalTypes);
        }
    }
//#### Practice #2
    class Solution40 {
        public static void main(String[] args) {
            // Creating a 2D array with quantities of different types of sports equipment.
            // The first array contains quantities of footballs, the second array - for basketballs, and the third - for volleyballs.
            int[][] equipmentStorage = {
                {15, 20}, // quantities of footballs
                {12, 25}, // quantities of basketballs
                {18, 30} // quantities of volleyballs
            };
          
            // Print out the quantity of footballs in storage without using arithmetic operations
            System.out.println("Footballs in storage - Size 1: " + equipmentStorage[0][0] + ", Size 5: " + equipmentStorage[0][1]);
        }
    }
//### Practice #3: Adjust the given code to print the number of tennis balls in the last storage compartment by using the array's length property.
    class Solution41 {
        public static void main(String[] args) {
            int[] tennisBalls = {50, 60, 70, 80, 90};
            // TODO: Access the last compartment's tennis balls using the array's length property
            System.out.println(tennisBalls[tennisBalls.length - 1]);
        }
    }
//#### Practice #4: There seems to be a slight hiccup when attempting to display the inventory as a neat string representation. Can you spot the bug and fix it
//  import java.util.*;
    class Solution42 {
        public static void main(String[] args) {
            int[] equipmentQuantities = { 5, 7, 4, 9, 1 };
            //needed to add Arrays.toString before (equipmentQuantities)
            System.out.println(Arrays.toString(equipmentQuantities)); // Attempting to output the multidimensional array
        }
    }
//#### Practice #5: Implement the missing piece of code to count the different types of balls and retrieve a specific type from our collection.
    class Solution43 {
        public static void main(String[] args) {
            // TODO: Create an array to represent the quantity of four types of sports balls (4 elements in the array)
            // Let's say we have 3 footballs, 5 basketballs, 2 volleyballs, 4 tennis balls
            int array[] = {3, 5, 2, 4};
            // TODO: Print the message "Total number of sports balls: " followed by the total count
            System.out.println("Total number of sports balls: " + array.length);
            // TODO: Access and print the message "Number of volleyballs: " followed by the count of the third item in the array
            System.out.println("Number of volleyballs: " + array[2]);
        }
    }
//#### Practice #6: Write Java code to initialize a multidimensional array representing storage for soccer balls and tennis rackets from different brands and print the total number for specific items.
    class Solution44 {
        public static void main(String[] args) {
            // Initialize a 2D array of integers named "sportsInventory", where the first sub-array stores
            // [0] - soccer balls, [1] - tennis rackets
            // Each array holds the quantity for different brands: [Nike, Adidas, Wilson]
            int[][] sportsInventory = { {40, 70, 0}, {25, 5, 10} };
    
            // TODO: Print the quantity of Nike soccer balls (1st element in the 1st sub-array)
            System.out.println(sportsInventory[0][0]);
            // TODO: Print the quantity of Wilson tennis rackets (3rd element in the 2nd sub-array) 
            System.out.println(sportsInventory[1][2]);
        }
    }

//LESSON 2: Java's Building Blocks: Primitive Types vs. Class Types
//#### Practice #1
    class Solution45 {
        public static void main(String[] args) {
            Integer accountBalance = 5000;
            Integer depositAmount = 1500;
            
            // Updating account balance using class types and methods
            accountBalance = accountBalance + depositAmount;
            System.out.println("New account balance: " + accountBalance.toString());
        }
    }
//#### Practice #2: Next, let's refine the equality check in our banking example. Instead of using the .intValue() method, use the equals() method from the Integer class to compare depositAmount directly with 5000.
/* original
    class Solution {
      public static void main(String[] args) {
        // Using class types with auto-boxing
        Integer accountBalance = 15000;
        Integer depositAmount = 5000;
    
        // Check if the deposit amount equals 5000
        if (depositAmount.intValue() == 5000) {
          accountBalance = accountBalance + depositAmount;
          System.out.println("New account balance: " + accountBalance);
        }
      }
    }
*/   
    class Solution46 {
      public static void main(String[] args) {
        // Using class types with auto-boxing
        Integer accountBalance = 15000;
        Integer depositAmount = 5000;
    
        // Check if the deposit amount equals 5000
        if (depositAmount.equals(5000)) {
          accountBalance = accountBalance + depositAmount;
          System.out.println("New account balance: " + accountBalance);
        }
      }
    }
//#### Practice #3: Here's a piece of code designed to verify the equality of two transaction amounts. However, it contains a bug, preventing it from doing so accurately. Determine the issue and fix it to ensure the comparison works correctly.
    class Solution47 {
        public static void main(String[] args) {
            Integer accountBalanceBoxed = 12000;
            Integer withdrawAmountBoxed = 12000;
            //needed to add.intValu()  to accountBalanceBoxed and withdrawAmountBoxed
            if (accountBalanceBoxed.intValue() == withdrawAmountBoxed.intValue()) {
                System.out.println("Transaction Successful: Balance and Withdrawal amounts are equal.");
            } else {
                System.out.println("Transaction Failed: Balance and Withdrawal amounts are not equal.");
            }
        }
    }
//#### Practice #4: Represent your bank account balance as a class type and print out the string length of it.
    class Solution48 {
        public static void main(String[] args) {
            // Define a bank account balance as a primitive type
            float accountBalancePrimitive = 1000.75f;
            
            // TODO: Convert the primitive account balance to a class type and assign it
            Float accountBalanceInteger = accountBalancePrimitive;
            // TODO: Print the class type balance to the console
            System.out.println(accountBalanceInteger);
            // TODO: Print the length of the string representation of the class type balance
            System.out.println(accountBalanceInteger.toString().length());
            // Hint: You can use 'toString()' and then 'length()' method on the class type
        }
    }
//#### Practice #5: Can you manage an account balance using Java class types writing a program that simulates an account balance withdrawal? Remember about built-in auto-boxing and auto-unboxing techniques, they make the code look much prettier.
    class Solution49 {
        public static void main(String[] args) {
            // TODO: Declare an Integer variable for account balance and initialize it with a value
            Integer accountBalanceInteger = 15000;
            // TODO: Declare a primitive int variable for the withdrawal amount and initialize it with a value
            int withdrawlAmountInt = 5000;
            // TODO: Perform a withdrawal by subtracting the withdrawal amount from the account balance (consider auto-unboxing and auto-boxing)
            Integer accountBalance = accountBalanceInteger - withdrawlAmountInt;
            // TODO: Print the new account balance as a string
            System.out.println(accountBalance.toString());
        }
    }

//LESSON 3: ArrayLists 
//#### Practice #1
//  import java.util.*;
    class Solution50 {
        public static void main(String[] args) {
            List<String> crewJobs = new ArrayList<>();
            crewJobs.add("Navigator"); // Adding a crew job
            crewJobs.add("Scientist"); // Adding another crew job
    
            // Access and print the job of the first crew member
            System.out.println("First job in the crew: " + crewJobs.get(0));
    
            // Finding out and printing the number of jobs
            System.out.println("Total jobs in the crew: " + crewJobs.size());
        }
    }
//#### Practice #2: Currently, the log updates the temperature for the first day. Can you modify the code to update the temperature for the second day instead? Remember, positions in the ArrayList start from 0.
//  import java.util.*;
    class Solution51 {
        public static void main(String[] args) {
            List<Float> temperatures = new ArrayList<>();
            temperatures.add(18.5f);
            temperatures.add(17.3f);
            temperatures.add(19.0f);
    
            // TODO: Increase yesterday's temperature by 1.1 degrees
            float newTemp = temperatures.get(1) + 1.1f;
            temperatures.set(1, newTemp);
    
            System.out.println("New temperatures: " + temperatures);
        }
    }
//#### Practice #3: correct the starship's crew list compiler. Currently, it exhibits strange behavior when updating a crew member's role. Use your knowledge of handling crew rosters to identify and fix the issue.
//  import java.util.*;
    class Solution52 {
        public static void main(String[] args) {
            List<String> starshipCrew = new ArrayList<>();
            starshipCrew.add("Captain Kirk");
            starshipCrew.add("Spock");
            starshipCrew.add("Dr. McCoy");
    
            // TODO: Replace 'Spock' with 'Scotty'
            // needed to replace "Spock" with 1
            starshipCrew.set(1, "Scotty");
    
            System.out.println("Welcome aboard the Starship, our crew members are: " + starshipCrew);
        }
    }
//#### Practice #4: Add the missing crew roles that are crucial for any space mission to the list, then remove the role of the navigation expert, as their assignment has changed. Display the updated list of roles.
//  import java.util.ArrayList;
//  import java.util.List;
    class Solution53 {
        public static void main(String[] args) {
            // Define a new ArrayList to manage crew roles
            List<String> crewRoles = new ArrayList<>();
            
            // TODO: Add the role of the leader of a space mission ("Commander").
            // TODO: Add the role required for navigating and steering the spacecraft ("Navigator").
            crewRoles.add("Commander");
            crewRoles.add("Navigator");
            crewRoles.add("Scientist");
            
            // TODO: Remove the role of the navigation expert ("Navigator") using its index position.
            crewRoles.remove(1);
            // Print the new list of crew roles
            System.out.println(crewRoles); // Finish the code to see the output
        }
    }
//#### Practice #5: Your mission is to create a starship crew list. To do this, you'll need to write code from scratch that adds crew members to an ArrayList and greet the captain. Don't forget to count your crew!
    class Solution54 {
        public static void main(String[] args) {
            // TODO: Create a new ArrayList to hold the starship crew members.
            List<String> crewMembers= new ArrayList<>();
            // TODO: Add the name of the captain to the crew list.
            crewMembers.add("Captain Kirk");
            // TODO: Add the name of an engineer to the crew list.
            crewMembers.add("Howard Wolowitz");
            // TODO: Greet the captain using their position in the list.
            System.out.println("Welcome aboard " + crewMembers.get(0));
            // TODO: Display the total number of crew members aboard the starship.
            System.out.println(crewMembers.size());
        }
    }

//LESSON 4: Navigating through Java's HashMaps: Keys to Efficient Data Storage
//#### Practice #1
//  import java.util.HashMap;
    class Solution55 {
        public static void main(String[] args) {
            HashMap<String, String> spaceshipRoles = new HashMap<>();
            spaceshipRoles.put("Zoe", "Pilot");
            spaceshipRoles.put("Jayne", "Mercenary");
            spaceshipRoles.put("Kaylee", "Mechanic");
            System.out.println("Kaylee's role: " + spaceshipRoles.get("Kaylee"));
            System.out.println("Do we have a Doctor? " + spaceshipRoles.containsKey("Doctor"));
        }
    }
//#### Practice #2: Update the code to handle a non-existent crew member. Please change the code to retrieve the role of "Pilot", returning "Unknown role" in case this role doesn't exist in our roles' HashMap.. Notice that roles like "Biologist", "Geologist", and "Astronomer" are now the keys, and the crew members' names like "Zara", "Li", and "Omar" are the values.
//  import java.util.HashMap;
    class Solution56 {
        public static void main(String[] args) {
            HashMap<String, String> crewRoles = new HashMap<>();
            crewRoles.put("Biologist", "Zara");
            crewRoles.put("Geologist", "Li");
            crewRoles.put("Astronomer", "Omar");
    
            // TODO: Use getOrDefault to retrieve the name for the role "Pilot" 
            // and output "Unknown role" if it doesn't exist.
            System.out.println("The Pilot is " + crewRoles.getOrDefault("Pilot", "Unknown role") + ".");
        }
    }
//#### Practice #3: Our crew management system has encountered a bug resulting from a misunderstanding of how Java's HashMap handles non-existent values. Can you correct the code to ensure that we correctly process the "Xenobiologist" role?
//  import java.util.HashMap;
    class Solution57 {
        public static void main(String[] args) {
            HashMap<String, String> crewRoles = new HashMap<>();
            
            crewRoles.put("Biologist", "Dr. Xenon");
            crewRoles.put("Astrophysicist", "Dr. Comet");
            
            // Incorrect handling of null values from the HashMap Get method
            // needed to add crewRoles.getOrDefault( and add , "Sorry, unknown role")
            System.out.println("Xenobiologist's name: " + crewRoles.getOrDefault("Xenobiologist", "Sorry, unknown role")); // Causes NullPointerException
        }
    }
//#### Practice #4: We've mustered an inventory list for our spaceship's supplies, but it seems we've forgotten to add some items. Could you initialize our supplies HashMap and add a couple of key-value pairs according to the scenario?
//  import java.util.HashMap;
    class Solution58 {
        public static void main(String[] args) {
            // TODO: Initialize a HashMap `foodSupplies` to keep an inventory of spaceship food supplies
            HashMap <String, Integer> foodSupplies = new HashMap<>();
            // TODO: Add two items with their quantity to the inventory
            foodSupplies.put("soup", 20);
            foodSupplies.put("casserole", 1);
            // Printing the current inventory of food supplies
            System.out.println("Food Supplies Inventory: " + foodSupplies);
        }
    }
//#### Practice #5: Create a HashMap to track the roles and ages of your crew members, and display a specific member's age (if the key doesn't exist, return the age of 0 instead).
//  import java.util.HashMap;
    class Solution59 {
        public static void main(String[] args) {
            // TODO: Initialize a HashMap to keep track of the crew members' roles and ages.
            HashMap <String, Integer> crewRoles = new HashMap<>();
            // TODO: Add a few crew members to the HashMap with their roles as keys and ages as values.
            crewRoles.put("Biologist", 21);
            crewRoles.put("Astrophysicist", 22);
            // TODO: Print the overall size of the mission crew
            System.out.println(crewRoles.size());
            // TODO: Retrieve and display the age of the Biochemist.
            System.out.println(crewRoles.getOrDefault("Biochemist", 0));
            // If there is no Biochemist, return the age of 0
        }
    }

//LESSON 5: HashSet in Java
//#### Practice #1
//  import java.util.HashSet;
    class Solution60 {
        public static void main(String[] args) {
            HashSet<String> planets = new HashSet<>();
            planets.add("Earth");
            planets.add("Mars");
            planets.add("Venus");
            planets.add("Venus");
            System.out.println("Number of unique planets: " + planets.size());
            System.out.println("Unique planets: " + planets);
            System.out.println(planets.contains("Earth"));
        }
    }
//#### Practice #2: Remove an element from a collection. Specifically, we have a set of celestial bodies, and we realize we don't need the "Asteroid Belt" in our collection. Your job is to modify the starter code to remove the "Asteroid Belt" before we print out the celestial bodies.
//  import java.util.HashSet;
    class Solution61 {
        public static void main(String[] args) {
            HashSet<String> celestialBodies = new HashSet<>();
            celestialBodies.add("Planet");
            celestialBodies.add("Dwarf Planet");
            celestialBodies.add("Moon");
            celestialBodies.add("Asteroid Belt");
    
            // TODO: Remove the "Asteroid Belt" from the HashSet
            celestialBodies.remove("Asteroid Belt");
            System.out.println(celestialBodies);
        }
    }
//#### Practice #3: Can you figure out how to check for the presence of "Mars" in our planetary exploration set? Remember the offerings of HashSet and fill in the blank.
    class Solution62 {
        public static void main(String[] args) {
            java.util.HashSet<String> planets = new java.util.HashSet<>();
            planets.add("Earth");
            planets.add("Mars");
            planets.add("Venus");
            
            // TODO: Check if "Mars" is part of the HashSet and, if so,
            // then print out a message about it to the console
            System.out.println("Is Mars present in the set? " + planets.contains("Mars"));
        }
    }
//#### Practice #4: Your task is to track the celestial objects we've observed. Are you ready to update our log? I've started the log for you, but you'll need to add a unique space object to our HashSet.
//  import java.util.HashSet;
    class Solution63 {
        public static void main(String[] args) {
            HashSet<String> spaceObservations = new HashSet<>();
            spaceObservations.add("Planet");
            spaceObservations.add("Black Hole");
            spaceObservations.add("Galaxy");
            // TODO: Add another unique space object to our HashSet that is not already present
            spaceObservations.add("Asteroid");
            // TODO: Print whether our HashSet contains the `"Galaxy"` element, using built-in operations
            System.out.println(spaceObservations.contains("Galaxy"));
            // TODO: Print the size of our HashSet
            System.out.println(spaceObservations.size());
        }
    }
//#### Practice #5: Create a catalog of unique space objects — but be careful. Space does not appreciate repetitions. Write the code to manage your set of celestial discoveries.
//  import java.util.HashSet;
    class Solution64 {
        public static void main(String[] args) {
            // TODO: Create a HashSet to store unique space objects - Black Hole, Nebula, and Quasar
            HashSet<String> spaceObjects = new HashSet<>();
            spaceObjects.add("Black Hole");
            spaceObjects.add("Nebula");
            spaceObjects.add("Quasar");
            // TODO: There's been a mistake! Remove an incorrectly added Nebula space object from the set.
            spaceObjects.remove("Nebula");
            // TODO: Display whether the removed object is still in the set (it should not be)
            System.out.println("Is Nebula still present in the set? " + spaceObjects.contains("Nebula"));
            // TODO: Print out the total count of unique space objects in your catalog
            System.out.println(spaceObjects.size());
        }
    }


//Course 1.3: Iterations and Loops in Java
//LESSON 1: For Loops and Beyond
//#### Practice #1  
    class Solution65 {
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
//#### Practice #2: Instead of using the enhanced for loop, switch to a basic for loop and list the planets with their ordinal numbers (1, 2, ..., 9). 
/* original
    class Solution {
        public static void main(String[] args) {
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            for (String planet : planets) {
                System.out.println("Exploring planet: " + planet);
            }
        }
    }
*/
    class Solution66 {
        public static void main(String[] args) {
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            for (int i = 0; i < planets.length; i++) {
                System.out.println(i+1 + " - Exploring planet: " + planets[i]);
            }
        }
    }
//#### Practice #3: Investigate the following code and correct the spaceship's course so we can visit every planet in our array.  
    class Solution67 {
        public static void main(String[] args) {
            int[] distancesFromSun = {1, 2, 3, 4, 5, 6, 7, 8};
            //needed to change i-- to i++
            for (int i = 0; i < distancesFromSun.length; i++) {
                System.out.println(distancesFromSun[i]);
            }
        }
    }
//#### Practice #4: We're going to practice using the enhanced for loop. Let's explore the solar system, one loop at a time.
    class Solution68 {
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
//#### Practice #5: Write code that visits each planet in our solar system, but now in reversed order.
    class Solution69 {
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

//LESSON 2: Java Space Loops: Mastering While and Do-While
//Practice #1
    class Solution70 {
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
//#### Practice #2: Change the starter code so the loop starts at mission day 1 and increases to day 5. This alteration will require updating the loop condition and the mission day progression within the while loop construct.
    class Solution71 {
        public static void main(String[] args) {
            // Initialize missionDay with day 5 of our space exploration
            int missionDay = 1;
            while (missionDay <= 5) { // Loop from mission day 5 to day 1
                System.out.println("Spacecraft is orbiting on Day " + missionDay);
                missionDay++; // Move to the previous mission day
            }
        }
    }
//#### Practice #3: Can you spot the malfunction and correct the code?
    class Solution72 {
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
//#### Practice #4: Add the code necessary to initiate the liftoff countdown and execute an orbit maneuver. Remember what ensures that the loop does not run indefinitely and how to guarantee at least one successful orbit completion.
    class Solution73 {
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
//#### Practice #5: Write a program from scratch that simulates the collection of stars in space until you have 5? Your ship's dashboard will display the number of stars you have collected after each loop!
    class Solution74 {
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

//LESSON 3: Navigating Conditional Asteroids: Java Loops and Decisions
//#### Practice #1: Run the code.
    class Solution75 {
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
//#### Practice #2: Convert the for loop in the starter code to a while loop to practice controlling your program's flow with a different type of loop. Ensure you maintain the same logic when scanning rock samples suitable for analysis.
    class Solution76 {
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
//#### Practice #3: The probe should increase its thruster burn every third day. Can you find the miscalculation in the days and fix it so that the probe can complete its 30-day journey correctly?
    class Solution77 {
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
                //this needed to be on the outside oof the conditional statement, was inside else block
                day++;
            }
        }
    }
//#### Practice #4: In the main code, find the spot to determine if it's a good day for a spacewalk. Remember, acceptable conditions range between 18 and 22 degrees. Your task awaits!
    class Solution78 {
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
//#### Practice #5: Write a Java program that loops through days, checks the temperature, and prints whether it's suitable for exploration.
    class Solution79 {
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

//LESSON 4: Understanding Nested Loops
//#### Practice #1
    class Solution80 {
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
//#### Practice #2: Transform the loop that prints our meal tasks from a for-in-collection loop into a while loop (while (condition) { ... }). Remember to keep the number of tasks constant and to maintain the same output format.
    class Solution81 {
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
//#### Practice #3: We've accidentally mixed up something in our code. They're not displaying in the order we planned. Identify the issue in our meal planning code and fix it.
    class Solution82 {
        public static void main(String[] args) {
            String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            String[] mealsOfTheDay = {"Breakfast", "Lunch", "Dinner"};
    
            // Outer loop for days of the week
            for (int i = 0; i < daysOfWeek.length; i++) {
                // Inner loop for each meal of the day
                for (int j = 0; j < mealsOfTheDay.length; j++) {
                    //needed to switch [i] and [j]
                    System.out.println("Day: " + daysOfWeek[i] + ", Meal: " + mealsOfTheDay[j]);
                }
            }
        }
    }
//#### Practice #4: A piece of code has mysteriously vanished. I need your help to add code that will print tasks for each meal of the day. Can you code the missing part where we loop through the tasks and output them?
    class Solution83 {
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
//#### Practice #5: Create a Java program that prints out the tasks needed to plan and prepare each meal of the day, utilizing nested loops to accomplish the task.
    class Solution84 {
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

//LESSON 5: Navigating Loop Control: Mastering Break and Continue in Java
//#### Practice #1
    class Solution85 {
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
//#### Practice #2
    class Solution86 {
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
//#### Practice #3: Please change the code so that it skips not just ride number 7, but also ride number 8. Use what you've learned about the continue statement and logical operators to make this happen.
    class Solution87 {
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
//#### Practice #4: On your amusement park adventure, make sure to skip the closed rides and decide when to take a break. Write the code to accomplish this!
    class Solution88 {
        public static void main(String[] args) {
            // Amusement Park Rides Carousel
            int totalRides = 10;
            int ride = 1;
            while (ride <= totalRides) {
                // TODO: Skip the closed ride #4
                if (ride == 4) {
                    ride++;
                    continue;
                }
    
                // TODO: Take a break and exit the carousel ride loop after ride #7
                if (ride > 7) {
                    break;
                }
                System.out.println("Enjoying ride number: " + ride);
                ride++;
      
            }
        }
    }
//#### Practice #5: Complete a loop condition and a statement inside a nested loop on your own?
    class Solution89 {
        public static void main(String[] args) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) {
                    // TODO: Add a condition and control statement to skip the rest of the loop when 'j' is equal to 'i'.
                    if (j == i) {
                        break;
                    }
                    System.out.print(i + "" + j + " ");
                }
                System.out.println(); // Move to next line
            }
        }
    }
//#### Practice #6: Write a program for controlling amusement park rides! Remember to skip a certain ride that's under maintenance and close the park after reaching a specific ride number.
    class Solution90 {
        public static void main(String[] args) {
            // TODO: Create a loop for the amusement park rides from 1 to 10
            int totalRides = 10;
            int ride = 1;
            for (ride = 1; ride < totalRides; ride++) {
                if (ride == 6) {
                    continue;
                }
                if (ride == 9) {
                    break;
                }
                System.out.println( "Enjoying ride number: " + ride);
            }
            // TODO: Skip ride #6, it's under maintenance right now
            // TODO: End your trip early when reaching ride #9
            // TODO: Print out the ride numbers that visitors enjoy on the way
        }
    }


//Course 1.4: Mastering Debugging with Java
//LESSON 1: Decoding Java Space Signals: Understanding Error Messages
//#### Practice #1: Review it carefully, identify the error, and fix it. Check the console for clues!
/*Original
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

Fixed */
    class Solution91 {
        public static void main(String[] args) {
            String message = "We have " + (2 + 2) + " rovers exploring Mars!";
            System.out.println(message);
        }
    }
//#### Practice #2: Can you find and fix the problem so we can continue stargazing?
/*Original

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

Fixed*/

    class Solution92 {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000000;
            System.out.println("There are " + starsInGalaxy + " stars in the Milky Way Galaxy.");
        }
    }
//#### Practice #3: There's a bug when we attempt to access one of the compartments. Could you help us identify and fix the issue so that we can inspect the contents safely?
/* Original

    class Solution {
        public static void main(String[] args) {
            int[] storageCompartment = {5, 10, 15};
            System.out.println(storageCompartment[3]); // Access the last element of the array
        }
    }

Error

    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at Solution.main(solution.java:4)

Fixed*/
    class Solution93 {
        public static void main(String[] args) {
            int[] storageCompartment = {5, 10, 15};
            System.out.println(storageCompartment[2]); // Access the last element of the array
        }
    }

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
    
    class Solution94 {
        public static void main(String[] args) {
            int value = 3;
            String spaceMessage = value == 3 ? null : "Hey, this is a message from Space!";
            System.out.println(spaceMessage);
        }
    }
     

//LESSON 2: Java's Puzzling Punctuation
//#### Practice #1: Help us debug the code so we can receive status updates from mission control once again. Run the code, check the output, and see if you can spot and fix the mistake.
/*Original

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

Fixed*/
    
    class Solution95 {
        public static void main(String[] args) {
            int missionControl = 3;
            System.out.println("Virtual space mission control center status: " + missionControl);
        }
    }

//#### Practice #2: Identify the correct number of syntax errors to fix in our code module. But Houston, we have a problem! The code is ready to compile, but it appears we've omitted some vital code symbols somewhere within the module. Run diagnostics and correct the issue, ensuring every sequence is complete and our program launches successfully into the Java Galaxy!
/*Original

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

Fixed*/

    class Solution96 {
        public static void main(String[] args) {
            int numOfErrors = 3;
            System.out.println("Number of syntax errors to fix: " + numOfErrors);
        }
    }

//#### Practice #3: Check the code and ensure all stars are logged. Something small is amiss. Can you spot and fix it?
/*Original

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

Fixed*/

    class Solution97 {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000;
            System.out.println(starsInGalaxy);
        }
    }

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

    class Solution98 {
        public static void main(String[] args) {
            int starsInGalaxy = 1000000; // Counting stars
            System.out.println(starsInGalaxy);
        }
    }


//LESSON 3: Java Logical Errors
//#### Practice #1: We have a small snippet that calculates and displays the total number of cookies available. There's a bug causing it to show an incorrect amount. Can you find and fix it?
/*Original

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

Fixed*/

    class Solution99 {
        public static void main(String[] args) {
            int cookiesInStorage = 10; // the number of cookies in the storage
            int cookiesBakedToday = 3;
            int cookiesTotal = cookiesInStorage + cookiesBakedToday;
            System.out.println("Total cookies we have: " + cookiesTotal);
        }
    }

//#### Practice #2:  calculates the total number of space objects in the solar system, given the count of planets and moons. Run the code, identify the bug that causes an incorrect result, and fix it.
/*Original

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

Fixed */

    class Solution100 {
        public static void main(String[] args) {
            int numberOfPlanets = 8;
            int numberOfMoons = 182;
            
            // There is an issue with the following line
            int totalSpaceObjects = numberOfPlanets + numberOfMoons; // This should calculate total space objects
            
            System.out.println("Total space objects in the solar system: " + totalSpaceObjects);
        }
    }

//#### Practice #3: Calculate the average distance of these 3 planets from the sun. Run the given code and see if it displays the correct average. There might be a small bug preventing the accurate calculation!
/*Original

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

Fixed*/

    class Solution101 {
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

    class Solution102 {
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

//LESSON 4: Navigating Through Try, Catch, and Finally Blocks
//#### Practice #1
    class Solution103 {
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
//#### Practice #2: Now, adjust your code so that navigating to the last star won't throw an exception. This small change will demonstrate that the finally block executes regardless of what occurs.
/*Original

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

Fixed*/

    class Solution104 {
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

//#### Practice #3: Add a catch block to handle an exception if our array access goes out of bounds, ensuring smooth space travel.
    class Solution105 {
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

//#### Practice #4: Create a Java program that anticipates and handles out-of-bounds issues when accessing array elements. Remember to use a try-catch block to manage the exception and add a finally block that always executes.
    class Solution106 {
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


//Course 1.5: Java String Manipulation for Beginners
//LESSON 1: Java String Operations: Concatenation, Comparison, and Essential Methods
//#### Practice #1
    class Solution {
        public static void main(String[] args) {
            String bookTitle = "The Adventures of Cosmo";
            String author = "Coder Kid";
            String librarySection = "Children's Books";
            
            String catalogEntry = bookTitle + " by " + author + " - " + librarySection;
            System.out.println(catalogEntry);
        }
    }

//#### Practice #2
    class Solution {
        public static void main(String[] args) {
            String bookTitle1 = "The Cosmic Code";
            String bookTitle2 = "Quantum Cosmos";
    
            System.out.println("Book titles are: \"" + bookTitle1 + "\" and \"" + bookTitle2 + "\"");
            System.out.println("Titles are the same? " + bookTitle1.equals(bookTitle2));
            System.out.println("Alphabetical comparison result: " + bookTitle1.compareTo(bookTitle2));
        }
    }

//#### Practice #3: Modify the given code to print not the raw compareTo result but a textual human-readable explanation instead. Remember - when the compareTo result is 0 - strings are equal, when it is negative - the first string is alphabetically smaller, and when it is positive - the first string is alphabetically larger. 
    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String anotherTitle = "Astronomy for Dummies";
            int titleComparison = bookTitle.compareTo(anotherTitle);
    
            // Output the comparison result
            if (titleComparison == 0) {
                System.out.println("book titles are equal alphabetically!");
            }
            else if (titleComparison < 0)
            {
                System.out.println(bookTitle + " is less than " + anotherTitle + " alphabetically");
            }
            else  {
                System.out.println(bookTitle + " is more than "+ anotherTitle + " alphabetically");
            }
            // TODO: Change the output to print explanation like "'<Title 1>' comes before '<Title 2>' alphabetically" instead
        }
    }

#### Practice #4
Run the code and use what you've learned to fix it.

    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String modifiedTitle = bookTitle.toUpperCase().substring(0, 6) + " Adventures";
            String anotherBookTitle = "COSMOS Java";
            
            System.out.println(anotherBookTitle);       
            System.out.println(modifiedTitle);
            if (modifiedTitle == anotherBookTitle) {
                System.out.println("Both titles are the same.");
            } else {
                System.out.println("Titles are different.");
            }
        }
    }
    
    COSMOS Java
    COSMIC Adventures
    Titles are different.
    
    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String modifiedTitle = bookTitle.toUpperCase().substring(0, 6) + " Adventures";
            String anotherBookTitle = "COSMOS Java";
            
            System.out.println(anotherBookTitle);       
            System.out.println(modifiedTitle);
            if (modifiedTitle.equals(anotherBookTitle)) {
                System.out.println("Both titles are the same.");
            } else {
                System.out.println("Titles are different.");
            }
        }
    }

###### feedback: says not working as intended, but is working perfectly, just not technically corrrect in method of comparing strings. Should have used methods and not standard comparison operators. Output is exactly the same⚠️.

#### Practice #5
Let's try cataloging a book by completing the code to give it an entry and display it correctly.

    class Solution {
        public static void main(String[] args) {
            String author = "J.K. Rowling";
            String title = "Harry Potter";
            // TODO: Concatenate title and author in uppercase using + operator and store it in catalogEntry.
            String catalogEntry = title.toUpperCase() + " BY " + author.toUpperCase();
            // TODO: Print out the catalog display, replacing the last word "ROWLING" with "R...".
            System.out.println(catalogEntry.substring(0, 20) + "R...");
            // The output should be: HARRY POTTER BY J.K. R...
        }
    }
#### Practice #6
Create a catalog entry for your favorite book in the library system. Remember to concatenate the title, the word 'by', and the author's name. Then, convert the entry to uppercase and calculate its length. Display the final catalog entry with its character count!

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a string variable for the book title and initialize it with your favorite book's title.
            String title = "Divergent";
            // TODO: Declare a string variable for the book author's name.
            String author = "Veronica Roth";
            // TODO: Concatenate the book title, the word 'by', and the author's name into one string.
            // For example: Cosmic Java by Raj Comet
            String catalogEntry = title + " by " + author;
            // TODO: Convert the entire string to uppercase - this way we obtain the catalog entry name
            String catalogEntryU = catalogEntry.toUpperCase();
            // TODO: Calculate the length of the entire string.
            int catalogEntryL = catalogEntryU.length();
            // TODO: Print out the catalog entry in uppercase and its character length.
            System.out.println(catalogEntryU + " " + catalogEntryL);
        }
    }

//LESSON 2: String Formatting in Java: Enhancing Readability of Your Data
#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Create a formatted String for a students grade report.
            String studentName = "Alice";
            int mathsGrade = 85;
            int scienceGrade = 90;
            int artGrade = 75;
    
            // Format and print the report card for the student
            String reportCard = String.format("| %-14s | %-3d | %-3d | %-3d |", 
                                              studentName, mathsGrade, scienceGrade, artGrade);
            System.out.println("| Name           | Mth | Sci | Art |");
            System.out.println("----------------------------------");
            System.out.println(reportCard);
        }
    }


#### Practice #2
Adjust the formatting of the report card in the code to widen the scores column. Change the field width from 8 to 7 for the scores in math, science, and history subjects.

    class Solution {
        public static void main(String[] args) {
            String studentName = "Lucy";
            int mathScore = 88;
            int scienceScore = 91;
            int historyScore = 76;
    
            // Using `printf` to format and print the report card directly to the console
            System.out.printf("| %-10s | %-7s | %-7s | %-7s |\n", "Name", "Math", "Science", "History");
            System.out.printf("| %-10s | %-7d | %-7d | %-7d |\n", studentName, mathScore, scienceScore, historyScore);
        }
    }


#### Practice #3
The provided code contains a small mistake — can you identify and correct it so that the report prints without any errors?

	class Solution {
	    public static void main(String[] args) {
	        String studentName = "Alex";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 75;
	        
	        String reportCard = String.format("Student: %d | Math: %d | Science: %d | Art: %d",
	                                          studentName, mathGrade, scienceGrade, artGrade);
	
	        System.out.println(reportCard);
	    }
	}
	
	Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.String
		at java.base/java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4710)
		at java.base/java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:3248)
		at java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:3203)
		at java.base/java.util.Formatter.format(Formatter.java:2801)
		at java.base/java.util.Formatter.format(Formatter.java:2738)
		at java.base/java.lang.String.format(String.java:4481)
		at Solution.main(solution.java:8)
	
	class Solution {
	    public static void main(String[] args) {
	        String studentName = "Alex";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 75;
	        
	        String reportCard = String.format("Student: %s | Math: %d | Science: %d | Art: %d",
	                                          studentName, mathGrade, scienceGrade, artGrade);
	
	        System.out.println(reportCard);
	    }
	}
	 

#### Practice #4
Create a nicely formatted report card header with left alignment and a record line with right alignment.

	class Solution {
	    public static void main(String[] args) {
	        // Academic report card formatted display for a student
	        String studentName = "Leo";
	        String subject1 = "History"; // TODO: Align this subject to the left with a width of 9
	        System.out.printf("Subject 1: %-9s ", subject1);
	        String subject2 = "Math";
	        String subject3 = "Science";
	        int grade1 = 87;
	        int grade2 = 75; // TODO: Format this grade to align to the right, adding spaces to the left to a width of 7
	        System.out.printf("Grade 2: %7s ", grade2);
	        int grade3 = 92;
	        
	        // Use of String formatting to align text and numbers neatly
	        System.out.printf("| %-9s | %-7s | %-7s | %-7s |\n", "Student", subject1, subject2, subject3);
	        System.out.printf("| %-9s | %-7s | %7d | %7d |\n", studentName, grade1, grade2, grade3);
	        
	    }
	}

###### feedback: there was an error coming from the provided code (last line System.out.printf() - and the _____ had to be replaced with text alignment. Not sure if this was deliberate. Also, did not turn out 'neat', was quite unhinged actually⚠️.


#### Practice #5
Craft a neatly formatted report for a student's grades using the formatting skills you've just learned. Your output should line up the student’s name and grades in their respective columns.

	class Solution {
	    public static void main(String[] args) {
	        // Grading and report card formatting for a student
	        String studentName = "Lucy";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 87;
	        System.out.println("| Name      | Math  | Science   | Art  |");
	        System.out.printf("| %-9s | %-5d | %-9d | %-5d|", studentName, mathGrade, scienceGrade, artGrade);
	        // TODO: Use String formatting to align the name and grades in a single line for a report card
	        // Outputs should look like this: | Name       | Math  | Science | Art    |
	    }
	}

	| Name      | Math  | Science   | Art  |
	| Lucy      | 85    | 90        | 87   |


//LESSON 3: Mastering Special Character Sequences
#### Practice #1
Run the code.

	class Solution {
	    public static void main(String[] args) {
	        // Below String represents a simple formatted text editing
	        // that might be seen in a document editor.
	        // It uses the newline and tab special character sequences.
	        System.out.println("Title:\tJava String Manipulation\n\nContent:\n\tJava strings are powerful.\n\tThey can contain \"special characters\" like newline (\\n) and tab (\\t).");
	    }
	}

#### Practice #2
Your task is to include quotes around the provided proverb and the author's name in the code below. Ensure you use escape sequences correctly. Include quotes before the word The, and after step.

	class Solution {
	    public static void main(String[] args) {
	        // Printing a proverb with a newline for formatting
	        System.out.println("\"The journey of a thousand miles begins with a single step.\"\n- Author");
	    }
	}

#### Practice #3
Can you spot the bug and fix it? The code is intended to display the title and proverb on separate lines and include specific special characters.

	class Solution {
	    public static void main(String[] args) {
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	    }
	}
	
	solution.java:3: error: ')' or ',' expected
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                             ^
	solution.java:3: error: ';' expected
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                       ^
	solution.java:3: error: illegal escape character
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                                                                                   ^
	solution.java:3: error: not a statement
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                        ^
	4 errors
	
	class Solution {
	    public static void main(String[] args) {
	        System.out.println("Document Title: \"The Cosmic Code\"\nFamous Proverb: To the stars, through difficulties \\ through learning Java.");
	    }
	}

#### Practice #4
Create a message titled "Java String Manipulation Guide" with a properly formatted document title, newline, and tabbed date using special character sequences.

	class Solution {
	    public static void main(String[] args) {
	      // TODO: Add a line of code that prints a formatted document title with a special sequence for a newline and then a tabbed date
	      // Output example:
	      //
	      // Document Title: "Java String Manipulation Guide"
	      //     Date: 2023-04-01
	      System.out.println("Document Title: \"Java String Manipulation Guide\"\n\t Date: 2023-04-01");
	    }
	}

#### Practice #5
You need to format a document title and sections using special character sequences, such as newlines (\n) and tabs (\t), to make them look organized. Remember what you've learned about \n and \t. It's all up to you to write the code from scratch!

	class Solution {
	    public static void main(String[] args) {
	        // TODO: Display the document title, followed by sections with appropriate tabulations and a conclusion, all separated by newlines.
	        System.out.println("Title: Java String Manipulations \n\t - Introduction \n\t - Special Characters \n\t - Practice Exercises \n Conclusion: Mastery of Java strings!");
	        // Here is an example of the output:
	        // Title: Java String Manipulations
	        //     - Introduction
	        //     - Special Characters
	        //     - Practice Exercises
	        // Conclusion: Mastery of Java strings!        
	    }
	}

//LESSON 4: Search and Replace in Java
#### Practice #1
Run the code.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "I love coding. Coding is fun!";
	        String filteredMessage = chatMessage.replace("Coding", "Java");
	        
	        System.out.println(filteredMessage); // Output: "I love coding. Java is fun!"
	    }
	}

#### Practice #2
Modify the code to replace another phrase in the message. This time, change the word "refrain" to "avoid" using the replace() method.

	class Solution {
	    public static void main(String[] args) {
	        // A message in an online chat room:
	        String message = "Java is fun, but please refrain from using bad words.";
	
	        // Moderating the chat by finding and replacing inappropriate language:
	        String moderatedMessage = message.replace("bad words", "****");
	        // Do one more change to replace "refrain" with "avoid"
	        String moderatedMessage2 = moderatedMessage.replace("refrain", "avoid");
	        // Display the moderated message:
	        System.out.println(moderatedMessage2);
	    }
	}

#### Practice #3
You may have noticed that some chat messages with smiles aren't displaying correctly on the screen. Can you identify and rectify the issue in this code snippet? Ensure all smiles are moderated correctly.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "I love coding with CodeSignal!! :-) Coding is fun :-)";
	        
	        String moderatedMessage = chatMessage.replace(":-)", "[smiley]");
	
	        System.out.println(moderatedMessage);
	    }
	}

#### Practice #4
Your task is to check whether a message contains a specific word in any letter case and then replace it with the correct case. Fill in the blanks to complete this operation.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "Java is cool! But sometimes, java can be challenging.";
	
	        // TODO: Add a condition to check if 'chatMessage' contains the word "java"
	        System.out.println(chatMessage.contains("java"));
	        // TODO: If it does contain, add a line to replace all occurrences of this word "java" with "Java"
	        System.out.println(chatMessage.replace("java", "Java"));
	        // Should replace and output: "Java is cool! But sometimes, Java can be challenging."
	    }
	}

#### Practice #5
Now, put your knowledge to the test by writing a program that filters a forbidden word from a chat message, replacing it with asterisks.

	class Solution {
	    public static void main(String[] args) {
	        String message = "The quick brown fox jumps over the lazy dog.";
	        String forbiddenWord = "lazy";
	        // TODO: Check if the message contains the forbidden word.
	        System.out.println(message.contains(forbiddenWord));
	        // TODO: If it does, replace the forbidden word with "****".
	        System.out.println(message.replace(forbiddenWord, "****"));
	        // TODO: Print the censored message.
	    }
	}


//LESSON 5: Splitting and Joining in Java for Text Wizards
#### Practice #1
Run the code.

	class Solution {
	    public static void main(String[] args) {
	        // Quote by Frank Zappa about books needing formatting
	        String quote = "So many books, so little time.";
	        
	        // Split the quote into words using space as the delimiter
	        String[] words = quote.split(" ");
	        
	        // Join the words into a sentence
	        String joinedQuote = String.join(" ", words);
	        
	        // Remove the comma from the joined sentence        
	        String formattedQuote = joinedQuote.replace(",", ""); 
	        
	        // Print the formatted quote
	        System.out.println(formattedQuote); // prints "So many books so little time."
	    }
	}

#### Practice #2
Adjust the formatting of the quote in the provided starter code by changing the delimiter in the join() method. Replace the dash (" - ") with a comma followed by a space (", "), which is more conventional for lists in sentences. Apply your new knowledge of string joining to polish the quote.

	class Solution {
	    public static void main(String[] args) {
	        // Quote by Frank Zappa about books needing formatting
	        String quote = "So many books, so little time.";
	        
	        // Split the quote into words using space as the delimiter
	        String[] words = quote.split(" ");
	        
	        // Join the words using a dash to emphasize pause for an editorial effect
	        String reformattedQuote = String.join(", ", words);
	        
	        // Print the reformatted quote
	        System.out.println(reformattedQuote); // prints "So - many - books, - so - little - time."
	    }
	}

###### feedback: gramatically incorrect output⚠️

#### Practice #3
Here's a piece of code that's supposed to rearrange a sentence but isn't giving us the output we’d expect. Can you spot what might be wrong and fix it? Remember, you can execute the code to see how it behaves!

	class Solution {
	    public static void main(String[] args) {
	        // A list of words to form a book-related sentence
	        String[] words = {"books", "are", "the", "treasure"};
	
	        // Joining the words to form a grammatical sentence with a period at the end
	        String sentence = String.join(" ", words) + ".";
	
	        // Printing the sentence
	        System.out.println(sentence);
	        
	        // Now let's rearrange the sentence to say "treasure books are the"
	        String[] rearrangedWords = {words[3], words[0], words[1], words[2]};
	
	        // Joining the rearranged words
	        String rearrangedSentence = String.join("", rearrangedWords);
	
	        // Printing the rearranged sentence
	        System.out.println(rearrangedSentence);
	    }
	}
	
	books are the treasure.
	treasurebooksarethe
	
	class Solution {
	    public static void main(String[] args) {
	        // A list of words to form a book-related sentence
	        String[] words = {"books", "are", "the", "treasure"};
	
	        // Joining the words to form a grammatical sentence with a period at the end
	        String sentence = String.join(" ", words) + ".";
	
	        // Printing the sentence
	        System.out.println(sentence);
	        
	        // Now let's rearrange the sentence to say "treasure books are the"
	        String[] rearrangedWords = {words[3], words[0], words[1], words[2]};
	
	        // Joining the rearranged words
	        String rearrangedSentence = String.join(" ", rearrangedWords);
	
	        // Printing the rearranged sentence
	        System.out.println(rearrangedSentence);
	    }
	}

#### Practice #4
Take the provided snippet and complete the code where marked with TODO. Remember, splitting strings is crucial for text analysis!

	class Solution {
	    public static void main(String[] args) {
	        String bookQuote = "To be or not to be that is the question";
	
	        // TODO: Use the split method to divide the quote into individual words and store them in an array.
	        String [] words = bookQuote.split(" ");
	        // TODO: Replace the last word ("question") with the word "boolean"
	        String tempWord = words[9];
	        words[9] = "boolean";
	        // TODO: Use the join method to recreate the quote from the array of words.
	        String formattedQuote = String.join(" ", words);
	        System.out.println(formattedQuote); // Should print "To be or not to be that is the boolean"
	    }
	}

#### Practice #5
You're almost a master at manipulating strings, Space Voyager! Your final challenge is to extract a fragment from a famous quote. Begin by identifying the last three individual words and use what you've learned about string joining to unite them into a new snippet.

	class Solution {
	    public static void main(String[] args) {
	        String quote = "To be, or not to be: that is the question.";
	
	        // TODO: Split the quotation into an array of words
	        String [] words = quote.split(" ");
	        // TODO: Use String.join() to concatenate the last three words into a short snippet
	        String joinedWords = String.join( " ", words[7], words[8], words[9]);
	        // TODO: Now, print out the snippet of the joined three last words
	        System.out.println(joinedWords);
	    }
	}


//Course 1.6: Writing Functions using Java
//LESSON 1: Defining and Executing Java Functions and Procedures
//#### Practice #1
    class Solution {
        static void displayBakingResult(int numOfCakes) {
            System.out.println("We baked " + numOfCakes + " delicious cakes!");
        }
        static int cookCookies(int batchCount, int cookiesPerBatch) {
            return batchCount * cookiesPerBatch;
        }
        public static void main(String[] args) {
            displayBakingResult(3);
            int totalCookies = cookCookies(5, 10);
            System.out.println("We cooked " + totalCookies + " yummy cookies!");
        }
    }
//####  Practice #2: Instead of finding out the total number of cakes from two batches, let's calculate the average number of cakes per batch. Please adjust the addBatches function and the print statement in the main method accordingly. Note: the average is the total number of cakes divided by 2.
    class Solution {
      static int addBatches(int batch1, int batch2) {
        return (batch1 + batch2) / 2;
      }
      public static void main(String[] args) {
        int totalCakes = addBatches(10, 20); // Represents the total number of cakes from two batches
        System.out.println("The average number of cakes is: " + totalCakes);
      }
    }
//####  Practice #3: Modify the bakeCake function to include a parameter for the number of candles and update the message. Then, update the function call to include the new parameter.
    class Solution {
        static void bakeCake(String cakeType, int layers, int candles) {
            System.out.println("Baking a " + layers + "-layer " + cakeType + " cake with " + candles + " candles.");
        }
        public static void main(String[] args) {
          bakeCake("Chocolate", 3, 21); // It will print "Baking a 3-layer Chocolate cake."
        }
    }
//####  Practice #4: The code below, is designed to calculate and print the total number of cookies sold at a bakery. However, there's a small bug that is preventing the correct execution of the total cookie sales. Can you find and fix the error to ensure the correct number of cookies sold is printed?
    class Solution {
        static void bakeCookies(int batchCount) {
            System.out.println("Baking " + batchCount + " batches cookies!");
        }
        static int sellCookies(int batchCount, int cookiesPerBatch) {
            int cookies = batchCount * cookiesPerBatch; // Returns the total number of cookies
            //needed to add return statement
            return cookies;
        }
        public static void main(String[] args) {
            bakeCookies(3); // Assuming each batch has the same number of cookies
            int totalCookies = sellCookies(3, 10); // Selling 3 batches, 10 cookies each
            System.out.println("Total cookies sold: " + totalCookies);
        }
//####  Practice #5: Let's add the essential piece to calculate the total price of baked goods. Also, let's ensure the bakery displays the number of goods being baked.
    class Solution {
      // TODO: Define a function to calculate and return the total price of baking goods.
      // Input parameters: itemCount, pricePerItem
      public static int bakingGoods(int itemCount, int pricePerItem) {
        int totalPrice = itemCount * pricePerItem;
        return totalPrice;
      }
      public static void main(String[] args) {
        // Task to calculate the total cost of cakes
        int cakesCount = 3;
        int pricePerCake = 15;
        // TODO: Call your function here to calculate the total price for cakes, given the quantity and price per cake.
        int cakesPrice = bakingGoods(cakesCount, pricePerCake);
        System.out.println("Total price for cakes: $" + cakesPrice);
      }
    }
//####  Practice #6: Bake up your function to calculate the cost of cakes and write a procedure to display freshly baked cookies. Remember the recipe from earlier: define the right type of function with the correct ingredients and cook your code to perfection!
    class Solution {
      // TODO: Create a function to calculate the cost of 'cakes' given the 'costPerCake'
      public static int cakeCost(int totalCakes, int costPerCake) {
        int cost = totalCakes * costPerCake;
        return cost;
      }
      // TODO: Write a procedure to display the number of 'cookies' baked
      public static void bakedCookies(int cookies) {
        System.out.println("There are " + cookies + " cookies baked");
      }
      public static void main(String[] args) {
        // TODO: Call a function that calculates the cost of 3 cakes, each costing $10, and print the total cost
        // Don't forget to print the result of the function to the console
        System.out.println(cakeCost(3, 10));
        // TODO: Call a procedure displaying a message about 15 cookies that have been baked
        bakedCookies(15);
      }
    }

//LESSON 2: An Introduction to Function Overloading
//#### Practice #1
    class Solution {
        static void print() {
            System.out.println("The office is open!");
        }
        static void print(int hours) {
            System.out.println("The office is open for " + hours + " hours today.");
        }
        public static void main(String[] args) {
            print();
            print(8);
        }
    }
//#### Practice #2: The given code contains two overridden implementations of checkNumber - Modify the checkNumber function variation that takes a double value to fill in the implementation there. Let's see overriding in action!
    class Solution {
        static String checkNumber(int number) {
            if (number > 0) {
                return "Positive";
            } else if (number < 0) {
                return "Negative";
            } else {
                return "Zero";
            }
        }
        static String checkNumber(double number) {
            // This function should to the same as `checkNumber(int)`, but now for `double`
          if (number > 0) {
                return "Positive";
            } else if (number < 0) {
                return "Negative";
            } else {
                return "Zero";
            }
        }
        public static void main(String[] args) {
            System.out.println(checkNumber(10)); // Positive
            System.out.println(checkNumber(-0.5)); // Negative
            System.out.println(checkNumber(0)); // Zero
            System.out.println(checkNumber(0.0)); // Zero
            System.out.println(checkNumber(0.1)); // Positive
        }
    }
//#### Practice #3: Define an overloaded function to display the tool's name in our office environment code.
    class Solution {
        // Print with overloading for different office tool names
        static void printToolName(String toolName) {
            System.out.println("The name of the tool is: " + toolName);
        }
        // TODO: Overload the printToolName function to accept a toolName and its quantity.
        // Print how many units of the tool the office has.
        static void printToolName(String tool, int tools) {
          System.out.println("The amount of tool units is: " + tools + ", that is a " + tool);
      }
        public static void main(String[] args) {
          printToolName("Stapler");
          // The below call should print "The office has 2 units of Whiteboard"
          printToolName("Whiteboard", 2);
        }
    }
//#### Practice #4: You are tasked with creating a greeting system for our virtual office environment. Write the complete code to overload a method that welcomes employees differently, depending on whether it's just their name or both their name and the day of the week.
    class Solution {
        // TODO: Create an overloaded method to welcome an employee by name
        public static String welcome(String name){
            return "Welcome " + name + " to this job!";                
        }
        // TODO: Overload the welcome method to include a greeting that also prints the day of the week
        public static String welcome(String name, String dayOfWeek){
            return "Welcome " + name + " to this job on " + dayOfWeek + "!";                
        }
        public static void main(String[] args) {
            // TODO: Test your welcome method with just a name
            System.out.println(welcome("Tre"));
            System.out.println(welcome("Beautiful", "Monday"));
            // TODO: Test your welcome method with a name and the day of the week
        }
    }

//LESSON 3: Java's Built-In Functions
//#### Practice #1
    class Solution {
        public static void main(String[] args) {
            // Given a square's side length, calculate its area using the Math.pow function
            double sideLength = 5;
            double area = Math.pow(sideLength, 2);
    
            // Output the area of the square as a double
            String info = "The area of the square with side length " + sideLength + " is " + area + " square units.";
            System.out.println(info);
        }
    }
//#### Practice #2: Now, take the given code and transform the areaOfCircle method into the diameterOfCircle method using Java's Math.sqrt() function based on the area you have calculated. Your goal is to calculate the diameter of the circle from its area. Remember to update both the method name and the output message accordingly. Note: the diameter of the circle equals  2 * sqrt(area/π)
    class Solution {
        // A simple method to calculate the area of a circle
        static double areaOfCircle(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
    
        public static void main(String[] args) {
            // Let's assume the radius of our cosmic circle is 7.5
            double radius = 7.5;
            System.out.println("The area of a circle with radius " + radius + " is: " + areaOfCircle(radius));
        }
    }
    class Solution {
        // A simple method to calculate the area of a circle
        static double areaOfCircle(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }
    
        static double diameterOfCircle(double radius) {
            return 2 * Math.sqrt((areaOfCircle(radius) / Math.PI));
        }
        
        public static void main(String[] args) {
            // Let's assume the radius of our cosmic circle is 7.5
            double radius = 7.5;
            System.out.println("The diameter of a circle with radius " + radius + " is: " + diameterOfCircle(radius));
        }
    
    }
//#### Practice #3: Try to write a line of Java code using the Math function to find the larger of two galaxy populations and create a string that states which galaxy has the greater population.
    class Solution {
        public static void main(String[] args) {
            // The universe is vast and full of numbers. Let's explore with Java functions!
            int galaxyOnePopulation = 1000000;
            int galaxyTwoPopulation = 2000000;
            
            // TODO: Write a line of code to find which galaxy population is greater and build a message string.
            System.out.println("The galaxy with a greater population has " + Math.max(galaxyOnePopulation, galaxyTwoPopulation) + " inhabitants");/* TODO: finish this message */
            // Finding the distance to the Andromeda galaxy in light-years as a String.
            double andromedaDistance = 2.537e6; // 2.537 million light years
            String distanceText = String.valueOf(andromedaDistance);
            
            // Using String.concat to create an information string about the distance to Andromeda galaxy
            String info = "The Andromeda galaxy is " /* TODO: Use a String method to add distance and unit */ + ".";
            String information = info.concat(distanceText);
            System.out.println(information);
        }
    }
//#### Practice #4: Write a program that computes the area of a square with a given side length, identifies the greater count of galaxies observed, and calculates the square root of an area to simulate space exploration measurements.
    class Solution {
        public static void main(String[] args) {
            // TODO: Calculate the area of a square where the side length is 4.0 light-years using the appropriate Math.pow() function.
            double squareArea = Math.pow(4, 2);
            // TODO: Determine the greater number of galaxies observed between two given counts using the correct Math.max() function.
            double galaxyOne = 1000;
            double galaxyTwo = 1001;
            double galaxies = Math.max(galaxyOne, galaxyTwo);
            // TODO: Compute the side of a square given its area, using a Math.sqrt() function.
            double squareSide = Math.sqrt(squareArea);
            // TODO: Print out the calculated values with descriptive messages.
            System.out.println("The area of the square is " + squareArea + " and the value of the greater galaxy is " + galaxies + " and the side of the square is " + squareSide);
        }
    }

//LESSON 4: Chaining Functions and Juggling Multiple Return Values in Java
//#### Practice #1
//import java.util.*;
    class Solution {
        public static void main(String[] args) {
            List<Integer> diceRolls = throwTwoDice();
            System.out.println(getHighestRoll(diceRolls));  // prints the higher number of two dice rolls
        }
        static List<Integer> throwTwoDice() {
            return Arrays.asList(rollDice(), rollDice());
        }
        static int rollDice() {
            return (int) (Math.random() * 6) + 1;
        }
        static int getHighestRoll(List<Integer> rolls) {
            return Math.max(rolls.get(0), rolls.get(1));
        }
    }
//#### Practice #2: Modify the diceRoll function to return a List containing two roll values. The first roll value is already generated, your task is to generate the second one in the same way and return both values as a result. Update the function to chain these actions using Java's capabilities for handling multiple values.
/*
    import java.util.Arrays;
    import java.util.List;
*/
    class Solution {
        static List<Integer> diceRoll() {
            int roll = (int) (Math.random() * 6) + 1;  // simulates a dice roll
            int roll2 = (int) (Math.random() * 6) + 1;
            return Arrays.asList(roll, roll2);
        }
        public static void main(String[] args) {
            List <Integer> rolls = diceRoll();
            System.out.println("Dice rolls: " + rolls);
        }
    }
//#### Practice #3: Directly apply function chaining in our board game scenario. Implement the missing pieces of code to calculate and store both the average and its square in a List.
/*
    import java.util.List;
    import java.util.ArrayList;
    import java.util.Arrays;
*/    
    class Solution {
        static double average(double a, double b) {
            return (a + b) / 2.0; // calculates the average of two numbers
        }
        static double square(double a) {
            return (a * a);
        }
        static double squareOfAverage(double a, double b) {
            return square(average(a, b));
        }
        static List<Double> calculateResults(double a, double b) {
            List<Double> results = new ArrayList<>();
            double avg = average(a, b);
            // TODO: Add the square of the average to the results list
            results.add(squareOfAverage(a, b));
            // TODO: return a List containing the average and the square of the average
            return Arrays.asList(avg, squareOfAverage(a, b));
        }
        public static void main(String[] args) {
            // TODO: Call calculateResults and print the average and square of the average.
            System.out.println(calculateResults(average(3, 3), square(3)) );
        }
    }
//#### Practice #4: In this lesson, you've discovered how function chaining and managing multiple return values with lists operate in Java. Now, it's time for you to roll up your sleeves and dive into writing some code on your own. Your objective is to perform a sequence of operations on a given number. Specifically, you will need to double this number and then add seven to the outcome. Your mission involves creating the appropriate functions and then chaining them together to unveil the "lucky number."
    class Solution {
        // TODO: Create a function that doubles the integer number passed to it.
        static double doubled(double a) {
            return a + a;
        }
        // TODO: Create a function that adds 7 to the integer number passed to it.
        static double seven(double a) {
            return a + 7;
        }
        // TODO: Create a function `luckyNumber` that chains the doubling and adding seven operations for a given integer number.
        // Given `x`, the function should return `2 * x + 7`
        static double luckyNumber(double a) {
            return seven(doubled(a));
        }
        public static void main(String[] args) {
            // TODO: Call the method that calculates the lucky number and print it out.
            // Provide number 3 as an integer parameter
            System.out.println(luckyNumber(3));
        }
    }

//LESSON 5: Exception Handling in Functions
//#### Practice #1
    class Solution {
        static void checkEmployeeId(int employeeNumber) {
            try {
                int idCode = 1000 / employeeNumber; // May cause ArithmeticException if employeeNumber is 0
                System.out.println("Employee ID is valid: " + idCode);
            } catch (ArithmeticException e) {
                System.out.println("Error: Employee number cannot be zero.");
            }
        }
        public static void main(String[] args) {
            checkEmployeeId(0); // Pass a 0 to simulate division by zero scenario
        }
    }
//#### Practice #2: Enhance the Employee ID validation in the checkEmployeeID method to include an upper limit. Adapt the condition to throw an exception for IDs greater than 10000. 
    class Solution {
        static void checkEmployeeID(int employeeID) throws IllegalArgumentException {
            if(employeeID <= 0) {
                throw new IllegalArgumentException("Employee ID must be greater than 0.");
            }
            else if(employeeID >= 10000) {
                throw new IllegalArgumentException("Employee ID must be less than 10000.");
            }
            System.out.println("Employee ID is valid.");
        }
        public static void main(String[] args) {
            try {
                checkEmployeeID(10001);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
//#### Practice #3: The age validation system in our Employee Management System is malfunctioning. Can you find the bug and fix the code so that it properly throws and handles an exception when an invalid age is entered?
    class Solution {
        static void validateAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
            //needed to add this print statement
            System.out.println("Age is " + age);
        }
        public static void main(String[] args) {
            try {
                validateAge(-5);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }
//#### Practice #4: Now, it's time to ensure that our Employee Management System handles situations correctly. Please add the missing code to check and handle invalid employee ages.
    class Solution {
        static void checkEmployeeAge(int age) {
            // TODO: Add code that checks if the employee is under 18
            if(age < 18){
                throw new IllegalArgumentException("Employee is underage");
            }
            // Throw an IllegalArgumentException exception with a message if the employee is underage
        }
        public static void main(String[] args) {
            // Here, we're trying to check the validity of the employee's age.
            try {
                checkEmployeeAge(16); // This will throw an exception as the age is not valid
            } catch (IllegalArgumentException e) {
                System.out.println("Caught an exception: " + e.getMessage());
                // TODO: Add code to catch the exception and print a message with the error.
            }
        }
    }
//#### Practice #5: You are running an employee management system and you need to access the employee IDs from an array. Write code to access an ID and handle the case where it doesn't exist using exception handling.
    class Solution {
        public static void main(String[] args) {
            int[] employeeIds = {101, 102, 103};
            // TODO: Try accessing an employee ID that might not exist in the array
            try {
                int employee = employeeIds[5];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Employee Id does not exist");
            }
            // TODO: Catch the ArrayIndexOutOfBoundsException exception that occurs if the index is out of bounds and print an error message
        }
    }


//Course 1.7: Object-Oriented Programming in Java
//LESSON 1: Creating and Using Classes
//#### Practice #1
    class Automobile {
        void startEngine() {
            System.out.println("The engine is starting!");
        }
    }
    class Solution {
        public static void main(String[] args) {
            Automobile myCar = new Automobile();
            myCar.startEngine(); // This will print "The engine is starting!"
        }
    }
//#### Practice #2: Let's make some tweaks: Rename the class to Car instead of Automobile; Add one more class method stopEngine that prints a message about engine stop. Don't forget to call this method afterward!
    class Car {
      // Define a method within the class
      void startEngine() {
        System.out.println("Vroom! The car engine starts.");
      }
      void stopEngine() {
        System.out.println("Scrreeeech! The car engine stops.");
      }
    }
    class Solution {
      public static void main(String[] args) {
        // Create an object of the Automobile class
        Car car = new Car();
        
        // Calling the startEngine method on the car object
        car.startEngine(); // It should print: "Vroom! The car engine starts."
        car.stopEngine();
      }
    }
//#### Practice #3: Troubleshoot the Car class's startEngine method in the Java simulator. The engine should start with a "Vroom vroom!" message when the method is called correctly. However, due to a bug, the car is not starting as expected. Identify and fix the issue by applying the Java naming conventions and object-oriented principles taught in the lesson.
     class Car {
        void startEngine() {
            System.out.println("The engine has started. Vroom vroom!");
        }
    }
    class Solution {
        public static void main(String[] args) {
            //needed to change myCar = null; to myCar = new Car();
            Car myCar = new Car();
            myCar.startEngine();
        }
    }
//#### Practice #4: Fill in the blank to make the car do something when we start 
    class Car {
      // TODO: Define a method inside the Car class that prints a message when the car's engine starts.
      void carEngine() {
        System.out.println("Car is exploding😵!");
      }
    }
    class Solution {
      public static void main(String[] args) {
        Car myCar = new Car(); // Creating an instance of Car class
        myCar.carEngine();;   // TODO: Call the method you've defined in the Car class to start the engine
      }
    }
//#### Practice #5: You've learned how to create and use a class and its methods. Now, it's time to apply that knowledge. Write a Car class with a method to imitate the sound of a horn; then create a Car object and call your method in the main function.
    // TODO: Define a class named 'Car'
        // TODO: In the Car class, define a method 'honk' that prints the sound a car horn makes.
    class Car {
        void honk() {
            System.out.println("honkkkkkkk");
        }
    }
    class Solution {
        public static void main(String[] args) {
            // TODO: Create a Car object.
            Car myCar = new Car();
            myCar.honk();
            // TODO: Call the method you defined in the Car class to imitate a horn sound.
        }
    }

//LESSON 2: Class Attributes and Methods in Java
//#### Practice #1
    // CellPhone class with Class Attributes and Methods.
    class CellPhone {
        String brand = "Galaxy";
        String model = "S21";
        final String chargerType = "Type-C";
    
        void makeCall() {
            System.out.println("Calling from " + brand + " " + model + " using " + chargerType + " charger...");
        }
    }
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.makeCall(); // Invoking the method to simulate making a call.
        }
    }
//#### Practice #2: Enhance the CellPhone class by adding an attribute that represents the software version. Then, create a simple updateSoftware method to change this version. This will demonstrate how methods can modify class attributes.
    class CellPhone {
        String brand = "AnyBrand";
        String model = "AnyModel";
        final String chargerType = "MicroUSB";
        String softwareVersion = "v1.0"; // New attribute for software version
        void updateSoftware(String newSoftware) {
            this.softwareVersion = newSoftware;
        }
        // Create a method to update the softwareVersion here        
    }
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            // Update `myPhone`s software version using the method you created
            myPhone.updateSoftware("v2.0");
            System.out.println(myPhone.softwareVersion);
        }
    }
//#### Practice #3: Your mission is to ensure your CellPhone is functional for interstellar communication. There's a slight problem: the code responsible for initiating calls is not using the model and brand variables correctly. Run the code and apply your fresh Java skills to resolve this, ensuring that the phone identifies itself properly when initiating a transmission!
    class CellPhone {
        String brand = "GadgetCo";
        String model = "SuperPhone";
        final String chargerType = "Type-C";
        void makeCall() {
        //needed to change callModel and callBrand to model and brand
            System.out.println("Making a call with the " + model + " by " + brand + "...");
        }
    }
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.makeCall();
        }
    }
//#### Practice #4: Create a new CellPhone object and call its method to simulate making a call.
    class CellPhone {
        String brand = "TechPhone";
        String model = "X2";
        final String chargerType = "Micro-USB";
    
        // TODO: Write a method 'makeCall' to simulate making a phone call 
        void makeCall() {
            System.out.println("Making a phone call with the " + brand + model + " using a " + chargerType + "charger.");
        }
    }
    class Solution {
        public static void main(String[] args) {
            // TODO: Create a CellPhone object and call the 'makeCall' method
            CellPhone newCall = new CellPhone();
            newCall.makeCall();
        }
    }
//#### Practice #5: Create a CellPhone class with attributes and methods that allow it to dial and hang up a call. This will test your understanding of classes, attributes, and methods in Java.
    class CellPhone {
        // TODO: Define attributes for the brand and model of the phone
        String brand = "iPhone";
        String model = "4";
        // TODO: Create a method `callDial` taking a parameter `long phoneNumber`
        // to simulate dialing a phone number (just print a message to the console)
        void callDial (long phoneNumber) {
            System.out.println("Dialing " + phoneNumber + " on my " + brand + model);
        }    
        // TODO: Create a method `hangUp` to simulate ending a call (just print a message to the console)
        void hangUp () {
            System.out.println("Hanging up...");
        }  
    }
    class Solution {
        public static void main(String[] args) {
            // TODO: Create an instance of CellPhone and use it to dial a number and then hang up
            CellPhone dial = new CellPhone();
            dial.callDial(+1-234-456-7890);
            dial.hangUp();
        }
    }

//LESSON 3: An Introduction to Java Constructors
//#### Practice #1
    class Car {
        String color;
        String model;
        boolean isElectric;
        // Car class constructor
        Car(String color, String model, boolean isElectric) {
            this.color = color;
            this.model = model;
            this.isElectric = isElectric;
        }
    }
    class Solution {
        public static void main(String[] args) {
            Car familyCar = new Car("Red", "SUV", false);
            System.out.println("Family Car - Model: " + familyCar.model + ", Color: " + familyCar.color + ", Electric: " + familyCar.isElectric);
        }
    }
//#### Practice #2: Your task is to enhance the Car constructor we've developed by implementing constructor overloading. Implement a new Car constructor with only model and year specified, setting the default color "White", benefitting our car manufacturing process during instances where a color preference is not indicated. At the end, create an instance of the Car class using the new constructor, and print all class fields to make sure everything has been set correctly.
    class Car {
        String model;
        String color;
        int year;
        // Constructor with parameters
        Car(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }
        // Add an overloaded constructor here
         Car(String model, int year) {
            this.model = model;
            this.color = "White";
            this.year = year;
        } 
    }
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car("Sedan", "Red", 2021);
            System.out.println(myCar.model + " - " + myCar.color + " - " + myCar.year);  // prints: Sedan - Red - 2021
            // TODO: create a new class instance calling the newly created constructor, and print all class attributes
            Car myCar2 = new Car("Honda", 2022);
            System.out.println(myCar2.model + " - " + myCar2.color + " - " + myCar2.year);
        }
    }
//#### Practice #3: Great job so far! On our car manufacturing line, there appears to be a small glitch: one car isn't displaying the correct model and year. Can you figure out what's going wrong and get our cars rolling out perfectly again?
    class Car {
      String model;
      int year;
      // Car class constructor with model and year
      Car(String model, int year) {
        //needed to add this. before model and year
        this.model = model;
        this.year = year;
      }
    }
    class Solution {
      public static void main(String[] args) {
        // Create a Car object called 'myCar' using the constructor
        Car myCar = new Car("Toyota Camry", 2021);
        System.out.println("Model: " + myCar.model + " - Year: " + myCar.year);
      }
    }
//#### Practice #4: Fill in the missing constructor code that initializes your car's model and year.
    class Car {
        String model;
        int year;
        // TODO: Define the constructor to initialize the car's model and year.
        Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
        String displayInfo() {
            return "Model: " + model + ", Year: " + year;
        }
    }
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car("Thunder", 2021); // Create a Car object using the constructor
            System.out.println(myCar.displayInfo()); // This should print the car's info
        }
    }
//#### Practice #5: Now, let's build a Car class from scratch. Remember, the Car class needs a constructor that sets the car's model and color. Then, in your Solution class, create an object of Car with your favorite car model and color, and print them out.
    class Car {
      // TODO: Declare attributes for model and color
      String model;
      String color;
      // TODO: Create a constructor to initialize model and color
      Car(String model, String color) {
        this.model = model;
        this.color = color;
      }
    }
    class Solution {
      public static void main(String[] args) {
        // TODO: Create a Car object with your chosen model and color, then print out its details
        Car newCar = new Car("Camry", "Transparent");
        System.out.println("My car is a " + newCar.color + " " + newCar.model);
      }
    }

//LESSON 4: Java's Building Blocks: Encapsulation of Attributes and Methods
//#### Practice #1
    class Vehicle {
        private String engineStatus = "off";  // Encapsulated vehicle's engine attribute
        public String getEngineStatus() {      // Getter for engine status
            return engineStatus;               // Returns current engine status
        }
        public void setEngineStatus(String status) {  // Setter for engine status
            this.engineStatus = status;               // Updates engine status
        }
    }
    class Solution {
        public static void main(String[] args) {
            Vehicle car = new Vehicle();              // Creating a new vehicle object, car.
            car.setEngineStatus("on");               // Starting the car's engine
            System.out.println("The engine is " + car.getEngineStatus()); // Displaying the engine status
        }
    }
//#### Practice #2: Your task is to update the setLicensePlate method in the Vehicle class to prevent the assignment of an empty string or the value "INVALID" to the license plate. Use conditional logic to ensure that if the new plate value is empty or equals "INVALID", the identifier "UNKNOWN" will be assigned instead.
    class Vehicle {
        private String licensePlate;
        public String getLicensePlate() {
            return licensePlate;
        }
        public void setLicensePlate(String newPlate) {
            if (newPlate.equals("")) {
                // TODO: Complete the condition for "INVALID" and assign "UNKNOWN" if needed
                this.licensePlate = "UNKNOWN";
            } else if (newPlate.equals("INVALID")) {
                this.licensePlate = "UNKNOWN";
            } else {
                this.licensePlate = newPlate;
            }
        }
    }
    class Solution {
        public static void main(String[] args) {
            Vehicle myCar = new Vehicle();
            myCar.setLicensePlate("XYZ 1234");
            System.out.println(myCar.getLicensePlate());
        }
    }

//#### Practice #3: Let's proceed to debug some code next. There’s a small mistake in this code that pertains to setting the model of a car. Identify and correct it to ensure the Car class functions as intended.
    class Car {
        private String model;
        private int year;
        public String getModel() {
            return this.model;
        }
        public void setModel(String newModel) {
            this.model = newModel;
        }
        public void setYear(int newYear) {
            this.year = newYear;
        }
    }
    class Solution {
        public static void main(String[] args) {
          Car car = new Car();
          car.setModel("Tesla Model X");
          car.setYear(2022);
          //needed to change car.model() to car.getModel();
          System.out.println("Model: " + car.getModel() );
        }
    }
//#### Practice #4: Add code to manage car details. Implement methods to set and get the car's manufacturing year.
    class Car {
        private String model;
        private int year;
        public String getModel() {
            return model;
        }
        public void setModel(String newModel) {
            model = newModel;
        }
        // TODO: Write a method to return the car's year
        public int getYear() {
            return this.year;
        }
        public void setYear(int newYear) {
            this.year = newYear;
        }
        // TODO: Write a method to assign a new year to the car
    }
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.setModel("Tesla Model S");
            // TODO: set the car year. Assume year is 2022
            myCar.setYear(1999);
            System.out.println("This is the year, my year " + myCar.getYear());
            // TODO: Display the car model and year
        }
    }
//### Practice #5: Create a Car class with private attributes and provide public getter and setter methods to access them. Remember to follow good encapsulation practices and control how these attributes are accessed and modified.
    class Car {
        // TODO: Declare private attributes for the Car class (model name as a String, year as an int)
        private String model;
        private int year;
        // TODO: Define a public getter method for the model name
        public String getModel() {
            return this.model;
        }
        // TODO: Define a public setter method for the model name
        public void setModel (String newModel) {
            this.model = newModel;
        }
        // TODO: Define a public getter method for the year
        public int getYear() {
            return this.year;
        }
        // TODO: Define a public setter method for the year
        public void setYear (int newYear) {
            this.year = newYear;
        }
    }
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car();
            // TODO: Set the model name of myCar to "Tesla Model S"
            myCar.setModel("Tesla Model 5");
            // TODO: Set the year of myCar to 2021
            myCar.setYear(2021);
            // TODO: Print the model name and year of myCar to the console
            System.out.println(myCar.getModel() + " " + myCar.getYear());
        }
    }

//LESSON 5: Mastering Interfaces, Abstract Classes, and Simple Inheritance in Java
//#### Practice #1
    class Solution {
        abstract static class Animal {
            abstract void eat();  // An abstract method for eating
    
            void breathe() {      // A concrete method for breathing
                System.out.println("Breathing...");
            }
        }
        static class Lion extends Animal {
            void eat() {         // Overriding the abstract method with Lion's way of eating
                System.out.println("Eating...");
            }
        }
        public static void main(String[] args) {
            Lion lion = new Lion();
            lion.eat();          // Will print "Eating..."
            lion.breathe();      // Will print "Breathing..."
        }
    }
//#### Practice #2: We have two classes, Zebra and Lion, each having their own eat() method. However, to make things more organized, please unite these two classes under an interface Animal containing a single method eat(), to make these classes have a common ground.
    // Main class named 'Solution'
    class Solution {
        public static void main(String[] args) {
            Zebra zebra = new Zebra();
            zebra.eat();
    
            Lion lion = new Lion();
            lion.eat();
        }
    }
    interface Animal {
         void eat();
    }
    // 'Zebra' class
    class Zebra implements Animal {
        // Implement the 'eat' method for 'Zebra'
        public void eat() {
            System.out.println("Eating tall grass in the savanna...");
        }
    }
    // 'Lion' class
    class Lion implements Animal {
        // Implement the 'eat' method for 'Lion'
        public void eat() {
            System.out.println("Eating meat...");
        }
    }
//#### Practice #3: There appears to be an error preventing it from running correctly. Your mission is to identify and fix this error to ensure the Lion class behaves as intended in our virtual savanna. Test your code to confirm the solution.
    abstract class Animal { // An example of an abstract class
      void breathe() {
        System.out.println("Breathing...");
      }
      //needed to add abstract before void
      abstract void eat();
    }
    class Lion extends Animal { // Class extending an abstract class
      void eat() {
        System.out.println("Eating meat...");
      }
    }
    class Solution {
      public static void main(String[] args) {
        Lion simba = new Lion(); // Creating an instance of Lion
        simba.breathe(); // Inherited from Animal class
        simba.eat(); // Supposed to implement an abstract method from Animal class
      }
    }
//#### Practice #4: Define the behavior of the Lion class. Implement the specific way a lion satisfies its hunger in the wild.
    abstract class Animal {
        // TODO: define an abstract `eat()` method with no parameters
        abstract void eat();    
        // Each animal will implement this method
    }
    class Lion extends Animal {
        // TODO: Implement the `eat()` method to express
        // how a lion eats in the wild using a print statement.
        public void eat() {
            System.out.println("Eating meat...");
        }
    }
    class Solution {
        public static void main(String[] args) {
            Lion king = new Lion();
            king.eat(); // Output: Lion is eating meat.
        }
    }
//#### Practice #5: Create an abstract class Animal with an abstract method eat and a concrete method breathe. Then, create a class Giraffe that extends Animal and implements eat. Have the Giraffe munch on some leaves and breathe the fresh savanna air!
    class Solution {
        public static void main(String[] args) {
            Giraffe g = new Giraffe();
            g.eat();
            g.breathe();
        }
    }
    // TODO: Create an abstract class named 'Animal'. It should have an abstract method 'eat' and a concrete method 'breathe'.
    abstract class Animal {
        abstract void eat();
        public void breathe() {
            System.out.println("Breathing...");
        }
    }
    // TODO: Create a class named 'Giraffe' that extends 'Animal'. Provide an implementation for the 'eat' method.
    class Giraffe extends Animal {
        public void eat() {
            System.out.println("Eating...");
        }
    }

//LESSON 6: Java Inheritance: Mastering Method and Attribute Overriding
//#### Practice #1
    class BasicCellPhone {
        protected String batteryType = "Removable";
        public void powerOn() {
            System.out.println("Basic CellPhone powering on with " + batteryType + " battery.");
        }
    }
    class CellPhone extends BasicCellPhone {
        protected String batteryType = "Non-removable";
        // Overrides powerOn method from BasicCellPhone
        public void powerOn() {
            System.out.println("Smartphone powering on with " + batteryType + " battery.");
        }
    } 
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.powerOn(); // Displays: Smartphone powering on with Non-removable battery.
        }
    }
//#### Practice #2: Please change the display method's access level in the Smartphone class to public, allowing it to override the parent class’s display method and to be called from outside the class hierarchy.
    class CellPhone {
        protected void display() {
            System.out.println("Basic cell phone display.");
        }
    }   
    class Smartphone extends CellPhone {
        public void display() {
            System.out.println("Smartphone with HD display.");
        }
    }
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.display();
            Smartphone mySmartphone = new Smartphone();
            // This call should print "Smartphone with HD display." after your update
            mySmartphone.display();
        }
    }
//#### Practice #3: You're tasked with ensuring a mobile device starts up correctly. However, there's been a hiccup, and the mobile device isn't booting as expected. Review the code and fix the problem to greet users warmly when they turn on their smartphones. 
    class MobileDevice {
        protected String operatingSystem = "Generic OS";
    
        protected void bootUp() {
            System.out.println("Booting up " + operatingSystem + "...");
        }
    }
    class Smartphone extends MobileDevice {
        public String operatingSystem = "Android";
        //needed to add this method
        public void bootUp() {
            System.out.println("Booting up " + operatingSystem + "...");
        }
    }
    class Solution {
        public static void main(String[] args) {
            MobileDevice myDevice = new Smartphone();
            myDevice.bootUp();
        }
    }
//#### Practice #4: Now that you've seen how a SmartPhone can override the powerOn method, let's put your skills to the test. Replace the placeholder with your own implementation to uniquely power on the SmartPhone.
    class BasicPhone {
        protected void powerOn() {
            System.out.println("BasicPhone powering on.");
        }
    }
    class SmartPhone extends BasicPhone {
        // TODO: Override the powerOn method to announce that the SmartPhone is powered by a touch screen.
        public void powerOn() {
            System.out.println("Touch screen powering on.");        
        }
    }
    class Solution {  
        public static void main(String[] args) {
            SmartPhone myPhone = new SmartPhone();
            // TODO: Call the powerOn method on myPhone object.
            myPhone.powerOn();
        }
    }
//#### Practice #5: You'll write code to simulate how a Smartphone can connect to the internet differently from a CellPhone. Remember to use method overriding to achieve this functionality.
    // TODO: Create a class 'CellPhone' with a method 'connectToInternet' that prints a message (connecting through 3G)
    class CellPhone {
        public void connectToInternet() {
            System.out.println("connecting through 3G");
        }
    }
    // TODO: Create another class, 'Smartphone', that extends 'CellPhone' and overrides 'connectToInternet' method to connect through Wi-Fi
    class Smartphone extends CellPhone{
        public void connectToInternet() {
              System.out.println("connecting through Wi-Fi");      
        }
    }
    class Solution {
        public static void main(String[] args) {
            // TODO: Instantiate 'Smartphone', call 'connectToInternet', and observe overridden behavior
            CellPhone phone = new Smartphone();
            phone.connectToInternet();
        }
    }




