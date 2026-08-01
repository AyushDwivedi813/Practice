//package Practice;

public class Pldrome {
    public static void main(String[] arg) {
        int num = 13231;
        int lastdigit = 0;
        int reversednum = 0;
        int originalnum = num;

        while (num != 0) {
            lastdigit = num % 10;
            reversednum = (reversednum * 10) + lastdigit;
            num /= 10;
        }
        if (reversednum == originalnum)
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }

}
