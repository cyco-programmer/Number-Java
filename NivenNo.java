import java.util.*;
public class Niven_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=0,n,r,s=0,q=0;
        System.out.println("Enter a no");
        n=sc.nextInt();
        b=n;
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        q=b/s;
        if((q*s)==b)
        System.out.println("Niven No");
        else
        System.out.println("Not a Niven No");
    }
}
