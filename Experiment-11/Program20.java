import MyPackage.Calculator;
public class Program20 {
public static void main(String[] args) {
Calculator calc = new Calculator();
int sum = calc.add(10, 5);
int diff = calc.subtract(10, 5);
System.out.println("Sum: " + sum);
System.out.println("Difference: " + diff);
}
}