import java.util.*;
class Program8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char ch = 'y';
while(ch=='y'){
System.out.println("Enter Student Details");
System.out.println("Name:");
String name = sc.next();
System.out.println("Course:");
String course = sc.next();
System.out.println("Roll Number:");
int roll = sc.nextInt();
System.out.println("Name: " + name);
System.out.println("Course: " + course);
System.out.println("Roll No.: " + roll);
System.out.println("Next student? (y/n)");
ch = sc.next().charAt(0);
}
}
}