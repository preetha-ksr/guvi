import java.util.Scanner;
class armstrongs
{
public static void main(String args[])
{
int sum=0,m,n;
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
for(int j=x;j<y;j++)
{
n=j;
while(n>0)
{
m=n%10;
sum=sum+(m*m*m);
n=n/10;
break;
}
}
if(n==j)
System.out.print("Armstrong number:"+sum+" ");
}
}
