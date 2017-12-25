//java program to find the factorial of the given integer using recurssion

import java.util.Scanner;
class fact1
{
static int factorial(int num)
{
if(num==0)
return 1;
else
return num*factorial(num-1);
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 int n,fact=1,i;
 System.out.println("ENTER THE INTEGER");
n=in.nextInt();
fact=factorial(n);
System.out.println("THE FACTORIAL OF GIVEN INTEGER"  +  n  + " IS : "  +  fact);
}}
