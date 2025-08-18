package review.Course_2_Review;
//1. boolean - 'beautiful' if the next character occurs more than the previous character false;
//if sumA > sumB return false
//19/20

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class BeautifulCharacterChecker {

    /**
     * Checks if there is any "beautiful" character in the given string.
     * A character at index 'i' is considered beautiful if the count of the character at 'i+1'
     * is strictly greater than the count of the character at 'i-1' in the entire string.
     *
     * @param str The input string.
     * @return true if a beautiful character exists, false otherwise.
     */
    public static boolean hasBeautifulCharacter(String str) {
        if (str == null || str.length() < 3) {
            // A beautiful character requires a character before and after it.
            return false;
        }

        // Step 1: Count character frequencies
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Step 2: Iterate and check the condition
        for (int i = 1; i < str.length() - 1; i++) {
            char prevChar = str.charAt(i - 1);
            char nextChar = str.charAt(i + 1);

            int prevCharCount = charCounts.get(prevChar);
            int nextCharCount = charCounts.get(nextChar);

            // Step 3: Apply the "beautiful" condition
            if (nextCharCount > prevCharCount) {
                // If a beautiful character is found, we can return true immediately.
                return true;
            }
        }

        // If the loop finishes without finding any beautiful characters
        return false;
    }

    public static void main(String[] args) {
        String testString1 = "abacaba"; // 'a' at index 1: count of 'c' (1) > count of 'a' (4) is false.
                                      // 'a' at index 3: count of 'c' (1) > count of 'b' (2) is false.
                                      // 'a' at index 5: count of 'a' (4) > count of 'a' (4) is false.
        String testString2 = "applepie"; // 'p' at index 1: count of 'p' (2) > count of 'a' (1) is true.
        String testString3 = "zxyabc";   // All characters have a count of 1.
                                       // The condition (1 > 1) is never met.

        System.out.println("String 'abacaba' has a beautiful character: " + hasBeautifulCharacter(testString1)); // false
        System.out.println("String 'applepie' has a beautiful character: " + hasBeautifulCharacter(testString2)); // true
        System.out.println("String 'zxyabc' has a beautiful character: " + hasBeautifulCharacter(testString3));   // false
    }
}

class BeautifulCharacterCheckers {

    /**
     * Checks if there is any "beautiful" character in the given string.
     * A character at index 'i' is considered beautiful if the count of the character at 'i+1'
     * is strictly greater than the count of the character at 'i-1' in the entire string.
     *
     * @param str The input string.
     * @return true if a beautiful character exists, false otherwise.
     */
    public static boolean hasBeautifulCharacter(String str) {
        if (str == null || str.length() < 3) {
            // A beautiful character requires a character before and after it.
            return false;
        }

        // Step 1: Count character frequencies
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Step 2: Iterate and check the condition
        for (int i = 1; i < str.length() - 1; i++) {
            char charBefore = str.charAt(i - 1);
            char charAfter = str.charAt(i + 1);

            int countCharBefore = charCounts.get(charBefore);
            int countCharAfter = charCounts.get(charAfter);

            // Step 3: Apply the "beautiful" condition
            if (countCharAfter > countCharBefore) {
                // If a beautiful character is found, we can return true immediately.
                return true;
            }
        }

        // If the loop finishes without finding any beautiful characters
        return false;
    }

    public static void main(String[] args) {
        String testString1 = "abacaba"; // Expected: false
        String testString2 = "applepie"; // Expected: true
        String testString3 = "zxyabc";   // Expected: false

        System.out.println("String 'abacaba' has a beautiful character: " + hasBeautifulCharacter(testString1));
        System.out.println("String 'applepie' has a beautiful character: " + hasBeautifulCharacter(testString2));
        System.out.println("String 'zxyabc' has a beautiful character: " + hasBeautifulCharacter(testString3));
    }
}


//2. string - reverse the order of the sentence - NOT LETTERS
//8/100
class ReverseWords {

    /**
     * Reverses the order of words in a sentence.
     *
     * @param sentence The input string containing a sentence.
     * @return A new string with the order of words reversed.
     */
    public static String reverseWords(String sentence) {
        // Handle null or empty input strings
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        // Split the sentence into an array of words using space as a delimiter
        String[] words = sentence.trim().split("\\s+");

        // Reverse the array of words
        Collections.reverse(Arrays.asList(words));

        // Join the words back into a single string with spaces
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String originalSentence = "Java is a powerful programming language";
        String reversedSentence = reverseWords(originalSentence);

        System.out.println("Original sentence: \"" + originalSentence + "\"");
        System.out.println("Reversed sentence: \"" + reversedSentence + "\"");
        // Expected output: "language programming powerful a is Java"
        
        String singleWord = "Hello";
        System.out.println("\nOriginal sentence: \"" + singleWord + "\"");
        System.out.println("Reversed sentence: \"" + reverseWords(singleWord) + "\"");
        
        String multipleSpaces = "  Hello   World  ";
        System.out.println("\nOriginal sentence: \"" + multipleSpaces + "\"");
        System.out.println("Reversed sentence: \"" + reverseWords(multipleSpaces) + "\"");
    }
}

//3. matrix - if any element of rectangular matrix == 0, set row and column equal to zero
//100/200
class ZeroMatrix {

    public static void setZeros(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return; // Handle null or empty matrices
        }

        int R = matrix.length;
        int C = matrix[0].length;

        boolean[] zeroRows = new boolean[R];
        boolean[] zeroCols = new boolean[C];

        // First pass: identify which rows and columns need to be zeroed
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Second pass: set the identified rows and columns to zero
        for (int i = 0; i < R; i++) 
            for (int j = 0; j < C; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeros(matrix);

        System.out.println("\nMatrix after setting zeros:");
        printMatrix(matrix);
    }

    // Helper method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

//4. matrix - return the contents of rectangular matrix in spiral
//0/200

class SpiralMatrix {

    /**
     * Traverses a matrix in a spiral order and returns the elements in a list.
     *
     * @param matrix The input rectangular matrix.
     * @return A list containing the elements of the matrix in spiral order.
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result; // Return an empty list for null or empty matrices.
        }

        int R = matrix.length;
        int C = matrix[0].length;

        int top = 0;
        int bottom = R - 1;
        int left = 0;
        int right = C - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top row
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Check if there are still rows to traverse
            if (top <= bottom) {
                // Traverse from right to left along the bottom row
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Check if there are still columns to traverse
            if (left <= right) {
                // Traverse from bottom to top along the left column
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Spiral order for matrix1: " + spiralOrder(matrix1));
        // Expected output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println("Spiral order for matrix2: " + spiralOrder(matrix2));
        // Expected output: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
    }
}