<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.2: Learning Simple Data Structures in Java
## Lesson 1: Exploring Java Arrays: Creation, Accessing, and Properties

### 1. Understanding Arrays in Java
An array is a container that stores a fixed number of values of a single type. Think of it as a box that holds only tennis balls or apples. Each item in an array is an element, and their positions are called indices. Let's put this into practice:

    int[] numbers = {10, 20, 30, 40, 50}; // creates an array "numbers" of 5 integers
    Consider numbers as a box with 5 compartments, each holding a number. Simple, isn't it?

### 2. Creation of Arrays in Java
To create an array, we declare it using a type and square brackets, followed by an array name. Then, we use the new keyword to initialize it, specifying the array's length. The process looks like this:

    int[] a;                  // Declare an array
    a = new int[5];           // Initialize the array with 5 elements
    a = new int[]{1, 2, 3, 4, 5};    // Assign values 1, 2, 3, 4, 5 to the array
    In this example, we've created an array a that can hold 5 numbers.

However, as you might have noticed already, shorter forms are also available, especially when all array elements are predefined:


    int[] a = new int[]{1, 2, 3, 4, 5}; // Define and assign the array at the same time. The length (5) is defined automatically.
    int[] a = {1, 2, 3, 4, 5}; // Shorter form that does the same for pre-defined array

### 3. Accessing Elements in Arrays
Array elements are accessed using index numbers, which start from 0. For instance, a[0] refers to the first item, a[1] refers to the second item, and so on.


    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a[0]); // Output: 1
    System.out.println(a[2]); // Output: 3
    // System.out.println(a[5]); // Error - there is no such element in the array
Keep in mind that an array has a fixed size. Therefore, attempting to access a[5] or any index beyond would lead to an error.

### 4. Array Properties and Methods
An array in Java has a length property that indicates the number of elements it can hold.

    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a.length); // Output: 5
    System.out.println(a[a.length - 1]); // Output: 5 - the last element
Here, a.length gives us the size of our array, which is 5. When working with arrays, remember to specify the size during creation and avoid accessing non-existent indices.

On top of that, you can use the Arrays.toString() method to convert the array to a string. See it in action:

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
As we used a single index to access elements in a one-dimensional array, we need to use two indices to access elements in two-dimensional arrays. The first index selects the deck of the spaceship, and the second index selects the cabin number. Hence, spaceships[1][0] would select the first cabin from the second deck - number 3.

Defining multidimensional arrays can be done in a similar way:

Java
Copy to clipboard
Play
int[][] spaceships;                  // Declare a multidimensional array of integers
spaceships = new int[3][4];          // Initialize the array with 3 arrays, 4 elements each
spaceships[1][0] = 5;                // Setting an element in the created array
