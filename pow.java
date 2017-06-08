import java.util.Scanner;
class pow
{
  public static void main(String arg[])	
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int p=sc.nextInt();
    int flag=1;
    if(a>=0&&p==0)
     {
        flag=1;
     }
    else if(a==0&&p>=1)
      { 
         flag=0;
      }
    else
     {
         for(int i=1;i<=p;i++)
	    {
            flag=flag*n;
 	    }	    
     }
    System.out.println(n+"^"+p+"="+flag);
  }
}


