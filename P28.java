import java.io.*;
import java.util.*;
class P28
{
public static void main(String arg[])
{
int[] a = new int[]{9,1,5,23,4,8};
int i,j,temp=0;
for(i=0;i<5;i++)
{
for(j=i+1;j<6;j++)
{
if(a[i]>=a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("min:"+a[0]+" "+a[1]);
System.out.println("max:"+a[4]+" "+a[5]);
}
}