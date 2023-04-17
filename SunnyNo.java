import java.util.Scanner;
public class Suuny_No
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    double x;
    System.out.println("Enter the no");
    int n=sc.nextInt();
    x=Math.sqrt(n+1);
    if((int)x==x)
    System.out.println("Sunny No");
    else
      System.out.println("Not a sunny no");
  }
}
