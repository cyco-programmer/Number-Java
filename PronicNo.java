import java.util.*;
public class Pronic_No
{
    int n,i=1,p=0;
    void display()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no");
        n=sc.nextInt();
        int flag=0;
        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Pronic no");
        else
        System.out.println("not a pronic no");
    }
}
