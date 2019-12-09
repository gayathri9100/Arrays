import java.io.*;
import java.util.*;
class P32
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,k,sum=0,n;
n=sc.nextInt();
int[] a = new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==6 && a[j]==7)
{
for(k=i;k<=j;k++)
a[k]=0;
}
}
}
for(i=0;i<n;i++)
sum=sum+a[i];
System.out.println(sum);
}
}