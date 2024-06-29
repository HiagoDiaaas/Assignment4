package Problem3;

public class Prog3 {
    public static int arraySum(int[] array, int num) {
        if (num <= 0) {
            return 0;
        } else {
            return array[num - 1] + arraySum(array, num - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = arraySum(array, array.length);
        System.out.println("Sum of array elements: " + sum);
    }
}
