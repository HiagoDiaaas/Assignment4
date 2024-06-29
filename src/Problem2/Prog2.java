package Problem2;

public class Prog2 {
    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}

