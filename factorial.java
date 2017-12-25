//java program to find the factorial of the given integer without recurssion

import java.util.Scanner;
class fact
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 int n,fact=1,i;
 System.out.println("ENTER THE INTEGER");
n=in.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("THE FACTORIAL OF GIVEN INTEGER IS : "  +  fact);
}}
