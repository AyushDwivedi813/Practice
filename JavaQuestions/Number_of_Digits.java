import java.util.Scanner;

public class Number_of_Digits {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tem = num;
        int count = 0;
        while (tem != 0) {
            tem = tem / 10;
            count++;
        }

        System.out.print(count);

    }

}
