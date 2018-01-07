//java program to replace the vowels in the input string.
//note : the usage of  regular expression which comprises all vowels "[aeiouAEIOU]".

import java.util.Scanner;
class vowel
{
public static void main(String args[])
{
	
Scanner in=new Scanner(System.in);
System.out.println("ENTER THE INPUT STRING");
 String str=in.nextLine();
 
String b= str.replaceAll("[aeiouAEIOU]", "z");
System.out.println(b);
}}
