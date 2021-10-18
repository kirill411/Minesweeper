import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        final int one = 1;
        final int two = 2;
        final int three = 3;

        int result = ((inputNumber + one) * inputNumber + two) * inputNumber + three;

        System.out.println(result);

        scanner.close();
    }
}