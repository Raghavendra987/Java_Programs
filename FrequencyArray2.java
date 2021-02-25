//Frequency  of each element without comparing with other elements//
class FrequencyArray2
{
public static void main(String arg[])
{
int a[]={2,8,5,8,6,5,4,3,2,8,9};
int big=a[0];
for(int i=1;i<a.length;i++)
{
if(big<a[i])
big=a[i];
}
int count[]=new int[big+1];
for(int j=0;j<a.length;j++)
{
count[a[j]]++;
}
for(int j=0;j<count.length;j++)
{
if(count[j]!=0)
System.out.println(j+" "+count[j]);
}
}
}

