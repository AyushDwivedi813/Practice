/**
 * PrimeNumber
 */
public class PrimeNumber {

    public boolean is_prime(int num) {

        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] arg) {
        int num = 29;
        PrimeNumber pn = new PrimeNumber();
        System.out.print(pn.is_prime(num));

    }
}
