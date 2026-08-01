import java.util.Scanner;

public class LCMofTwoNum extends GcdoftwoNumbers {

    public int lcmof2num(int a, int b, int z) {
        int x = a, y = b;
        int lcm = Math.abs(a * b) / z;
        return lcm;

    }

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers :");
        int a = input.nextInt(), b = input.nextInt();

        LCMofTwoNum lcm = new LCMofTwoNum();
        int z = lcm.gcd(a, b);
        System.out.print(lcm.lcmof2num(a, b, z));
    }
}