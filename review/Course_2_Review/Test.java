package review.Course_2_Review;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
*/

class Test {

/*OLD 
//1. beautiful - correct, but is this doing what it's supposed to do? not printing right answers, plus is it the correct logic in general?⁉️
public boolean hasBeautifulCharacter(String str) {
    //create hashmap and fill with characters
    java.util.HashMap<Character, Integer> chars = new java.util.HashMap<>();
    for (char c: str.toCharArray()) {
        chars.put(c, chars.getOrDefault(c, 0) + 1);
    }

    //iterate through
    for (int i = 0; i < str.length() - 1; i++) {
        char cur = str.charAt(i);
        char next = str.charAt(i + 1);

        int curcount = chars.getOrDefault(cur, 0);
        int nextcount = chars.getOrDefault(next, 0);
    
        //check condition
        if (curcount <= nextcount) {
            return false;
        }
    }
    return true;

}
*/
 //1. beautiful


    public static boolean isNextMoreFrequent(String str) {
        // Handle edge cases
        if (str == null || str.length() < 2) {
            return false;
        }

        // Convert the string to lowercase to handle case-insensitivity
        String lowerStr = str.toLowerCase();
        // Create a frequency map for all alphabetic characters
        java.util.Map<Character, Integer> freqMap = new java.util.HashMap<>();
        for (char c : lowerStr.toCharArray()) {
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        // Iterate through the sorted keys to find the previous and next characters
        // alphabetically and compare their frequencies
        Character previousChar = null;
        for (char c = 'a'; c <= 'z'; c++) {
            if (freqMap.containsKey(c)) {
                if (previousChar != null) {
                    // Check the condition if both characters exist
                    int nextCount = freqMap.get(c);
                    int previousCount = freqMap.get(previousChar);

                    if (nextCount > previousCount) {
                        return true;
                    }
                }
                previousChar = c; // Update the previous character to the current one
            }
        }

        return false;
    }

 /* 
    public static boolean isNextMoreFrequent(String str) {
        // Handle edge cases where a comparison isn't possible
        if (str == null || str.length() < 2) {
            return false;
        }

        char previousChar = str.charAt(0);
        char nextChar = str.charAt(1);

        // Count the occurrences of both characters
        long previousCount = 0;
        long nextCount = 0;

        for (char c : str.toCharArray()) {
            if (c == previousChar) {
                previousCount++;
            } else if (c == nextChar) {
                nextCount++;
            }
        }

        return nextCount > previousCount;
    }
*/
//2. reverse sentence - correct✅
    public static String reverseWords(String sentence) {
        String [] words = sentence.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

//3. matrix element == 0 - correct✅, but return?
    public static void setZeros(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        boolean[] row = new boolean[R];
        boolean[] column = new boolean[C];

        //be attentive rushing - put i++ twice, not j++, easy fix
        for (int i=0; i < R; i++) {
            for (int j=0; j < C; j++) {

                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }

            }
        }
        for (int i=0; i < R; i++) {
            for (int j=0; j < C; j++) {

                if(row[i] || column[j]) {
                    matrix[i][j] = 0;
                }

            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



//4. spiral matrix✅
public static int[] spiralOrder(int[][] matrix) {

    //1. variables
    java.util.ArrayList<Integer> resultList = new java.util.ArrayList<>();

    int R = matrix.length;
    int C = matrix[0].length;

    int top = 0;
    int bottom = R - 1;
    int left = 0;
    int right = C - 1;

    //2.while loop
    while (left <= right && top <= bottom) {
            
        // 3. for loops
        for (int j = left; j <= right; j++) {
            resultList.add(matrix[top][j]);
        }
        top++;
        for (int i = top; i <= bottom; i++) {
            resultList.add(matrix[i][right]);
        }
        right--;

        //4. if statements
        if (left <= right) {
            for(int j=right; j >=left; j--) {
                resultList.add(matrix[bottom][j]);
            }
        }
        bottom--;
        if (top <= bottom) {
            for(int i=bottom; i>=top; i--) {
                resultList.add(matrix[i][left]);
            }
        }
        left++;
    }

    // Convert the ArrayList to an integer array
    int[] resultArray = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
        resultArray[i] = resultList.get(i);
    }
    
    return resultArray;
}

    /* oLD
//4. spiral matrix✅
    public static List<Integer> spiralOrder(int[][] matrix) {

        //1. variables
        java.util.ArrayList<Integer> result = new java.util.ArrayList<>();

        int R = matrix.length;
        int C = matrix[0].length;

        int top = 0;
        int bottom = R - 1;
        int left = 0;
        int right = C - 1;

        //2.while loop
        while (left <= right && top <= bottom) {
                // 3. for loops
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            //4. if statements
            if (left <= right) {
                for(int j=right; j >=left; j--) {
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;
            if (top <= bottom) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
    }
    return result;
}
    */


























        /*

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result; // Return an empty list for null or empty matrices.
        }

//1. variables✅
        List<Integer> result = new ArrayList<>();
        int R = matrix.length;
        int C = matrix[0].length;

        int top = 0;
        int bottom = R - 1;
        int left = 0;
        int right = C - 1;

//2. while loop✅
        while (top <= bottom && left <= right) {

//3. two for loops✅
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

//4. two if statements (with for loops inside)☑️
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
        */


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

        // Corrected example usage:
        System.out.println("Is 'aba' more frequent? " + isNextMoreFrequent("aba"));  // Expected: false (a=2, b=1)
        System.out.println("Is 'apple' more frequent? " + isNextMoreFrequent("apple")); // Expected: true (a=1, p=2)
        System.out.println("Is 'banana' more frequent? " + isNextMoreFrequent("banana")); // Expected: true (b=1, a=3)
        System.out.println("Is 'programming' more frequent? " + isNextMoreFrequent("programming")); // Expected: true (p=1, r=2)
        System.out.println("Is 'test' more frequent? " + isNextMoreFrequent("test")); // Expected: false (t=2, e=1)
        System.out.println("Is 'a' more frequent? " + isNextMoreFrequent("a")); // Expected: false
        System.out.println("Is empty string more frequent? " + isNextMoreFrequent("")); // Expected: false

    /*
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

        Test checker = new Test();

        // Test Cases
        System.out.println("Test Case 1: 'aabbc'");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter("aabbc")); // a=2, b=2, c=1; a->a(2<=2) is false

        System.out.println("\nTest Case 2: 'abac'");
        System.out.println("Expected: false");
        System.out.println("Result: " + checker.hasBeautifulCharacter("abac")); // a=2, b=1, c=1; a->b(1>2) is false

        System.out.println("\nTest Case 3: 'xyyzzz'");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter("xyyzzz")); // x=1, y=2, z=3; x->y(2>1) true, y->y(2<=2) is false

        System.out.println("\nTest Case 4: 'a'");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter("a"));

        System.out.println("\nTest Case 5: '' (empty string)");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter(""));

        System.out.println("\nTest Case 6: 'abcdefg'");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter("abcdefg"));

        System.out.println("\nTest Case 7: null");
        System.out.println("Expected: true");
        System.out.println("Result: " + checker.hasBeautifulCharacter(null));

        System.out.println("\nTest Case 8: 'zzzyyxx'");
        System.out.println("Expected: false");
        System.out.println("Result: " + checker.hasBeautifulCharacter("zzzyyxx"));

        System.out.println("\nTest Case 9: 'ba'");
        System.out.println("Expected: false");
        System.out.println("Result: " + checker.hasBeautifulCharacter("ba"));
         */

    }
}
