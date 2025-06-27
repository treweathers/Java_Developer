<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.3: Iterations and Loops in Java
## Lesson 1: For Loops and Beyond

### 1. Understanding the Basic For Loop in Java
Understanding the Basic For Loop in Java
Imagine lining up your favorite planet toys in order. You take one, put it in line, and repeat until you run out of toys. This is precisely how the basic `for` loop works in Java!

Here's the syntax:

    for (initialization; condition; post-iteration actions) {
        // Some task to do
    }
This loop does the following:
* First, we do the `initialization`
* Then, while the `condition` is true, we keep executing the `task` inside the loop body
* After each iteration, we execute `post-iteration` actions that change the state in some way
* Now, let's demonstrate this with code that prints numbers 1 through 5:

        for (int i = 1; i <= 5; i++) {
            // The following command will print the number i
            System.out.println(i);
        }
        // Prints:
        // 1
        // 2
        // 3
        // 4
        // 5

Here, we defined an `int` variable `i`, assigned it to `1` first, and then repeated `System.out.println(i);` while `i <= 5`, incrementing `i` by `1` after every iteration. By the way, `i++` is a short form for `i += 1`, which is `i = i + 1` - so it's just adding `1` to the current value of i, but in a short way! This operation is called increment.

### 2. Enhanced For Loop
Now, remember flipping pancakes? You pour one pancake, let it cook, then pour the next one, continuing until the batter is finished. Guess what? The enhanced `for` loop operates in a similar fashion!

Here's an example of printing all elements of an array:

    int[] numbers = {5, 4, 3, 2, 1};
    
    // The loop below will take each element num from numbers and print it
    for (int num: numbers) {
        System.out.println(num);
    }
    // Prints:
    // 5
    // 4
    // 3
    // 2
    // 1
Quite the pancake flipper, isn't it?

### 3. Difference Between the Basic For Loop and the Enhanced For Loop
You'd typically use a basic `for` loop when you need to perform a task a specific number of times. In contrast, an enhanced `for` loop is your go-to when you have a collection (like an array, list, map, or set) and need to perform an action for each item in that collection.

Let's illustrate with both loops printing numbers from an array:

##### Basic for loop:

    // This loop will print all numbers from the numbers array using its indices
    int[] numbers = {1, 2, 3, 4, 5};
    
    // `i` goes through all array indices - 0, 1, 2, ..., numbers.length - 1
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    // Prints:
    // 1
    // 2
    // 3
    // 4
    // 5
###### Enhanced for loop:

    // This loop will print all numbers from the numbers array, directly taking each of them
    int[] numbers = {1, 2, 3, 4, 5};
    
    for (int num: numbers) {
        System.out.println(num);
    }
    // Prints:
    // 1
    // 2
    // 3
    // 4
    // 5

#### Practice #1
Run the code.
    
    class Solution {
        public static void main(String[] args) {
            // Create an array representing planets in the solar system
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            
            // Using basic for-loop to iterate through all planets
            for (int i = 0; i < planets.length; i++) {
                System.out.println("Visiting planet: " + planets[i]);
            }
            System.out.println();
            
            // Use enhanced for loop to visit each planet and print its name
            for (String planet : planets) {
                System.out.println("Visiting planet: " + planet);
            }
        }
    }

#### Practice #2

#### Practice #3

#### Practice #4

#### Practice #5

