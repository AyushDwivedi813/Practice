public class Factorial {

    public static void main(String[] arg) {
        int num = 5;
        for (int i = num - 1; i > 0; i--) {
            num = num * i;
        }
        System.out.print(num);

    }
}