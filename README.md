# JavaShapesProject
This project is a Java implementation that demonstrates the concepts of inheritance, polymorphism, and abstraction. It includes the definition of various shape classes (Circle, Rectangle, Square) that inherit from an abstract base class Shape.

Project Structure
Shape.java: An abstract class that represents a general shape. It contains two abstract methods:

public abstract double area(): Computes the area of the shape.
public abstract double perimeter(): Computes the perimeter of the shape.
Circle.java: A class that represents a circle and inherits from Shape. It includes:

An attribute radius to store the circle's radius.
Methods to calculate the area and perimeter of the circle.
Getters and setters for the radius.
A toString() method to represent the circle as a string.
Rectangle.java: A class that represents a rectangle and inherits from Shape. It includes:

Attributes width and height to store the rectangle's dimensions.
Methods to calculate the area and perimeter of the rectangle.
Getters and setters for width and height.
A toString() method to represent the rectangle as a string.
Square.java: A class that represents a square and inherits from Rectangle. It includes:

A constructor that initializes the square with equal width and height.
A toString() method to represent the square as a string.
Overridden setters for width and height to maintain the square shape.
Main.java: A class that contains the main method to test and demonstrate the functionality of the shapes.

How to Run
1- Clone the Repository:
  git clone https://github.com/Kareemnat12/JavaShapesProject
Navigate to the Project Directory:


2-Copy code
  cd JavaShapesProject
3- Compile the Java Files: Ensure you have Java installed and set up in your environment. You can compile the Java files using the following command:
  javac Shape.java Circle.java Rectangle.java Square.java Main.java
4- Run the Main Class: After successful compilation, you can run the Main class to see the output.
  java Main


  
