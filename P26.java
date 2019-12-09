import java.io.*;
import java.util.*;
class P26
{
public static void main(String args[])
{
int[] a = new int[]{1,2,3,4,5};
int key,z=0,c=0;
Scanner sc = new Scanner(System.in);
key = sc.nextInt();
int i;
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
c++;
z = i;
}
}
if(c>=1)
System.out.println(z);
else
System.out.println("-1");
}
}