interface Shape {
double area();
double perimeter();
void display();
}

class Circle implements Shape {
private double radius;

public Circle(double radius) {
this.radius = radius;
}

@Override
public double area() {
return Math.PI * radius * radius;
}

@Override
public double perimeter() {
return 2 * Math.PI * radius;
}

@Override
public void display() {
System.out.println("Circle:");
System.out.printf("Area: %.2f%n", area());
System.out.printf("Perimeter : %.2f%n", perimeter());
}
}

// Rectangle implements Shape
class Rectangle implements Shape {
private double length, width;

public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

@Override
public double area() {
return length * width;
}

@Override
public double perimeter() {
return 2 * (length + width);
}

@Override
public void display() {
System.out.println("Rectangle:");
System.out.printf("Area: %.2f%n", area());
System.out.printf("Perimeter : %.2f%n", perimeter());
}
}

public class Program17 {
public static void main(String[] args) {
Shape circle = new Circle(5);
Shape rectangle = new Rectangle(4, 6);

circle.display();
rectangle.display();
}
}