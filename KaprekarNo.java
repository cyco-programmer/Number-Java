import java.util.Scanner;
public class Kaprekar_No
{
    public static void main(String args[])
    {
        int a,n,b,c=0,d,e,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        n=sc.nextInt();
        b=n;
        a=n*n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        d=(int)Math.pow(10,c);
        e=a/10;
        f=a%d;
        if(e+f==b)
        System.out.println("Kaporekar No");
        else
        System.out.println("Not a kaprekar no");
    }
}
