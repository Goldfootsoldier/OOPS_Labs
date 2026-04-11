import java.util.Scanner;
public class Program22 {
public static int divide(int a, int b) throws ArithmeticException {
if (b == 0) {
throw new ArithmeticException("Cannot divide by zero!");
}
return a / b;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
try {
System.out.print("Enter first number: ");
int num1 = sc.nextInt();
System.out.print("Enter second number: ");
int num2 = sc.nextInt();
int result = divide(num1, num2);
System.out.println("Result: " + result);
}
catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());
} 
catch (Exception e) {
System.out.println("Invalid input! Please enter integers only.");
} 
finally {
System.out.println("Execution completed.");
sc.close();
}
System.out.println("Program continues after exception handling.");
}
}