import java.util.Scanner;
class Array8
{
 static int countPrime(int x[])
{
int count=0;
for(int i=0;i<x.length;i++)
{
boolean rs=isPrime(x[i]);
if(rs==true)
count++;
}
return count;
}
static boolean isPrime(int num)
{
for(int i=2;i<num/2;i++)
{
if(num%i==0)
return false;
}
return true;
}


public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array  ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter "+ n +" elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int c =countPrime(arr);
System.out.println(c+" prime numbers");
}
}