//REVIEW (selected) for JAVA ASSESSMENT
//Course 1.1: Getting Started with Java

class Test {
//LESSON 6: Primitive Data Type Conversion
//Practice #4: Use the knowledge from our journey to convert different Java primitive types and strings. Follow the steps below using type casting and concatenation!
    public static void main(String[] args) {
        int planetNumber = 7;

        // TODO: Convert the planetNumber integer to a double using casting.
        double planetNumberInt = planetNumber;
        // TODO: Now, convert the new double to a String
        String planetNumberStr = Double.toString(planetNumberInt);
        // Printing out the String value after conversion.
        System.out.println("In our galaxy, the planet count is: " + planetNumberStr);


//LESSON 7: Navigating Java Conditional Statements: If-Else, Switch, Ternary Operator
//#### Practice #3: Something isn't quite right. Run the code to observe its behavior. Can you determine what needs to be fixed to ensure it follows the proper execution logic for the switch cases?
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
//#### Practice #5: Fill in the missing conditions and print statements in the provided if-else block.
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
//#### Practice #6: Write code to make a decision about chasing a comet based on its speed. Remember the ternary operator from our lesson? Let it guide your spaceship's actions!
        // TODO: Define a variable to store the comet's speed in km/s
        int cometSpeed = 100;
        
        // TODO: Use the ternary operator to decide what action to take based on the comet's speed
        // and store the result in a variable
        // Check if the comet's speed is less than 50 - if so, save the "Chasing comet!" message, otherwise - "Comet too fast, let it go!".
        String speed = cometSpeed < 50 ? "Chasing comet!" : "Comet too fast, let it go!";
        // TODO: Print out the action to take
        System.out.println(speed);

//LESSON 8: Understanding Concatenation Operations
//#### Practice #4: Combine your knowledge of concatenation and strings to craft a message that celebrates the moons of the giant planets. Use a StringBuilder or just a + operator to construct the final output.
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
}