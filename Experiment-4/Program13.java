abstract class Person {
public String name = "Alex";// public
protected int age = 20; // protected
String country = "India";   // default
private String secret = "Hidden";   // private
static String species = "Human";// static variable
abstract void role();   // abstract method
final void identity() { // final method
System.out.println("Species: " + species);
}
public void showAccess() {
System.out.println(name);
System.out.println(age);
System.out.println(country);
System.out.println(secret); // private accessible here
}
}
public class Program13 extends Person {
public void role() {
System.out.println("Role: Student");
}
public static void main(String[] args) {
Program13 s = new Program13();
// Access modifiers
System.out.println(s.name);  // public
System.out.println(s.age);   // protected
System.out.println(s.country);   // default
// System.out.println(s.secret); // ❌ private not accessible
// Abstract + final + static
s.role();
s.identity();
System.out.println(Person.species); // static access
}
}
