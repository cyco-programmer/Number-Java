import java.util.Scanner;

public class DuckNumberChecker 
{
    static boolean isDuckNumber(String numStr) 
    {
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        if (isDuckNumber(number)) {
            System.out.println(number + " is a duck number.");
        } else {
            System.out.println(number + " is not a duck number.");
        }

        scanner.close();
    }
}