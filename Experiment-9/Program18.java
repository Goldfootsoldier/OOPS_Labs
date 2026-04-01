
abstract class Animal {
private String name;

public Animal(String name) {
this.name = name;
}

public String getName() {
return name;
}

public abstract String sound();
public abstract String type();

public void describe() {
System.out.println("Animal: " + getName());
System.out.printf("Type: %s%n", type());
System.out.printf("Sound : %s%n", sound());
System.out.println("-------------------");
}
}

class Dog extends Animal {
public Dog(String name) {
super(name);
}

@Override
public String sound() { return "Woof!"; }

@Override
public String type() { return "Mammal"; }
}

class Eagle extends Animal {
public Eagle(String name) {
super(name);
}

@Override
public String sound() { return "Screech!"; }

@Override
public String type() { return "Bird"; }
}

class Frog extends Animal {
public Frog(String name) {
super(name);
}

@Override
public String sound() { return "Ribbit!"; }

@Override
public String type() { return "Amphibian"; }
}

public class Program18 {
public static void main(String[] args) {
Animal[] animals = {
new Dog("Bruno"),
new Eagle("Sky"),
new Frog("Kermit")
};

for (Animal a : animals) {
a.describe();
}
}
}
