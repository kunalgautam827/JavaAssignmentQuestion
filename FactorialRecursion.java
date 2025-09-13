public class FactorialRecursion {
    static int fact(int n) {
        int sum = 1;
        if (n == 0) {
            return 1;
        } else {
            return sum = n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int factorial = fact(5);
        System.out.println(factorial);
    }
}