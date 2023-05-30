import java.util.Scanner;
public class Special_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=sc.nextInt();
        int n1=num,fact,digit,i,sum=0;
        while(num>0)
        {
            digit=num%10;
            fact=1;
            for(i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if(sum==n1)
        System.out.println(n1+" is a special no");
        else
        System.out.println(n1+" is not a special no");
    }
}
