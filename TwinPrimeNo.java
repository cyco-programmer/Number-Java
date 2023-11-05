public class TwinPrimes 
{
    public static void main(String args[]) 
    {
        int a = 3, b = 5;
        while (b < 100) {
            if (isPrime(a) && isPrime(b) && (b - a) == 2) {
                System.out.println(a + " " + b);
            }
            a = b;
            b += 2;
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}