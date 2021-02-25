// zigzag order unsorted format//
class ZigZag
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
int i=0,k=0;
while(i<x.length && i<y.length)
{
z[k]=x[i];
k++;
z[k]=y[i];
k++;
i++;
}
while(i<x.length)
{
z[k]=x[i];
k++;
i++;
}
while(i<y.length)
{
z[k]=y[i];
k++;
i++;
}
return z;
}
}
