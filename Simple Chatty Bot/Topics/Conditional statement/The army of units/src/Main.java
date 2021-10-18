import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int nineteen = 19;
        final int twenty = 20;
        final int twoHundredAndFortyNine = 249;
        final int twoHundredAndFifty = 250;
        final int nineHundredAndNinetyNine = 999;

        int inputNumber = scanner.nextInt();
        boolean noArmy = inputNumber < 1;
        boolean pack = 1 <= inputNumber && inputNumber <= nineteen;
        boolean throng = twenty <= inputNumber && inputNumber <= twoHundredAndFortyNine;
        boolean zounds = twoHundredAndFifty <= inputNumber && inputNumber <= nineHundredAndNinetyNine;

        if (noArmy) {
            System.out.println("no army");
        } else if (pack) {
            System.out.println("pack");
        } else if (throng) {
            System.out.println("throng");
        } else if (zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
        scanner.close();
    }
}