//REVIEW (selected) for JAVA ASSESSMENT

/*install and set up: in treweathers (not for project)
brew install openjdk
java -version
*/

//Lesson 6: Primitive Data Type Conversion
class Test {
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
