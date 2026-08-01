
public class Armstrong {

    public static boolean armstrong(int num) {
        int t1 = num, t2 = num, sum = 0;
        int d = 0;
        while (t1 > 0) {
            d++;
            t1 /= 10;
        }

        int ld = 0;
        while (t2 > 0) {
            ld = t2 % 10;
            sum += Math.pow(ld, d);
            t2 /= 10;
        }
        if (sum == num)
            return true;

        return false;
    }

    public static void main(String[] arg) {

        System.out.print(Armstrong.armstrong(153));
    }
}
