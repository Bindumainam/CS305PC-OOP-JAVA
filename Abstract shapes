Shape.java(Abstarct class)
public abstract class Shape { 
protected int a1; 
protected int a2; 
public Shape(int d1, int d2) { 
this.a1 = d1; 
this.a2 = d2; 
} 
public abstract void printArea(); 
} 
Rectangle.java 
public class Rectangle extends Shape { 
public Rectangle(int length, int breadth) { 
super(length, breadth); 
} 
@Override 
public void printArea() { 
double area = a1 * a2; 
System.out.println("Rectangle Area is : " + area); 
} 
} 
Triangle.java 
public class Triangle extends Shape { 
public Triangle(int base, int height) { 
super(base, height); 
} 
@Override 
public void printArea() { 
double area = 0.5 * a1 * a2; 
System.out.println("Triangle Area is : " + area); 
} 
} 
9 
Circle.java 
public class Circle extends Shape { 
public Circle(int radius) { 
super(radius, 0); // a1 is radius, a2 is unused 
} 
@Override 
public void printArea() { 
double area = Math.PI * a1 * a1; 
System.out.println("Circle Area is: "+ area); 
} 
} 
AbstractTest.java (Main Class) 
public class AbstractTest { 
public static void main(String[] args) { 
Shape rect = new Rectangle(10, 5); 
Shape tri = new Triangle(4, 6); 
Shape circ = new Circle(7); 
System.out.println("‐‐‐ Calculating Areas ‐‐‐"); 
rect.printArea(); 
tri.printArea(); 
circ.printArea(); 
} 
} 
