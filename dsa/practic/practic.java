public class practic {
    static int factorial(int n) {
        if (n < 0) {
            return -1;

        }
        if (n == 1 || n == 0) {
            return 1;

        } else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = -9;
        System.out.println(factorial(n));

    }

}
