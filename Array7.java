import java.util.Scanner;
class Array7
{
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
int b=getBiggest(arr);
System.out.println( b +" is total sum");
}
static int getBiggest(int x[])
{
int big=0;
for(int i=0;i<x.length;i++)
{
big=big+x[i];
}
return big;
}
}

			