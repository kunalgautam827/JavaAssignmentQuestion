public class PowerofNumber {
    public static int pow(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            return b * pow(b, e - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = pow(base, exponent);
        System.out.println(result);
    }
}
