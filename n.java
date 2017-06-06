import java.io.*;
import java.util.*;
class n
{
public static void main(String args[])
{
int a[]=new int[args.length];
int sum=0;
for(int i=0;i<a.length;i++)
{
a[i]=Integer.parseInt(args[i]);
sum=sum+a[i];
}
System.out.println(sum);
}
}


