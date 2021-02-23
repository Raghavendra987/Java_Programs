import java.util.Scanner;
class ReverseArray
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter "+ n +" the size of array ");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=arr.length-1;i>=0;i--)
{
System.out.println(arr[i]);
}
}
}