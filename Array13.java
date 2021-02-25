// HOW MANY THREES ARE PRESENT IN THE ARRAY //
import java.util.Scanner;
class Array13
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of array ");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter the numbers");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
int a=countThress(arr);
System.out.println(a+" threes are present");
}
static int countThress(int x[])
{
int tc=0;
for(int i=0;i<x.length;i++)
{
int n=x[i];
do{
int r=n%10;
if(r==3)
tc++;
n=n/10;
}while(n!=0);
}
return tc;
}
}