import java.util.Scanner;
public class Neon_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,n;
        System.out.println("Enter the no");
        n=sc.nextInt();
        a=n*n;
        while(a>0)
        {
            b=a%10;
            c=c+b;
            a=a/10;
        }
        if(c==n)
        System.out.println("Neon no");
        else
        System.out.println("Not a Neon No");
    }
}
