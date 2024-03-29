import java.util.Scanner;
public class CyclicNo
{
    long n;
    public CyclicNo(long x)
    {
        n=x;
    }
    public void check()
    {
        long copy1=n,num,copy2,d1,d2;
        int c1=0,flag1=1,v2,flag2,i,c2;
        while(copy1!=0)
        {
            c1+=1;
            copy1/=10;
        }
        for(i=1;i<=c1;i++)
        {
            num=n*i;
            copy2=num;
            c2=0;
            while(copy2!=0)
            {
                d1=copy2%10;
                flag2=0;
                copy1=n;
                while(copy1!=0)
                {
                    d2=copy1%10;
                    if(d1==d2)
                    {
                        flag2=1;
                        break;
                    }
                    copy1/=10;
                }
                if(flag2==1)
                c2++;
                copy2/=10;
            }
            if(c2!=c1)
            {
            flag1=0;
            break;
            }
        }
        if(flag1==1)
        System.out.println("it is a cyclic number");
        else
        System.out.println("it is not a cyclic number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n;
        System.out.println("Enter any number");
        n=sc.nextLong();
        CyclicNo ob=new CyclicNo(n);
        ob.check();
    }
}