//Course 1.5: Java String Manipulation for Beginners

class Test5 {
//LESSON 1: Java String Operations: Concatenation, Comparison, and Essential Methods
//#### Practice #3: Modify the given code to print not the raw compareTo result but a textual human-readable explanation instead. Remember - when the compareTo result is 0 - strings are equal, when it is negative - the first string is alphabetically smaller, and when it is positive - the first string is alphabetically larger. 
    public static void main(String[] args) {
        String bookTitle = "Cosmic Java";
        String anotherTitle = "Astronomy for Dummies";
        int titleComparison = bookTitle.compareTo(anotherTitle);
        // Output the comparison result
        if (titleComparison == 0) {
            System.out.println("book titles are equal alphabetically!");
        }
        // TODO: Change the output to print explanation like "'<Title 1>' comes before '<Title 2>' alphabetically" instead
        else if (titleComparison < 0)
        {
            System.out.println(bookTitle + " is less than " + anotherTitle + " alphabetically");
        }
        else  {
            System.out.println(bookTitle + " is more than "+ anotherTitle + " alphabetically");
        }
//#### Practice #6: Create a catalog entry for your favorite book in the library system. Remember to concatenate the title, the word 'by', and the author's name. Then, convert the entry to uppercase and calculate its length. Display the final catalog entry with its character count!
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

        
//LESSON 2: String Formatting in Java: Enhancing Readability of Your Data
//#### Practice #5: Craft a neatly formatted report for a student's grades using the formatting skills you've just learned. Your output should line up the student’s name and grades in their respective columns.
        // Grading and report card formatting for a student
        String studentName = "Lucy";
        int mathGrade = 85;
        int scienceGrade = 90;
        int artGrade = 87;
        // TODO: Use String formatting to align the name and grades in a single line for a report card
        System.out.println("| Name      | Math  | Science   | Art  |");
        // Outputs should look like this: | Name       | Math  | Science | Art    |
        System.out.printf("| %-9s | %-5d | %-9d | %-5d|", studentName, mathGrade, scienceGrade, artGrade);

//LESSON 3: Mastering Special Character Sequences
//#### Practice #5: You need to format a document title and sections using special character sequences, such as newlines (\n) and tabs (\t), to make them look organized. Remember what you've learned about \n and \t. It's all up to you to write the code from scratch!
        // TODO: Display the document title, followed by sections with appropriate tabulations and a conclusion, all separated by newlines.
        System.out.println("Title: Java String Manipulations \n\t - Introduction \n\t - Special Characters \n\t - Practice Exercises \n Conclusion: Mastery of Java strings!");
        // Here is an example of the output:
        // Title: Java String Manipulations
        //     - Introduction
        //     - Special Characters
        //     - Practice Exercises
        // Conclusion: Mastery of Java strings!

//LESSON 4: Search and Replace in Java
//#### Practice #5: Now, put your knowledge to the test by writing a program that filters a forbidden word from a chat message, replacing it with asterisks.
        String message = "The quick brown fox jumps over the lazy dog.";
        String forbiddenWord = "lazy";
        // TODO: Check if the message contains the forbidden word.
        System.out.println(message.contains(forbiddenWord));
        // TODO: If it does, replace the forbidden word with "****".
        // TODO: Print the censored message.
        System.out.println(message.replace(forbiddenWord, "****"));
 
//LESSON 5: Splitting and Joining in Java for Text Wizards
//#### Practice #5: You're almost a master at manipulating strings, Space Voyager! Your final challenge is to extract a fragment from a famous quote. Begin by identifying the last three individual words and use what you've learned about string joining to unite them into a new snippet.
        String quote = "To be, or not to be: that is the question.";

        // TODO: Split the quotation into an array of words
        String [] words = quote.split(" ");
        // TODO: Use String.join() to concatenate the last three words into a short snippet
        String joinedWords = String.join( " ", words[7], words[8], words[9]);
        // TODO: Now, print out the snippet of the joined three last words
        System.out.println(joinedWords);
    }
}