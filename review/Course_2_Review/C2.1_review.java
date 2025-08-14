package review.Course_2_Review;
import java.util.HashSet;
import java.util.HashMap;
//import java.util.*; // Importing java utility package
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//# Course 2.1: Hashing, Dictionaries, and Sets in Java
class Solution {
    public static void main(String[] args) {
        //2.1 - unit 1/6 Practice #3: Recall how to create a collection to store a unique set of visitor IDs by completing the given starter code.
        // TODO: Instantiate a collection to store unique visitor IDs
        java.util.HashSet<String> uniqueVisitors = new java.util.HashSet<String>(); 
        // TODO: Add two different visitor IDs to your collection and try adding one of them again
        uniqueVisitors.add("visitor1@example.com");
        uniqueVisitors.add("visitor2@example.com");
        // TODO: Display the number of unique visitors
        System.out.println(uniqueVisitors.size());
        
        //2.1 - unit 2/6 practice 1
        int blog1[] = {1, 2, 3, 4, 5};
        int blog2[] = {6, 7, 8, 9, 10};
        if (audienceOverlap(blog1, blog2))
            System.out.print("Yes, there is an audience overlap between both blogs.");
        else
            System.out.print("No, there is no audience overlap between both blogs.");
        //2.1 - unit 2/6 practice 2
        int[] addresses = {1, 2, 3, 2, 1, 5, 3, 1, 2, 1, 4, 5, 6};
        int[] uniqueAddresses = processAddresses(addresses);
        System.out.println(Arrays.toString(uniqueAddresses));   // Returns [1, 2, 3, 5, 4, 6]

        //2.1 - unit 3/6 practice 1
        System.out.println(findFirstDuplicateID(new String[]{"X123", "A456", "X123", "B789", "A456", "C111"})); // Expected "X123"
        System.out.println(findFirstDuplicateID(new String[]{"Z999", "Y888", "Z999", "Y888"})); // Expected "Z999"
        System.out.println(findFirstDuplicateID(new String[]{"E100", "B200", "C300", "E100", "D400", "C300"})); // Expected "E100"

        //2.1 - unit 3/6 practice 2
        String[] array1 = {"cat", "dog", "tac", "god", "act"};
        String[] array2 = {"tca", "ogd", "atc", "taco"};
        int result = findAnagrams(array1, array2);
        System.out.println(result);   // output: 9
        // additional test samples
        String[] array3 = {"rat", "tar", "bat", "tab","bats"};
        String[] array4 = {"tra", "art", "abr"};
        int result2 = findAnagrams(array3, array4);
        System.out.println(result2);  // output: 6

        /*2.1 - unit 4/6 #### Practice #4
        Create an inventory system for an online bookstore. Use your knowledge to map book ISBNs to their names, add several books to the inventory, and then reveal the entire book collection.
        After that, remove any book you like and display the rest.
        ```java
        */
        // TODO: Create a HashMap with String as the key type and String as the value type
        HashMap<String, String> bookInventory = new HashMap<>();
        // TODO: Add at least three books to the inventory with their ISBN and name
        bookInventory.put("978-9374893012", "The Hunger Games");
        bookInventory.put("978-9739409248", "Catching Fire");
        bookInventory.put("978-7892384786", "Mocking Jay");
        // TODO: Display the entire bookstore inventory
        System.out.println("Book Inventory:" + bookInventory);
        // TODO: Remove any book from the inventory
        bookInventory.remove("978-9374893012");
        // TODO: Display the entire bookstore inventory
        System.out.println("Updated book inventory:" + bookInventory);

        /* 2.1 - unit 5/6 #### Practice #1: Imagine you're receiving cosmic signals, but the alien words are separated by a comma, not the usual spaces we're accustomed to. They've sent you a string and your objective is to jot down how many times each word appears in the message. Let's say it's something like "hello,stellar,navigator,stellar,stellar". The outcome? A count showing "hello: 1, stellar: 3, navigator: 1".
         */
        String text = "Cosmo,is,an,incredible,technical,companion,with,very,strong,skills,in,Algorithms,and,Data,Structures,and,a,great,teacher,for,technical,interviews.";
        // TODO: initialize the counter hashmap
        String[] words = text.split(",");
        HashMap<String, Integer> wordCount = new HashMap<>();
        // TODO: count words
        for (String word: words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
        // 2.1 - unit 5.6 practice 2
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 50);
        inventory.put("Bananas", 100);
        inventory.put("Oranges", 75);
        System.out.println(getTotalQuantity(inventory));  // It should print 225

        HashMap<String, Integer> anotherInventory = new HashMap<>();
        anotherInventory.put("Pizzas", 20);
        anotherInventory.put("Burgers", 30);
        anotherInventory.put("Tacos", 50);
        System.out.println(getTotalQuantity(anotherInventory));  // It should print 100

        HashMap<String, Integer> emptyInventory = new HashMap<>();
        System.out.println(getTotalQuantity(emptyInventory));  // It should print 0

        //2.1 - unit 6/6 - practice 1
        Solution solution = new Solution();

        int[] visits1 = {1,2,3,1,2,3,1,2,3,1};
        int frequentUser1 = solution.frequentUser(visits1);
        System.out.println("Frequent User: " + frequentUser1);  // Expected output: 1

        int[] visits2 = {5,0,5,0,5,0,5,0,1,1,1,1,1};
        int frequentUser2 = solution.frequentUser(visits2);
        System.out.println("Frequent User: " + frequentUser2);  // Expected output: 5

        int[] visits3 = {3,2,2,1,3,2,3,0,0,1,4,1};
        int frequentUser3 = solution.frequentUser(visits3);
        System.out.println("Frequent User: " + frequentUser3);  // Expected output: -1

        //2.1 - unit 6/6 practice 2
        String sentence1 = "Hello Hello world world world";
        HashMap<String, Integer> index1 = createWordIndex(sentence1);
        index1.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); //Should print: (hello -> 2),  (world -> 3)
        System.out.println("----");

        String sentence2 = "";
        HashMap<String, Integer> index2 = createWordIndex(sentence2);
        index2.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); //Should print nothing as the sentence is empty.
        System.out.println("----");

        String sentence3 = "Quick Quick brown fox jumps over the lazy dog";
        HashMap<String, Integer> index3 = createWordIndex(sentence3);
        index3.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); 
        //Should print: (over -> 1), (the -> 1), (quick -> 2), (lazy -> 1), (jumps -> 1), (brown -> 1), (dog -> 1), (fox -> 1)
        System.out.println("----");

        //COURSE 1 PRACTICE PROBLEM SOLUTION
            // Example 1
        List<String> words1 = new ArrayList<>(Arrays.asList("cat", "tac", "act", "dog"));
        System.out.println("Input: {\"cat\", \"tac\", \"act\", \"dog\"}");
        System.out.println("Output: " + AnagramSolver.findAnagramGroups(words1)); // Expected: {cat=3}
        System.out.println("--------------------");

        // Example 2
        List<String> words2 = new ArrayList<>(Arrays.asList("listen", "silent", "rat", "tar", "bat"));
        System.out.println("Input: {\"listen\", \"silent\", \"rat\", \"tar\", \"bat\"}");
        System.out.println("Output: " + AnagramSolver.findAnagramGroups(words2)); // Expected: {listen=2, rat=2}
        System.out.println("--------------------");
    }


    //2.1 - unit 2/6 Practice #1: You're tracking visitors to two different blogs on your fantastic galactic website. Each user is identified with a unique id and you've got logs of all their visits. Your mission, should you choose to accept it, is to find out if there's any overlap in visitors to each blog. In simple terms, we want to know if anyone has visited both blogs. You can decode these logs – they're simply lists of user IDs, with each ID mirrored by a unique integer. Your code should return true if there is any overlap, and false otherwise.
    public static boolean audienceOverlap(int blog1[], int blog2[]) {

        HashSet<Integer> visitorSet = new HashSet<>();
        
        // implement this 
        for (int num: blog1) {
            visitorSet.add(num);
        }
        for (int num: blog2) {
            if (visitorSet.contains(num)) {
                return true;
            }
        }
        return false;
    }
    /*
    //2.1 - unit 2/6 Practice #2
    Let's imagine we’ve got an integer array – picture it as a crowded pool of email addresses, where some addresses keep popping up more than once. Your mission? To write a function that dives in and rescues only the unique address IDs.

    This function's gonna take that original array as an input. As for output, it ought to spit back an array, but this time with only the unique IDs. Think of it like cleaning up the pool, removing the duplicate addresses so every ID is a lone ranger.

    The tricky part could be managing those edge cases. Arrays can be fickle beasts – empty or filled to the brim. It's your job to handle 'em both.
    */
    static int[] processAddresses(int[] addresses) {
        HashSet<Integer> set = new HashSet<>();
        
        // TODO: fill in the set
        for (int num: addresses) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        
        // TODO: fill in the result array
        int i = 0;
        for (int num: set) {
            result[i++] = num;
        }
        return result;
    }
    
    /*2.1 - unit 3/6 Practice #1
    You've been assigned a crew and each member has a unique ID consisting of alphanumeric characters. Now, you're sifting through these IDs and need to find the just first one that appears more than once in the array. If every ID is unique or the array is empty, just return an empty string.
    The answer format should be a string - that string is our elusive doubled ID or an empty string if we find no doubles in the array.*/
    public static String findFirstDuplicateID(String[] ids) {
        HashSet<String> idSet = new HashSet<>();

        // TODO: Find an id that appears more than once and return it
        HashSet<String> duplicateSet = new HashSet<>();
        for(String id: ids) {
            if(idSet.contains(id)) {
                duplicateSet.add(id);
                return id;
            }
            else {
                idSet.add(id);
            }
        }
        idSet.removeAll(duplicateSet);
        
        String firstDuplicateId = "";
        for (int i = ids.length; i<=0; i++) {
            if (idSet.contains(ids[i])) {
               firstDuplicateId = ids[i];
               break;
            }             
        }
        return firstDuplicateId;
    }
    // Return an empty string if no duplicate ids are found
    // return "";

    /*2.1 - unit 3/6 #### Practice #2: Picture two spacecraft log files, each a whole array of words. Your mission? Find the unique words from the second log file that have an anagram in the first log file. Then, add up the length of these matching anagram words. You must return this total length as an integer. Now, remember, anagrams are words that have the same letters but rearranged. If a word has no anagram in the other array or if it's not unique in its own array, abandon it like a black hole.*/
    // Method to return a unique character signature for each string.
    static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to find unique words from array2 that have an anagram in array1
    public static int findAnagrams(String[] array1, String[] array2) {
        HashSet<String> sortedWordsInArray1 = new HashSet<>();
        // TODO: fill in sortedWordsInArray1
        for (String word : array1) {
            sortedWordsInArray1.add(sortCharacters(word));
        }
        HashSet<String> anagramsMatched = new HashSet<>();
        int lengthSum = 0;

        for (String word : array2) {
            // implement this
            if (sortedWordsInArray1.contains(sortCharacters(word))) {
                if(!anagramsMatched.contains(word)) {
                    anagramsMatched.add(word);
                    lengthSum += sortCharacters(word).length();
               }
            }
        }

        return lengthSum;
    }
    /* 2.1 - unit 5/6 #### Practice #2
    We've got a HashMap that holds each unique product sold in a store and its quantity. Every product key is a unique string, and its quantity is represented by an integer value. Now, your mission is to calculate the total quantity of all the products stocked in this store and return it as an integer.
    Do remember, the HashMap you get as an input will not contain any unusual cases, it would be an ordinary universe with just products and their quantities.
     */
    public static int getTotalQuantity(HashMap<String, Integer> inventory) {
        // implement this
        int sum = 0;
        for (int value : inventory.values()) {
            sum += value;
        }
        return sum;
}

    /* 2.1 - unit 6/6 #### Practice #1
    imagine you're a webmaster of a popular website and you monitor visits from various users. You've got a list of identifier numbers linked to each visit, where each number represents a unique user. Now, imagine a situation where one of them visits the site more frequently, precisely, more than n/4 times, where n is the total number of visits. If that's the case, you'd want to find out who it is. So, here's your task: Write a script that scans the list and points out that frequent visitor. Non-negative integers represent the identifiers, but ignore the case when the identifier is zero. If there's no such frequent user, your script should return -1.
    */
    public int frequentUser(int[] visits) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int frequentVisitThreshold = visits.length / 4;

        // implement this
        for (int num : visits) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        
        if (countMap.get(num) > frequentVisitThreshold && countMap.get(num) != 0) {
            return num;  
        }
        }   
    return -1;
    }

    /* 2/1 - unit 6/6 #### Practice #2 Imagine you're a wordsmith astronaut needing to catalog words in alien languages. We'd create a tool - a HashMap! It maps unique words in any sentence to their frequency of appearance. Just like you'd document "blorp" shows up 3 times to know it's a common word. Here's a friendly rubric: Create a function taking a sentence as input (a string of English words separated by spaces, could be empty) and returning a HashMap. Each key is a unique word (case insensitive), and its value is the count of how often it appeared.*/
    public static HashMap<String, Integer> createWordIndex(String sentence) {
        HashMap<String, Integer> index = new HashMap<>();
        String[] words = sentence.split("\\s+");
        // implement this
        for (String word : words) {
            if (!word.isEmpty() == false) {
                continue;
            }
            word = word.toLowerCase();
            index.put(word, index.getOrDefault(word, 0) + 1);
        }
        return index;
    }




// COURSE 1 PRACTICE PROBLEM
    //2. METHOD sorting the characters⚠️
    private static String sortedCharacters(String string) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

    public HashMap<String,Integer> anagram (List<String> strings) {
        //1. new hashmap for sorted values
        HashMap<String, Integer> firstMap = new HashMap<>();
        
        //3. for loop and adding to hashmap
        for (String str: strings) {
            String sortedString =  sortedCharacters(str);
            firstMap.put(sortedString, firstMap.getOrDefault(str, 0) +1);
        }

        //3. new hashmap for duplicate values
        HashMap<String,Integer> duplicates = new HashMap<>();

        //4. for loop adding duplicates to duplicate hashmap
        for (String str: strings) {
            String sortedString =  sortedCharacters(str);
            int count = firstMap.get(sortedString);
            
            if(count > 1) {
                if(duplicates.containsKey(str)) {
                    //put the alien names in the hashmap
                    duplicates.put(str, count);

            }
        }
    }
        
        return duplicates;
    }
/*
Your refined logic is sound. Here is a complete Java solution based on that logic for the "Alien Dictionary" practice problem.
### 💻 Solution

### ⚙️ Explanation
1.  **`getCanonical()` Helper Method:** This is the core of the anagram detection. By sorting the characters of each word, we create a **unique identifier** for any group of anagrams. All anagrams will have the exact same canonical form.
2.  **`canonicalCounts` Map:** This map efficiently handles the counting part. The key is the sorted string (e.g., "act"), and the value is the total number of times any word with that sorted string appears in the list. This step is a direct application of the "counting occurrences" pattern we discussed earlier.
3.  **`finalResult` Map & Final Loop:** After counting, we iterate through the original word list one more time. This is where we format the output correctly. We check if an anagram group's total count is greater than 1. If it is, we add an original word from that group (e.g., "cat" for the "act" group) to our final result map. The `finalResult.containsValue(count)` check is a simple way to prevent adding multiple words from the same anagram group to the output.

This two-pass approach is a classic and efficient pattern for solving problems involving anagrams or groups of related items. The first pass uses a map to aggregate information, and the second pass uses that information to produce the desired output.
 */
class AnagramSolver {
    
    // Helper method to create a canonical string for a word
    private static String getCanonical(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static HashMap<String, Integer> findAnagramGroups(List<String> words) {
        // Step 1: Use a HashMap to count anagram groups based on their canonical form
        HashMap<String, Integer> canonicalCounts = new HashMap<>();
        
        for (String word : words) {
            String canonical = getCanonical(word);
            canonicalCounts.put(canonical, canonicalCounts.getOrDefault(canonical, 0) + 1);
        }

        // Step 2: Create a separate map to store the final result
        HashMap<String, Integer> finalResult = new HashMap<>();

        // Step 3: Iterate through the original words again to build the final output
        for (String word : words) {
            String canonical = getCanonical(word);
            int count = canonicalCounts.get(canonical);
            
            // If the count for this canonical form is > 1, it's a duplicate group
            if (count > 1) {
                // Check if we've already added this anagram group to the final result
                // This prevents us from adding all anagrams (e.g., 'cat', 'tac', 'act')
                // as keys to the final map. We only want one key per group.
                if (!finalResult.containsKey(word) && !finalResult.containsValue(count)) {
                    finalResult.put(word, count);
                }
            }
        }
        
        return finalResult;
    }
}
}