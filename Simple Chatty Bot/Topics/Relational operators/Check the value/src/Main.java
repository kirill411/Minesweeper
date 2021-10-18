import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ten = 10;

        int inputNumber = scanner.nextInt();
        boolean isLessThanTen = inputNumber < ten;

        System.out.println(isLessThanTen);
        scanner.close();
    }
}