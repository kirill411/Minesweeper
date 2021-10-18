import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ten = 10;
        final int hundred = 100;

        int inputNumber = scanner.nextInt();

        int hundreds = inputNumber / hundred;
        int tens = inputNumber % hundred / ten;
        int ones = inputNumber % hundred % ten;

        System.out.println(hundreds + tens + ones);

        scanner.close();
    }
}