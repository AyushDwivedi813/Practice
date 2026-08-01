import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] arg) {
        System.out.print("Enter Number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0, first = 0, second = 1;
        while (i < n) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
            i++;
        }

    }

}