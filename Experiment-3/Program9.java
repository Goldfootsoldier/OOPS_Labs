import java.util.*;
class Program9
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Counter Program");
int sum = 0;
int num = 0;
do{
System.out.println("Enter any Number (enter 0 to end program)");
num = sc.nextInt();
sum += num;
}
while(num!=0);
System.out.println("Counter: " + sum);
}
}

