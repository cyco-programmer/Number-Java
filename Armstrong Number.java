import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = num;

        // Find the number of digits in the given number
        for (originalNumber = num; originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // If the result is the same as the input number, it's an Armstrong number
        return result == num;
    }
}