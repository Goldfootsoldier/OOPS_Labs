//Method Overriding
class Shape {
double area() { return 0; }
void display() {
System.out.println(getClass().getSimpleName() + " Area: " + area());
}
}
class Circle extends Shape {
double radius;
Circle(double r) { this.radius = r; }
@Override
double area() { return Math.PI * radius * radius; }
}
class Rectangle extends Shape {
double length, breadth;
Rectangle(double l, double b) { this.length = l; this.breadth = b; }
@Override
double area() { return length * breadth; }
}
class Triangle extends Shape {
double base, height;
Triangle(double b, double h) { this.base = b; this.height = h; }
@Override
double area() { return 0.5 * base * height; }
}
public class Program16 {
public static void main(String[] args) {
Shape[] shapes = {
new Circle(7),
new Rectangle(5, 10),
new Triangle(6, 8)
};
for (Shape s : shapes) s.display();
}
}
