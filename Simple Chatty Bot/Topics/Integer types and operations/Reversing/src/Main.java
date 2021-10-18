import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ten = 10;
        final int hundred = 100;

        int inputNumber = scanner.nextInt();

        int ones = inputNumber / hundred;
        int tens = (inputNumber % hundred / ten) * ten;
        int hundreds = (inputNumber % hundred % ten) * hundred;

        System.out.println(ones + tens + hundreds);

        scanner.close();
    }
}