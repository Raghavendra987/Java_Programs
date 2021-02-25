import java.util.Scanner;
class Array10
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
int a=isperfectNumber(arr);
System.out.println(a+"perfect number");
}

static int isperfectNumber(int x[])
{
int sum=0,count=0;
for(int j=0;j<x.length;j++)
{
for(int k=1;k<x[j]/2;k++)
{
if(x[j]%k==0)
{
sum=sum+k;
}
}
if(sum==x[j])
count++;
}
return count;
}
}
