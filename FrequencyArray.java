//frequency of each elements by comparing with other//
class FrequencyArray
{
public static void main(String arg[])
{
int a[]={23,56,78,56,78,13};
int n=a.length;
for(int  i=0;i<n;i++)
{
int count=1;
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
count++;
a[j]=a[n-1];
n--;
j--;
}
}
System.out.println(a[i]+" "+count);
}
}
}

