//Course 1.2: Learning Simple Data Structures in Java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Test2 {
//LESSON 1: Java Arrays: Creation, Accessing, and Properties
//#### Practice #6: Write Java code to initialize a multidimensional array representing storage for soccer balls and tennis rackets from different brands and print the total number for specific items.
    public static void main(String[] args) {
        // Initialize a 2D array of integers named "sportsInventory", where the first sub-array stores
        // [0] - soccer balls, [1] - tennis rackets
        // Each array holds the quantity for different brands: [Nike, Adidas, Wilson]
        int[][] sportsInventory = { {40, 70, 0}, {25, 5, 10} };

        // TODO: Print the quantity of Nike soccer balls (1st element in the 1st sub-array)
        System.out.println(sportsInventory[0][0]);
        // TODO: Print the quantity of Wilson tennis rackets (3rd element in the 2nd sub-array) 
        System.out.println(sportsInventory[1][2]);

//LESSON 2: Java's Building Blocks: Primitive Types vs. Class Types
//#### Practice #5: Can you manage an account balance using Java class types writing a program that simulates an account balance withdrawal? Remember about built-in auto-boxing and auto-unboxing techniques, they make the code look much prettier.
        // TODO: Declare an Integer variable for account balance and initialize it with a value

//**Q: WHAT IS DIFFERENCE BETWEEN Intefer and Int: Integer can be null, can be, directly stored in collections like HashMap and ArrayList, and has built-in methods like .toString(), java may convert this for you

        Integer accountBalanceInteger = 15000;
        // TODO: Declare a primitive int variable for the withdrawal amount and initialize it with a value
        int withdrawlAmountInt = 5000;
        // TODO: Perform a withdrawal by subtracting the withdrawal amount from the account balance (consider auto-unboxing and auto-boxing)
        Integer accountBalance = accountBalanceInteger - withdrawlAmountInt;
        // TODO: Print the new account balance as a string
        System.out.println(accountBalance.toString());

//LESSON 3: ArrayLists 
//#### Practice #5: Your mission is to create a starship crew list. To do this, you'll need to write code from scratch that adds crew members to an ArrayList and greet the captain. Don't forget to count your crew!
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

//LESSON 4: Navigating through Java's HashMaps: Keys to Efficient Data Storage
//#### Practice #5: Create a HashMap to track the roles and ages of your crew members, and display a specific member's age (if the key doesn't exist, return the age of 0 instead).
        // TODO: Initialize a HashMap to keep track of the crew members' roles and ages.
        HashMap <String, Integer> crewRoles = new HashMap<>();
        // TODO: Add a few crew members to the HashMap with their roles as keys and ages as values.
        crewRoles.put("Biologist", 21);
        crewRoles.put("Astrophysicist", 22);
        // TODO: Print the overall size of the mission crew
        System.out.println(crewRoles.size());
        // TODO: Retrieve and display the age of the Biochemist.
        System.out.println(crewRoles.getOrDefault("Biochemist", 0));
        // If there is no Biochemist, return the age of 0

//LESSON 5: HashSet in Java
//#### Practice #5: Create a catalog of unique space objects — but be careful. Space does not appreciate repetitions. Write the code to manage your set of celestial discoveries.
        // TODO: Create a HashSet to store unique space objects - Black Hole, Nebula, and Quasar
        HashSet<String> spaceObjects = new HashSet<>();
        spaceObjects.add("Black Hole");
        spaceObjects.add("Nebula");
        spaceObjects.add("Quasar");
        // TODO: There's been a mistake! Remove an incorrectly added Nebula space object from the set.
        spaceObjects.remove("Nebula");
        // TODO: Display whether the removed object is still in the set (it should not be)
        System.out.println("Is Nebula still present in the set? " + spaceObjects.contains("Nebula"));
        // TODO: Print out the total count of unique space objects in your catalog
        System.out.println(spaceObjects.size());
    }
}
