import java.util.Scanner;
class Array9
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the numbers of elements ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter the numbers");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int c=countOfEven(arr);
int a=countOfOdd(arr);
System.out.print(c+"even numbers and ");
System.out.print( a +" odd numbers ");
}
static int countOfEven(int x[])
{
int count1=0;
for(int j=0;j<x.length;j++)
{
if (x[j]%2==0)
{
count1++;
}
}
return count1;
}
static int countOfOdd(int y[])
{
int count2=0;
for(int k=0;k<y.length;k++)
{
if (y[k]%2==1)
{
count2++;
}
}
return count2;
}
}
