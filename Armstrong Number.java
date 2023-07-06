import java.util.Scanner;


public class ArmstrongNumber {
    
    private int number;

    private ArmstrongNumber() {
        number = 0;
    }

    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = Integer.parseInt(sc.nextLine());
    }

    private int numberOfDigits(int n) {
        return (int)Math.floor(Math.log10(n))+1;
    }

    private boolean armstrongCheck(int a) {
        int sum = 0;
        while(a > 0) {
            sum += (int)Math.pow(a % 10,
                    numberOfDigits(number));
            a /= 10;
        }
        return sum == number;
    }

    private void display() {

        System.out.println(armstrongCheck(number) ?
                "Number is armstrong." :
                "Number is not armstrong.");
    }

   
    public static void main(String[] args) {
        ArmstrongNumber ob = new ArmstrongNumber();
        ob.input();
        ob.display();
    }
}
