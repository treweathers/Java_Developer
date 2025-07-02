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


//Course 1.3: Iterations and Loops in Java


//Course 1.4: Mastering Debugging with Java


//Course 1.5: Java String Manipulation for Beginners


//Course 1.6: Writing Functions using Java


//Course 1.7: Object-Oriented Programming in Java




