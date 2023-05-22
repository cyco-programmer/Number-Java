import java.util.Scanner;
public class Magic_Num
{
    public static void main(String arsg[])
    {
        Scanner sc=new Scanner(System.in);
        int num,digit,sum;
        System.out.println("Enter number");
        num=sc.nextInt();
        sum=num;
        while(sum>9)
        {
            sum=0;
            while(num>0)
            {
                digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            num=sum;
        }
        if(sum==1)
        System.out.println(sum+ "is a magic no");
        else
        System.out.println(sum+ "is not a magic no");
    }
}
