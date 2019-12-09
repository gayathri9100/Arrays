import java.util.*;
import java.io.*;
public class P30
{
public static void main(String[] args) 
{
System.out.println("enter no. of elements:");
Scanner sc = new Scanner(System.in);
int i,j,n;
n = sc.nextInt();
int[] a = new int[n];
System.out.println("enter the elements:");
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int[] temp = new int[10];
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]==a[j])
a[i]=0;
}
}
for(i=0;i<n;i++)
{
if(a[i]!=0)
temp[i]=a[i];
else if(a[i]==0)
continue;
}
for(i=0;i<n;i++)
{
if(a[i]!=0)
System.out.print(a[i]+" ");
else if(a[i]==0)
continue;
}

}
}
