import java.util.*;
class Program10
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int marks = 0;
System.out.println("Enter Marks to Display Grade");
marks = sc.nextInt();
if(marks>=90){
System.out.println("A grade");
}
else if(marks>=80)
{
System.out.println("B grade");
}
else if(marks>=70)
{
System.out.println("C grade");
}
else if(marks>=60)
{
System.out.println("D grade");
}
else if(marks>=50)
{
System.out.println("E grade");
}
else
{
System.out.println("F Grade");
}
}
}