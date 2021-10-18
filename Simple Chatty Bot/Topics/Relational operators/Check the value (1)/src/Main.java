import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int zero = 0;
        final int ten = 10;

        int inputNumber = scanner.nextInt();
        boolean inRange = zero < inputNumber && inputNumber < ten;

        System.out.println(inRange);
        scanner.close();
    }
}