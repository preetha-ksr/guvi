import java.io.*;
import java.util.*;
class cs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n,count=0;
while(a>0)
{
n=a%10;
a=a/10;
count=count+1;
}
System.out.println(count);
}
}
