
class MergeTwoArray
{
public static void main ( String arg[])
{
int a[]={23,56,78,34,58};
int b[]={11,72,33,55};
int c[]=merge(a,b);
for(int i=0;i<c.length;i++)
{
System.out.print(c[i]+" ");
}
}

static int[] merge(int x[],int y[])
{
int z[]=new int[x.length+y.length];
for(int i=0;i<x.length;i++)
{
z[i]=x[i];
}
for(int j=0;j<y.length;j++)
{
z[x.length+j]=y[j];
}
return z;
}
}