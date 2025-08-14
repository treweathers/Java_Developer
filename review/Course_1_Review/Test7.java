//Course 1.7: Object-Oriented Programming in Java

class Test7 {
    public static void main(String[] args) {
//FROM LESSON 1
        // TODO: Create a Car object.
        Car myCar = new Car();
        // TODO: Call the method you defined in the Car class to imitate a horn sound.
        myCar.honk();

//FROM LESSON 3
        // TODO: Create a Car object with your chosen model and color, then print out its details
        Car2 newCar = new Car2("Camry", "Transparent");
        System.out.println("My car is a " + newCar.color + " " + newCar.model);

//FROM LESSON 4
        Car3 myCar1 = new Car3();
        // TODO: Set the model name of myCar to "Tesla Model S"
        myCar1.setModel("Tesla Model 5");
        // TODO: Set the year of myCar to 2021
        myCar1.setYear(2021);
        // TODO: Print the model name and year of myCar to the console
        System.out.println(myCar1.getModel() + " " + myCar1.getYear());

//FROM LESSON 5: PRACTICE 2
        Zebra zebra = new Zebra();
        zebra.eat();

        Lion lion = new Lion();
        lion.eat();
//FROM LESSON 5: PRACTICE 5
        Giraffe g = new Giraffe();
        g.eat();
        g.breathe();

//FROM LESSON 6: PRACTICE 5
        // TODO: Instantiate 'Smartphone', call 'connectToInternet', and observe overridden behavior
        CellPhone2 phone = new Smartphone();
        phone.connectToInternet();
        }
    }

//LESSON 1: Creating and Using Classes
//#### Practice #5: You've learned how to create and use a class and its methods. Now, it's time to apply that knowledge. Write a Car class with a method to imitate the sound of a horn; then create a Car object and call your method in the main function.
// TODO: Define a class named 'Car'
class Car {
// TODO: In the Car class, define a method 'honk' that prints the sound a car horn makes.
    void honk() {
        System.out.println("honkkkkkkk");
    }
}

//LESSON 2: Class Attributes and Methods in Java
//#### Practice #5: Create a CellPhone class with attributes and methods that allow it to dial and hang up a call. This will test your understanding of classes, attributes, and methods in Java.
class CellPhone {
    // TODO: Define attributes for the brand and model of the phone
    String brand = "iPhone";
    String model = "4";
    // TODO: Create a method `callDial` taking a parameter `long phoneNumber` to simulate dialing a phone number (just print a message to the console)
    void callDial (long phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " on my " + brand + model);
    }    
    // TODO: Create a method `hangUp` to simulate ending a call (just print a message to the console)
    void hangUp () {
        System.out.println("Hanging up...");
    }  
}

//LESSON 3: An Introduction to Java Constructors
//#### Practice #5: Now, let's build a Car class from scratch. Remember, the Car class needs a constructor that sets the car's model and color. Then, in your Solution class, create an object of Car with your favorite car model and color, and print them out.
class Car2 {
    // TODO: Declare attributes for model and color
    String model;
    String color;
    // TODO: Create a constructor to initialize model and color
    Car2(String model, String color) {
      this.model = model;
      this.color = color;
    }
}

//LESSON 4: Java's Building Blocks: Encapsulation of Attributes and Methods
//### Practice #5: Create a Car class with private attributes and provide public getter and setter methods to access them. Remember to follow good encapsulation practices and control how these attributes are accessed and modified.
class Car3 {
    // TODO: Declare private attributes for the Car class (model name as a String, year as an int)
    private String model;
    private int year;
    // TODO: Define a public getter method for the model name
    public String getModel() {
        return this.model;
    }
    // TODO: Define a public setter method for the model name
    public void setModel (String newModel) {
        this.model = newModel;
    }
    // TODO: Define a public getter method for the year
    public int getYear() {
        return this.year;
    }
    // TODO: Define a public setter method for the year
    public void setYear (int newYear) {
        this.year = newYear;
    }
}

//LESSON 5: Mastering Interfaces, Abstract Classes, and Simple Inheritance in Java
//#### Practice #2: We have two classes, Zebra and Lion, each having their own eat() method. However, to make things more organized, please unite these two classes under an interface Animal containing a single method eat(), to make these classes have a common ground.
    interface Animal {
         void eat();
    }
    // 'Zebra' class
    class Zebra implements Animal {
        // Implement the 'eat' method for 'Zebra'
        public void eat() {
            System.out.println("Eating tall grass in the savanna...");
        }
    }
    // 'Lion' class
    class Lion implements Animal {
        // Implement the 'eat' method for 'Lion'
        public void eat() {
            System.out.println("Eating meat...");
        }
    }
//#### Practice #5: Create an abstract class Animal with an abstract method eat and a concrete method breathe. Then, create a class Giraffe that extends Animal and implements eat. Have the Giraffe munch on some leaves and breathe the fresh savanna air!
// TODO: Create an abstract class named 'Animal'. It should have an abstract method 'eat' and a concrete method 'breathe'.
abstract class Animal2 {
    abstract void eat();
    public void breathe() {
        System.out.println("Breathing...");
    }
}
// TODO: Create a class named 'Giraffe' that extends 'Animal'. Provide an implementation for the 'eat' method.
class Giraffe extends Animal2 {
    public void eat() {
        System.out.println("Eating...");
    }
}

//LESSON 6: Java Inheritance: Mastering Method and Attribute Overriding
//#### Practice #5: You'll write code to simulate how a Smartphone can connect to the internet differently from a CellPhone. Remember to use method overriding to achieve this functionality.
    // TODO: Create a class 'CellPhone' with a method 'connectToInternet' that prints a message (connecting through 3G)
    class CellPhone2 {
        public void connectToInternet() {
            System.out.println("connecting through 3G");
        }
    }
    // TODO: Create another class, 'Smartphone', that extends 'CellPhone' and overrides 'connectToInternet' method to connect through Wi-Fi
    class Smartphone extends CellPhone2 {
        public void connectToInternet() {
              System.out.println("connecting through Wi-Fi");      
        }
    }