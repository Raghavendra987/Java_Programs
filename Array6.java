import java.util.Scanner;
class Array6
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
System.out.println("enter "+ b +" is biggest number");
}
static int getBiggest(int x[])
{
int big=x[0];
for(int i=1;i<x.length;i++)
{
if(big<x[i])
{
big=x[i];
}
}
return big;
}
}

