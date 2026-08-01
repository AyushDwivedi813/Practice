import java.util.Scanner;

public class GcdoftwoNumbers {

    public int gcd(int a, int b) {

        int r = 1;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return a;

    }

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers :");
        int a = input.nextInt(), b = input.nextInt();
        GcdoftwoNumbers gcd = new GcdoftwoNumbers();
        System.out.print(gcd.gcd(a, b));

    }

}