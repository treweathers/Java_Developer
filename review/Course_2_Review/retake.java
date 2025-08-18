package review.Course_2_Review;

class Redo {

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
}