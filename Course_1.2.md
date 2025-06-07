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


