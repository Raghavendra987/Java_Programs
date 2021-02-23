import java.util.Scanner;
class Array4
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of persons  ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter "+ n +" persons age");
int i;
for( i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int max;
max=arr[0];
for( i=0;i<arr.length;i++)
{
if(max<arr[i])
{
max=arr[i];
}
}
System.out.println("out of "+n+"eldest persons age"+max);
}
}