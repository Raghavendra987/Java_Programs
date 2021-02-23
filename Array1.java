import java.util.Scanner;
class Array1
{
public static void main ( String arg[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of product ");
int  n = sc.nextInt();
float arr[] = new float[n];
System.out.println("enter "+ n +" the product prices");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextFloat();
}
float total=0,avg=0;
for(int i=0;i<arr.length;i++)
{
total=total+arr[i];
avg=(avg+arr[i]/n);
}
System.out.println("product price total is :"+total);
System.out.println("product price Average is :"+avg);
}
}