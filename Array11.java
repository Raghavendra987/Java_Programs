import java.util.Scanner;
class Array11
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n =sc.nextInt();
int ar[]=new int[n];
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
int  rs =isPalindrome(ar);
System.out.println(rs+"palindrome are there");
}
static int  isPalindrome(int x[])
{
int a;
int rev=0;
int count=0;
for(int j=0;j<x.length;j++)
{
int temp=x[j];
while(x[j]>0)
{
a=x[j]%10;
rev=rev*10+a;
x[j]=x[j]/10;
}
if(temp==rev)
count++;
}
return count;
}
}
