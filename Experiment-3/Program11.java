import java.util.*;
class Program11
{
public static void main(String agrs[])
{
Scanner sc = new Scanner(System.in);
System.out.println("*****MENU*****");
System.out.println("1. Pizza");
System.out.println("2. Burger");
System.out.println("3. French Fries");
System.out.println("4. Taco");
System.out.println("5. Waffles");
System.out.println("Enter Your Choice Number");
int ch = sc.nextInt();
switch(ch){
case(1):
System.out.println("You have Selected Pizza");
break;
case(2):
System.out.println("You have Selected Burger");
break;
case(3):
System.out.println("You have Selected French Fries");
break;
case(4):
System.out.println("You have Selected Taco");
break;
case(5):
System.out.println("You have Selected Waffles");
break;
default:
System.out.println("You have not selected any valid option");
break;
}
}
}
