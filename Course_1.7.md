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


