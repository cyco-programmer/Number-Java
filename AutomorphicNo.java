import java.util.Scanner;
public class Automorphic_No
{
  public static void main(String args[])
  {
    int a,n,b,c=0,d,e,f;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no");
    n=sc.nextInt();
    f=n;
    a=n*n;
    while(n>0)
    {
      c++;
      n=n/10;
    }
    d=(int)Math.pow(10,c);
    e=a%d;
    if(e==f)
      System.out.println("Automorphic No");
    else
      System.out.println("Not a automorphic no");
  }
}
