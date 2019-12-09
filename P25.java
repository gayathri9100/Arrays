import java.io.*;
import java.util.*;
class P25
{
public static void main(String args[])
{
int[] a = new int[]{1,2,3,4,5};
int i,max=a[0],min=a[0];
for(i=0;i<a.length;i++)
{
if(a[i]>=max)
max=a[i];
else if(a[i]<=min)
min=a[i];
}
System.out.println("MAX:"+max);
System.out.println("MIN:"+min);
}
}