public static void main(String[] arg) {
    Scanner input = new Scanner(System.in);
    int nu = input.nextInt();
    int pow = input.nextInt();
    int num = nu;
    while (pow != 1) {
        num *= nu;
        pow -= 1;
    }
    System.out.print(num);

}