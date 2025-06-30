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
Adjust the formatting of the report card in the code to widen the scores column. Change the field width from 8 to 7 for the scores in math, science, and history subjects.

    class Solution {
        public static void main(String[] args) {
            String studentName = "Lucy";
            int mathScore = 88;
            int scienceScore = 91;
            int historyScore = 76;
    
            // Using `printf` to format and print the report card directly to the console
            System.out.printf("| %-10s | %-7s | %-7s | %-7s |\n", "Name", "Math", "Science", "History");
            System.out.printf("| %-10s | %-7d | %-7d | %-7d |\n", studentName, mathScore, scienceScore, historyScore);
        }
    }


#### Practice #3
The provided code contains a small mistake — can you identify and correct it so that the report prints without any errors?

	class Solution {
	    public static void main(String[] args) {
	        String studentName = "Alex";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 75;
	        
	        String reportCard = String.format("Student: %d | Math: %d | Science: %d | Art: %d",
	                                          studentName, mathGrade, scienceGrade, artGrade);
	
	        System.out.println(reportCard);
	    }
	}
	
	Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.String
		at java.base/java.util.Formatter$FormatSpecifier.failConversion(Formatter.java:4710)
		at java.base/java.util.Formatter$FormatSpecifier.printInteger(Formatter.java:3248)
		at java.base/java.util.Formatter$FormatSpecifier.print(Formatter.java:3203)
		at java.base/java.util.Formatter.format(Formatter.java:2801)
		at java.base/java.util.Formatter.format(Formatter.java:2738)
		at java.base/java.lang.String.format(String.java:4481)
		at Solution.main(solution.java:8)
	
	class Solution {
	    public static void main(String[] args) {
	        String studentName = "Alex";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 75;
	        
	        String reportCard = String.format("Student: %s | Math: %d | Science: %d | Art: %d",
	                                          studentName, mathGrade, scienceGrade, artGrade);
	
	        System.out.println(reportCard);
	    }
	}
	 

#### Practice #4
Create a nicely formatted report card header with left alignment and a record line with right alignment.

	class Solution {
	    public static void main(String[] args) {
	        // Academic report card formatted display for a student
	        String studentName = "Leo";
	        String subject1 = "History"; // TODO: Align this subject to the left with a width of 9
	        System.out.printf("Subject 1: %-9s ", subject1);
	        String subject2 = "Math";
	        String subject3 = "Science";
	        int grade1 = 87;
	        int grade2 = 75; // TODO: Format this grade to align to the right, adding spaces to the left to a width of 7
	        System.out.printf("Grade 2: %7s ", grade2);
	        int grade3 = 92;
	        
	        // Use of String formatting to align text and numbers neatly
	        System.out.printf("| %-9s | %-7s | %-7s | %-7s |\n", "Student", subject1, subject2, subject3);
	        System.out.printf("| %-9s | %-7s | %7d | %7d |\n", studentName, grade1, grade2, grade3);
	        
	    }
	}

###### feedback: there was an error coming from the provided code (last line System.out.printf() - and the _____ had to be replaced with text alignment. Not sure if this was deliberate. Also, did not turn out 'neat', was quite unhinged actually⚠️.


#### Practice #5
Craft a neatly formatted report for a student's grades using the formatting skills you've just learned. Your output should line up the student’s name and grades in their respective columns.

	class Solution {
	    public static void main(String[] args) {
	        // Grading and report card formatting for a student
	        String studentName = "Lucy";
	        int mathGrade = 85;
	        int scienceGrade = 90;
	        int artGrade = 87;
	        System.out.println("| Name      | Math  | Science   | Art  |");
	        System.out.printf("| %-9s | %-5d | %-9d | %-5d|", studentName, mathGrade, scienceGrade, artGrade);
	        // TODO: Use String formatting to align the name and grades in a single line for a report card
	        // Outputs should look like this: | Name       | Math  | Science | Art    |
	    }
	}

	| Name      | Math  | Science   | Art  |
	| Lucy      | 85    | 90        | 87   |
 
## Lesson 3: Mastering Special Character Sequences
### 1. Introduction to Special Character Sequences
Escape sequences are characters prefixed with a backslash (`\`), which triggers unique behavior in subsequent characters. They're incredibly handy for commanding line breaks, adding tab spaces, or including a backslash or quotes in a string.

Here's an example of the newline character (`\n`) in action:
	
	public class HelloWorld {
	    public static void main(String[] args) {
	        System.out.println("Programming is fun!\nLet's learn Java together.");
	    }
	    // Output:
	    // Programming is fun!
	    // Let's learn Java together.
	}
The output appears on two separate lines!

### 2. Understanding Newline Character
Think of `\n` as your in-code line breaker. It efficiently splits the output, enhancing readability. Here's how it works:

	class Main {
	  public static void main(String[] args) {
	    System.out.println("Java\nProgramming");
	    // Output:
	    // Java
	    // Programming
	  }
	}
The output breaks "Java" and "Programming" into separate lines, all thanks to `\n`.

### 3. Exploring Tab and Backslash Characters
To insert a tab space, we use `\t`. It's useful for aligning the output or creating separations in your text.

Check out this example:

	class Main {
	  public static void main(String[] args) {
	    System.out.println("Java\tProgramming");
	    // Output: Java     Programming (with a tab space between)
	  }
	}
If you need to include a backslash in your string, you'll have to use `\\`.

	class Main {
	  public static void main(String[] args) {
	    System.out.println("Java\\Programming");
	  }
	  // Output: Java\Programming
	}
Note that there's a backslash in the output because we used `\\`. Also, note that just using a single backslash inside the string will not work and will cause a compilation error - because the backslash is a special character.

### 4. Working with Quotes in Strings
Do you wish to include quotes inside a string or inside a char? Here's how. JavaScript provides `\"` and `\'` for double and single quotes, respectively. Take a look for yourself:

	class Main {
	  public static void main(String[] args) {
	    System.out.println("Java \"Programming\" is fun");
	    System.out.println("It's okay to say \'Java is cool!\'");
	  }
	  // Output:
	  // Java "Programming" is fun
	  // It's okay to say 'Java is cool!'
	}
The output clearly illustrates how `\"` and `\'` help infuse strings with quotes!

#### Practice #1
Run the code.

	class Solution {
	    public static void main(String[] args) {
	        // Below String represents a simple formatted text editing
	        // that might be seen in a document editor.
	        // It uses the newline and tab special character sequences.
	        System.out.println("Title:\tJava String Manipulation\n\nContent:\n\tJava strings are powerful.\n\tThey can contain \"special characters\" like newline (\\n) and tab (\\t).");
	    }
	}

#### Practice #2
Your task is to include quotes around the provided proverb and the author's name in the code below. Ensure you use escape sequences correctly. Include quotes before the word The, and after step.

	class Solution {
	    public static void main(String[] args) {
	        // Printing a proverb with a newline for formatting
	        System.out.println("\"The journey of a thousand miles begins with a single step.\"\n- Author");
	    }
	}

#### Practice #3
Can you spot the bug and fix it? The code is intended to display the title and proverb on separate lines and include specific special characters.

	class Solution {
	    public static void main(String[] args) {
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	    }
	}
	
	solution.java:3: error: ')' or ',' expected
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                             ^
	solution.java:3: error: ';' expected
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                       ^
	solution.java:3: error: illegal escape character
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                                                                                   ^
	solution.java:3: error: not a statement
	        System.out.println("Document Title: "The Cosmic Code"\nFamous Proverb: To the stars, through difficulties \ through learning Java.");
	                                                        ^
	4 errors
	
	class Solution {
	    public static void main(String[] args) {
	        System.out.println("Document Title: \"The Cosmic Code\"\nFamous Proverb: To the stars, through difficulties \\ through learning Java.");
	    }
	}

#### Practice #4
Create a message titled "Java String Manipulation Guide" with a properly formatted document title, newline, and tabbed date using special character sequences.

	class Solution {
	    public static void main(String[] args) {
	      // TODO: Add a line of code that prints a formatted document title with a special sequence for a newline and then a tabbed date
	      // Output example:
	      //
	      // Document Title: "Java String Manipulation Guide"
	      //     Date: 2023-04-01
	      System.out.println("Document Title: \"Java String Manipulation Guide\"\n\t Date: 2023-04-01");
	    }
	}

#### Practice #5
You need to format a document title and sections using special character sequences, such as newlines (\n) and tabs (\t), to make them look organized. Remember what you've learned about \n and \t. It's all up to you to write the code from scratch!

	class Solution {
	    public static void main(String[] args) {
	        // TODO: Display the document title, followed by sections with appropriate tabulations and a conclusion, all separated by newlines.
	        System.out.println("Title: Java String Manipulations \n\t - Introduction \n\t - Special Characters \n\t - Practice Exercises \n Conclusion: Mastery of Java strings!");
	        // Here is an example of the output:
	        // Title: Java String Manipulations
	        //     - Introduction
	        //     - Special Characters
	        //     - Practice Exercises
	        // Conclusion: Mastery of Java strings!        
	    }
	}

## Lesson 4: Search and Replace in Java
### 1. String Searching: The 'indexOf' and 'lastIndexOf' Methods
Our exploration begins with a string search. Java provides the `indexOf()` and `lastIndexOf()` methods. `indexOf()` returns the index of the first occurrence of a substring, while `lastIndexOf()` yields the index of the last.

	String str = "Hello, CodeSignal learners!";
	System.out.println(str.indexOf("CodeSignal")); // Output: 7, as str[7:16] = "CodeSignal"
In this example, the term `"CodeSignal"` begins at index 7 in our string.

	String str = "CodeSignal is fun. I love CodeSignal!";
	System.out.println(str.lastIndexOf("CodeSignal")); // Output: 27
Notice how `"CodeSignal"` starts at index 27 in the last occurrence within our string. Efficient, isn't it?

### 2. Checking Substring Existence: The 'contains' Method
The `contains()` method confirms whether a string contains a specific sequence of characters, regardless of its location.

	String str = "Welcome to CodeSignal!";
	System.out.println(str.contains("CodeSignal")); // Output: true
This shows that `"CodeSignal"` indeed exists within our string. These practical methods empower us to tackle real-life situations!

### 3. String Replacement: The 'replace' method
Replacing specific characters within strings is simple with the `replace()` method. `replace()` substitutes all occurrences of the provided string and replaces it with another string.

	String str = "Apples are sweet. I love apples!";
	System.out.println(str.replace("apples", "oranges")); // Output: "Apples are sweet. I love oranges!"
From modifying file paths to correcting user inputs, this replacement method effortlessly incorporates changes!

#### Practice #1
Run the code.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "I love coding. Coding is fun!";
	        String filteredMessage = chatMessage.replace("Coding", "Java");
	        
	        System.out.println(filteredMessage); // Output: "I love coding. Java is fun!"
	    }
	}

#### Practice #2
Modify the code to replace another phrase in the message. This time, change the word "refrain" to "avoid" using the replace() method.

	class Solution {
	    public static void main(String[] args) {
	        // A message in an online chat room:
	        String message = "Java is fun, but please refrain from using bad words.";
	
	        // Moderating the chat by finding and replacing inappropriate language:
	        String moderatedMessage = message.replace("bad words", "****");
	        // Do one more change to replace "refrain" with "avoid"
	        String moderatedMessage2 = moderatedMessage.replace("refrain", "avoid");
	        // Display the moderated message:
	        System.out.println(moderatedMessage2);
	    }
	}

#### Practice #3
You may have noticed that some chat messages with smiles aren't displaying correctly on the screen. Can you identify and rectify the issue in this code snippet? Ensure all smiles are moderated correctly.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "I love coding with CodeSignal!! :-) Coding is fun :-)";
	        
	        String moderatedMessage = chatMessage.replace(":-)", "[smiley]");
	
	        System.out.println(moderatedMessage);
	    }
	}

#### Practice #4
Your task is to check whether a message contains a specific word in any letter case and then replace it with the correct case. Fill in the blanks to complete this operation.

	class Solution {
	    public static void main(String[] args) {
	        String chatMessage = "Java is cool! But sometimes, java can be challenging.";
	
	        // TODO: Add a condition to check if 'chatMessage' contains the word "java"
	        System.out.println(chatMessage.contains("java"));
	        // TODO: If it does contain, add a line to replace all occurrences of this word "java" with "Java"
	        System.out.println(chatMessage.replace("java", "Java"));
	        // Should replace and output: "Java is cool! But sometimes, Java can be challenging."
	    }
	}

#### Practice #5
Now, put your knowledge to the test by writing a program that filters a forbidden word from a chat message, replacing it with asterisks.

	class Solution {
	    public static void main(String[] args) {
	        String message = "The quick brown fox jumps over the lazy dog.";
	        String forbiddenWord = "lazy";
	        // TODO: Check if the message contains the forbidden word.
	        System.out.println(message.contains(forbiddenWord));
	        // TODO: If it does, replace the forbidden word with "****".
	        System.out.println(message.replace(forbiddenWord, "****"));
	        // TODO: Print the censored message.
	    }
	}


## Lesson 5: Splitting and Joining in Java for Text Wizards
### 1. Understanding String Splitting in Java
In Java, the `split()` method divides a string into several substrings based on a delimiter — a character that separates words. It stores these substrings into an array. Here's an example to clarify:

	// Our original sentence
	String sentence = "I love programming.";
	
	// Let's split it into individual words
	String[] words = sentence.split(" "); // Now words = ["I", "love", "programming."]
	System.out.println(Arrays.toString(words)); // [I, love, programming.]
In this snippet, we have a sentence that we divide into separate words using the `split()` method with a space as the delimiter. The results are stored in the array `words`.

### 2. Mastering String Joining
The `join()` method merges an array of strings back into a single string using a specified delimiter. It is the reverse of the `split()` method. Here's how it works:

	// Our original words
	String[] words = {"programming", "I" "love"};
	
	// Let's join the words into a new sentence
	String sentence = String.join(" ", words);
	
	// Now "sentence" is "programming I love"
In the example above, we took an array of words and combined them into a single string, using a space as the delimiter.

### 3. Combining Splitting and Joining
You can combine `split()` and `join()` to rearrange sentences. For instance, let's take `"I love programming"` and rearrange it to `"programming love I"`:

	String sentence = "I love programming.";
	
	// Split the sentence into words
	String[] words = sentence.split(" ");
	
	// Swap the first and third words
	String tempWord = words[0];
	words[0] = words[2];
	words[2] = tempWord;
	
	// The `words` is ["programming", "love", "I"] now
	
	// Join the words back into a sentence
	String newSentence = String.join(" ", words);
	
	System.out.println(newSentence); // Output: "programming love I"
In this example, we first split the sentence into words. Next, we swapped the first and last words, and, finally, we joined them back into a new sentence.

In fact, `String.join` is so flexible that it even allows to specify all parts to join one by one:

	System.out.println(String.join(" ", "See", "how", "you", "can", "join", "any", "number", "of", "words!"));
	// Output: See how you can join any number of words!
It's very useful at times!

#### Practice #1
Run the code.

class Solution {
    public static void main(String[] args) {
        // Quote by Frank Zappa about books needing formatting
        String quote = "So many books, so little time.";
        
        // Split the quote into words using space as the delimiter
        String[] words = quote.split(" ");
        
        // Join the words into a sentence
        String joinedQuote = String.join(" ", words);
        
        // Remove the comma from the joined sentence        
        String formattedQuote = joinedQuote.replace(",", ""); 
        
        // Print the formatted quote
        System.out.println(formattedQuote); // prints "So many books so little time."
    }
}

#### Practice #2


#### Practice #3
#### Practice #4
#### Practice #5
