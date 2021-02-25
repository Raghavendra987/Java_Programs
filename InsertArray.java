class InsertArray
{
public static void main(String args[])
{
int a[]={23,56,78,89};
int b[]={25,39,45,79,89,95,96,99};
b=insert(b,a,3);
Array15.dispArr(b);
}
static int [] insert(int x[],int y[],int in)
{
if (in<0 ||in >x.length)
{
System.out.println("inserted not in the range");
return x;
}
int z[]=new int[x.length+y.length];
for(int i=0;i<y.length;i++)
{
z[in+i]=y[i];
}
for(int j=0;j<x.length;j++)
{
if(j<in)
z[j]=x[j];
else
z[j+y.length]=x[j];
}
return z;
}
}