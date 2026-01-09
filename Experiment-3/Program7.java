import java.util.*;
class Program7{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = 0;
System.out.println("Enter Number to Print Triangle");
n = sc.nextInt();
for(int i = 1; i<=n; i++){
for(int j = 1; j<=i; j++){
System.out.print("*");
}
System.out.println("");
}
while(n>0){
System.out.println("Iteration  " + n);
n--;
}
do{
System.out.println("Do while for n = "+n);
}
while(n>0);
}
}