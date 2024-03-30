import java.util.Scanner;
public class EquivalentNo
{
    int n,m;
    public EquivalentNo(int x,int y)
    {
        n=x;
        m=y;
    }
    public int sumFcators(int num)
    {
        int sum=0,i;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        return (sum);
    }
    public void check()
    {
        if(sumFcators(n)==sumFcators(m))
        System.out.println("It is an Equivalent Number");
        else
        System.out.println("It is not an Equivalent Number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter any 2 numbers");
        n=sc.nextInt();
        m=sc.nextInt();
        EquivalentNo ob=new EquivalentNo(n,m);
        ob.check();
    }
}