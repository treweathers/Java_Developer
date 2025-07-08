class Practice  {
//Only CodeSignal Practice Question: Single Function Question
//You are given a two-digit integer n. Return the sum of its digits.
    int solution(int n) {
        int first = n/10;
        int second = n%10;
        int sum = first + second;
        return sum;
    }

//Single Function Questions

//1. Write a boolean that returns true if the string is a palindrome and false if it is not.

//2. Write a boolean that returns true if the string is in the "HR:MM" format and false if it is not.

//Find the bug questions
// 3. find the bug that returns this format: (seems to be double the amount of stars for each input). The function is a set of for loops that control "*" additions to string.
/*

 "***
 *abc*
 ***"

 */
}