<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.2: Learning Simple Data Structures in Java
## Lesson 1: Exploring Java Arrays: Creation, Accessing, and Properties

### 1. Understanding Arrays in Java
An array is a container that stores a fixed number of values of a single type. Think of it as a box that holds only tennis balls or apples. Each item in an array is an element, and their positions are called indices. Let's put this into practice:

    int[] numbers = {10, 20, 30, 40, 50}; // creates an array "numbers" of 5 integers
Consider `numbers` as a box with 5 compartments, each holding a number. Simple, isn't it?

### 2. Creation of Arrays in Java
To create an array, we declare it using a type and square brackets, followed by an array name. Then, we use the `new keyword` to initialize it, specifying the array's length. The process looks like this:

    int[] a;                  // Declare an array
    a = new int[5];           // Initialize the array with 5 elements
    a = new int[]{1, 2, 3, 4, 5};    // Assign values 1, 2, 3, 4, 5 to the array
In this example, we've created an array `a` that can hold 5 numbers.

However, as you might have noticed already, shorter forms are also available, especially when all array elements are predefined:


    int[] a = new int[]{1, 2, 3, 4, 5}; // Define and assign the array at the same time. The length (5) is defined automatically.
    int[] a = {1, 2, 3, 4, 5}; // Shorter form that does the same for pre-defined array

### 3. Accessing Elements in Arrays
Array elements are accessed using index numbers, which start from 0. For instance, `a[0]` refers to the first item, `a[1]` refers to the second item, and so on.


    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a[0]); // Output: 1
    System.out.println(a[2]); // Output: 3
    // System.out.println(a[5]); // Error - there is no such element in the array
Keep in mind that an array has a fixed size. Therefore, attempting to access `a[5]` or any index beyond would lead to an error.

### 4. Array Properties and Methods
An array in Java has a `length` property that indicates the number of elements it can hold.

    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a.length); // Output: 5
    System.out.println(a[a.length - 1]); // Output: 5 - the last element
Here, `a.length` gives us the size of our array, which is 5. When working with arrays, remember to specify the size during creation and avoid accessing non-existent indices.

On top of that, you can use the `Arrays.toString()` method to convert the array to a string. See it in action:

    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a); // Outputs: [I@379619aa. Oops, simply printing an array doesn't work!
    System.out.println(Arrays.toString(a)); // Outputs: [1, 2, 3, 4, 5]
When we try to just directly print the array, the output is confusing - in fact, the string it prints corresponds to the array's address in the memory, not its value. We will cover this concept in more detail in the next courses.

### 5. Multidimensional arrays
We have covered the linear arrays, but there is more fun - multidimensional arrays! Just like our spaceship that has multiple decks, each deck having multiple cabins, a multidimensional array is an array of arrays.

Let's initialize a two-dimensional (2D) array with 3 decks in our spaceship, each having 4 cabins:

    // 2D array of 3 arrays, each having 4 elements
    int[][] spaceships = { {8, 2, 7, 9}, {3, 4, 1, 2}, {3, 8, 6, 7} };
    System.out.println(spaceships[1][0]); // Output: 3 - the first element in the second array [3, 4, 1, 2]
    System.out.println(spaceships[2][3]); // Output: 7 - the fourth element in the third array [3, 8, 6, 7]
As we used a single index to access elements in a one-dimensional array, we need to use two indices to access elements in two-dimensional arrays. The first index selects the deck of the spaceship, and the second index selects the cabin number. Hence, `spaceships[1][0]` would select the first cabin from the second deck - number `3`.

Defining multidimensional arrays can be done in a similar way:

    int[][] spaceships;                  // Declare a multidimensional array of integers
    spaceships = new int[3][4];          // Initialize the array with 3 arrays, 4 elements each
    spaceships[1][0] = 5;                // Setting an element in the created array

#### Practice #1
Run the code.

    import java.util.Arrays;
    
    class Solution {
        public static void main(String[] args) {
            int[] sportsInventory = {7, 8, 10, 3, 6}; // Represents inventory for 5 sports: soccer balls, tennis rackets, cricket bats, basketballs, volleyball
            
             // Print out the whole array
             System.out.println("Sports inventory: " + Arrays.toString(sportsInventory));
    
            // Print out the number of items for soccer balls (index 0)
            System.out.println("Soccer balls in inventory: " + sportsInventory[0]);
            
            // Finding and printing the total types of items in sports inventory
            int totalTypes = sportsInventory.length;
            System.out.println("Total types of sports items in the inventory: " + totalTypes);
        }
    }

#### Practice #2
Run the code.

    Class Solution {
        public static void main(String[] args) {
            // Creating a 2D array with quantities of different types of sports equipment.
            // The first array contains quantities of footballs, the second array - for basketballs, and the third - for volleyballs.
            int[][] equipmentStorage = {
                {15, 20}, // quantities of footballs
                {12, 25}, // quantities of basketballs
                {18, 30} // quantities of volleyballs
            };
          
            // Print out the quantity of footballs in storage without using arithmetic operations
            System.out.println("Footballs in storage - Size 1: " + equipmentStorage[0][0] + ", Size 5: " + equipmentStorage[0][1]);
        }
    }

#### Practice #3
Adjust the given code to print the number of tennis balls in the last storage compartment by using the array's length property.

    class Solution {
        public static void main(String[] args) {
            int[] tennisBalls = {50, 60, 70, 80, 90};
            // TODO: Access the last compartment's tennis balls using the array's length property
            System.out.println(tennisBalls[2]);
        }
    }

    class Solution {
        public static void main(String[] args) {
            int[] tennisBalls = {50, 60, 70, 80, 90};
            // TODO: Access the last compartment's tennis balls using the array's length property
            System.out.println(tennisBalls[tennisBalls.length - 1]);
        }
    }
#### Practice #4
There seems to be a slight hiccup when attempting to display the inventory as a neat string representation. Can you spot the bug and fix it

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            int[] equipmentQuantities = { 5, 7, 4, 9, 1 };
            System.out.println(equipmentQuantities); // Attempting to output the multidimensional array
        }
    }
    
    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            int[] equipmentQuantities = { 5, 7, 4, 9, 1 };
            System.out.println(Arrays.toString(equipmentQuantities)); // Attempting to output the multidimensional array
        }
    }

#### Practice #5
Implement the missing piece of code to count the different types of balls and retrieve a specific type from our collection.

    class Solution {
        public static void main(String[] args) {
            // TODO: Create an array to represent the quantity of four types of sports balls (4 elements in the array)
            // Let's say we have 3 footballs, 5 basketballs, 2 volleyballs, 4 tennis balls
            int array[] = {3, 5, 2, 4};
            // TODO: Print the message "Total number of sports balls: " followed by the total count
            System.out.println("Total number of sports balls: " + array.length);
            // TODO: Access and print the message "Number of volleyballs: " followed by the count of the third item in the array
            System.out.println("Number of volleyballs: " + array[2]);
        }
    }

###### feedback: asking for "total count" for the sports balls is confusing, the total count of balls is equal to the sum, maybe state as total types of balls or something of this nature‼️

#### Practice #6
Write Java code to initialize a multidimensional array representing storage for soccer balls and tennis rackets from different brands and print the total number for specific items.

    class Solution {
        public static void main(String[] args) {
            // Initialize a 2D array of integers named "sportsInventory", where the first sub-array stores
            // [0] - soccer balls, [1] - tennis rackets
            // Each array holds the quantity for different brands: [Nike, Adidas, Wilson]
            int[][] sportsInventory = { {40, 70, 0}, {25, 5, 10} };
    
            // TODO: Print the quantity of Nike soccer balls (1st element in the 1st sub-array)
            System.out.println(sportsInventory[0][0]);
            // TODO: Print the quantity of Wilson tennis rackets (3rd element in the 2nd sub-array) 
            System.out.println(sportsInventory[1][2]);
        }
    }

## Lesson 2: Java's Building Blocks: Primitive Types vs. Class Types
### 1. Dive into Primitive Types in Java
Primitive types in Java are the most fundamental form of data. Here are some examples:
    
    int myAge = 10; // integer
    float pi = 3.14f; // decimal number
    char firstInitial = 'A'; // single character
For each primitive type in Java, there's a corresponding class type. These instances convert regular data, such as `int`, `float`, or `char`, into objects with more capabilities:

    Integer ageObject = 10;
    Float piObject = 3.14f;
    Character initialObject = 'A';
They look similar to primitive types at first glance, huh? But they act almost entirely differently!

### 2. Unlocking Differences: Comparisons
Primitive and class types may seem similar, yet they differ significantly in terms of memory usage, efficiency, and value comparisons. In fact, primitive type is just a value (`5`, `3.14`, `'A'`). Class type, however, is an object that holds the value. On top of holding the value, the object provides several additional properties, methods, and characteristics.

Here is a quick comparison of primitive and class types:

* Class types take more memory, as they not only hold a value but also hold a few additional properties
* Class types can be less time-effective
* Class types are more powerful, providing more functionality for each type instance
* Class types can hold an additional `null` value (meaning "no value")
* Java is an Object-Oriented language, with class types allowing it to cover most of the needs, so they are more commonly used, especially in collections

### 3. Quick Dive: Auto-boxing & Auto-unboxing
Java compiler supports auto-boxing and auto-unboxing that allows seamless transitions between primitive types and class types. Let's observe below:

    int a = 10; // this is a primitive `int` type
    Integer aBoxed = a; // auto-boxing: int to Integer
    System.out.println(aBoxed); // prints: 10

    Integer bBoxed = 20; // this is a class type
    int b = bBoxed; // auto-unboxing: Integer to int
    System.out.println(b); // prints: 20
In this code, `a` auto-boxes from `int` to `Integer`, while `bBoxed` auto-unboxes from `Integer` to `int`. This saves us from manual conversions and calling `.intValue()` on class types in most places!

### 4. Justifying Use of Class Types Over Primitive Types
In Java, Class Types' additional capabilities have various use cases. Consider how only Class types can use built-in methods from Java's object class like `.toString()`. The `.toString()` converts our numeric or character data into a string, allowing us to use this data in ways Primitive Types don’t support:

    Integer numInt = 10;
    System.out.println(numInt.toString()); // Prints: 10
    System.out.println(numInt.toString().length()); // Prints: 2
    
    int numPrim = 10;
    System.out.println(numPrim.toString()); // Error: int cannot be dereferenced
    System.out.println(numPrim.length()); // Error: int cannot be dereferenced
Class Types also open the portal to Object-Oriented Programming in Java. So, while Primitive types handle basic tasks elegantly, Class types bring new areas within our reach!

### 5. Primitive and Class Types: Values Comparison
Let's see the difference between how you compare two values with primitive and class types. Here is how you compare the primitives:

    int x = 5;
    int y = 5;
    System.out.println(x == y); // Returns: true
With class types, the `==` operator checks the memory locations of two objects, not values. In this case, you'll need to use `.equals()` or `intValue()`:

    Integer x = 500;
    Integer y = 500;
    
    System.out.println(x == y); // Returns: false
    System.out.println(x.equals(y)); // Returns: true
    System.out.println(x.intValue() == y.intValue()); // Returns: true
Bingo! `x == y` returns `false` while `x.equals(y)` returns `true`.

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            Integer accountBalance = 5000;
            Integer depositAmount = 1500;
            
            // Updating account balance using class types and methods
            accountBalance = accountBalance + depositAmount;
            System.out.println("New account balance: " + accountBalance.toString());
        }
    }

#### Practice #2
Next, let's refine the equality check in our banking example. Instead of using the .intValue() method, use the equals() method from the Integer class to compare depositAmount directly with 5000.
 
    class Solution {
      public static void main(String[] args) {
        // Using class types with auto-boxing
        Integer accountBalance = 15000;
        Integer depositAmount = 5000;
    
        // Check if the deposit amount equals 5000
        if (depositAmount.intValue() == 5000) {
          accountBalance = accountBalance + depositAmount;
          System.out.println("New account balance: " + accountBalance);
        }
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // Using class types with auto-boxing
        Integer accountBalance = 15000;
        Integer depositAmount = 5000;
    
        // Check if the deposit amount equals 5000
        if (depositAmount.equals(5000)) {
          accountBalance = accountBalance + depositAmount;
          System.out.println("New account balance: " + accountBalance);
        }
      }
    }

#### Practice #3
Here's a piece of code designed to verify the equality of two transaction amounts. However, it contains a bug, preventing it from doing so accurately. Determine the issue and fix it to ensure the comparison works correctly.

    class Solution {
        public static void main(String[] args) {
            Integer accountBalanceBoxed = 12000;
            Integer withdrawAmountBoxed = 12000;
            
            if (accountBalanceBoxed == withdrawAmountBoxed) {
                System.out.println("Transaction Successful: Balance and Withdrawal amounts are equal.");
            } else {
                System.out.println("Transaction Failed: Balance and Withdrawal amounts are not equal.");
            }
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Integer accountBalanceBoxed = 12000;
            Integer withdrawAmountBoxed = 12000;
            
            if (accountBalanceBoxed.intValue() == withdrawAmountBoxed.intValue()) {
                System.out.println("Transaction Successful: Balance and Withdrawal amounts are equal.");
            } else {
                System.out.println("Transaction Failed: Balance and Withdrawal amounts are not equal.");
            }
        }
    }

#### Practice #4
Represent your bank account balance as a class type and print out the string length of it.

    class Solution {
        public static void main(String[] args) {
            // Define a bank account balance as a primitive type
            float accountBalancePrimitive = 1000.75f;
            
            // TODO: Convert the primitive account balance to a class type and assign it
            Float accountBalanceInteger = accountBalancePrimitive;
            // TODO: Print the class type balance to the console
            System.out.println(accountBalanceInteger);
            // TODO: Print the length of the string representation of the class type balance
            System.out.println(accountBalanceInteger.toString().length());
            // Hint: You can use 'toString()' and then 'length()' method on the class type
        }
    }

#### Practice #5
Can you manage an account balance using Java class types writing a program that simulates an account balance withdrawal?

Remember about built-in auto-boxing and auto-unboxing techniques, they make the code look much prettier.

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare an Integer variable for account balance and initialize it with a value
            Integer accountBalanceInteger = 15000;
            // TODO: Declare a primitive int variable for the withdrawal amount and initialize it with a value
            int withdrawlAmountInt = 5000;
            // TODO: Perform a withdrawal by subtracting the withdrawal amount from the account balance (consider auto-unboxing and auto-boxing)
            Integer accountBalance = accountBalanceInteger - withdrawlAmountInt;
            // TODO: Print the new account balance as a string
            System.out.println(accountBalance.toString());
        }
    }

## Lesson 3: ArrayLists
### 1. Creating an ArrayList in Java
`ArrayLists` are akin to a flexible roster of interstellar explorers; their size changes as we encounter or lose crew members. `ArrayLists`, part of Java's `Collections Framework`, elevate arrays to another level by providing more flexibility.

Constructing an `ArrayList` is akin to assembling a crew list. As shown, we declare a variable of type `ArrayList`:

    List<Integer> crewMembers = new ArrayList<>(); // creating an empty list
    List<Integer> members = Arrays.asList(1, 2, 3, 4, 5); // creating a pre-defined list
Here:

* `List<Integer>` is a general type for all lists of integers
* `crewMembers` is a list name
* new `ArrayList<>()` creates an instance of the list of integers. Note the `<>` part denoting that `ArrayList` can be of any type (`Float`, `String`, etc.), but we already specified the type when mentioning it'd be `List<Integer>` at the beginning of the definition.
* `Arrays.asList` declares a pre-defined list of integers.

Did you notice we used `List<Integer`> as a type, not `ArrayList<Integer>`? This is called abstraction, as `List<Integer>` is an interface for all lists. There is no need to understand it in detail for now, though - we'll cover it in the next courses!

### 2. Accessing ArrayList Elements
Now, let's engage with our crew. `ArrayLists` provide methods such as:

* `add(element)` - to add a new element to the end of the list.
* `get(int index)` - for accessing element at the given position `index`, starting from `0`, as in arrays.
* `set(index, value)` - for updating the value at the given position `index`, with a new `value`.
* `remove(index)` - remove the element at the given position `index`.
* `size()` - is used to determine how many elements are in the list.

        crewMembers.add(101); // Add a crew member
        crewMembers.add(102); // Add another crew member
        
        System.out.println(crewMembers.get(0)); // Output: 101. Retrieves the first crew member
        System.out.println(crewMembers.size()); // Output: 2. Finds the total number of crew members
        System.out.println(crewMembers); // Output: [101, 102]
    
        // Removing the 2nd element, the `crewMembers` list now contains a single element 101
        crewMembers.remove(1);
        System.out.println(crewMembers); // Output: [101]
  

### 3. Multidimensional ArrayLists
Now, let's add another dimension to our `ArrayList`, creating a roster of crew members. This is akin to building a multidimensional ArrayList in Java. Let's say we're grouping our crew members based on the tasks they do.

Just as we created a multidimensional array of integers before, we can create an ArrayList of ArrayLists. Essentially, each element of the outer ArrayList can hold another ArrayList, and these nested ArrayLists can also have different sizes (which is not possible for multidimensional arrays):

    // Step 1: Create the inner ArrayLists
    List<String> pilots = new ArrayList<>(); // First group, the pilots
    pilots.add("Sarah");
    pilots.add("James");
    pilots.add("John");
    
    List<String> engineers = new ArrayList<>(); // Second group, the engineers
    engineers.add("Nina");
    engineers.add("Tom");
    
    // Step 2: Add these groups to an outer ArrayList
    List<List<String>> crewGroups = new ArrayList<>(); // The crew groups
    crewGroups.add(pilots); // Adding the pilot group
    crewGroups.add(engineers); // Adding the engineer group
    
    // Let's see our crew groupings
    System.out.println(crewGroups); // Output: [[Sarah, James, John], [Nina, Tom]]
This piece of code defines two groups: one for pilots and another for engineers. Then these groups are added to an ArrayList called `crewGroups`. Each item of `crewGroups` is an ArrayList itself, therefore achieving the multidimensional structure. Printing `crewGroups` should give you `[[Sarah, James, John], [Nina, Tom]]`, showing our well-arranged crew groups, ready for interstellar exploration! You can notice that nested arrays have different sizes - 3 and 2, respectively, which wasn't possible with multidimensional arrays before.

Another way of doing the same thing in a shorter way is using `Arrays.asList`:

    List<List<String>> crewGroups = Arrays.asList(
        Arrays.asList("Sarah", "James", "John"),
        Arrays.asList("Nina", "Tom")
    );
    System.out.println(crewGroups); // Output: [[Sarah, James, John], [Nina, Tom]]
See? Fairly simple!

### 4. Comparing ArrayLists with Arrays of Primitive Types
`ArrayLists` can grow or shrink flexibly. On the other hand, arrays have a fixed size. Thus, if you're dealing with changeable elements (like our dynamic crew), opt for an `ArrayList`. But for fixed-sized elements, like a preplanned list of planets to visit, an array will suffice.

#### Practice #1
Run the code.

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            List<String> crewJobs = new ArrayList<>();
            crewJobs.add("Navigator"); // Adding a crew job
            crewJobs.add("Scientist"); // Adding another crew job
    
            // Access and print the job of the first crew member
            System.out.println("First job in the crew: " + crewJobs.get(0));
    
            // Finding out and printing the number of jobs
            System.out.println("Total jobs in the crew: " + crewJobs.size());
        }
    }

#### Practice #2
Currently, the log updates the temperature for the first day. Can you modify the code to update the temperature for the second day instead? Remember, positions in the ArrayList start from 0.

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            List<Float> temperatures = new ArrayList<>();
            temperatures.add(18.5f);
            temperatures.add(17.3f);
            temperatures.add(19.0f);
    
            // TODO: Increase yesterday's temperature by 1.1 degrees
            float newTemp = temperatures.get(0) + 1.1f;
            temperatures.set(0, newTemp);
    
            System.out.println("New temperatures: " + temperatures);
        }
    }
    
    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            List<Float> temperatures = new ArrayList<>();
            temperatures.add(18.5f);
            temperatures.add(17.3f);
            temperatures.add(19.0f);
    
            // TODO: Increase yesterday's temperature by 1.1 degrees
            float newTemp = temperatures.get(1) + 1.1f;
            temperatures.set(1, newTemp);
    
            System.out.println("New temperatures: " + temperatures);
        }
    }

#### Practice #3
correct the starship's crew list compiler. Currently, it exhibits strange behavior when updating a crew member's role. Use your knowledge of handling crew rosters to identify and fix the issue.

    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            List<String> starshipCrew = new ArrayList<>();
            starshipCrew.add("Captain Kirk");
            starshipCrew.add("Spock");
            starshipCrew.add("Dr. McCoy");
    
            // TODO: Replace 'Spock' with 'Scotty'
            starshipCrew.set("Spock", "Scotty");
    
            System.out.println("Welcome aboard the Starship, our crew members are: " + starshipCrew);
        }
    }
    
    solution.java:11: error: method set in interface List<E> cannot be applied to given types;
            starshipCrew.set("Spock", "Scotty");
                        ^
      required: int,String
      found:    String,String
      reason: argument mismatch; String cannot be converted to int
      where E is a type-variable:
        E extends Object declared in interface List
    1 error
    
    
    import java.util.*;
    
    class Solution {
        public static void main(String[] args) {
            List<String> starshipCrew = new ArrayList<>();
            starshipCrew.add("Captain Kirk");
            starshipCrew.add("Spock");
            starshipCrew.add("Dr. McCoy");
    
            // TODO: Replace 'Spock' with 'Scotty'
            starshipCrew.set(1, "Scotty");
    
            System.out.println("Welcome aboard the Starship, our crew members are: " + starshipCrew);
        }
    }

#### Practice #4
Add the missing crew roles that are crucial for any space mission to the list, then remove the role of the navigation expert, as their assignment has changed. Display the updated list of roles.

    import java.util.ArrayList;
    import java.util.List;
    
    class Solution {
        public static void main(String[] args) {
            // Define a new ArrayList to manage crew roles
            List<String> crewRoles = new ArrayList<>();
            
            // TODO: Add the role of the leader of a space mission ("Commander").
            // TODO: Add the role required for navigating and steering the spacecraft ("Navigator").
            crewRoles.add("Commander");
            crewRoles.add("Navigator");
            crewRoles.add("Scientist");
            
            // TODO: Remove the role of the navigation expert ("Navigator") using its index position.
            crewRoles.remove(1);
            // Print the new list of crew roles
            System.out.println(crewRoles); // Finish the code to see the output
        }
    }

###### feedback: did not specify an order and code provided scinetist first, but them tell me to correc to make sure commander comes first?⚠️

#### Practice #5
Your mission is to create a starship crew list. To do this, you'll need to write code from scratch that adds crew members to an ArrayList and greet the captain. Don't forget to count your crew!

    class Solution {
        public static void main(String[] args) {
            // TODO: Create a new ArrayList to hold the starship crew members.
            List<String> crewMembers= new ArrayList<>();
            // TODO: Add the name of the captain to the crew list.
            crewMembers.add("Captain Kirk");
            // TODO: Add the name of an engineer to the crew list.
            crewMembers.add("Howard Wolowitz");
            // TODO: Greet the captain using their position in the list.
            System.out.println("Welcome aboard " + crewMembers.get(0));
            // TODO: Display the total number of crew members aboard the starship.
            System.out.println(crewMembers.size());
        }
    }

## Lesson 4: Navigating through Java's HashMaps: Keys to Efficient Data Storage
### 1. Creating HashMaps in Java
Creating a `HashMap` involves declaring its data type and initializing it. Just like an `ArrayList`, `HashMaps` can only hold object types. Here's a `HashMap` that maps our spaceship crew's names (`String`) to their ages (`Integer`).

    HashMap<String, Integer> spaceshipCrew = new HashMap<>();
    System.out.println(spaceshipCrew); // Prints out: {}
The `HashMap` is empty for now, represented by `{}`.

### 2. Managing Key-Value Pairs
In our spaceship, different crew members have different roles. These roles can be linked to the crew members' ages.

Adding entries to a `HashMap` is done with `put(key, value)`. If `put()` is used with an already existing key, the old value gets replaced. `remove(key)` allows us to exclude entries from our `HashMap`.

    HashMap<String, Integer> spaceshipCrew = new HashMap<>();
    spaceshipCrew.put("Captain", 35); // Assigning age 35 for key "Captain"
    spaceshipCrew.put("Engineer", 30); // Assigning age 30 for key "Engineer"
    spaceshipCrew.put("Navigator", 32); // Assigning age 32 for key "Navigator"
    System.out.println(spaceshipCrew); // Outputs {Captain=35, Engineer=30, Navigator=32}
    
    spaceshipCrew.put("Engineer", 28); // Replaces the age of Engineer to 28
    spaceshipCrew.remove("Navigator"); // Removes Navigator key (and its value too)
    System.out.println(spaceshipCrew); // Outputs {Captain=35, Engineer=28}

### 3. Accessing Elements in HashMaps
Accessing a `HashMap` involves using the `get(key)` method with a unique key. This method returns the value for the specified key or `null` if there is no value stored for this key. For cases when you need some other default value rather than `null`, you can use `getOrDefault(key, default)` that returns a `default` value if the key doesn't exist.

Let's see how we can retrieve the engineer's age:

    HashMap<String, Integer> spaceshipCrew = new HashMap<>();
    spaceshipCrew.put("Captain", 35);
    spaceshipCrew.put("Engineer", 30);
    System.out.println("Engineer age: " + spaceshipCrew.get("Engineer")); // Outputs: "Engineer age: 30"
    System.out.println("Artist age: " + spaceshipCrew.get("Artist")); // Outputs: "Artist age: null"
    System.out.println("Artist age or default: " + spaceshipCrew.getOrDefault("Artist", 0)); // Outputs: "Artist age or default: 0"
You can see that `get()` for the existent key returned just the value, while for the non-existent key `"Artist"`, it returned `null`. In the meantime, `getOrDefault()` returned the default value `0` that we provided as a parameter.

### 4. Exploring HashMap Properties & Methods
`HashMaps` provide useful methods such as:

* `size()`: returns the count of key-value pairs
* `clear()`: clears all key-value pairs
* `containsKey()`: check if a certain key exists in the map

Let's show these in the following example:

        HashMap<String, Integer> spaceshipCrew = new HashMap<>();
        spaceshipCrew.put("Captain", 35);
        spaceshipCrew.put("Engineer", 30);
        System.out.println("Crew size: " + spaceshipCrew.size()); // Outputs: "Crew size: 2"
        System.out.println("Do we have a Navigator? " + spaceshipCrew.containsKey("Navigator"));
        // Outputs: "Do we have a Navigator? false"

#### Practice #1
Run the code.

    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
            HashMap<String, String> spaceshipRoles = new HashMap<>();
            spaceshipRoles.put("Zoe", "Pilot");
            spaceshipRoles.put("Jayne", "Mercenary");
            spaceshipRoles.put("Kaylee", "Mechanic");
            System.out.println("Kaylee's role: " + spaceshipRoles.get("Kaylee"));
            System.out.println("Do we have a Doctor? " + spaceshipRoles.containsKey("Doctor"));
        }
    }

#### Practice #2
Update the code to handle a non-existent crew member. Please change the code to retrieve the role of "Pilot", returning "Unknown role" in case this role doesn't exist in our roles' HashMap.

Notice that roles like "Biologist", "Geologist", and "Astronomer" are now the keys, and the crew members' names like "Zara", "Li", and "Omar" are the values.

    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
            HashMap<String, String> crewRoles = new HashMap<>();
            crewRoles.put("Biologist", "Zara");
            crewRoles.put("Geologist", "Li");
            crewRoles.put("Astronomer", "Omar");
    
            // TODO: Use getOrDefault to retrieve the name for the role "Pilot" 
            // and output "Unknown role" if it doesn't exist.
            System.out.println("The Biologist is " + crewRoles.get("Biologist") + ".");
        }
    }
    
    
    
    import java.util.HashMap;
    
    class Solution {
        public static void main(String[] args) {
            HashMap<String, String> crewRoles = new HashMap<>();
            crewRoles.put("Biologist", "Zara");
            crewRoles.put("Geologist", "Li");
            crewRoles.put("Astronomer", "Omar");
    
            // TODO: Use getOrDefault to retrieve the name for the role "Pilot" 
            // and output "Unknown role" if it doesn't exist.
            System.out.println("The Pilot is " + crewRoles.getOrDefault("Pilot", "Unknown role") + ".");
        }
    }

#### Practice #3
#### Practice #4
#### Practice #5

## Lesson 5
### 1. 




