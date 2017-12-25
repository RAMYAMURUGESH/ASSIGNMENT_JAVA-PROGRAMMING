//java program to sort the given numbers in ascending order and descending order

import java.util.Scanner;
class sort1
{

public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 int i,t,j,n;
 System.out.println("ENTER THE TOTAL NO.OF.ELEMENT");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
System.out.println("THE ELEMENTS IN ASCENDING ORDER:");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("THE ELEMENTS IN DESCENDING ORDER:");
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}

}}
