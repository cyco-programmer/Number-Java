import java.util.Scanner;


public class FibonacciSeries {

    private int x;


    private FibonacciSeries() {
        x=0;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        x=Integer.parseInt(sc.next());
    }


    private void compute(int n) {
        int a1 = 0, a2 = 1, a3;
        //Printing first two terms
        System.out.print(a1 + " " + a2);
        for(int i = 2; i < n; ++i) {
            a3 = a1 + a2;
            System.out.print(" " + a3);
            a1 = a2;
            a2 = a3;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries ob = new FibonacciSeries();
        ob.input();
        ob.compute(ob.x);
    }
}
