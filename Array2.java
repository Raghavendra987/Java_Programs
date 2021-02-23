import java.util.Scanner;
class Array2
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter "+ n +" elements");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int even=0,odd=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]%2==0)
even++;
else
odd++;
}
System.out.println(even+"even numbers ");
System.out.println(odd+"odd numbers");
}
}