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


//Course 1.5: Java String Manipulation for Beginners


//Course 1.6: Writing Functions using Java


//Course 1.7: Object-Oriented Programming in Java




