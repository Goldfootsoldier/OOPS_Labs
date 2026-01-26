import java.util.*;
class Program12
{
public static void main(String args[])
{
System.out.println("Program to demonstrate jump statements");
for(int i = 0;i<=5;i++){
if(i==2){
System.out.println("Continue");
continue;
}
if(i==4){
System.out.println("Break");
break;
}
System.out.println("Iteration " + i);
}
}
}
