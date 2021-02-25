// combining  two sorted array in single sorted format //
class SortedArray
{
public static void main(String arg[])
{
int a[]={23,56,78,89};
int b[]={25,39,45,79,89,95,96,99};
int c[]=merge(a,b);
Array15.dispArr(c);
}
static int[] merge(int x[],int y[])
{
int z[]=new int[x.length+y.length];
int i=0,j=0,k=0;
while(i<x.length && j<y.length)
{
if(x[i]<y[j])
z[k++]=x[i++];
else
z[k++]=y[j++];
}
while(i<x.length)
{
z[k++]=x[i++];
}
while(j<y.length)
{
z[k++]=y[j++];
}
return z;
}
}