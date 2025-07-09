# Course 2.1: Hashing, Dictionaries, and Sets in Java
## Lesson 1: Mastering Java HashSet: An In-depth Exploration of Implementation and Complexity Analysis
### 1. Understanding HashSets
A HashSet is an intrinsic part of Java's collections framework. It is designed to store unique elements in an unordered manner. As a class derived from the AbstractSet class and implementing the Set interface, a HashSet doesn't conform to the order in which elements are added. This gives its users the freedom not to maintain any sequencing while ensuring every stored element is distinct.

A HashSet stands out among Set implementations due to its ability to eliminate duplicate data. This makes it highly efficient when we need to swiftly check if an item exists in a collection or when we want to store only the unique data. Let's consider this using a simple Java code snippet:

    import java.util.HashSet;  
    
    class Solution {
        public static void main(String args[]) {  
            // Instantiate a HashSet
            HashSet<String> set=new HashSet<String>();
            
            // Add elements to HashSet
            set.add("David");
            set.add("Alice");
            set.add("Bob");
            set.add("Alice");
    
            System.out.println(set);  // prints [Bob, Alice, David]
            System.out.println(set.size());  // prints 3
        }  
    } 
In this example, despite adding "Alice" twice to our HashSet, we observe that "Alice" is included only once when we display our set to the console. Note that "Bob" is shown before "David" or "Alice", though it has been added the last. This happens because sets do not preserve the order of the elements.

## 2. HashSet Implementation
Under its hood, a HashSet uses a hash table to manage all its elements. A hash table revolves around an array of buckets that store all items. A hash function is integrated to generate a hash code; the hashed key indicates the memory location where each element gets stored, accelerating the element storage and retrieval process.

In Java, the `add()`, `remove()`, and `contains()` operations in the HashSet class rely on the hash code of the object you're dealing with. When adding or fetching an object, the hashCode method computes a hash that points to a particular bucket where the object will be stored or found.

The ability of a HashSet to mitigate collisions can be demonstrated with the following example:

    import java.util.HashSet;
    
    class Solution {
        public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<Integer>();
            
            // Add elements to HashSet
            for(int i = 0; i < 100; i++){
                set.add(i); 
            }
            
            // Access all elements
            for(int i = 0; i < 100; i++){
                if(set.contains(i)) {
                    System.out.println(i + " found");
                }
            }
        }
    }
In this example, we add numbers from 0 to 99 to the HashSet and then check whether each of these numbers is present in the HashSet. Thanks to the `hashCode` method, the lookup for all these operations is highly efficient, keeping our code execution fast.

### 3. Complexity Analysis of HashSet Operations
The intriguing factor that influences the performance of a HashSet is its time and space complexity. The index of an element is directly computed via the hash function, offering a constant time (O(1)) for adding an element, checking the presence of a component, and removing an element from a HashSet.

The space complexity of a HashSet is linear (O(n)), where n is the number of elements contained in the HashSet. Each element occupies its distinctive bucket.

Consider this Java code:

    import java.util.HashSet;
    
    class Solution {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<String>();
            
            // Add elements to HashSet
            for(int i = 0; i < 1000; i++){
                set.add("element_" + i); 
            }
    
            // Find elements in HashSet
            for(int i = 0; i < 1000; i++){
                set.contains("element_" + i); 
            }
    
            // Remove elements from HashSet
            for(int i = 0; i < 1000; i++){
                set.remove("element_" + i); 
            }
        }
    }
In the above code, the time to add, find, and remove all elements from the HashSet remains constant, regardless of the size of the HashSet. This showcases the efficiency of HashSet operations.

### 4. Real-world problems that HashSet tackles
A HashSet comes in handy when dealing with large datasets. It provides swift handling operations such as adding elements, verifying whether an item is present in the collection, and deleting items. It's extensively used as the backbone data structure for other advanced data structures, especially in big data management scenarios.

For instance, consider a scenario where we're interested in keeping track of unique visited web pages. A HashSet allows us to add new visited pages quickly and provides an efficient method to check whether a specific page has been visited.

    import java.util.HashSet;
    
    class Solution {
        public static void main(String[] args) {
            HashSet<String> visitedPages = new HashSet<String>();
            
            // Impersonate a user visiting pages
            visitedPages.add("https://example.com");
            visitedPages.add("https://codesignal.com");
    
            // Check if a user accessed https://codesignal.com before
            if (visitedPages.contains("https://codesignal.com")) {
                System.out.println("The user visited https://codesignal.com before");
            }
        }
    }
As we add URLs to the `visitedPages` HashSet when a user lands on a webpage, checking whether a user previously visited a specific page is highly efficient and immediate.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            // Initialize a HashSet to store unique visitor IDs for website traffic analysis
            java.util.HashSet<Integer> uniqueVisitors = new java.util.HashSet<Integer>();
    
            // Add visitor IDs (some IDs are duplicates on purpose)
            uniqueVisitors.add(101);
            uniqueVisitors.add(202);
            uniqueVisitors.add(303);
            uniqueVisitors.add(101); // Duplicate ID will not be added
    
            // Print the number of unique visitors recorded
            System.out.println("Unique visitors count: " + uniqueVisitors.size());
        }
    }

#### Practice #2
Check if visitor3@example.com has ever visited our site before. Use the contains method to find out, and print the result in one line.

    class Solution {
        public static void main(String[] args) {
            java.util.HashSet<String> uniqueVisitors = new java.util.HashSet<String>();
            
            // Simulated visits to the website
            uniqueVisitors.add("visitor1@example.com");
            uniqueVisitors.add("visitor2@example.com");
            uniqueVisitors.add("visitor1@example.com"); // repeated visitor
            
            // Check presence of a visitor and print the result
            System.out.println(uniqueVisitors.contains("visitor3@example.com"));
        }
    }

#### Practice #3
Recall how to create a collection to store a unique set of visitor IDs by completing the given starter code.

    import java.util.HashSet;
    
    class Solution {
        public static void main(String[] args) {
            // TODO: Instantiate a collection to store unique visitor IDs
            java.util.HashSet<String> uniqueVisitors = new java.util.HashSet<String>(); 
            // TODO: Add two different visitor IDs to your collection and try adding one of them again
            uniqueVisitors.add("visitor1@example.com");
            uniqueVisitors.add("visitor2@example.com");
            // TODO: Display the number of unique visitors
            System.out.println(uniqueVisitors.size());
        }
    }

## Lesson 1: Operating HashSets in Java
### 1. Problem 1: Check if Two Sets are Disjoint
Imagine you're developing a feature for a social media platform that requires user groups to be exclusive — you need to ensure that users can't belong to more than one group at a time. It's like organizing events where a guest should not appear on the lists for two different parties at the same venue — an overlap would be a significant issue.

### 2. Problem 1: Naive Approach
Initially, you might consider checking for overlap by comparing each member of one group with every member of the other — a somewhat cumbersome O(n*m) operation. If you have hundreds or thousands of users in each group, the time it would take to compare them all grows exponentially. This approach is impractical and resource-intensive, especially on the scale of a social media platform with potentially millions of users.

### 3. Problem 1: Efficient Approach
Instead, `HashSet` provides a swift and efficient method for achieving the same result. Let's step through the implementation:

First, we add members from one group into the `HashSet`:

    HashSet<Integer> set1 = new HashSet<>();
    for (int num : arr1) {
        set1.add(num); // Populating the HashSet, preparing for constant-time checks
    }

Then, for each member in the second group, we check if they are already part of the first group using the constant-time `contains` method of the `HashSet`:
    
    for (int num : arr2) {
        if (set1.contains(num)) {
            return false; // If found, the sets are not disjoint.
        }
    }
If the second loop completes without finding any common members, we conclude that the sets are disjoint:

    return true; // No overlap found; the groups are exclusive.
Thanks to `HashSet`, we have made our operation far more efficient, avoiding the performance cost of an O(n*m) complexity approach.

### 4. Problem 2: Remove Duplicates from an Array
Consider a scenario where you have a list of email addresses but must ensure each customer receives only one newsletter — duplicates must go. This scenario is akin to managing invitations to an exclusive gala where each person should receive only one invite, meaning the invitation list must be free of repeats.

### 5. Problem 2: Naive Approach
The naive approach to this problem would be to create a new list and check every incoming address against all previously added ones — resulting in an inefficient O(n^2) operation. Such an approach would not scale well with larger datasets and could lead to significant delays, like manually verifying each invitation against a growing list one by one.

### 6. Problem 2: Efficient Approach
By leveraging `HashSet`, however, we can effectively simplify the process:

    HashSet<Integer> set = new HashSet<>();
    for (int num : arr) {
        set.add(num); // Adds the number if it's not already present, thus ignoring duplicates
    }
Here, we use the `HashSet` to store unique email addresses; each new address is added only if it's not already present. Hence, duplicates are naturally filtered out.

Next, we convert the `HashSet` back into an array, now containing unique elements:

    int[] result = new int[set.size()];
    int i = 0;
    for (int num : set) {
        result[i++] = num; // Each unique element is added to the result array
    }
We now have a clean list ready for our exclusive newsletter send-out. The `HashSet` optimizes our process and scales it efficiently for larger datasets.

#### Practice #1
You're tracking visitors to two different blogs on your fantastic galactic website. Each user is identified with a unique id and you've got logs of all their visits. Your mission, should you choose to accept it, is to find out if there's any overlap in visitors to each blog. In simple terms, we want to know if anyone has visited both blogs. You can decode these logs – they're simply lists of user IDs, with each ID mirrored by a unique integer. Your code should return true if there is any overlap, and false otherwise.

    import java.util.HashSet;
    
    class Solution {
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
    
        public static void main(String[] args) {
            int blog1[] = {1, 2, 3, 4, 5};
            int blog2[] = {6, 7, 8, 9, 10};
            
            if (audienceOverlap(blog1, blog2))
                System.out.print("Yes, there is an audience overlap between both blogs.");
            else
                System.out.print("No, there is no audience overlap between both blogs.");
        }
    }

#### Practice #2
Let's imagine we’ve got an integer array – picture it as a crowded pool of email addresses, where some addresses keep popping up more than once. Your mission? To write a function that dives in and rescues only the unique address IDs.

This function's gonna take that original array as an input. As for output, it ought to spit back an array, but this time with only the unique IDs. Think of it like cleaning up the pool, removing the duplicate addresses so every ID is a lone ranger.

The tricky part could be managing those edge cases. Arrays can be fickle beasts – empty or filled to the brim. It's your job to handle 'em both.

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            int[] addresses = {1, 2, 3, 2, 1, 5, 3, 1, 2, 1, 4, 5, 6};
            int[] uniqueAddresses = processAddresses(addresses);
            System.out.println(Arrays.toString(uniqueAddresses));   // Returns [1, 2, 3, 5, 4, 6]
        }
    
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
    }

## Lesson 3: Mastering Unique Elements and Anagram Detection with Java HashSets
### 1. Problem 1: Unique Echo
Picture this: you're given a vast list of words, and you must identify the final word that stands proudly solitary — the last word that is not repeated. Imagine sorting through a database of unique identifiers and finding one identifier towards the end of the list that is unlike any others.

### 2. Problem 1: Naive Approach
The straightforward approach would be to examine each word in reverse, comparing it to every other word for uniqueness. This brute-force method would result in poor time complexity, O(n^2), which is less than ideal for large datasets.

### 3. Problem 1: Efficient Approach
We can use two `HashSet` instances: `wordsSet` to maintain unique words and `duplicatesSet` to keep track of duplicate words. By the end, we can remove all duplicated words from `wordsSet` to achieve our goal. Here is how to use `HashSet` to solve the problem:

Create a `HashSet` instance to store unique words:

    HashSet<String> wordsSet = new HashSet<>();
Initialize another `HashSet` to monitor duplicates:


    HashSet<String> duplicatesSet = new HashSet<>();
Iterate the word array, filling `wordsSet` and `duplicatesSet`:

    for (String word : words) {
        if (wordsSet.contains(word)) {
            duplicatesSet.add(word);
        } else {
            wordsSet.add(word);
        }
    }
Use the `removeAll` method from the `HashSet` API to remove all duplicated words from `wordsSet`:

    wordsSet.removeAll(duplicatesSet);
Now, `wordsSet` only contains unique words. Find the last unique word by iterating through the original word list from the end:

    String lastUniqueWord = "";
    for (int i = words.length - 1; i >= 0; i--) {
       if (wordsSet.contains(words[i])){
           lastUniqueWord = words[i];
           break;
       }
    }
And finally, return the last unique word:

    return lastUniqueWord;
This efficient approach, with a time complexity closer to O(n), is far superior to the naive method and showcases your proficiency at solving algorithmic problems with Java's `HashSet`.

### 4. Problem 2: Anagram Matcher
Now, imagine a different scenario in which you have two arrays of strings, and your task is to find all the unique words from the first array that have an anagram in the second array.

### 5. Problem 2: Efficient Approach
We'll create a unique signature for each word by sorting its characters and then compare these signatures for matches. We'll use a `HashSet` to store signatures for efficient access.

### 6. Problem 2: Solution Building
Let's break down the anagram matcher:

Construct a method to create sorted character signatures from the input string:

    private static String sortCharacters(String input) {
       char[] chars = input.toCharArray();
       Arrays.sort(chars);
       return new String(chars);
    }
Store these sorted characters from `array2` in a `HashSet` for fast lookup:

    HashSet<String> sortedWordsInArray2 = new HashSet<>();
    for (String word : array2) {
       sortedWordsInArray2.add(sortCharacters(word));
    }
For each word in `array1`, check for its sorted signature in the `HashSet` and track the found anagrams:

    HashSet<String> anagramsMatched = new HashSet<>();
    ArrayList<String> result = new ArrayList<>();
    for (String word : array1) {
        if (sortedWordsInArray2.contains(sortCharacters(word))) {
            if (!anagramsMatched.contains(word)) {
                result.add(word);
                anagramsMatched.add(word);
            }
        }
    }
The `ArrayList` `result` stores the matches, ensuring that we return unique anagrams, while the `HashSet` `anagramsMatched` prevents duplication in our `result`.

Our final step is to return the list of anagrams found:

    return result;
By utilizing `HashSets` in this manner, we achieve efficient anagram checking with reduced complexity, considering both the  O(mlogm) character sorting for each word and the O(n) comparison for n words.


