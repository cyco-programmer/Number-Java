import java.util.Scanner;
public class HarshadNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int originalNumber = number;
        while (number > 0) 
        {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        if (originalNumber % sumOfDigits == 0) 
        {
            System.out.println(originalNumber + " is a Harshad number.");
        } else 
        {
            System.out.println(originalNumber + " is not a Harshad number.");
        }
    }
}
