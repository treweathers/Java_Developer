class Practice {
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

//2. Write a boolean that returns true if the string is in the "HR:MM" format and false if it is not.

//Find the bug questions
// 3. find the bug that returns this format: (seems to be double the amount of stars for each input). The function is a set of for loops that control "*" additions to string.
/*

 "***
 *abc*
 ***"

 */
