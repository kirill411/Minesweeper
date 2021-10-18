import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tens = 10;
        int inputNumber = scanner.nextInt();

        System.out.println(inputNumber / tens);

        scanner.close();
    }
}