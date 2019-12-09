import java.io.*;
import java.util.*;
class P24
{
public static void main(String args[])
{
int[] a = new int[]{1,2,3,4,5};
int i,sum=0,avg=0;
for(i=0;i<5;i++)
sum=sum+a[i];
avg=sum/5;
System.out.println("SUM:"+sum);
System.out.println("AVG:"+avg);
}
}
