<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.5: Java String Manipulation for Beginners
## Lesson 1: Revising String Concatenation
We already know what concatenation is and how it works, but worth revising it quickly! Concatenation means joining things together and is a crucial string operation. In Java, we accomplish this with the `+` operator or using `StringBuilder`.
    
    String hello = "Hello, ";
    String world = "World!";
    String greeting = hello + world; // "Hello, World!"

In this case, `"Hello, "` and `"World!"` are combined to form one string: `"Hello, World!"`.

### 2. Comparing Strings
There are often times when we need to compare Strings. Unfortunately, just a common comparison operators `==` and `<` will not work here. To accomplish this in Java, we use the `equals()` and `compareTo()` methods.

The `equals()` method, as the name suggests, checks if two Strings are identical.

    String firstWord = "Hello";
    String secondWord = "Hello";
    boolean areEqual = firstWord.equals(secondWord); // true
    System.out.println(areEqual); // Outputs: true
Here, since `firstWord` and `secondWord` are equal, `areEqual` is true.

The `compareTo()` method, on the other hand, is used to compare two strings alphabetically. `compareTo()` will return 0 if the strings are equal, a negative number if the first string comes first alphabetically, and a positive number otherwise.

    String firstWord = "Apple";
    String secondWord = "Banana";
    int comparisonResult = firstWord.compareTo(secondWord); // A negative number because 'Apple' comes before 'Banana' alphabetically.
    System.out.println(firstWord + " is less than " + secondWord + "? Comparison result: " + comparisonResult);
    // Apple is less than Banana? Comparison result: -1
As you can see, the comparison result is negative, meaning that `"Apple"` is alphabetically smaller than `"Banana"`

### 3. Important String Methods
Now, let's explore the other common String methods:

* `length()`: This method returns the number of characters in the String.

      String word = "Hello";
      int length = word.length(); // 5
* `substring(int beginIndex, int endIndex)`: This method returns the section of the original String from `beginIndex `(inclusive) to `endIndex` (exclusive).

      String sentence = "Hello, World!";
      String word = sentence.substring(0, 5); // "Hello"
* `toLowerCase()` and `toUpperCase()`: These methods return the string in either lowercase or uppercase, respectively.

      String word = "Hello";
      String lowerCaseWord = word.toLowerCase(); // "hello"
      String upperCaseWord = word.toUpperCase(); // "HELLO"
* `trim()`: This method removes all white spaces at the beginning and the end of the String.

      String sentence = " Hello, World!   ";
      String trimmedSentence = sentence.trim(); // "Hello, World!"

