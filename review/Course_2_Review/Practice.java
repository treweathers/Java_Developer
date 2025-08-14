package review.Course_2_Review;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;
import java.util.Stack;


public class Practice {
    public static void main(String[] args) {
        int numbers[] = {0, 1, 2, 3, 4};
        System.out.println(Practice.adjacent(numbers));

        String input = "maam";
        System.out.println(Practice.palindrome(input));

        int array [] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        System.out.println(Practice.duplicate(array));

        int n = 16;
        System.out.println(Practice.power(n));

        String str = "()";
        System.out.println(Practice.parentheses(str));
     }

//Practice #1: Adjacent Elements Product (Arrays - traversal) - correct
     static int adjacent (int[] numbers) {
        int largest = numbers[0] * numbers [1];
        for (int i = 1; i < numbers.length - 1; i++) {
            int count = numbers[i] * numbers[i + 1];
            if (count > largest) {
                largest = count;
            }
        }
        return largest;
     }
    
//Practice #2: Check Palindrome (String - manipulation) - correct
     static boolean palindrome (String input) {
        char [] inputstr = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (inputstr[left] != inputstr[right]) {
                return false;
            }
            left++;
            right --;
        }
        return true;
     }

//Practice #3: First Duplicate (HashSet) - correct✅
     static int duplicate (int[] array) {
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (duplicates.contains(num)) {
                return num;
            }
            duplicates.add(num);
        }
        return -1;
     }

//Practice #5: Binary Search - correct (bits -  BUT HOW DO WITH LOOP?‼️
     static boolean power (int n) {
        if (n <= 0) {
            return false ;
        }
        return ((n & (n - 1)) == 0);

     }
//Practice #6: Valid Parentheses‼️
     static boolean parentheses (String str)  {
        //Character not char
        Stack<Character> stack = new Stack<>();
        for (char c :  str.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (str.isEmpty()) {
                    return false;
                }
            }

            char top = stack.pop();

            if(c == ')' && top != '(') {
                return false;
            }
            if(c == ']' && top != '[') {
                return false;
            }
            if(c == '}' && top != '{') {
                return false;
            }
            
        }
        return stack.isEmpty();
     }

    // Practice #7: Two Num‼️
     public int[] twoNum (int [] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(target)) {
                //syntax {get.get(target), i}; was initially incorrect
                 return new int[] {map.get(compliment), i};
        }
        //flipped i and nums i originally
        map.put(nums[i], i);
     }
     //apparently necessary
    throw new IllegalArgumentException("no solution");
    }
    // Practice #8: uses API method defined in "parent class" - don't think that is applicable to this type of assessment

    // Practice #9: Valid Parentheses✅
     public boolean isEmpty(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c: s.toCharArray()) {
            if (c =='(' || c =='[' || c =='{') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
            else if ( c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
     }
     // Practice #10: Reverse LinkedList
     public ListNode reverse (ListNode head) {
        ListNode prev = null;
        ListNode current =  head;

        while (current != null) {
            ListNode temp =  current.next;
            current.next = prev;
            prev = current;
            // not current.next
            current = temp;
        }
        // not current
        return prev;
     }
}
//Practice #4: LinkedLists/ListNodes‼️
class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
class Remove {
    public static ListNode remove(ListNode l, int k) {       
        //&& not ||
        while (l != null && l.value == k) {
            l = l.next;
        }

        if (l == null) {
            return null;
        }
        // not new ListNode(k);
        ListNode current = l;

        //current.next, not current
        while (current.next != null) {
            if (current.value == k) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return l;
    }
}

