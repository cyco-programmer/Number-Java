import java.util.*;
public class Spy_No
{
    public static void main(String args[])
    {
        int n,d,p=1,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            s=s+d;
            p=p*d;
            n=n/10;
        }
        if(s==p)
        System.out.println("Spy no");
        else
        System.out.println("Not a spy no");
    }
}
