import java.util.Scanner;
class Array3
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of students marks ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter "+ n +" students marks");
int i;
for( i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int min;
min=arr[0];
for( i=0;i<arr.length;i++)
{
if(min>arr[i])
{
min=arr[i];
}
}
System.out.println("out of "+n+"lowest marks is"+min);
}
}