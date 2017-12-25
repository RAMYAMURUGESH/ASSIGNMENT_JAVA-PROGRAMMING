//java program to do the case conversion in the given string.

import java.util.Scanner;
class case1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s1,s2;
System.out.println("ENTER THE STRINGS:");
s1=in.nextLine();
s2=in.nextLine();
System.out.println("THE STRINGS BEFORE CONVERSION:");
System.out.println("s1= " + s1);
System.out.println("s2= " + s2);
System.out.println("THE STRINGS AFTER CONVERSION:");
System.out.println("s1 = " + s1.toUpperCase());
System.out.println("s2 = " + s2.toLowerCase());
}}

