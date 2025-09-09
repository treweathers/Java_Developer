package review.Course_2_Review;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Redo {
 //1. beautiful
    public static boolean isNextMoreFrequent(String str) {
        if (str == null || str.length() < 2) {
            return false;
        }

        String lowerStr = str.toLowerCase();
        java.util.Map<Character, Integer> freqMap = new java.util.HashMap<>();
        for (char c : lowerStr.toCharArray()) {
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }
 
        Character previousChar = null;
        for (char c = 'a'; c <= 'z'; c++) {
             
            if (freqMap.containsKey(c)) {
                if (previousChar != null) {

                    int nextCount = freqMap.get(c);
                    int previousCount = freqMap.get(previousChar);

                    if (nextCount > previousCount) {
                        return true;
                    }
                }
                previousChar = c;
            }
        }
        return false;
    }

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
            for(int i=bottom; i >=top; i--) {
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
    /* 
    public static boolean isNextMoreFrequent(String str) {
        char prev = str.charAt(0);
        char next = str.charAt(1);

        int prevCount = 0;
        int nextCount = 0;

        for (char c: str.toCharArray()){
        if (c == prev) {
            prevCount++;
        } else if (c == next) {
            nextCount++;
        }
    }
    return nextCount > prevCount;
}

    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join("", words);
    }

    public static void setZeros(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        boolean[] row = new boolean[R];
        boolean[] column = new boolean[C];

        for(int i=0; i<R; i++) {
            for(int j=0; j<C; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i=0; i<R; i++) 
            for (int j=0; j<C; j++) {
                if(row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
    }

    public static int[] spiralOrder(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        int top = 0;
        int bottom = R - 1;
        int left = 0;
        int right = C - 1;

        ArrayList<Integer> resultList = new ArrayList<>();

        while (left <= right && top <= bottom) {

            for (int j=left; j<right; j++) {
                resultList.add(matrix[top][j]);
            }
            top++;
            for (int i=top; i<bottom; i++) {
                resultList.add(matrix[i][right]);
            }
            right--;

            if (left <= right) {
                for (int j=right; j<left; j--) {
                    resultList.add(matrix[bottom][j]);
                }
                bottom--;
                for (int i=bottom; i<top; i--) {
                    resultList.add(matrix[i][left]);
                }
                left++;
            }
        }
        int[] resultArray = new int[resultList.size()];
        for (int i=0; i< resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
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
}
}