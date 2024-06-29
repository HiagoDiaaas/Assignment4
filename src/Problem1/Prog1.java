package Problem1;

public class Prog1 {
    public static void displayDigitsReverse(int n) {
        if (n < 10) {
            System.out.print(n);
        } else {
            System.out.print(n % 10);
            displayDigitsReverse(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.print("Digits in reverse order: ");
        displayDigitsReverse(number);
    }
}
