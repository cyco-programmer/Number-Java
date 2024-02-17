import java.util.Scanner;
public class AnagramChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine().toLowerCase(); 
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine().toLowerCase();
        scanner.close();
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = str2.indexOf(ch);
            if (index == -1) {
                System.out.println("The strings are not anagrams.");
                return;
            }
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        if (str2.isEmpty()) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}