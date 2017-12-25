//java program to find the power of the given integer

import java.util.Scanner;
class power
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 int n,pow=1,i;
 System.out.println("ENTER THE INTEGER");
n=in.nextInt();
for(i=1;i<=n;i++)
{
pow=pow*2;
}
System.out.println("THE POWER OF GIVEN INTEGER IS : "  +  pow);
}}
