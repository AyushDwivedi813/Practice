
public class ReverseNum {
    public static void main(String[] arg) {

        int num = 143434;
        int reversednum = 0;
        int lastdigit = 0;
        while (num != 0) {
            lastdigit = num % 10;
            reversednum = (reversednum * 10) + lastdigit;
            num /= 10;
        }
        System.out.print(reversednum);
    }
}
