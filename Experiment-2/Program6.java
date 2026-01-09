import java.util.*;
class Program6
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Two Numbers:");
System.out.println("Enter First Number:");
int num1 = sc.nextInt();
System.out.println("Enter Second Number:");
int num2 = sc.nextInt();
int addn = num1+num2;
int subn = num1-num2;
int mult = num1*num2;
int divn = num1/num2;
int mods = num1%num2;
num1++;
num2--;
boolean lessThan = num1<num2;
boolean greaterThan = num1>num2;
boolean lessThanEqual = num1<=num2;
boolean greaterThanEqual = num1>=num2;
boolean eq = num1==num2;
boolean noteq = num1!=num2;
boolean andop = eq&&noteq;
boolean orop = eq||noteq;
System.out.println("Addition: " + addn);
System.out.println("Subtraction: " + subn);
System.out.println("Multiplication: " + mult);
System.out.println("Division: " + divn);
System.out.println("Modulus: " + mods);
System.out.println("Increment: " + num1);
System.out.println("Decrement: " + num2);
System.out.println("Less Than: " + lessThan);
System.out.println("Greater Than: " + greaterThan);
System.out.println("Less Then or Equals To: " + lessThanEqual);
System.out.println("Greater Than or Equals To: " + greaterThanEqual);
System.out.println("Equals: " + eq);
System.out.println("Not Equals: " + noteq);
System.out.println("And: " + andop);
System.out.println("Or: " + orop);
}
}
