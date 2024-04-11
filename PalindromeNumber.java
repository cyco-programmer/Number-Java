import java.util.Scanner;
public class Palindrome_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array");
        n=sc.nextInt();
        int ar[]=new int[n],d,r,i,copy;
        System.out.println("Enter" +n+ "integers");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            copy=ar[i];
            r=0;
            while(copy!=0)
            {
                d=copy%10;
                r=r*10+d;
                copy/=10;
            }
            if(r==ar[i])
            System.out.println(ar[i]+" is palindrome");
        }
    }
}