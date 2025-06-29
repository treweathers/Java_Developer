<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.5: Java String Manipulation for Beginners
## Lesson 1: Java String Operations: Concatenation, Comparison, and Essential Methods
### 1. Revising String Concatenation
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

#### Practice #1
Run the code.

    class Solution {
        public static void main(String[] args) {
            String bookTitle = "The Adventures of Cosmo";
            String author = "Coder Kid";
            String librarySection = "Children's Books";
            
            String catalogEntry = bookTitle + " by " + author + " - " + librarySection;
            System.out.println(catalogEntry);
        }
    }

#### Practice #2
Run the code.

    class Solution {
        public static void main(String[] args) {
            String bookTitle1 = "The Cosmic Code";
            String bookTitle2 = "Quantum Cosmos";
    
            System.out.println("Book titles are: \"" + bookTitle1 + "\" and \"" + bookTitle2 + "\"");
            System.out.println("Titles are the same? " + bookTitle1.equals(bookTitle2));
            System.out.println("Alphabetical comparison result: " + bookTitle1.compareTo(bookTitle2));
        }
    }

#### Practice #3
Modify the given code to print not the raw compareTo result but a textual human-readable explanation instead. Remember - when the compareTo result is 0 - strings are equal, when it is negative - the first string is alphabetically smaller, and when it is positive - the first string is alphabetically larger.

    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String anotherTitle = "Astronomy for Dummies";
            int titleComparison = bookTitle.compareTo(anotherTitle);
    
            // Output the comparison result
            if (titleComparison == 0) {
                System.out.println("book titles are equal alphabetically!");
            }
            else if (titleComparison < 0)
            {
                System.out.println(bookTitle + " is less than " + anotherTitle + " alphabetically");
            }
            else  {
                System.out.println(bookTitle + " is more than "+ anotherTitle + " alphabetically");
            }
            // TODO: Change the output to print explanation like "'<Title 1>' comes before '<Title 2>' alphabetically" instead
        }
    }

#### Practice #4
Run the code and use what you've learned to fix it.

    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String modifiedTitle = bookTitle.toUpperCase().substring(0, 6) + " Adventures";
            String anotherBookTitle = "COSMOS Java";
            
            System.out.println(anotherBookTitle);       
            System.out.println(modifiedTitle);
            if (modifiedTitle == anotherBookTitle) {
                System.out.println("Both titles are the same.");
            } else {
                System.out.println("Titles are different.");
            }
        }
    }
    
    COSMOS Java
    COSMIC Adventures
    Titles are different.
    
    class Solution {
        public static void main(String[] args) {
            String bookTitle = "Cosmic Java";
            String modifiedTitle = bookTitle.toUpperCase().substring(0, 6) + " Adventures";
            String anotherBookTitle = "COSMOS Java";
            
            System.out.println(anotherBookTitle);       
            System.out.println(modifiedTitle);
            if (modifiedTitle.equals(anotherBookTitle)) {
                System.out.println("Both titles are the same.");
            } else {
                System.out.println("Titles are different.");
            }
        }
    }

###### feedback: says not working as intended, but is working perfectly, just not technically corrrect in method of comparing strings. Should have used methods and not standard comparison operators. Output is exactly the same⚠️.

#### Practice #5


#### Practice #6
