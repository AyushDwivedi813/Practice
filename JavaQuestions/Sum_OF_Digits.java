public class Sum_OF_Digits {

    public void sumOfDigits(int num) {
        int ld = 0;
        int sum = 0;
        while (num != 0) {
            ld = num % 10;
            sum = sum + ld;
            num /= 10;
        }
        System.out.print(sum);
    }

    public static void main(String... ar) {
        int num = 12121212;
        Sum_OF_Digits sd = new Sum_OF_Digits();
        sd.sumOfDigits(num);
    }
}