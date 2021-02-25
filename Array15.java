// INPUT ARRAY AND DISPLAY ARRAY FOR ALL THE ARRAY //
import java.util.Scanner;
public class Array15 {
	static int[] readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+"values");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}

	static void dispArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static int[] insertArr(int x[],int in,int ele)
	{
		if(in<0||in>x.length)
		{
			System.out.println("insert not in the array");
			return x;
		}
		int y[]=new int[x.length+1];
		y[in]=ele;
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
	}
	static int[] mergeArray(int a[],int b[])
	{
		int z[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			z[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			z[a.length+j]=b[j];
		}
		return z;
	}
		
	}
	

