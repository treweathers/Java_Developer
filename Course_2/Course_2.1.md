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

#### Practice #1
You've been assigned a crew and each member has a unique ID consisting of alphanumeric characters. Now, you're sifting through these IDs and need to find the just first one that appears more than once in the array. If every ID is unique or the array is empty, just return an empty string.
The answer format should be a string - that string is our elusive doubled ID or an empty string if we find no doubles in the array.

    import java.util.*; // Importing java utility package

    class Solution {
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
        
    
        public static void main(String[] args) {
            System.out.println(findFirstDuplicateID(new String[]{"X123", "A456", "X123", "B789", "A456", "C111"})); // Expected "X123"
            System.out.println(findFirstDuplicateID(new String[]{"Z999", "Y888", "Z999", "Y888"})); // Expected "Z999"
            System.out.println(findFirstDuplicateID(new String[]{"E100", "B200", "C300", "E100", "D400", "C300"})); // Expected "E100"
        }
    }

#### Practice #2
Picture two spacecraft log files, each a whole array of words. Your mission? Find the unique words from the second log file that have an anagram in the first log file. Then, add up the length of these matching anagram words. You must return this total length as an integer. Now, remember, anagrams are words that have the same letters but rearranged. If a word has no anagram in the other array or if it's not unique in its own array, abandon it like a black hole.

    import java.util.*;
    
    class Solution {
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
        
        public static void main(String []args){
            String[] array1 = {"cat", "dog", "tac", "god", "act"};
            String[] array2 = {"tca", "ogd", "atc", "taco"};
            int result = findAnagrams(array1, array2);
            System.out.println(result);   // output: 9
    
            // additional test samples
            String[] array3 = {"rat", "tar", "bat", "tab","bats"};
            String[] array4 = {"tra", "art", "abr"};
            int result2 = findAnagrams(array3, array4);
            System.out.println(result2);  // output: 6
        }
    }

###### Questions I asked Cosmo:
* What do you mean by "sum the lengths of unique words from array2 that have an anagram in array1"?

        Cosmo's response:
        Great question! Here’s what it means:
        
        For each word in array2, check if:
        The word is unique in array2 (appears only once).
        There is an anagram of that word in array1.
        If both are true, add the length of that word to your total sum.
        For example, if "tca" in array2 is unique and has an anagram in array1 (like "cat"), you add 3 (its length) to your sum. Repeat for all such words, then return the total.
        
        Does that help clarify?

* So then I set lengthSum = sortCharacters(word).length();

        Good effort, but your code is only keeping the length of the last matching word instead of summing all matching lengths.
        
        Try updating your code so that you add each matching word's length to the total. Need a hint, or want to give it another shot?

* How can you add the length of strings in an array?

        Cosmo's response:
        Great question! To add the length of strings, you can use the .length() method for each string and sum them up.
        
        For example:

        int sum = 0;
        for (String word : array) {
            sum += word.length();
        }
        In your case, you want to add word.length() directly to your total when you find a match—no need for a loop from length() down to 0. Does that make sense?

## Lesson 4: HashMaps: Understanding Implementation and Complexity Analysis in Java
### 1. Deep Dive into HashMaps
Before we commence, let's formally define a `HashMap`. A HashMap in the world of Java, functions based on a hashtable, implementing the `Map` interface. This interface implies that HashMaps can store key-value pairs, and interestingly, it allows `null` values and a `null` key. HashMaps do not guarantee any specific map order; in other words, the order can change over time.

HashMaps function using the principle of hashing. Here, a key is rendered to a hash code by a hash function, and this numeric code identifies the storage location for the key-value pair. Let's visualize a simple creation of a HashMap:

    import java.util.HashMap;
    
    class Solution {
    
        public static void main(String[] args) {
            // Creating the HashMap
            HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    
            // Adding key-value pairs to the HashMap
            hashMap.put(1, "John");
            hashMap.put(2, "Mike");
            hashMap.put(3, "Emma");
    
            // Displaying the contents of the HashMap
            System.out.println("HashMap: " + hashMap);  // Outputs HashMap: {1=John, 2=Mike, 3=Emma}
        }
    }
In the above code snippet, we have created a HashMap that maps an Integer key to a String value. Then, we add three key-value pairs and print the HashMap to the console.

### 2. The Power of Hashing in HashMaps
In HashMaps, hashing takes center stage where the keys are hashed. Intriguingly, this hashed value helps us determine where to store the corresponding data.

This mechanism of hashing is what gives the HashMap its name. But the question that arises is, why is hashing important? Through hashing, it becomes possible to achieve constant time complexity, `O(1)`, for `get()` and `put()` operations in ideal scenarios. This means that HashMaps provides extremely swift data access and insertion functionality — an advantage unrivaled by other data structures.

One thing to note is that due to the hashing mechanism, a HashMap might end up with multiple keys with the same hash code (known as a hash collision). To handle collisions, all keys with the same hash code are added to a linked list. Starting from Java 8, when this list becomes too large, it transforms into a balanced tree, enhancing worst-case performance from O(n) to O(log n).

### 3. Complexity Analysis of HashMap Operations
HashMaps demonstrate an impressive `O(1)` time complexity for basic operations — `get()` and `put()`. Derived from the concept of hashing, the key's hash code is used directly to store and retrieve elements, eliminating the need for scanning or searching. This gives HashMap a substantial edge in efficiency.

While it offers efficient time complexity operations, by using a HashMap, we need to be mindful of the space complexity as well. The space usage for HashMap can grow to `O(n)`, where n is the number of elements in the HashMap.

We extend our earlier HashMap example to exhibit these operations:

    import java.util.HashMap;
    
    class Solution {
    
        public static void main(String[] args) {
            HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
    
            // Adding elements (put operation)
            hashMap.put(1, "John");
            hashMap.put(2, "Mike");
            hashMap.put(3, "Emma");
    
            // Retrieving an element (get operation)
            System.out.println("Element with key 1: " + hashMap.get(1));
            // Output: Element with key 1: John
    
            // Removing an element (remove operation)
            hashMap.remove(2);
    
            System.out.println("HashMap after removal operation: " + hashMap);
            // Output: HashMap after removal operation: {1=John, 3=Emma}
        }
    }
Here, we use the `get(key)` function to retrieve the value mapped to the provided key and the `remove(key)` function to delete the designated key-value pair.

#### Practice #1
Run the code.

    import java.util.HashMap;
    
    
    class Solution {
        public static void main(String[] args) {
            // HashMap to store books (ISBN) and their average reviews
            HashMap<String, Double> bookReviews = new HashMap<>();
    
            // Adding some books and their reviews to the inventory
            bookReviews.put("978-0134685991", 4.7); // Effective Java
            bookReviews.put("978-0596009205", 4.5); // Head First Java
    
            // Printing the average review of "Effective Java"
            System.out.println("Average review for Effective Java: " + bookReviews.get("978-0134685991"));
        }
    }

#### Practice #2
Modify the bookstore inventory system to remove a book from the inventory? Use what you've learned to apply the remove() method on the HashMap and remove the entry for the book with ID 1001. Then, print out the remaining inventory.

    import java.util.HashMap;
    
    
    class Solution {
        public static void main(String[] args) {
            // Create a HashMap to track the quantity of books by their unique IDs
            HashMap<Integer, Integer> bookInventory = new HashMap<>();
            
            // Adding books with their unique IDs as keys and quantities as values
            bookInventory.put(1001, 5); // ID 1001 has 5 copies
            bookInventory.put(1002, 3); // ID 1002 has 3 copies
    
            // TODO: Remove the book with ID 1001 from the inventory
            bookInventory.remove(1001);
            
            // Print the updated inventory
            System.out.println("Updated book inventory: " + bookInventory);
        }
    }

#### Practice #3
Enhance our Online Bookstore Inventory. Your mission is to complete the code by adding 3 key-value pairs for new books and their quantity to the inventory.

    import java.util.HashMap;
    
    
    class Solution {
        public static void main(String[] args) {
            // Creating a HashMap for the Online Bookstore Inventory
            HashMap<String, Integer> books = new HashMap<>();
    
            // Adding key-value pairs for BookName-Quantity
            books.put("The Alchemist", 10);
            // TODO: Add any other books to the bookstore inventory along with their quantity
            books.put("Divergent", 11);
            books.put("Insurgent", 12);
            books.put("Allegiant", 13);
            // Display the quantity of "The Alchemist"
            System.out.println(books.get("The Alchemist"));
        }
    }

#### Practice #4
Create an inventory system for an online bookstore. Use your knowledge to map book ISBNs to their names, add several books to the inventory, and then reveal the entire book collection.

After that, remove any book you like and display the rest.

    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
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
        }
    }

## Lesson 5: Java HashMaps: A Guide to Efficient Data Management
### 1. Problem 1: Word Counter
Consider this: you have an extensive text — perhaps a short story or a section of a report — and want to analyze word usage. How many times does each word appear? This isn't just about curiosity; such a tool benefits writers aiming for diverse vocabulary.

Visualize yourself tasked with developing a feature for a text editor that gives feedback on word usage. A writer could use this feature to refine their work, ensuring they use only certain words.

### 2. Problem 1: Naive Approach
Consider iterating over the text word by word, keeping track of each instance in a list. This approach might work for a short sentence, but imagine scaling it up to an entire book! It becomes inefficient as you repeatedly wade through a growing list for each word you encounter.

### 3. Problem 1: Efficient Approach
This is where `HashMap` shines like a knight in shining armor. With its `getOrDefault` function, `HashMap` allows for swift updates. Instead of a laborious search for each word, a `HashMap` can check and update the count in a constant time — a massive time-saver!

### 4. Problem 1: Build Solution
Let's break down the code step by step:

1. We create a `HashMap` called `wordCount` to store words and their frequencies.
2. using the `split` method around each space, we split the text into words.
3. Then, for each word, we update the `HashMap` using the `getOrDefault` method, which fetches the current count and adds one. If the key is not in the HashMap, it creates the key and assigns it a value of 0.
Here's how our Java crusader does it:

        import java.util.HashMap;
        
        class Solution {
            public static void main(String[] args) {
                String text = "Java Java Java";
                HashMap<String, Integer> wordCount = new HashMap<>();
                String[] words = text.split(" ");
                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
                System.out.println(wordCount);
            }
        }
Take the sentence "Java Java Java" for example. Our function would create a `HashMap` with a single entry: {"Java", 3}. Simple and elegant!

### 5. Problem 2: Sum of Mapped Values
Suppose you're keeping track of inventory. You have items identified by their names and associated with their prices, all stored in a hashmap. How would you compute the total inventory value with minimal fuss?

Consider a situation in a retail store with a diverse product range, each with a unique barcode and price. To calculate the total inventory value, you must efficiently pair each item with its price and tally them up.

### 6. Problem 2: Approach
`HashMap` lays out items and prices on a neat table. It associates each product name (key) with its price (value). Using the `values()` method, you can directly access all the prices at once for summation, turning a complex task into a walk in the park.

### 7. Problem 2: Solution Building
Given a hashmap of items, we will use the loop to traverse the map's values, adding them together into a sum.

Here's the Java magic:

    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
    
            map.put("a", 10);
            map.put("b", 6);
            map.put("c", 12);
    
            int sum = 0;
            for (int value : map.values()) {
                sum += value;
            }
            System.out.println(sum);  // 28
        }
    }
Imagine a register ringing up items — "apple: 1, banana: 2, cherry: 3" — our `HashMap` would keep a tally, and in the end, the sum would be a quick and accurate total: 6.

#### Practice #1
Imagine you're receiving cosmic signals, but the alien words are separated by a comma, not the usual spaces we're accustomed to. They've sent you a string and your objective is to jot down how many times each word appears in the message. Let's say it's something like "hello,stellar,navigator,stellar,stellar". The outcome? A count showing "hello: 1, stellar: 3, navigator: 1".

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            String text = "Cosmo,is,an,incredible,technical,companion,with,very,strong,skills,in,Algorithms,and,Data,Structures,and,a,great,teacher,for,technical,interviews.";
            // TODO: initialize the counter hashmap
            String[] words = text.split(",");
            HashMap<String, Integer> wordCount = new HashMap<>();
            // TODO: count words
            for (String word: words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            System.out.println(wordCount);
        }
    }

#### Practice #2
We've got a HashMap that holds each unique product sold in a store and its quantity. Every product key is a unique string, and its quantity is represented by an integer value. Now, your mission is to calculate the total quantity of all the products stocked in this store and return it as an integer.

Do remember, the HashMap you get as an input will not contain any unusual cases, it would be an ordinary universe with just products and their quantities.

    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
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
        }
    
        public static int getTotalQuantity(HashMap<String, Integer> inventory) {
            // implement this
            int sum = 0;
            for (int value : inventory.values()) {
                sum += value;
            }
            return sum;
        }
    }

## Lesson 6: HashMaps for Efficient Problem Solving in Java Algorithmic Interviews
### 1. Problem 1: Majority Element Finder
Our journey begins with the Majority Element Finder. You're handed an array of integers, and your mission is simple yet intriguing: determine whether this array has a celebrity element. This integer appears more frequently than all others combined. More formally, we are looking for an element appearing more than `n/2` times.

### 2. Problem 1: Problem Actualization
Why does this matter? Well, consider analyzing sales data to determine the most sold product in an online marketplace—knowing the majority of products could streamline marketing strategies and inventory management. That's the real-world relevance of the majority element problem.

### 3. Problem 1: Efficient Approach Explanation
Now, let's be savvy about this. Enter the `HashMap`: your sophisticated voting tally system. With it, you can keep a running total of each product's sales as you go through the transaction list once rather than reviewing the entire list for each product. It grants us the speed of an experienced cashier who knows customers' habits by heart.

### 4. Problem 1: Solution Building
Let's dissect the process in our election analogy step by step:

    HashMap<Integer, Integer> countMap = new HashMap<>();
    int majorityThreshold = arr.length / 2;
Here, we're preparing our `HashMap`, akin to setting up our ballot boxes and establishing the majority threshold — the number of votes needed to win the election by a landslide.

    for (int num : arr) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
We're recording every vote cast in our `HashMap` ledger. Each key is a unique product, and the value is the current total of received votes.
    
    if (countMap.get(num) > majorityThreshold) {
            return num;
    }
Once a product's vote count exceeds the threshold — signaling a majority — our search concludes, akin to declaring a winner!

    return -1;
If the polling ends with no majority victor, we return -1, signifying a contested market where no single product dominates.

### 5. Problem 2: Keyword Index Creator
Imagine you are building a search feature for an app, and you need a function that quickly retrieves all documents where a certain keyword is present. If you have ever searched for something using your browser's Ctrl+F or Command+F function, you have utilized such an index! Our task is to create a dictionary that behaves like an index, mapping a keyword to all the documents where it can be found.

### 6. Problem 2: Problem Actualization
This capability is the cornerstone of search engines or reference databases — offering instant results when you look up a word or phrase. Indexing is an unsung hero in big data, where speed is invaluable.

### 7. Problem 2: Efficient Approach Explanation
Our `HashMap` steps in as our digital librarian, capable of cataloging every word and its locations at a fantastic clip. It's the magic behind the fast search results we often take for granted.

### 8. Problem 2: Solution Building
Let's delve into our code, assembling our digital index:

    HashMap<String, List<Integer>> index = new HashMap<>();
This line can be likened to opening a new spreadsheet where each row represents a distinct word, and the columns list the document numbers where the word appears.

    for (int i = 0; i < docs.length; i++) {
        String[] words = docs[i].split(" ");
        for (String word : words) {
Here, we're flipping through each document and dissecting it into individual words. It's parallel to scanning each page of our metaphorical book.
    
        if (!word.isEmpty()) {
            List<Integer> docIndices = index.getOrDefault(word, new ArrayList<>());
            docIndices.add(i);
             index.put(word, docIndices);
        }
    }
}
For every word we encounter, we pinpoint its listing or create one if it's new. Then, we're cross-referencing the document index, much like jotting down on which page a topic is discussed.

    return index;
And with that, our index is complete, a feat many times quicker than doing so manually and without the risk of paper cuts!
