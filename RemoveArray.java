class RemoveArray
{
public static void main(String arg[])
{
int h[]={23,56,78,56,78,13};
int r[]=removeDuplicate(h);
for(int i=0;i<r.length;i++)
{
System.out.println(r[i]);
}
}
static int[] removeDuplicate(int a[])
{
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
a[j]=a[n-1];
n--;
j--;
}
}
}
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=a[i];
}
return b;
}
}