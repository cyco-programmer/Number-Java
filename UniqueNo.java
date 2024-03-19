import java.util.Scanner;
public class UniqueNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,num,k,i,c,f=1,d,d1;
        System.out.println("Enter any number");
        n=sc.nextInt();
        k=n;
        while(n!=0)
        {
            d=n%10;
            c=0;
            num=k;
            while(num!=0)
            {
                d1=num%10;
                if(d==d1)
                c++;
                num=num/10;
            }
            if(c==1)
            {
                n=n/10;
                continue;
            }
            else
            {
                f=0;
                break;
            }
        }
        if(f==1)
        System.out.println("Unique Number");
        else
        System.out.println("Not a unique number");
    }
}