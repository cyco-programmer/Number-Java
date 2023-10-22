import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find prime palindromic numbers up to that limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        System.out.println("Prime Palindromic Numbers up to " + limit + ":");
        for (int number = 2; number <= limit; number++) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            num = num / 10;
        }

        return originalNumber == reversedNumber;
    }
}