import java.util.Scanner;
public class Disarium_No
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNum = number;
        int numDigits = 0;
        int temp = number;
        while (temp != 0) 
        {
            temp /= 10;
            numDigits++;
        }
        temp = number;
        int sum = 0;
        int position = numDigits;
        while (temp > 0) 
        {
            int digit = temp % 10;
            int term = 1;
            for (int i = 0; i < position; i++) 
            {
                term *= digit;
            }
            sum += term;
            temp /= 10;
            position--;
        }
        if (sum == originalNum) 
        {
            System.out.println(originalNum + " is a Disarium number.");
        } else {
            System.out.println(originalNum + " is not a Disarium number.");
        }
    }
}