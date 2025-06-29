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
Let's try cataloging a book by completing the code to give it an entry and display it correctly.

    class Solution {
        public static void main(String[] args) {
            String author = "J.K. Rowling";
            String title = "Harry Potter";
            // TODO: Concatenate title and author in uppercase using + operator and store it in catalogEntry.
            String catalogEntry = title.toUpperCase() + " BY " + author.toUpperCase();
            // TODO: Print out the catalog display, replacing the last word "ROWLING" with "R...".
            System.out.println(catalogEntry.substring(0, 20) + "R...");
            // The output should be: HARRY POTTER BY J.K. R...
        }
    }
#### Practice #6
Create a catalog entry for your favorite book in the library system. Remember to concatenate the title, the word 'by', and the author's name. Then, convert the entry to uppercase and calculate its length. Display the final catalog entry with its character count!

    class Solution {
        public static void main(String[] args) {
            // TODO: Declare a string variable for the book title and initialize it with your favorite book's title.
            String title = "Divergent";
            // TODO: Declare a string variable for the book author's name.
            String author = "Veronica Roth";
            // TODO: Concatenate the book title, the word 'by', and the author's name into one string.
            // For example: Cosmic Java by Raj Comet
            String catalogEntry = title + " by " + author;
            // TODO: Convert the entire string to uppercase - this way we obtain the catalog entry name
            String catalogEntryU = catalogEntry.toUpperCase();
            // TODO: Calculate the length of the entire string.
            int catalogEntryL = catalogEntryU.length();
            // TODO: Print out the catalog entry in uppercase and its character length.
            System.out.println(catalogEntryU + " " + catalogEntryL);
        }
    }

## Lesson 2: String Formatting in Java: Enhancing Readability of Your Data
### 1. Fundamentals of String Formatting in Java
Our journey begins with understanding the concept of String formatting. This concept reshapes the way we view a string. In Java, it's somewhat akin to enhancing the appearance of existing data. Specifically, format strings are tools we use to 'dress up' our data. These strings employ a delimiter `%`, along with flags, width, and precision specifications to format the data. A simple example can illustrate this concept quite well:

    String name = "Tom";
    String greeting = String.format("Hello, %s!", name);
    System.out.println(greeting);  // Prints: Hello, Tom!
In this instance, we used `%s` - a placeholder for a string - that gets replaced by the string `Tom`.

The other available options include:

* `%d` - integer number
* `%f` - float number

### 2. Control Over Formatting With Width and Precision
Let's explore how `width` and `precision` can further refine the display of our string. `Width` allows us to define a minimum number of characters, while precision sets the limit on the number of decimal digits or characters in a string:

    int number = 123;
    double percentage = 90.32167;
    
    // `%5d` specifies a minimum width of 5 characters for an integer, adding extra whitespaces to the beginning
    // `%-5d` is the same as `%5d`, but whitespaces are now added to the end of the number
    // `%.2f` limits the output to 2 decimal digits for a float number
    String formatted = String.format("Number: %5d, Percentage: %.2f", number, percentage);
    System.out.println(formatted);  // Prints: Number:   123, Percentage: 90.32
    String formattedRight = String.format("Number: %-5d, Percentage: %.2f", number, percentage);
    System.out.println(formattedRight);  // Prints: Number: 123  , Percentage: 90.32
In this case, additional spaces for `number` are padded to print 5 characters (even though the number has just 3 digits), and `percentage` is truncated to two decimal places. When we use `formattedRight` and `%-5d`, extra whitespaces are added to the right instead.

### 3. Padding and Aligning Strings
To enhance the data display, we can adjust alignment and padding, filling extra spaces with specific characters. In this example, we fill the additional spaces with `0`:

    int number = 10;
    // `%05d` specifies the number will be returned with 5 characters in it, extra digits will be filled with 0
    String formatted = String.format("Number [%05d]", number);
    System.out.println(formatted); // Prints: Number [00010]
This is particularly useful when numbers need to align to the right and have the same number of digits.

### 4. Use of 'printf' and 'String.format' for Formatting
Java provides `printf`, an alternative to `String.format`, for string formatting. `printf` is similar to `String.format`, but it prints directly to the console. Here's how it works:

    int number = 123;
    System.out.printf("Number: [%05d]", number);  // Prints: Number: [00123]

### 5. Real-world Examples and Applications of String Formatting
To wrap up, let's consider a practical application of string formatting. Suppose we need to print a report on students' grades in a table-like structure:

    String header = String.format("| %-10s | %-5s | %-5s | %-5s |", "Name", "Math", "Sci", "Art");
    String johnData = String.format("| %-10s | %-5d | %-5d | %-5d |", "John", 78, 82, 94);
    String annaData = String.format("| %-10s | %-5d | %-5d | %-5d |", "Anna", 92, 87, 88);
    
    System.out.println(header);   // Prints: | Name       | Math  | Sci   | Art   |
    System.out.println(johnData); // Prints: | John       | 78    | 82    | 94    |
    System.out.println(annaData); // Prints: | Anna       | 92    | 87    | 88    |
Such formatting substantially improves data readability.

This example is pretty advanced, so don't hesitate to ask me to clarify it if you need any help!

#### Practice #1
Run the code.

class Solution {
    public static void main(String[] args) {
        // Create a formatted String for a students grade report.
        String studentName = "Alice";
        int mathsGrade = 85;
        int scienceGrade = 90;
        int artGrade = 75;

        // Format and print the report card for the student
        String reportCard = String.format("| %-14s | %-3d | %-3d | %-3d |", 
                                          studentName, mathsGrade, scienceGrade, artGrade);
        System.out.println("| Name           | Mth | Sci | Art |");
        System.out.println("----------------------------------");
        System.out.println(reportCard);
    }
}


#### Practice #2
#### Practice #3
#### Practice #4
#### Practice #5
