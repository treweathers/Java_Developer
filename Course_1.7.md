<h1 align='center'> Course 1: Java Programming for Beginners </h1> 

# Course 1.7: Object-Oriented Programming in Java
## Lesson 1: Creating and Using Classes
### 1. What is a Class in Java?
In Java, a class is a cornerstone tool. It is a blueprint from which we create objects. For example, a `Bicycle` class could include attributes such as `gear` and `speed`, as well as methods such as `applyBrake` and `changeGear`. Just as a caterer uses a recipe to make cookies, we use classes to create objects in programming.

### 2. Creating a Class in Java
The creation of a `class` begins with the class keyword, followed by a unique class name. It's standard in Java for class names to begin with a capital letter. Here's how to define an empty class called `MyClass`:

    class MyClass {
      // class body
    }
To create an object - an instance of the class - we use `new` along with the class name:

    MyClass myObject = new MyClass();
### 3. Methods in a Class
Objects perform actions (or stop them) through methods. A method is a set of instructions that performs an action when executed. In our class, we define a method to display a message. This syntax requires a return type, a name, and parentheses `()`.

    class MyClass {
      // The return type `void` indicates that this showMessage method does not return any value.
      void showMessage() {
        // Print the string "Hello World!" to the console.
        System.out.println("Hello World!");
      }
    }
### 4. Using the Class and its Method
Now, we create an object and call our method. To invoke a method, we use dot notation `.` on the object, followed by the method name and parentheses:

    class MyClass {
      // showMessage method
      void showMessage() {
        System.out.println("Hello World!");
      }
      
      public static void main(String[] args) {
    
        // Create an object from MyClass 
        MyClass myObject = new MyClass();
    
        // Call the showMessage method
        myObject.showMessage(); // Prints: Hello World!
      }
    }
The program prints `"Hello World!"` to the console. We've now executed a method with an object successfully!

#### Practice #1
Run the code.

    class Automobile {
        void startEngine() {
            System.out.println("The engine is starting!");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Automobile myCar = new Automobile();
            myCar.startEngine(); // This will print "The engine is starting!"
        }
    }

#### Practice #2
Let's make some tweaks:

Rename the class to Car instead of Automobile;
Add one more class method stopEngine that prints a message about engine stop. Don't forget to call this method afterward!

    class Car {
      // Define a method within the class
      void startEngine() {
        System.out.println("Vroom! The car engine starts.");
      }
      void stopEngine() {
        System.out.println("Scrreeeech! The car engine stops.");
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // Create an object of the Automobile class
        Car car = new Car();
        
        // Calling the startEngine method on the car object
        car.startEngine(); // It should print: "Vroom! The car engine starts."
        car.stopEngine();
      }
    }

#### Practice #3
Troubleshoot the Car class's startEngine method in the Java simulator. The engine should start with a "Vroom vroom!" message when the method is called correctly. However, due to a bug, the car is not starting as expected. Identify and fix the issue by applying the Java naming conventions and object-oriented principles taught in the lesson.

    class Car {
        void startEngine() {
            System.out.println("The engine has started. Vroom vroom!");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = null;
            myCar.startEngine();
        }
    }
    
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Car.startEngine()" because "<local1>" is null
    	at Solution.main(solution.java:10)
    
     class Car {
        void startEngine() {
            System.out.println("The engine has started. Vroom vroom!");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.startEngine();
        }
    }

#### Practice #4
Fill in the blank to make the car do something when we start 

    class Car {
      // TODO: Define a method inside the Car class that prints a message when the car's engine starts.
      void carEngine() {
        System.out.println("Car is exploding😵!");
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        Car myCar = new Car(); // Creating an instance of Car class
        myCar.carEngine();;   // TODO: Call the method you've defined in the Car class to start the engine
      }
    }


#### Practice #5
You've learned how to create and use a class and its methods. Now, it's time to apply that knowledge.

Write a Car class with a method to imitate the sound of a horn; then create a Car object and call your method in the main function.

    // TODO: Define a class named 'Car'
        // TODO: In the Car class, define a method 'honk' that prints the sound a car horn makes.
    class Car {
        void honk() {
            System.out.println("honkkkkkkk");
        }
    }
    class Solution {
        public static void main(String[] args) {
            // TODO: Create a Car object.
            Car myCar = new Car();
            myCar.honk();
            // TODO: Call the method you defined in the Car class to imitate a horn sound.
        }
    }

## Lesson 2: Class Attributes and Methods in Java
### 1. Understanding Class Attributes
Class `attributes` symbolize an object's properties. For instance, the attributes of a `CellPhone` might be its `brand` and `model`:

    public class CellPhone {
        public String brand; // Brand of the phone
        public String model; // Model of the phone
    }
Sometimes, attributes remain constant after initial set-up. The `final` keyword aids in creating such attributes. Let's add a `chargerType` attribute, which will be constant:

    public class CellPhone {
        public String brand;
        public String model;
        public final String chargerType = "Type-C"; // A constant attribute
    }
### 2. Understanding Class Methods
`Methods` are a class's behaviors, while `attributes` are its properties. For our `CellPhone`, a `callDial` method might be used to start a phone call:

    public class CellPhone {
        public String brand = "iPhone";
        public String model = "15 Pro Max";
        public final String chargerType = "Type-C";
    
        public void callDial(long phoneNumber) {
            // Calling the given phone number, including class attributes
            System.out.println("Dialing " + phoneNumber + " from my " + brand + " " + model);
        }
    }
Just as we humans can perform various tasks, our objects can possess more than one method. For instance, let's add another method, `hangUp`:

    public void hangUp() {
        // Call has ended
        System.out.println("Call ended.");
    }
To run this code, we can instantiate a class and call a method for the created instance:

    CellPhone cellPhone = new CellPhone();
    cellPhone.callDial("+1-212-456-7890"); // Prints: Dialing +1-212-456-7890 from my iPhone 15 Pro Max
    cellPhone.hangUp(); // Prints: Call ended.
### 3. Modifying Class Attributes
Methods can interact with and modify class attributes. This can be illustrated with an `updateModel` method that updates the `model`:

    public void updateModel(String newModel) {
        // Updating the model attribute
        this.model = newModel;
        System.out.println("Model updated to " + newModel);
    }
Here, the `this` keyword refers to the current instance of the class object. It means that we are setting the `model` field in the current `CellPhone` class object to `newModel`.

#### Practice #1
Run the code.

    // CellPhone class with Class Attributes and Methods.
    class CellPhone {
        String brand = "Galaxy";
        String model = "S21";
        final String chargerType = "Type-C";
    
        void makeCall() {
            System.out.println("Calling from " + brand + " " + model + " using " + chargerType + " charger...");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.makeCall(); // Invoking the method to simulate making a call.
        }
    }

#### Practice #2
Enhance the CellPhone class by adding an attribute that represents the software version. Then, create a simple updateSoftware method to change this version. This will demonstrate how methods can modify class attributes.

    class CellPhone {
        String brand = "AnyBrand";
        String model = "AnyModel";
        final String chargerType = "MicroUSB";
        String softwareVersion = "v1.0"; // New attribute for software version
        void updateSoftware(String newSoftware) {
            this.softwareVersion = newSoftware;
        }
        // Create a method to update the softwareVersion here        
    }
    
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            // Update `myPhone`s software version using the method you created
            myPhone.updateSoftware("v2.0");
            System.out.println(myPhone.softwareVersion);
        }
    }

#### Practice #3
Your mission is to ensure your CellPhone is functional for interstellar communication. There's a slight problem: the code responsible for initiating calls is not using the model and brand variables correctly. Run the code and apply your fresh Java skills to resolve this, ensuring that the phone identifies itself properly when initiating a transmission!

    class CellPhone {
        String brand = "GadgetCo";
        String model = "SuperPhone";
        final String chargerType = "Type-C";
    
        void makeCall() {
            System.out.println("Making a call with the " + callModel + " by " + callBrand + "...");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.makeCall();
        }
    }
    
    solution.java:7: error: cannot find symbol
            System.out.println("Making a call with the " + callModel + " by " + callBrand + "...");
                                                           ^
      symbol:   variable callModel
      location: class CellPhone
    solution.java:7: error: cannot find symbol
            System.out.println("Making a call with the " + callModel + " by " + callBrand + "...");
                                                                                ^
      symbol:   variable callBrand
      location: class CellPhone
    2 errors
    
    class CellPhone {
        String brand = "GadgetCo";
        String model = "SuperPhone";
        final String chargerType = "Type-C";
    
        void makeCall() {
            System.out.println("Making a call with the " + model + " by " + brand + "...");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            CellPhone myPhone = new CellPhone();
            myPhone.makeCall();
        }
    }

#### Practice #4
Create a new CellPhone object and call its method to simulate making a call.

    class CellPhone {
        String brand = "TechPhone";
        String model = "X2";
        final String chargerType = "Micro-USB";
    
        // TODO: Write a method 'makeCall' to simulate making a phone call 
        void makeCall() {
            System.out.println("Making a phone call with the " + brand + model + " using a " + chargerType + "charger.");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            // TODO: Create a CellPhone object and call the 'makeCall' method
            CellPhone newCall = new CellPhone();
            newCall.makeCall();
        }
    }

#### Practice #5
Create a CellPhone class with attributes and methods that allow it to dial and hang up a call. This will test your understanding of classes, attributes, and methods in Java.

    class CellPhone {
        // TODO: Define attributes for the brand and model of the phone
        String brand = "iPhone";
        String model = "4";
        // TODO: Create a method `callDial` taking a parameter `long phoneNumber`
        // to simulate dialing a phone number (just print a message to the console)
        void callDial (long phoneNumber) {
            System.out.println("Dialing " + phoneNumber + " on my " + brand + model);
        }    
        // TODO: Create a method `hangUp` to simulate ending a call (just print a message to the console)
        void hangUp () {
            System.out.println("Hanging up...");
        }  
    }
    
    class Solution {
        public static void main(String[] args) {
            // TODO: Create an instance of CellPhone and use it to dial a number and then hang up
            CellPhone dial = new CellPhone();
            dial.callDial(+1-234-456-7890);
            dial.hangUp();
        }
    }

## Lesson 3: An Introduction to Java Constructors
### 1. The Syntax of Constructors
Constructors in Java adhere to some specific rules. The name of a constructor must be the same as the class name. Like a method, a constructor has a body enclosed between curly braces `{ }`. A constructor looks like this:

    public class Dog {
      
      String breed; // Attribute 1
      int age; // Attribute 2
      
      // Dog class constructor
      Dog(String breed, int age) {
        this.breed = breed; // Initialize attribute 1
        this.age = age; // Initialize attribute 2
        System.out.println("Initialized Dog class with breed=" + this.breed + " and age=" + this.age);
      } 
    }
In this example, `Dog` is a constructor, taking two parameters - a `String` breed and an `int` age. The `this` keyword refers to the current instance. So `this.breed` refers to the breed attribute of the current dog object, and similarly for age.

### 2. How to Use Constructors
Constructors help us instantiate a class or create an object from a class. They set initial values for object attributes and carry out other functions that are necessary to create the object. Once a constructor is defined, it is automatically called when an object is created.

Here is an example of creating a Dog object, `fido` from the Dog class using a constructor.

    public class Solution {
      public static void main(String[] args) {
    
        // Create 'fido' using the Dog class constructor
        Dog fido = new Dog("Alsatian", 5); // Prints: Initialized Dog class with breed=Alsatian and age=5
        
        System.out.println(fido.breed);  // prints: Alsatian
        System.out.println(fido.age);  // prints: 5
      }
    }
The expression `Dog fido = new Dog("Alsatian", 5);` follows the format `Class object = new Class(args);`, which creates the `fido` object. It also prints the statement we left in the constructor in the previous section, showing the constructor has actually been called.

### 3. Types of Constructors in Java
There are two main types of constructors in Java:

1. **No-argument constructor**: A constructor that does not take any parameters. Also known as default constructor.

        public class Dog {
          
          String breed;
          int age;
          
          // no-argument constructor
          Dog() {
            breed = "Unknown";
            age = 0;
          }
        }
In this example, if no breed and age are provided when creating a new Dog object, the object will have the breed "Unknown" and age 0.

2. **Parameterized constructor**: A constructor that has parameters.

        public class Dog {
          
          String breed;
          int age;
          
          // parameterized constructor
          Dog(String breed, int age) {
            this.breed = breed;
            this.age = age;
          }
        }
Just like in our first example, the parameterized constructor takes breed and age parameters when you create a new Dog object.

### 4. Brief Introduction to Constructor Overloading
Java supports multiple constructors with distinct parameters. This technique is called constructor overloading. The number and the type of parameters differentiate these constructors.

Here's a `Dog` class featuring constructor overloading:

    public class Dog {
      String breed;
      int age;
      
      // no-arg constructor
      Dog() {
        breed = "Unknown";
        age = 0;
      } 
       
      // parameterized constructor
      Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
      } 
       
      // age-only constructor
      Dog(int age) {
        this.age = age;
        breed = "Unknown";
      }
    }
In the main class, we will call both constructors like this:

    public class Solution {
      public static void main(String[] args) {
        Dog dog1 = new Dog("Husky", 3);
        System.out.println(dog1.breed);  // prints: Husky
        System.out.println(dog1.age);  // prints: 3
    
        Dog dog2 = new Dog(10);
        System.out.println(dog2.breed);  // prints: Unknown
        System.out.println(dog2.age);  // prints: 10
    
        Dog dog3 = new Dog();
        System.out.println(dog3.breed); // prints: Unknown
        System.out.println(dog3.age); // prints: 0
      }
    }

#### Practice #1
Run the code.

    class Car {
        String color;
        String model;
        boolean isElectric;
    
        // Car class constructor
        Car(String color, String model, boolean isElectric) {
            this.color = color;
            this.model = model;
            this.isElectric = isElectric;
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Car familyCar = new Car("Red", "SUV", false);
            System.out.println("Family Car - Model: " + familyCar.model + ", Color: " + familyCar.color + ", Electric: " + familyCar.isElectric);
        }
    }

#### Practice #2
Your task is to enhance the Car constructor we've developed by implementing constructor overloading.

Implement a new Car constructor with only model and year specified, setting the default color "White", benefitting our car manufacturing process during instances where a color preference is not indicated.

At the end, create an instance of the Car class using the new constructor, and print all class fields to make sure everything has been set correctly.

    class Car {
        String model;
        String color;
        int year;
    
        // Constructor with parameters
        Car(String model, String color, int year) {
            this.model = model;
            this.color = color;
            this.year = year;
        }
    
        // Add an overloaded constructor here
         Car(String model, int year) {
            this.model = model;
            this.color = "White";
            this.year = year;
        } 
    }
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car("Sedan", "Red", 2021);
            System.out.println(myCar.model + " - " + myCar.color + " - " + myCar.year);  // prints: Sedan - Red - 2021
            // TODO: create a new class instance calling the newly created constructor, and print all class attributes
            Car myCar2 = new Car("Honda", 2022);
            System.out.println(myCar2.model + " - " + myCar2.color + " - " + myCar2.year);
        }
    }

#### Practice #3
Great job so far! On our car manufacturing line, there appears to be a small glitch: one car isn't displaying the correct model and year. Can you figure out what's going wrong and get our cars rolling out perfectly again?

    class Car {
      String model;
      int year;
    
      // Car class constructor with model and year
      Car(String model, int year) {
        model = model;
        year = year;
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // Create a Car object called 'myCar' using the constructor
        Car myCar = new Car("Toyota Camry", 2021);
        
        System.out.println("Model: " + myCar.model + " - Year: " + myCar.year);
      }
    }
    
    class Car {
      String model;
      int year;
    
      // Car class constructor with model and year
      Car(String model, int year) {
        model = model;
        year = year;
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // Create a Car object called 'myCar' using the constructor
        Car myCar = new Car("Toyota Camry", 2021);
        
        System.out.println("Model: " + myCar.model + " - Year: " + myCar.year);
      }
    }
    
    class Car {
      String model;
      int year;
    
      // Car class constructor with model and year
      Car(String model, int year) {
        this.model = model;
        this.year = year;
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // Create a Car object called 'myCar' using the constructor
        Car myCar = new Car("Toyota Camry", 2021);
        
        System.out.println("Model: " + myCar.model + " - Year: " + myCar.year);
      }
    }

#### Practice #4
Fill in the missing constructor code that initializes your car's model and year.

    class Car {
        String model;
        int year;
    
        // TODO: Define the constructor to initialize the car's model and year.
        Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
        String displayInfo() {
            return "Model: " + model + ", Year: " + year;
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car("Thunder", 2021); // Create a Car object using the constructor
            System.out.println(myCar.displayInfo()); // This should print the car's info
        }
    }

#### Practice #5
Now, let's build a Car class from scratch. Remember, the Car class needs a constructor that sets the car's model and color. Then, in your Solution class, create an object of Car with your favorite car model and color, and print them out.

    class Car {
      // TODO: Declare attributes for model and color
      String model;
      String color;
      // TODO: Create a constructor to initialize model and color
      Car(String model, String color) {
        this.model = model;
        this.color = color;
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        // TODO: Create a Car object with your chosen model and color, then print out its details
        Car newCar = new Car("Camry", "Transparent");
        System.out.println("My car is a " + newCar.color + " " + newCar.model);
      }
    }

## Lesson 4: Java's Building Blocks: Encapsulation of Attributes and Methods
### 1. Understanding the 'private' Keyword in Java
Java uses the `private` modifier to limit the visibility of class attributes. A `private` attribute can be accessed only within its specific class.

    public class MyRobot {
        private String robotName; // This attribute can be accessed within the MyRobot class only
    }
In the `MyRobot` class mentioned above, `robotName` is a private attribute, which implies it can be directly accessed only within the `MyRobot` class.

### 2. Getters and Setters in Java
Getters and setters, also known as accessors and mutators, respectively, allow us to read and modify private attributes from outside the class.

Getters are used to obtain (or get) the value of a private attribute.

    public class MyRobot {
        private String robotName;
        
        public String getRobotName() { // Getter method for RobotName
            return robotName;  // Returns current robot name
        }
    }
Setters are used to change (or set) the value of a private attribute.
    
    public class MyRobot {
        private String robotName;
        
        public void setRobotName(String newRobotName) { // Setter method for RobotName
            this.robotName = newRobotName;  // Sets the robot name to new value
        }
    }
Getters and setters form a controlled passage to access and modify the object's hidden internal state. If you want your private variable to be non-editable - you don't include setter in your class, if you don't want it to be accessible - you don't include getter.

### 3. Putting It All Together: Encapsulating Class Attributes and Methods
Let's consolidate these insights with an example.

    public class MyRobot {
        private String robotName;
        
        public String getRobotName() {
            return this.robotName;  // Fetches current robotName
        }
        
        public void setRobotName(String newRobotName) {
            this.robotName = newRobotName;  // Changes current robotName to new input
        }
    }
    
    MyRobot robot = new MyRobot(); // Initialize an object, bot, of the class MyRobot
    // robot.robotName = "R2-D2"; // This fails, you can't access a private field directly
    robot.setRobotName("Bot-202"); // Sets robotName to "Bot-202"
    System.out.println(robot.getRobotName());  // Gets robotName and prints it
In this example, `setRobotName()` sets a new name for our `MyRobot` object while `getRobotName()` retrieves the current name. You can modify and access `robotName` in a controlled, safe manner.

#### Practice #1
Run the code.

    class Vehicle {
        private String engineStatus = "off";  // Encapsulated vehicle's engine attribute
        
        public String getEngineStatus() {      // Getter for engine status
            return engineStatus;               // Returns current engine status
        }
        
        public void setEngineStatus(String status) {  // Setter for engine status
            this.engineStatus = status;               // Updates engine status
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Vehicle car = new Vehicle();              // Creating a new vehicle object, car.
            car.setEngineStatus("on");               // Starting the car's engine
            System.out.println("The engine is " + car.getEngineStatus()); // Displaying the engine status
        }
    }

#### Practice #2
Your task is to update the setLicensePlate method in the Vehicle class to prevent the assignment of an empty string or the value "INVALID" to the license plate. Use conditional logic to ensure that if the new plate value is empty or equals "INVALID", the identifier "UNKNOWN" will be assigned instead.

    class Vehicle {
        private String licensePlate;
      
        public String getLicensePlate() {
            return licensePlate;
        }
      
        public void setLicensePlate(String newPlate) {
            if (newPlate.equals("")) {
                // TODO: Complete the condition for "INVALID" and assign "UNKNOWN" if needed
                this.licensePlate = "UNKNOWN";
            } else if (newPlate.equals("INVALID")) {
                this.licensePlate = "UNKNOWN";
            } else {
                this.licensePlate = newPlate;
            }
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Vehicle myCar = new Vehicle();
            myCar.setLicensePlate("XYZ 1234");
            System.out.println(myCar.getLicensePlate());
        }
    }

#### Practice #3
Let's proceed to debug some code next. There’s a small mistake in this code that pertains to setting the model of a car. Identify and correct it to ensure the Car class functions as intended.

    class Car {
        private String model;
        private int year;
            
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }
    }
    
    class Solution {
        public static void main(String[] args) {
          Car car = new Car("Tesla Model X", 2022);
          System.out.println("Model: " + car.model);
        }
    }
    
    
    solution.java:14: error: model has private access in Car
          System.out.println("Model: " + car.model);
                                            ^
    1 error
    
    
    class Car {
        private String model;
        private int year;
        public String getModel() {
            return this.model;
        }
        public void setModel(String newModel) {
            this.model = newModel;
        }
        public void setYear(int newYear) {
            this.year = newYear;
        }
    }
    
    class Solution {
        public static void main(String[] args) {
          Car car = new Car();
          car.setModel("Tesla Model X");
          car.setYear(2022);
          System.out.println("Model: " + car.getModel() );
        }
    }

#### Practice #4
Add code to manage car details. Implement methods to set and get the car's manufacturing year.

    class Car {
        private String model;
        private int year;
        
        public String getModel() {
            return model;
        }
        
        public void setModel(String newModel) {
            model = newModel;
        }
        
        // TODO: Write a method to return the car's year
        public int getYear() {
            return this.year;
        }
        public void setYear(int newYear) {
            this.year = newYear;
        }
        // TODO: Write a method to assign a new year to the car
    }
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.setModel("Tesla Model S");
            // TODO: set the car year. Assume year is 2022
            myCar.setYear(1999);
            System.out.println("This is the year, my year " + myCar.getYear());
            // TODO: Display the car model and year
        }
    }

#### Practice #5
Create a Car class with private attributes and provide public getter and setter methods to access them. Remember to follow good encapsulation practices and control how these attributes are accessed and modified.

    class Car {
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
    
    class Solution {
        public static void main(String[] args) {
            Car myCar = new Car();
            // TODO: Set the model name of myCar to "Tesla Model S"
            myCar.setModel("Tesla Model 5");
            // TODO: Set the year of myCar to 2021
            myCar.setYear(2021);
            // TODO: Print the model name and year of myCar to the console
            System.out.println(myCar.getModel() + " " + myCar.getYear());
        }
    }

## Lesson 5: Mastering Interfaces, Abstract Classes, and Simple Inheritance in Java
### 1. Diving into Interfaces
Think of an Interface as a contract or a set of guidelines. A class can follow these guidelines or `implement` the interface. In this case, we have an interface, `FootballPlayer`, which represents the behaviors of a football player such as `dribble()`, `pass()`, and `shoot()`.

    interface FootballPlayer {
        void dribble();
        void pass();
        void shoot();
    }

### 2. Implementing Interfaces
To follow an Interface, a class needs to `implement` it. This action necessitates the definition of all its methods. So, we create a `Forward` class that promises to adhere to our `FootballPlayer` interface:

    class Forward implements FootballPlayer {
        // Dribbling like a forward player
        public void dribble() {
            System.out.println("Dribbling forward...");
        }
    
        // Passing pattern of a forward player
        public void pass() {
            System.out.println("Passing to a teammate...");
        }
    
        // How a forward player takes a shot
        public void shoot() {
            System.out.println("Shooting towards the goal...");
        }
    }
Here, the `Forward` class is following the rules set by the `FootballPlayer` interface. If the `Forward` class does not implement one of the required methods, Java will throw an error.

### 3. Exploring Abstract Classes
Abstract classes serve as blueprints for other classes. They can't be instantiated but can provide a skeleton upon which to build. Let's demonstrate this with an `Animal` abstract class:

    abstract class Animal {
        // How the animal eats: this method has not been implemented yet
        abstract void eat();
    
        void breathe() { // All animals breathe
            System.out.println("Breathing...");
        }
    }

In the `Animal` class, we declare `eat()` as an abstract method, meaning subclasses must provide their own implementation. `breathe()` is a standard method, which all subclasses will inherit.

### 4. Inheriting from Abstract Classes
To `extend` an abstract class, a class must implement its abstract methods. Here's a `Lion` class that extends `Animal`:

    class Lion extends Animal {
        void eat() { // Lion's way of eating
            System.out.println("Eating meat...");
        }
    }
The `Lion` class inherits `breathe()` from the `Animal` class and provides its own implementation of `eat()`. We can also define a different class, `Giraffe`, that defines the `eat()` method differently:

    class Giraffe extends Animal {
        void eat() { // Giraffe's way of eating
            System.out.println("Eating leaves...");
        }
    }
Both of these classes, however, will have a default implementation of the `breathe()` method, defined in the abstract class.

### 5. Simple Inheritance in Java
Inheritance allows the creation of a new class based on an existing one. The new class inherits the fields and methods of the existing class. Here's an example in which `Dog` extends `Animal`:

    class Animal {
       void eat() {
          System.out.println("eating...");
       }
    }
    
    class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("eating dog food...");
        }
    
        void bark() {
              System.out.println("barking...");
        }
    }
    
    Dog dog = new Dog();
    dog.eat(); // Prints: eating dog food...
The `Dog` class inherits the `eat()` method from the `Animal` class. Note the `@Override` annotation - it's optional, but it helps you understand that the method has actually been overridden and the behavior has been changed from the default behavior in the base class `Animal`.

#### Practice #1
Run the code.

    class Solution {
        abstract static class Animal {
            abstract void eat();  // An abstract method for eating
    
            void breathe() {      // A concrete method for breathing
                System.out.println("Breathing...");
            }
        }
    
        static class Lion extends Animal {
            void eat() {         // Overriding the abstract method with Lion's way of eating
                System.out.println("Eating...");
            }
        }
    
        public static void main(String[] args) {
            Lion lion = new Lion();
            lion.eat();          // Will print "Eating..."
            lion.breathe();      // Will print "Breathing..."
        }
    }

#### Practice #2
We have two classes, Zebra and Lion, each having their own eat() method. However, to make things more organized, please unite these two classes under an interface Animal containing a single method eat(), to make these classes have a common ground.

    // Main class named 'Solution'
    class Solution {
        public static void main(String[] args) {
            Zebra zebra = new Zebra();
            zebra.eat();
    
            Lion lion = new Lion();
            lion.eat();
        }
    }
    
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

#### Practice #3
There appears to be an error preventing it from running correctly. Your mission is to identify and fix this error to ensure the Lion class behaves as intended in our virtual savanna. Test your code to confirm the solution.

    abstract class Animal { // An example of an abstract class
      void breathe() {
        System.out.println("Breathing...");
      }
    
      void eat();
    }
    
    class Lion extends Animal { // Class extending an abstract class
      void eat() {
        System.out.println("Eating meat...");
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        Lion simba = new Lion(); // Creating an instance of Lion
        simba.breathe(); // Inherited from Animal class
        simba.eat(); // Supposed to implement an abstract method from Animal class
      }
    }
    
    solution.java:6: error: missing method body, or declare abstract
      void eat();
           ^
    1 error
    
    abstract class Animal { // An example of an abstract class
      void breathe() {
        System.out.println("Breathing...");
      }
    
      abstract void eat();
    }
    
    class Lion extends Animal { // Class extending an abstract class
      void eat() {
        System.out.println("Eating meat...");
      }
    }
    
    class Solution {
      public static void main(String[] args) {
        Lion simba = new Lion(); // Creating an instance of Lion
        simba.breathe(); // Inherited from Animal class
        simba.eat(); // Supposed to implement an abstract method from Animal class
      }
    }

#### Practice #4
Define the behavior of the Lion class. Implement the specific way a lion satisfies its hunger in the wild.

    abstract class Animal {
        // TODO: define an abstract `eat()` method with no parameters
        abstract void eat();    
        // Each animal will implement this method
    }
    
    class Lion extends Animal {
        // TODO: Implement the `eat()` method to express
        // how a lion eats in the wild using a print statement.
        public void eat() {
            System.out.println("Eating meat...");
        }
    }
    
    class Solution {
        public static void main(String[] args) {
            Lion king = new Lion();
            king.eat(); // Output: Lion is eating meat.
        }
    }

#### Practice #5

