//java program to swap the two numbers using temporary variable

import java.util.Scanner;
class swap1
{

public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 int i,a,b,t;
 System.out.println("ENTER THE NUMBERS");
a=in.nextInt();
b=in.nextInt();
System.out.println("THE NUMBERS BEFORE SWAPPING ARE  a = " + a + " b = "  + b); 
for(i=0;i<1;i++)
{
t=a;
a=b;
b=t;

}
System.out.println("THE NUMBERS AFTER SWAPPING ARE  a = " + a + " b = "  + b); 
}}
