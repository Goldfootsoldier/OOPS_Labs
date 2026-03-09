class Animal {
void makeSound() {
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
@Override
void makeSound() {
System.out.println("Dog barks: Woof! Woof!");
}
}
class Cat extends Animal {
@Override
void makeSound() {
System.out.println("Cat meows: Meow! Meow!");
}
}
public class Program14 {
public static void main(String[] args) {
Animal a;// Animal reference
a = new Dog();
a.makeSound();
a = new Cat();
a.makeSound();
a = new Animal();
a.makeSound(); 
}
}
