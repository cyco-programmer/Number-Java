import java.util.Scanner;
public class Perfect_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter number");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
        System.out.println(n+" is a perfect number");
        else
        System.out.println(n+" is not a perfect number");
    }
}
