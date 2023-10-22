import java.util.Scanner;

public class TechNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isTechNumber(number)) {
            System.out.println(number + " is a tech number.");
        } else {
            System.out.println(number + " is not a tech number.");
        }
    }

    public static boolean isTechNumber(int num) {
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num = num / 10;
        }

        return evenCount == oddCount;
    }
}