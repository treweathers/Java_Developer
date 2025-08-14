import java.util.HashMap;

//Error: Could not find or load main class practice Caused by: java.lang.NoClassDefFoundError: (wrong name: )
/*class Practice {
    public static void main(String [] args) {
        System.out.println(palindrome("ama"));
        System.out.println(solution(20));
    }

//Only CodeSignal Practice Question: Single Function Question
//You are given a two-digit integer n. Return the sum of its digits.
    static int solution(int n) {
        int first = n/10;
        int second = n%10;
        int sum = first + second;
        return sum;
    }

//Single Function Questions
//1. Write a boolean that returns true if the string is a palindrome and false if it is not.
    static boolean palindrome (String string) {
        //create StringBuilder
        StringBuilder reversedString = new StringBuilder();
        //reverse string
        reversedString.reverse();
        //if reversed string == string, return true
        return true;
    }
}
*/
//2. Write a boolean that returns true if the string is in the "HR:MM" format and false if it is not.
public boolean isValidTime(String time) {
    // Check if the input string is null or empty.
    // If it is, it can't be a valid time format, so we return false.
    if (time == null || time.isEmpty()) {
        return false;
    }

    // A valid "HR:MM" string must have exactly 5 characters.
    // (e.g., "09:30"). If the length is not 5, we return false.
    if (time.length() != 5) {
        return false;
    }

    // The colon separator must be at the third position (index 2).
    // If it's not a colon, the format is incorrect.
    if (time.charAt(2) != ':') {
        return false;
    }

    // We split the string into two parts: hours and minutes, using the colon as a delimiter.
    String[] parts = time.split(":");

    // We expect exactly two parts (hours and minutes).
    // If the split operation doesn't result in two parts, the format is invalid.
    if (parts.length != 2) {
        return false;
    }

    // We use a try-catch block to handle potential NumberFormatException.
    // This can happen if the hours or minutes parts are not valid numbers.
    try {
        // Parse the hours and minutes parts from strings to integers.
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        // Check if the hours are within a valid range (0-23).
        // A 24-hour clock is assumed.
        if (hours < 0 || hours > 23) {
            return false;
        }

        // Check if the minutes are within a valid range (0-59).
        if (minutes < 0 || minutes > 59) {
            return false;
        }
    } catch (NumberFormatException e) {
        // If parsing fails, it means the hours or minutes strings
        // were not valid numbers, so the format is incorrect.
        return false;
    }

    // If all checks pass, the string is in the "HR:MM" format.
    return true;
}


//Find the bug questions
// 3. find the bug that returns this format: (seems to be double the amount of stars for each input). The function is a set of for loops that control "*" additions to string.
/*

 "***
 *abc*
 ***"

 */
/*
public class StarPatternGenerator {

    /**
     * This function generates a specific star pattern using nested for loops.
     * The pattern consists of a top and bottom section of stars, with an optional
     * inner string. The number of stars in each row of the top section doubles
     * for each step, while the bottom section is a mirror image.
     * The output format is:
     * ***
     * *abc*
     * ***
     *
     * @param innerString The string to be placed between the stars. Pass null or an
     * empty string to omit it.
     */
    public static void printDoublingStarPattern(String innerString) {
        // Define the number of rows for the top and bottom sections.
        int numRows = 3;

        // --- Top Section of the Pattern ---
        // The outer loop controls the number of rows to print for the top section.
        for (int i = 1; i <= numRows; i++) {
            // The inner loop builds the string for each row.
            // It calculates the number of stars to print based on the current row number.
            // The number of stars doubles in each step (1, 2, 4, etc. - in this specific
            // example, we are using a simpler pattern of 3, then a specific line).
            StringBuilder rowBuilder = new StringBuilder();

            // Special case for the middle line
            if (i == 2) {
                rowBuilder.append("*"); // Add the leading star.
                // Add the inner string, if it exists.
                if (innerString != null && !innerString.isEmpty()) {
                    rowBuilder.append(innerString);
                }
                rowBuilder.append("*"); // Add the trailing star.
            } else {
                // For the top and bottom rows, we double the stars.
                // The number of stars for the top and bottom rows is fixed at 3 for this
                // specific pattern. A more general solution would use a calculation like
                // 2^(i-1) or similar to double the stars. This code is tailored to the
                // exact output format requested.
                for (int j = 0; j < 3; j++) {
                    rowBuilder.append("*");
                }
            }
            // Print the completed row and move to the next line.
            System.out.println(rowBuilder.toString());
        }

        // Use a more general loop structure to show how a doubling pattern could work.
        // This is a slightly different output but demonstrates the concept of doubling.
        System.out.println("\nExample of a true doubling pattern:");

        for (int i = 0; i < 4; i++) {
            StringBuilder doublingStars = new StringBuilder();
            // The number of stars is 2^i, which doubles with each iteration.
            int starsToPrint = (int) Math.pow(2, i);
            for (int j = 0; j < starsToPrint; j++) {
                doublingStars.append("*");
            }
            System.out.println(doublingStars.toString());
        }
    }

    /**
     * Main method to demonstrate the usage of the function.
     */
    public static void main(String[] args) {
        // --- Use Case 1: With an inner string ---
        System.out.println("--- Use Case 1: Pattern with 'abc' ---");
        printDoublingStarPattern("abc");

        System.out.println(); // Add a blank line for separation

        // --- Use Case 2: With a different inner string ---
        System.out.println("--- Use Case 2: Pattern with 'Java' ---");
        printDoublingStarPattern("Java");

        System.out.println(); // Add a blank line for separation

        // --- Use Case 3: Without an inner string ---
        System.out.println("--- Use Case 3: Pattern without an inner string ---");
        printDoublingStarPattern(null);
    }



//Sample Question Types
//1. Array Manipulation
//Write a method that returns the maximum product of two integers in an array.
//2. String Parsing
//Return true if a string is a palindrome (case insensitive, ignore non-alphanumerics).

//3. HashMap Practice
//Return the first non-repeating character in a string.
class FirstNonRepeatingCharacter {

    /**
     * Finds the first non-repeating character in a given string.
     *
     * @param s The input string.
     * @return The first non-repeating character, or null if all characters repeat or the string is empty.
     */
    public Character findFirstNonRepeatingCharacter(String s) {
        // Handle edge cases: if the string is null or empty, there are no non-repeating characters.
        if (s == null || s.isEmpty()) {
            return null;
        }

        // Create a HashMap to store the frequency of each character.
        // The key is the character, and the value is its count.
        HashMap<Character, Integer> charCount = new HashMap<>();

        // First pass: Iterate through the string to populate the HashMap with character counts.
        // For each character, we get its current count (defaulting to 0 if not present)
        // and then increment it by 1 before putting it back into the map.
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Second pass: Iterate through the string again to find the first character
        // whose count in the HashMap is 1.
        // The first character we encounter with a count of 1 is the first non-repeating one.
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                // If the count is 1, we've found our character, so we return it.
                return c;
            }
        }

        // If we complete the second loop without finding any character with a count of 1,
        // it means all characters repeat. In this case, we return null.
        return null;
    }
}




