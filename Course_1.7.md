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
