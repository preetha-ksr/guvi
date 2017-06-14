import java.io.*;
import java.util.*;
class even_interval
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
            
        
    }
}
